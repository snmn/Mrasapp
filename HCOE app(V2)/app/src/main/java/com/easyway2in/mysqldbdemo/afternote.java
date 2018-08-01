package com.easyway2in.mysqldbdemo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.test.ActivityUnitTestCase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by seaso on 04/08/2016.
 */
public class afternote extends Fragment {
    Intent intent;
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.afternote, container, false);
        Button call = (Button) myView.findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                switch (v.getId()) {
                    case R.id.call:
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.content_frame, new call());
                        ft.commit();
                        break;
                }
            }
        });
        Button button3 = (Button) myView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                switch (v.getId()) {
                    case R.id.button3:
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.content_frame, new web());
                        ft.commit();
                        break;
                }
            }
        });
        Button button5 = (Button) myView.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                switch (v.getId()) {
                    case R.id.button5:
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.content_frame, new logout());
                        ft.commit();
                        break;
                }
            }
        });




        return myView;
    }
}
