package ec.edu.tecnologico.myapplication;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class MiPosicion implements LocationListener {
    public static double latitud;
    public static double longitud;
    public static boolean statusGPS;
    public static Location coordenadas;

    public void onLocationChanged(Location location){
        latitud= location.getLatitude();
        longitud=location.getLongitude();
        coordenadas=location;
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {
        statusGPS=true;
    }

    @Override
    public void onProviderDisabled(String provider) {
        statusGPS=false;

    }
}
