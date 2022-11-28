package com.example.btkt3_117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv_pheptoan);
        arrayCourse = new ArrayList<>();
        arrayCourse.add("Cộng");
        arrayCourse.add("Trừ");
        arrayCourse.add("Nhân");
        arrayCourse.add("Chia");
        arrayCourse.add("Logarit");
        arrayCourse.add("Chia lấy dư");
        arrayCourse.add("chia nguyên");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    doOpencongtrunhanchia();
            }
                if(i==1){
                    doOpentru();
                }
                Toast.makeText(MainActivity.this, arrayCourse.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void doOpencongtrunhanchia()
    {
        Intent myIntent=new Intent(this, congtrunhanchia.class);
        startActivity(myIntent);
    }
    public void doOpentru()
    {
        Intent myIntent=new Intent(this, Tru.class);
        startActivity(myIntent);
    }
    public void doOpennhan()
    {
        Intent myIntent=new Intent(this, nhan.class);
        startActivity(myIntent);
    }
}