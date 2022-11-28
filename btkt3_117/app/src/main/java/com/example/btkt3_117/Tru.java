package com.example.btkt3_117;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class Tru extends AppCompatActivity implements View.OnClickListener{
    EditText soA, soB;
    ListView lv;
    Button tinh;
    TextView txtht;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tru);
        soA = (EditText) findViewById(R.id.editTextNumberA);
        soB = (EditText) findViewById(R.id.editTextNumberB);
        findViewById(R.id.btntinh).setOnClickListener(this);
        txtht = (TextView) findViewById(R.id.txthienthiketqua);
        lv= (ListView) findViewById(R.id.lv_pheptoan);
    }

    @Override
    public void onClick(View view) {
        int soa = Integer.parseInt(soA.getText().toString());
        int sob = Integer.parseInt(soB.getText().toString());
        int result=0;
        switch (view.getId()){
            case R.id.btntinh:
                result = soa - sob;
                break;
        }
        txtht.setText(result + "");
    }
}