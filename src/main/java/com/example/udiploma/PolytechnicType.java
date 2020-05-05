package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.udiploma.BottomShoot.PdfViewerFragment;

public class PolytechnicType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polytechnic_type);

        findViewById(R.id.public_poly).setOnClickListener((View view)->{
            startActivity(new Intent(getApplicationContext(),DivisionActivity.class));
        });
        findViewById(R.id.private_poly).setOnClickListener((View view)->{
            PdfViewerFragment fragment = new PdfViewerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url", "private_polytechnic_institutes.pdf");
            fragment.setArguments(bundle);
            fragment.show(getSupportFragmentManager(), fragment.getTag());
        });
    }
}
