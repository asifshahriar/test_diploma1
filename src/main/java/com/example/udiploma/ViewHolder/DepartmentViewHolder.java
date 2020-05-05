package com.example.udiploma.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udiploma.Interface.ItemClickListener;
import com.example.udiploma.R;

public class DepartmentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView department, seat;
    public ItemClickListener listener;

    public DepartmentViewHolder(@NonNull View itemView) {
        super(itemView);
        department = itemView.findViewById(R.id.department_nameId);
        seat = itemView.findViewById(R.id.seat_id);
    }

    public void onClickListener(ItemClickListener listener)
    {
        this.listener = listener;
    }
    @Override
    public void onClick(View v) {
        listener.onClick(v, getAdapterPosition(), false);
    }
}
