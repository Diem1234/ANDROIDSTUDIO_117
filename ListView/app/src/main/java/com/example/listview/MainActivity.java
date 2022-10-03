package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayCourse;
    Button btnThem,btnCapNhat;
    EditText txtMH;

    int vt=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        btnThem = (Button) findViewById(R.id.buttonThem);
        btnCapNhat = (Button) findViewById(R.id.buttonCapNhat);
        txtMH = (EditText) findViewById(R.id.editTextTextMH);
        //txtND = (EditText) findViewById(R.id.editTextND);
        arrayCourse = new ArrayList<>();

        arrayCourse.add("Android");
        arrayCourse.add("PHP");
        arrayCourse.add("iOS");
        arrayCourse.add("ASP.NET");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
        listView.setAdapter(adapter);
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String monhoc = txtMH.getText().toString();
                arrayCourse.add(monhoc);
                adapter.notifyDataSetChanged();
            }
        });
        btnCapNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayCourse.set(vt,txtMH.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,arrayCourse.get(i),Toast.LENGTH_SHORT).show();
                txtMH.setText(arrayCourse.get(i));
                vt = i;
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                doOpenMainActivity2();
                Toast.makeText(MainActivity.this,arrayCourse.get(i),Toast.LENGTH_SHORT).show();
                //String hienthi = txtND.getText().toString();
                //arrayCourse.set(vt,txtND.getText().toString());
                //txtND.setText(arrayCourse.get(i));
                //vt = i;
               // adapter.notifyDataSetChanged();
                return false;
            }
        });


    }
    public void doOpenMainActivity2()
    {
        Intent myIntent=new Intent(this, MainActivity2.class);
        startActivity(myIntent);
    }
}