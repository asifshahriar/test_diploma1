package com.example.udiploma;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.udiploma.BottomShoot.PdfViewerFragment;
import com.example.udiploma.Model.Institute;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private CardView notice_card, book_list_card, institute_card, cgpa_card, accademic_card, probidhan_card,
            result_card, admission_card, important_link_card, search_card, study_card, class_routine_card, bord_card, university_card, training_card;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        root.findViewById(R.id.institute_card).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), PolytechnicType.class));
        });
        root.findViewById(R.id.notice_card).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), AdminActivity.class));
        });
        root.findViewById(R.id.university_card).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), UniversityType.class));
        });
        root.findViewById(R.id.result_card).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), ResultActivity.class ));
        });
        root.findViewById(R.id.bord_card).setOnClickListener((View view)->{
            Intent intent = new Intent(getContext(),WebService.class);
            intent.putExtra("url", "http://bteb.gov.bd");
            startActivity(intent);
        });
        root.findViewById(R.id.admission_info_card).setOnClickListener((View view)->{
            Intent intent = new Intent(getContext(),WebService.class);
            intent.putExtra("url", "http://www.btebadmission.gov.bd");
            startActivity(intent);
        });
        root.findViewById(R.id.probidhan_card).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), ProbidhanActivity.class));
        });
        root.findViewById(R.id.academic_calender_card).setOnClickListener((View view)->{
            PdfViewerFragment fragment = new PdfViewerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url", "Academic Calender.pdf");
            fragment.setArguments(bundle);
            fragment.show(getFragmentManager(), fragment.getTag());
        });
        root.findViewById(R.id.study_cart).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), StudyActivity.class));
        });
        root.findViewById(R.id.cgpa_card).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), CGPA_Activity.class));
        });
        root.findViewById(R.id.institute_card).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), PolytechnicType.class));
        });
        root.findViewById(R.id.training_card).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), TranningActivity.class));
        });
        root.findViewById(R.id.book_list_card).setOnClickListener((View view)->{
            startActivity(new Intent(getContext(), BookListActivity.class));
        });
//        root.findViewById(R.id.institute_card).setOnClickListener((View view)->{
//
//        });
//        root.findViewById(R.id.institute_card).setOnClickListener((View view)->{
//
//        });


        return root;
    }
}
