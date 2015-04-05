package com.southsai.eventbusexample;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by thao on 4/5/15.
 */
public class ActivityB extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        if (savedInstanceState == null) {
            fm.beginTransaction().replace(R.id.container_layout, new FragmentB()).commit();
        }
    }
}
