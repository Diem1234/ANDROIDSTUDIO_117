package com.example.sqlite_117;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sqlite_117.Sqlite.DBHelper;
import com.example.sqlite_117.Sqlite.sinhvienDao;
import com.example.sqlite_117.adapter.sinhvienAdapter;
import com.example.sqlite_117.model.sinhvien;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private sinhvienAdapter SVadapter;
    private ListView lvsv;
    private String sinhvienid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase readableDatabase =dbHelper.getReadableDatabase();
        readableDatabase.close();
        //tim kiem thong tin tao giao dien
        lvsv =(ListView) findViewById(R.id.listViewSV);
        sinhvienDao dao = new sinhvienDao(this);
        List<sinhvien> list = dao.getAll();
        SVadapter = new sinhvienAdapter(this,list);
        lvsv.setAdapter(SVadapter);
        lvsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                sinhvien sv = list.get(i);
                sinhvienid= sv.getId();
            }
        });

        findViewById(R.id.btnedit).setOnClickListener(this);
        findViewById(R.id.btninsert).setOnClickListener(this);
        findViewById(R.id.btndelete).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,AddOrEditActivity.class);
        switch (view.getId()){
            case R.id.btninsert:
                //click nut edit chuyen trang addordedit
                startActivity(intent);
                break;
            case R.id.btnedit:
                if(sinhvienid==null){//r??ng bu???c ??i???u ki???n ch???n id ????? th???c hi???n ch???nh s???a
                    Toast.makeText(this, "phai chon id cua sinh vien!", Toast.LENGTH_SHORT).show();
                    return;
                }

                Bundle bundle= new Bundle();
                bundle.putString("id",sinhvienid);
                intent.putExtra("data",bundle);
                startActivity(intent);
                break;
            case R.id.btndelete:
                if(sinhvienid==null){
                    Toast.makeText(this, "phai chon id cua sinh vien!", Toast.LENGTH_SHORT).show();
                    return;//ket thuc doan lenh
                }
                
                sinhvienDao dao = new sinhvienDao(this);//t???o ??oi tuong goi ham delete
                dao.delete(sinhvienid);
                sinhvienid = null;

                Toast.makeText(this, "Da xoa sinh vien!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}