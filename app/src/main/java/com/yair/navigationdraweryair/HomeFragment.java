package com.yair.navigationdraweryair;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        Button button = (Button)rootView.findViewById(R.id.inHomeButton);

        Spinner spinner  = (Spinner)rootView.findViewById(R.id.spinner);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //  Toast.makeText(MainActivity.this, "Sending", Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(), "hhhhhh", Toast.LENGTH_SHORT).show();
            }
        } );

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.nav_drawer_items, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        return rootView;
    }
}
