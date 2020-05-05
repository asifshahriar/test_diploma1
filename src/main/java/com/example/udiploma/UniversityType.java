package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.udiploma.BottomShoot.University;

public class UniversityType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_options);

        findViewById(R.id.public_university).setOnClickListener((View view)->{

        });
        findViewById(R.id.private_university).setOnClickListener((View view)->{
            University university = new University();
            university.show(getSupportFragmentManager(), university.getTag());
        });
    }
}
