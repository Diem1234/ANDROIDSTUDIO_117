package com.example.tonghop_117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button btnPro,btnlgout,btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnPro = (Button) findViewById(R.id.btnProfile);
        btnList = (Button) findViewById(R.id.btnListView);
        btnlgout = (Button) findViewById(R.id.btnLogout);
        btnPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doOpenProfileActivity();
            }
        });
        btnlgout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doOpenLoginActivity();
            }
        });
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenListViewActivity();
            }
        });
    }
    public void doOpenProfileActivity()
    {
        Intent myIntent=new Intent(this, Profile.class);
        startActivity(myIntent);
    }
    public void doOpenLoginActivity()
    {
        Intent myIntent=new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
    public void doOpenListViewActivity()
    {
        Intent myIntent=new Intent(this, listView.class);
        startActivity(myIntent);
    }
}