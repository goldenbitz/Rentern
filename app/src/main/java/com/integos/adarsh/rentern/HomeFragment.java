package com.integos.adarsh.rentern;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class HomeFragment extends Fragment {
   ImageButton cars,bikes,scooters,bus,dress,cameras;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.home_fragment,container,false);
        cars=(ImageButton)v.findViewById(R.id.car_id);
        bikes=(ImageButton)v.findViewById(R.id.bike_id);
        scooters=(ImageButton)v.findViewById(R.id.scooter_id);
        bus=(ImageButton)v.findViewById(R.id.bus_id);
        dress=(ImageButton)v.findViewById(R.id.dress_id);
        cameras=(ImageButton)v.findViewById(R.id.camera_id);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),SearchResult.class);
                startActivity(intent);
            }
        });
        bikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),SearchResult.class);
                startActivity(intent);
            }
        });
        scooters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),SearchResult.class);
                startActivity(intent);
            }
        });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),SearchResult.class);
                startActivity(intent);
            }
        });
        cameras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),SearchResult.class);
                startActivity(intent);
            }
        });
        dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),SearchResult.class);
                startActivity(intent);
            }
        });
    }
}
