package com.easyway2in.mysqldbdemo;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by seaso on 06/08/2016.
 */
public class logout extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.logout, container, false);

        Button button4 = (Button)view.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                switch(v.getId()){

                    case R.id.button4:
                        Intent intent1 = new Intent(view.getContext(),MainActivity.class);
                        view.getContext().startActivity(intent1);
                        break;


                }
            }
        });

        return view;

    }
}

