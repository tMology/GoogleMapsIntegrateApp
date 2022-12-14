package com.example.hw09;

/*
 * Mitchell Habovick, Aaron Hill
 * Group15_HW09
 * HW09
 *
 * */

//This class was written and is the logic for the latitude and longitude for the MapFragment.

import java.io.Serializable;
import java.util.ArrayList;

class LatLng implements Serializable {
        private double lat, lon;


        public LatLng(double lat, double lon) {
            this.lat = lat;
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        //        {"title":"Loop 485 Drive","path":[{"latitude":35.344255,"longitude":-80.73303166666666},
//
//        {"latitude":35.33585333333333,"longitude":-80.72822500000001},
//        {"latitude":35.323528333333336,"longitude":-80.71723833333334},
//        {"latitude":35.316245,"longitude":-80.71311833333333},
//        {"latitude":35.31064166666667,"longitude":-80.70556499999999},
//        {"latitude":35.30728,"longitude":-80.697325},
//        {"latitude":35.30391833333333,"longitude":-80.68702666666667},
//        {"latitude":35.285423333333334,"longitude":-80.6781},
//        {"latitude":35.28094,"longitude":-80.67535333333333},
//        {"latitude":35.26972833333333,"longitude":-80.67054666666667},
//        {"latitude":35.26412166666667,"longitude":-80.67054666666667},
//        {"latitude":35.25459,"longitude":-80.65887333333333},
//        {"latitude":35.25178666666667,"longitude":-80.65818666666668},
//        {"latitude":35.24393666666666,"longitude":-80.65132},
//        {"latitude":35.22038,"longitude":-80.65063333333333},
//        {"latitude":35.208038333333334,"longitude":-80.64170833333333},
//        {"latitude":35.20298833333333,"longitude":-80.63484166666667},
//        {"latitude":35.18503166666667,"longitude":-80.63278166666667},
//        {"latitude":35.160336666666666,"longitude":-80.62866166666666},
//        {"latitude":35.14910833333333,"longitude":-80.62866166666666},
//        {"latitude":35.138439999999996,"longitude":-80.64308166666666},
//        {"latitude":35.122155,"longitude":-80.6575},
//        {"latitude":35.11822333333334,"longitude":-80.66642666666667},
//        {"latitude":35.11092166666666,"longitude":-80.68634},
//        {"latitude":35.101371666666665,"longitude":-80.71174500000001},
//        {"latitude":35.092945,"longitude":-80.717925},
//        {"latitude":35.08002166666667,"longitude":-80.73989833333333},
//        {"latitude":35.072154999999995,"longitude":-80.74539166666666},
//        {"latitude":35.06541,"longitude":-80.75706333333332},
//        {"latitude":35.06091333333333,"longitude":-80.78178333333334},
//        {"latitude":35.061476666666664,"longitude":-80.81680166666666},
//        {"latitude":35.063725,"longitude":-80.84632833333333},
//        {"latitude":35.067658333333334,"longitude":-80.86418},
//        {"latitude":35.08283166666667,"longitude":-80.87516666666667},
//        {"latitude":35.10418,"longitude":-80.88821333333334},
//        {"latitude":35.115415,"longitude":-80.90126000000001},
//        {"latitude":35.140125,"longitude":-80.932845},
//        {"latitude":35.155845,"longitude":-80.949325},
//        {"latitude":35.15809,"longitude":-80.957565},
//        {"latitude":35.17829833333334,"longitude":-80.97198333333334},
//        {"latitude":35.208038333333334,"longitude":-80.97061000000001},
//        {"latitude":35.236085,"longitude":-80.97061000000001},
//        {"latitude":35.261878333333335,"longitude":-80.96786333333333},
//        {"latitude":35.287665,"longitude":-80.96511833333334},
//        {"latitude":35.300555,"longitude":-80.95413166666667},
//        {"latitude":35.321286666666666,"longitude":-80.94245833333333},
//        {"latitude":35.32857,"longitude":-80.92185833333333},
//        {"latitude":35.33697333333334,"longitude":-80.89988666666666},
//        {"latitude":35.351535,"longitude":-80.86624},
//        {"latitude":35.358815,"longitude":-80.85250833333333},
//        {"latitude":35.362175,"longitude":-80.81886166666666},
//        {"latitude":35.366655,"longitude":-80.79551666666666},
//        {"latitude":35.358815,"longitude":-80.74607833333333},
//        {"latitude":35.354335,"longitude":-80.74401833333333}]}

}
