package com.southsai.eventbusexample;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class ActivityA extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        if (savedInstanceState == null) {
            fm.beginTransaction().replace(R.id.container_layout, new FragmentA()).commit();
        }
    }
}
