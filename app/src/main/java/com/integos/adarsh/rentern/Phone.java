package com.integos.adarsh.rentern;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Phone extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.phone,container,false);
        Button button=(Button)v.findViewById(R.id.login_id);
        final EditText editText=(EditText)v.findViewById(R.id.phone_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone=editText.getText().toString();
                Toast.makeText(getContext(), phone, Toast.LENGTH_SHORT).show();
getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.inlude_id,new Otp()).addToBackStack("frag").commit();
            }
        });
        return v;
    }
}
