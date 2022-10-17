package com.example.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter {
    private List mStutents;
    private Context mContext;

    public StudentAdapter(List mStutents, Context mContext) {
        this.mStutents = mStutents;
        this.mContext = mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Nạp layout cho View biểu diễn phần tử sinh viên
        View studentView = inflater.inflate(R.layout.student_item, parent, false);
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(studentView) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        student st =

        holder.mName.setText(student.getmName());
        holder.birthYear.setText(student.getBirthYear()+"");

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
