package com.ucucite.edu.maps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(mMap.MAP_TYPE_SATELLITE);

        LatLng smeis = new LatLng(15.980317330663954, 120.700020896964);
        LatLng smisi = new LatLng(15.97984487416766, 120.7016366834732);
        LatLng epac = new LatLng(15.958928826426103, 120.67732569696373);
        LatLng scis = new LatLng(15.94300637085478, 120.7207807811098);


        mMap.addMarker(new MarkerOptions().position(smeis).title("Sta. Maria East Integrated School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smeis));

        mMap.addMarker(new MarkerOptions().position(smisi).title("St. Mary's Integrated School, Inc."));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smisi));

        mMap.addMarker(new MarkerOptions().position(epac).title("Eastern Pangasinan Agricultural College"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(epac));

        mMap.addMarker(new MarkerOptions().position(scis).title("Sta Cruz Integrated School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(scis));


    }
}