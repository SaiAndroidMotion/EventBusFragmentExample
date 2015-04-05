package com.southsai.eventbusexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.greenrobot.event.EventBus;

public class FragmentB extends Fragment {
    private TextView txtName, txtAge;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, container, false);
        txtAge = (TextView) v.findViewById(R.id.txtage);
        txtName = (TextView) v.findViewById(R.id.txtname);
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().registerSticky(this);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    public void onEventMainThread(NameandAge event) {

        txtAge.setText("Tên: " + event.getAge());
        txtName.setText("Tuổi: " + event.getName());
    }
}
