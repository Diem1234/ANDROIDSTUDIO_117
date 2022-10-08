package com.example.tonghop_117;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class listView extends AppCompatActivity {
    ListView lvta;
    ArrayList<ThucAn> arrayThucan;
    ThucanAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        AnhXa();
        adapter = new ThucanAdapter(this, R.layout.layout_listview,arrayThucan);
        lvta.setAdapter(adapter);
        lvta.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ThucAn ta = arrayThucan.get(i);
                doOpenMainActivity2(ta.getTen(),ta.getMota(),ta.getHinh());
            }
        });
        lvta.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                XacNhanXoa(i);

                return false;
            }
        });

    }
    private void AnhXa() {
        lvta = (android.widget.ListView) findViewById(R.id.lvThucan);
        arrayThucan = new ArrayList<>();
        arrayThucan.add(new ThucAn("Bánh Cuốn","15000 Đồng",R.drawable.banhcuon));
        arrayThucan.add(new ThucAn("Bánh Mì","10000 Đồng",R.drawable.banhmi));
        arrayThucan.add(new ThucAn("Bún","20000 Đồng",R.drawable.bun));
        arrayThucan.add(new ThucAn("Phở","20000 Đồng",R.drawable.pho1));

    }
    private void XacNhanXoa(final int position){

        AlertDialog.Builder alerDiaLog = new AlertDialog.Builder(this);
        alerDiaLog.setTitle("Thong bao !");
        alerDiaLog.setIcon(R.mipmap.ic_launcher);
        alerDiaLog.setMessage("Bạn có muốn xóa hay không?");

        alerDiaLog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                arrayThucan.remove(position);
                adapter.notifyDataSetChanged();

            }
        });
        alerDiaLog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        alerDiaLog.show();
    }
    public void doOpenMainActivity2(String title, String des, int image)
    {
        Intent myIntent;
        myIntent = new Intent( this, Chuyentrang.class);
        myIntent.putExtra("title",title);
        myIntent.putExtra("image",image);
        myIntent.putExtra("des",des);
        startActivity(myIntent);
    }
}