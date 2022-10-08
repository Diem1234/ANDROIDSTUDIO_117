package com.example.tonghop_117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnsignin, btnsignup;
    EditText txtName,txtPw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsignin = (Button) findViewById(R.id.btnlogin);
        btnsignup = (Button) findViewById(R.id.btnsinup1);
        txtName = (EditText) findViewById(R.id.editTextName);
        txtPw = (EditText) findViewById(R.id.editTextPass);
        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtName.getText().length() !=0 && txtPw.getText().length() !=0){
                    if (txtName.getText().toString().equals("Diem") && txtPw.getText().toString().equals("1234")){
                        doOpenNavActivity();
                        Toast.makeText(MainActivity.this, "Ban dang nhap thanh cong!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Nhap ten hoac mat khau cua ban!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenSignUpActivity();
            }
        });

    }
    public void doOpenNavActivity()
    {
        Intent myIntent=new Intent(this, BottomNavigationBar.class);
        startActivity(myIntent);
    }
    public void doOpenSignUpActivity()
    {
        Intent myIntent=new Intent(this, SignUp.class);
        startActivity(myIntent);
    }
}