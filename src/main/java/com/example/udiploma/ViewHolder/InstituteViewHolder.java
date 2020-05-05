package com.example.udiploma.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udiploma.Interface.ItemClickListener;
import com.example.udiploma.R;

public class InstituteViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView name, address;
    public ItemClickListener listener;
    public InstituteViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.institute_nameId);
        address = itemView.findViewById(R.id.institute_addressId);
    }

    public void setItemClickListener(ItemClickListener listener)
    {
        this.listener = listener;
    }

    @Override
    public void onClick(View v)
    {
        listener.onClick(v, getAdapterPosition(), false);
    }
}
