package com.integos.adarsh.rentern;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Otp extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.otp,container,false);
        Button button=(Button)v.findViewById(R.id.ok_id);
        final EditText editText=(EditText)v.findViewById(R.id.otp_id);
        TextView otp_send_again=(TextView)v.findViewById(R.id.otp_sende_again_id_otp);
        otp_send_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "OTP sended", Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otp=editText.getText().toString();
                if (otp.equals(""))
                {
                    editText.setError("invalid OTP");
                }else {
                    Intent intent = new Intent(getContext(), Home.class);
                    startActivity(intent);
                }
               //getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.inlude_id,new )
            }
        });
        return v;
    }
}
