package com.example.udiploma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.udiploma.BottomShoot.InstituteDetailsFragment;
import com.example.udiploma.Model.Division;
import com.example.udiploma.Model.Institute;
import com.example.udiploma.ViewHolder.DivisionViewHolder;

import java.util.ArrayList;
import java.util.List;

public class DivisionActivity extends AppCompatActivity {

    private List<Division> divisions;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division_options);

        recyclerView = findViewById(R.id.all_divisionId);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        divisions = new ArrayList<>();

        divisions.add(new Division("Barisal",R.drawable.book_list));
        divisions.add(new Division("Chittagong",R.drawable.rajshahi));
        divisions.add(new Division("Dhaka",R.drawable.rajshahi));
        divisions.add(new Division("Khulna",R.drawable.rangpur));
        divisions.add(new Division("Mymensingh",R.drawable.dhaka_map));
        divisions.add(new Division("Rajshahi",R.drawable.dhaka_map));
        divisions.add(new Division("Rangpur",R.drawable.dhaka_map));
        divisions.add(new Division("Sylhet",R.drawable.dhaka_map));

        RecyclerView.Adapter<DivisionViewHolder> adapter = new RecyclerView.Adapter<DivisionViewHolder>() {
            @NonNull
            @Override
            public DivisionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_division_list, parent, false);
                DivisionViewHolder holder = new DivisionViewHolder(view);
                return holder;
            }

            @Override
            public void onBindViewHolder(@NonNull final DivisionViewHolder holder, int position) {
                holder.name.setText(divisions.get(position).getName());

                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),InstituteActivity.class);
                        intent.putExtra("div_id",holder.name.getText());
                        startActivity(intent);
                    }
                });
            }

            @Override
            public int getItemCount() {
                return divisions.size();
            }
        };
        recyclerView.setAdapter(adapter);
    }
}
