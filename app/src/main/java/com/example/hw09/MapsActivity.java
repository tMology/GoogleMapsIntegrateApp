package com.example.hw09;

/*
 * Mitchell Habovick, Aaron Hill
 * Assignment #9
 * HW09
 *
 * */

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.hw09.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

//        binding = ActivityMapsBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.map, new MapsFragment(), "MapsFragment")
//                .commit();


         //Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // From here, we will start at Charlotte
        LatLng charlotte = new LatLng(35.2271, -80.8431);
        mMap.addMarker(new MarkerOptions().position(charlotte).title("Marker in Charlotte"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(charlotte));
        //Our Polygon drawing is called here, it will parse the data in the PolygonOptions method Below.
        Polygon polygon = mMap.addPolygon(polygonOptions);


        //Our Coordinates are specified, and our zoom level is set to automatically zoom into our location
        LatLng latLng = new LatLng(35.2271,-80.8431);
        float zoomLevel = 10.0f; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoomLevel));

    }

    //Our method below parses and draws our circle.

    PolygonOptions polygonOptions = new PolygonOptions()
            .add(new LatLng(35.33585333333333, -80.72822500000001),
                    new LatLng(35.323528333333336, -80.71723833333334),
                    new LatLng(35.316245, -80.71311833333333),
                    new LatLng(35.31064166666667, -80.70556499999999),
                    new LatLng(35.30728, -80.697325),
                    new LatLng(35.30391833333333, -80.68702666666667),
                    new LatLng(35.285423333333334, -80.6781),
                    new LatLng(35.28094, -80.67535333333333),
                    new LatLng(35.26972833333333, -80.67054666666667),
                    new LatLng(35.26412166666667, -80.67054666666667),
                    new LatLng(35.25459, -80.65887333333333),
                    new LatLng(35.25178666666667, -80.65818666666668),
                    new LatLng(35.24393666666666, -80.65132),
                    new LatLng(35.22038, -80.65063333333333),
                    new LatLng(35.22038, -80.65063333333333),
                    new LatLng(35.208038333333334, -80.64170833333333),
                    new LatLng(35.20298833333333, -80.63484166666667),
                    new LatLng(35.18503166666667, -80.63278166666667),
                    new LatLng(35.160336666666666, -80.62866166666666),
                    new LatLng(35.14910833333333, -80.62866166666666),
                    new LatLng(35.138439999999996, -80.64308166666666),
                    new LatLng(35.122155, -80.6575),
                    new LatLng(35.11822333333334, -80.66642666666667),
                    new LatLng(35.11092166666666, -80.68634),
                    new LatLng(35.101371666666665, -80.71174500000001),
                    new LatLng(35.092945, -80.717925),
                    new LatLng(35.08002166666667, -80.73989833333333),
                    new LatLng(35.072154999999995, -80.74539166666666),
                    new LatLng(35.06541, -80.75706333333332),
                    new LatLng(35.06091333333333, -80.78178333333334),
                    new LatLng(35.061476666666664, -80.81680166666666),
                    new LatLng(35.063725, -80.84632833333333),
                    new LatLng(35.067658333333334, -80.86418),
                    new LatLng(35.08283166666667, -80.87516666666667),
                    new LatLng(35.10418, -80.88821333333334),
                    new LatLng(35.115415, -80.90126000000001),
                    new LatLng(35.140125, -80.932845),
                    new LatLng(35.155845, -80.949325),
                    new LatLng(35.15809, -80.957565),
                    new LatLng(35.17829833333334, -80.97198333333334),
                    new LatLng(35.208038333333334, -80.97061000000001),
                    new LatLng(35.236085, -80.97061000000001),
                    new LatLng(35.261878333333335, -80.96786333333333),
                    new LatLng(35.287665, -80.96511833333334),
                    new LatLng(35.300555, -80.95413166666667),
                    new LatLng(35.321286666666666, -80.94245833333333),
                    new LatLng(35.32857, -80.92185833333333),
                    new LatLng(35.33697333333334, -80.89988666666666),
                    new LatLng(35.351535, -80.86624),
                    new LatLng(35.358815, -80.85250833333333),
                    new LatLng(35.362175, -80.81886166666666),
                    new LatLng(35.366655, -80.79551666666666),
                    new LatLng(35.358815, -80.74607833333333),
                    new LatLng(35.354335, -80.74401833333333));
}