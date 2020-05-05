package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.udiploma.BottomShoot.PdfViewerFragment;

public class ProbidhanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probidhan);

        findViewById(R.id.probidhan_1016).setOnClickListener((View view)->{
            PdfViewerFragment fragment = new PdfViewerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url", "Probidhan_2016.pdf");
            fragment.setArguments(bundle);
            fragment.show(getSupportFragmentManager(), fragment.getTag());
        });
        findViewById(R.id.probidhan_1010).setOnClickListener((View view)->{
            PdfViewerFragment fragment = new PdfViewerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url", "Probidhan_2010.pdf");
            fragment.setArguments(bundle);
            fragment.show(getSupportFragmentManager(), fragment.getTag());
        });
    }

}
