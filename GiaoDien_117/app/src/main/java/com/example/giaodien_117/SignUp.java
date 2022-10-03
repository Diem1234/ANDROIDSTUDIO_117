package com.example.giaodien_117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button btntrove=(Button)
                findViewById(R.id.buttonBack);
        btntrove.setOnClickListener(new
                                            View.OnClickListener() {
                                                public void onClick(View arg0) {
                                                    doOpenGiaoDien1Activity();
                                                }
                                            });
    }
    public void doOpenGiaoDien1Activity()
    {
        Intent myIntent=new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
}