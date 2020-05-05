package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.udiploma.BottomShoot.PdfViewerFragment;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity {

    private ListView department_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        department_list = findViewById(R.id.department_listViewId);

        ArrayList<String> department = new ArrayList<>();
        department.add("ARCHITECTURE AND INTERIOR DESIGN (687)");
        department.add("AIRCRAFT MAINTENANCE (AVIONICS) (683)");
        department.add("AIRCRAFT MAINTENANCE (AEROSPACE) (682)");
        department.add("ARCHITECTURE TECHNOLOGY (661)");
        department.add("AUTOMOBILE TECHNOLOGY (662)");
        department.add("CERAMIC TECHNOLOGY (676)");
        department.add("CHEMICAL TECHNOLOGY (663)");
        department.add("CIVIL TECHNOLOGY (664)");
        department.add("CIVIL (WOOD) TECHNOLOGY (665)");
        department.add("COMPUTER TECHNOLOGY (666)");
        department.add("COMPUTER SCIENCE & TECHNOLOGY (685)");
        department.add("CONSTRUCTION TECHNOLOGY (688)");
        department.add("DATA TELECOMMUNICATION AND NETWORKING (684)");
        department.add("ELECTRICAL TECHNOLOGY (667)");
        department.add("ELECTROMEDICAL TECHNOLOGY (686)");
        department.add("ELECTRONICS TECHNOLOGY (668)");
        department.add("ENVIRONMENTAL TECHNOLOGY (690)");
        department.add("FOOD TECHNOLOGY (669)");
        department.add("Footwear Technology (698)");
        department.add("GLASS TECHNOLOGY (677)");
        department.add("GRAPHICS TECHNOLOGY (696)");
        department.add("INSTRUMENTATION AND PROCESS CONTROL (691)");
        department.add("MECHANICAL TECHNOLOGY (670)");
        department.add("MECHATRONICS TECHNOLOGY (692)");
        department.add("MARINE TECHNOLOGY (679)");
        department.add("MINING AND MINE SURVEY TECHNOLOGY (693)");
        department.add("POWER TECHNOLOGY (671)");
        department.add("PRINTING TECHNOLOGY (695)");
        department.add("REFRIGERATION AND AIR CONDITIONING (672)");
        department.add("SHIPBUILDING TECHNOLOGY (680)");
        department.add("SURVEYING TECHNOLOGY (678)");
        department.add("TELECOMMUNICATION TECHNOLOGY (694)");
        department.add("DIPLOMA-IN- TOURISM AND HOSPITALITY (99)");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.university_sample, R.id.uni_listId, department);
        department_list.setAdapter(adapter);
        department_list.setClickable(true);

        department_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = department_list.getItemAtPosition(position);
                String str = (String) o;
                PdfViewerFragment fragment = new PdfViewerFragment();
                Bundle bundle = new Bundle();
                bundle.putString("url", str+".pdf");
                fragment.setArguments(bundle);
                fragment.show(getSupportFragmentManager(), fragment.getTag());
            }
        });

    }
}
