package com.example.btkt_117;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CasiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CaSi> caSiList;

    public CasiAdapter(Context context, int layout, List<CaSi> caSiList) {
        this.context = context;
        this.layout = layout;
        this.caSiList = caSiList;
    }

    @Override
    public int getCount() {
        caSiList.size();
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        //anh xa
        TextView txtten = (TextView) view.findViewById(R.id.nameText);
        TextView txtnghedanh = (TextView) view.findViewById(R.id.nghedanhText);
        TextView txtquocgia = (TextView) view.findViewById(R.id.quocgiaText);
        TextView txtsosao = (TextView) view.findViewById(R.id.sosaoText);
        ImageView imghinh =(ImageView) view.findViewById(R.id.imageview);
        // gan gia tri
        CaSi cs = caSiList.get(i);

        txtten.setText(cs.getTen());
        txtnghedanh.setText(cs.getNghedanh());
        txtquocgia.setText(cs.getQuocgia());
        txtsosao.setText(cs.getSosao());
        imghinh.setImageResource(cs.getHinh());

        return view;
    }
}
