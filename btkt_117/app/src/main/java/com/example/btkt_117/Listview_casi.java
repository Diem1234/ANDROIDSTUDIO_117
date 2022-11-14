package com.example.btkt_117;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Listview_casi extends AppCompatActivity {
    ListView lvcs;
    ArrayList<CaSi> arrayCaSi;
    CasiAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_casi);
        AnhXa();
        adapter = new CasiAdapter(this, R.layout.layout_listview,arrayCaSi);
        lvcs.setAdapter(adapter);
        lvcs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CaSi ta = arrayCaSi.get(i);
            }
        });
    }
    private void AnhXa() {
        lvcs = (android.widget.ListView) findViewById(R.id.lv_casi);
        arrayCaSi = new ArrayList<>();
        arrayCaSi.add(new CaSi("Ca sĩ Minh Hằng", "Minh Hằng","Việt Nam",5, R.drawable.minhhang));
        arrayCaSi.add(new CaSi("Ca sĩ Khởi My", "Khởi My","Việt Nam",5, R.drawable.khoimi));
        arrayCaSi.add(new CaSi("Ca sĩ Jun Phạm", "Jun Phạm","Việt Nam",5, R.drawable.junpham));
        arrayCaSi.add(new CaSi("Ca sĩ Vũ Cát Tường", "Cát Tường","Việt Nam",5, R.drawable.vucattuong));

    }
}