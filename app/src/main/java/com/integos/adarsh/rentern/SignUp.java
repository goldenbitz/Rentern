package com.integos.adarsh.rentern;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity{
    EditText user_name,user_phone,user_otp;
    Button sign_up,validate;
    LinearLayout otp_layout;
   boolean visibility_flag= false;
   TextView otp_send_again;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        user_name=(EditText)findViewById(R.id.name_id_signup);
        user_phone=(EditText)findViewById(R.id.phone_id_signup);

        sign_up=(Button)findViewById(R.id.signup_id_signup);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user_name.getText().toString().equals(""))
                {
                    user_name.setError("name field is empty");
                }else if(user_phone.getText().toString().equals(""))
                {
                    user_phone.setError("phone field is empty");
                }else {
                   Intent intent=new Intent(SignUp.this,SignupOTP.class);
                   startActivity(intent);

                }

            }
        });

    }


}
