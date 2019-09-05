package com.example.user.hangaram_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import net.daum.mf.map.api.MapView;
import net.daum.mf.map.api.MapPoint;





public class MainActivity extends AppCompatActivity {
    static final String API_KEY = "5eb530f8efdefdc576ed524b337b9f28";
    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView = new MapView(this);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);

        }

    }
}