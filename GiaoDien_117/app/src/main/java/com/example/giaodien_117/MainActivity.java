package com.example.giaodien_117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtName,txtMK;
    Button btnsu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen=(Button) findViewById(R.id.btnLogin);
        btnsu = (Button) findViewById(R.id.btnSignUp);
        txtName = (EditText)findViewById(R.id.editTextName);
        txtMK = (EditText) findViewById(R.id.editTextPassword);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (txtName.getText().length() !=0 && txtMK.getText().length() !=0){
                    if (txtName.getText().toString().equals("Diem") && txtMK.getText().toString().equals("1234")){
                        doOpenGiaoDien2Activity();
                        Toast.makeText(MainActivity.this, "Ban dang nhap thanh cong!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Nhap ten hoac mat khau cua ban!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenSignUpActivity();
            }
        });

    }
    public void doOpenGiaoDien2Activity()
    {
        Intent myIntent=new Intent(this, GiaoDien_2.class);
        startActivity(myIntent);
    }
    public void doOpenSignUpActivity()
    {
        Intent myIntent=new Intent(this, SignUp.class);
        startActivity(myIntent);
    }
}