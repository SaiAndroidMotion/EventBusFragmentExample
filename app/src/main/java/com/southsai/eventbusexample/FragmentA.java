package com.southsai.eventbusexample;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import de.greenrobot.event.EventBus;

public class FragmentA extends Fragment {
    private EditText editName, editAge;
    private Button btnSend;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_a, container, false);
        editName = (EditText) v.findViewById(R.id.edit_name);
        editAge = (EditText) v.findViewById(R.id.edit_age);
        btnSend = (Button) v.findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDatatoFragmentB();
            }
        });
        return v;
    }

    private void sendDatatoFragmentB() {

        NameandAge data = new NameandAge(editName.getText().toString(), Integer.parseInt(editAge.getText().toString()));
        EventBus.getDefault().postSticky(data);
        //Start Activity B;
        Intent i = new Intent(getActivity(), ActivityB.class);
        startActivity(i);
    }


}
