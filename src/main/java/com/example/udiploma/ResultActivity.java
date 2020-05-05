package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        findViewById(R.id.bteb_result).setOnClickListener((View v)->{
            Intent intent = new Intent(getApplicationContext(),WebService.class);
            intent.putExtra("url", "http://180.211.164.133/result_arch/");
            startActivity(intent);
        });
    }
}
