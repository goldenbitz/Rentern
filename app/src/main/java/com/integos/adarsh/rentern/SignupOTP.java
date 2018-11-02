package com.integos.adarsh.rentern;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupOTP extends AppCompatActivity {
    Button validate;
    EditText otp_editText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp);
        otp_editText=(EditText)findViewById(R.id.otp_id);
        validate=(Button)findViewById(R.id.ok_id);
        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(otp_editText.getText().toString().equals(""))
                {
                    otp_editText.setError("invalid OTP");
                }else {
                    Intent intent=new Intent(SignupOTP.this,Home.class);
                    startActivity(intent);

                }
            }
        });


    }
}
