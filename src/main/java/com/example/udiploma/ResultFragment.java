package com.example.udiploma;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ResultFragment extends Fragment {


    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_result, container, false);

        view.findViewById(R.id.bteb_result).setOnClickListener((View v)->{
            Intent intent = new Intent(getContext(),WebService.class);
            intent.putExtra("url", "http://180.211.164.133/result_arch/");
            startActivity(intent);
        });
        return view;
    }
}
