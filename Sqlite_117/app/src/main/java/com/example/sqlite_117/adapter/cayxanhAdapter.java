package com.example.sqlite_117.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sqlite_117.R;
import com.example.sqlite_117.model.cayxanh;
import com.example.sqlite_117.model.sinhvien;

import java.util.List;

public class cayxanhAdapter extends BaseAdapter {
    private Context context;
    private List<cayxanh> list;

    public cayxanhAdapter(Context context, List<cayxanh> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view ==null){
            view = LayoutInflater.from(context).inflate(R.layout.layout_cayxanh_item,null);
        }
        TextView tvname = view.findViewById(R.id.tvName1);
        TextView tvtentg = view.findViewById(R.id.tvNametg);
        TextView tvdacta = view.findViewById(R.id.tvdacta);
        TextView tvmaula = view.findViewById(R.id.tvmaula);
        TextView tvd = view.findViewById(R.id.tvChiso);


        cayxanh sv = list.get(i);
        tvname.setText(sv.getTenkh());
        tvtentg.setText(sv.getTentg());
        tvdacta.setText(sv.getDactinh());
        tvmaula.setText(sv.getMaula());
        tvd.setText(""+sv.getChiso());//vì diem là kieu float nen phai chuyen doi sang chuoi thi moi có the setText

        return view;
    }
}
