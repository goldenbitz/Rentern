package com.integos.adarsh.rentern;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class BookingFragment extends android.support.v4.app.Fragment {
   ImageButton request,my_bookings;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.booking_fragment,container,false);
        request=(ImageButton)v.findViewById(R.id.booking_request_id_bookings);
        my_bookings=(ImageButton)v.findViewById(R.id.my_bookings_id_bookings);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),MyBookingRequest.class);
                startActivity(intent);
            }
        });
        my_bookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),MyBookings.class);
                startActivity(intent);
            }
        });
    }
}
