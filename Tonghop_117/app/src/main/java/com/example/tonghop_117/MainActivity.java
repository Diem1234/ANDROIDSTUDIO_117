package com.example.tonghop_117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnsignin, btnsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsignin = (Button) findViewById(R.id.btnlogin);
        btnsignup = (Button) findViewById(R.id.btnsinup1);
        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenHomeActivity();
            }
        });
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenSignUpActivity();
            }
        });

    }
    public void doOpenHomeActivity()
    {
        Intent myIntent=new Intent(this, Home.class);
        startActivity(myIntent);
    }
    public void doOpenSignUpActivity()
    {
        Intent myIntent=new Intent(this, SignUp.class);
        startActivity(myIntent);
    }
}