package com.example.udiploma.ViewHolder;

import android.net.sip.SipSession;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udiploma.Interface.ItemClickListener;
import com.example.udiploma.R;

public class DivisionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView name;
    public ItemClickListener listener;

    public DivisionViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.division_nameId);
    }

    private void ItemClickListener(ItemClickListener listener)
    {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        listener.onClick(v, getAdapterPosition(), false );
    }
}
