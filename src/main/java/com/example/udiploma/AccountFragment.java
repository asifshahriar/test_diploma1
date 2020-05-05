package com.example.udiploma;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.udiploma.BottomShoot.Sigup_Fragment;
import com.example.udiploma.Prevelent.Prevalent;

import io.paperdb.Paper;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {

    public AccountFragment() {
        // Required empty public constructor
    }

    private RelativeLayout sign_up, log_out;
    private TextView name, roll, regi, dept, semi, institute, blood;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_account, container, false);

        Paper.init(getContext());

        sign_up = root.findViewById(R.id.userSignup);
        log_out = root.findViewById(R.id.userLogout);

        root.findViewById(R.id.userSignup).setOnClickListener((View view)->{
            Sigup_Fragment fragment = new Sigup_Fragment();
            fragment.show(getFragmentManager(), fragment.getTag());
            log_out.setVisibility(View.VISIBLE);
            sign_up.setVisibility(View.INVISIBLE);
        });
        root.findViewById(R.id.userLogout).setOnClickListener((View view)->{
            sign_up.setVisibility(View.VISIBLE);
            log_out.setVisibility(View.INVISIBLE);
            Paper.book().destroy();
        });

        name = root.findViewById(R.id.account_nameId);
        roll = root.findViewById(R.id.account_rollId);
        regi = root.findViewById(R.id.account_regiId);
        dept = root.findViewById(R.id.account_departmentId);
        semi = root.findViewById(R.id.account_semesterId);
        institute = root.findViewById(R.id.account_instituteId);
        blood = root.findViewById(R.id.account_bloodId);


        String u_roll = Paper.book().read(Prevalent.roll);
        String u_name = Paper.book().read(Prevalent.u_name);
        String u_regi = Paper.book().read(Prevalent.registration);
        String u_dept = Paper.book().read(Prevalent.department);
        String u_semi = Paper.book().read(Prevalent.semester);
        String u_institute = Paper.book().read(Prevalent.poly);
        String u_blood = Paper.book().read(Prevalent.blood);

        name.setText("Name: "+u_name);
        roll.setText("Roll: "+u_roll);
        regi.setText("Registration: "+u_regi);
        dept.setText("Department: "+u_dept);
        semi.setText("Semester: "+u_semi);
        institute.setText("Institute: "+u_institute);
        blood.setText("Blood Group: "+u_blood);

        return root;
    }

}
