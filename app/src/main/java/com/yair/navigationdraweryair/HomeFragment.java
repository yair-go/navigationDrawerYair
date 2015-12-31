package com.yair.navigationdraweryair;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        Button button = (Button)rootView.findViewById(R.id.inHomeButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //  Toast.makeText(MainActivity.this, "Sending", Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(), "hhhhhh", Toast.LENGTH_SHORT).show();
            }
        } );

        return rootView;
    }
}
