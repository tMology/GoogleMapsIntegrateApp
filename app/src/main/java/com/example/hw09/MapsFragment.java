package com.example.hw09;

/*
 * Mitchell Habovick, Aaron Hill
 * Group15_HW09
 * HW09
 *
 * */

//NOTE: The code base for the Map Fragment


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.app.DownloadManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.hw09.databinding.FragmentMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;



public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng sydney = new LatLng(35.2271, -80.8431);
            googleMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
    };

    FragmentMapsBinding binding;
    private final OkHttpClient client = new OkHttpClient();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_maps, container, false);

        binding = FragmentMapsBinding.inflate(inflater, container, false);
        String url = "https://www.theappsdr.com/map/route";

        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                if(response.isSuccessful()){
                    String body = response.body().string();
                    try {
                        ArrayList<LatLng> pathArray = new ArrayList<>();
                        JSONObject jsonBody = new JSONObject(body);

                        JSONArray path = jsonBody.getJSONArray("path");
                        for (int i=0; i<100 ;i++) {
                            JSONObject p = path.getJSONObject(i);
                            String latitude = p.getString("latitude");
                            String longitude = p.getString("longitude");
                            pathArray.add(new LatLng(Double.parseDouble(latitude), Double.parseDouble(longitude)));
                        }

                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                PolygonOptions polygonOptions = new PolygonOptions();
                                for (LatLng l : pathArray) {
                                    polygonOptions.add(l);
                                }
                                //Polygon polygon = googleMap.addPolygon(polygonOptions);
                            }
                        });


                    }catch (JSONException e) {
                        e.printStackTrace();
                    }
                }


            }

        });



        return binding.getRoot();
    }

    //ArrayAdapter<LatLng> adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        //adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, LatLng.latLngs);
//        SupportMapFragment mapFragment =
//                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
//        if (mapFragment != null) {
//            mapFragment.getMapAsync(callback);
//        }

        //Call in the lat long in the MapFragment then use a draw the poly line Look into draw polyline and use http call for calling in the map
    }

//    void drawPolyLine(ArrayList<LatLng.Path> pathList, GoogleMap googleMap){
//
//        for (LatLng.PATH: pathList) {
//            Double latitude = Double.parseDouble(path.latitude);
//            Double longitude = Double.parseDouble(path.longitude);
//
//
//        }
//    }
}