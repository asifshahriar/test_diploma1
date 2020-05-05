package com.example.udiploma.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.udiploma.R;

public class NoticeViewHolder extends RecyclerView.ViewHolder {
    public TextView notice_title, time, date;
    public NoticeViewHolder(@NonNull View itemView) {
        super(itemView);

        time = itemView.findViewById(R.id.notice_timeId);
        date = itemView.findViewById(R.id.notice_dateId);
        notice_title = itemView.findViewById(R.id.notice_titleId);
    }
}
