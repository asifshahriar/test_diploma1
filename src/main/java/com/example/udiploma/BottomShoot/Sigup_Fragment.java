package com.example.udiploma.BottomShoot;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.udiploma.Model.Users;
import com.example.udiploma.Prevelent.Prevalent;
import com.example.udiploma.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

import io.paperdb.Paper;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sigup_Fragment extends BottomSheetDialogFragment {

    public Sigup_Fragment() {
        // Required empty public constructor
    }
    private TextInputLayout w1, w2, w3, w5, w6, w7, w8;
    private EditText edt_name, edt_roll, edt_regi, edt_phone, edt_dept, edt_semi, edt_institute, edt_blood;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        View view = View.inflate(getContext(),R.layout.fragment_sigup, null);
        dialog.setContentView(view);
        Paper.init(getContext());


        edt_name = view.findViewById(R.id.edt__full_nameId);
        edt_roll = view.findViewById(R.id.edt_rollId);
        edt_regi = view.findViewById(R.id.edt_registrationId);
        edt_phone = view.findViewById(R.id.edt__mobileId);
        edt_dept = view.findViewById(R.id.edt_Technology);
        edt_semi = view.findViewById(R.id.edt_semesterId);
        edt_institute = view.findViewById(R.id.edt_polytechnicId);
        edt_blood = view.findViewById(R.id.edt_bloodId);

        w1 = view.findViewById(R.id.wrapper1);
        w2 = view.findViewById(R.id.wrapper2);
        w3 = view.findViewById(R.id.wrapper3);
        w5 = view.findViewById(R.id.wrapper4);
        w6 = view.findViewById(R.id.wrapper5);
        w7 = view.findViewById(R.id.wrapper7);
        w8 = view.findViewById(R.id.wrapper8);


        //totalPrice = getIntent().getStringExtra("price");
        view.findViewById(R.id.btn_registration).setOnClickListener((View v)->{
            check();
        });

        return dialog;
    }
    private void check() {
        if (TextUtils.isEmpty(edt_name.getText().toString())){
            w1.setError("Enter full name");
        }else if (TextUtils.isEmpty(edt_roll.getText().toString())){
            w2.setError("Enter your roll");
        }else if (TextUtils.isEmpty(edt_regi.getText().toString())){
            w3.setError("Enter your registration");
        }else if (TextUtils.isEmpty(edt_phone.getText().toString())){
            edt_phone.setText("");
        }else if (TextUtils.isEmpty(edt_dept.getText().toString())) {
            w5.setError("Enter your department");
        }else if (TextUtils.isEmpty(edt_semi.getText().toString())) {
            w6.setError("Enter your semester");
        }else if (TextUtils.isEmpty(edt_institute.getText().toString())) {
            w7.setError("Enter your Institute");
        }else if (TextUtils.isEmpty(edt_blood.getText().toString())) {
            w8.setError("Enter your blood group");
        }else{
            confirmOrder();
        }
    }

    private void confirmOrder() {

        String name, roll, regi, dept, semi, institute, blood;

        name = edt_name.getText().toString();
        roll = edt_roll.getText().toString();
        regi = edt_regi.getText().toString();
        dept = edt_dept.getText().toString();
        semi = edt_semi.getText().toString();
        institute = edt_institute.getText().toString();
        blood = edt_blood.getText().toString();

        final String saveCurrentTime, saveCurrentDate;
        Calendar calDateTime = Calendar.getInstance();
        SimpleDateFormat currentDate = new SimpleDateFormat("MMM dd, yyyy");
        saveCurrentDate = currentDate.format(calDateTime.getTime());

        SimpleDateFormat currentTime = new SimpleDateFormat("HH:mm:ss a");
        saveCurrentTime = currentTime.format(calDateTime.getTime());

        final DatabaseReference orderRef = FirebaseDatabase.getInstance().getReference().child("Users List").child(edt_roll.getText().toString());

        final HashMap<String, Object> userMap = new HashMap<>();

        userMap.put("full_name", edt_name.getText().toString());
        userMap.put("roll", edt_roll.getText().toString());
        userMap.put("registration", edt_regi.getText().toString());
        userMap.put("phone", edt_phone.getText().toString());
        userMap.put("department", edt_dept.getText().toString());
        userMap.put("semester", edt_semi.getText().toString());
        userMap.put("institute", edt_institute.getText().toString());
        userMap.put("blood", edt_blood.getText().toString());
        userMap.put("date", saveCurrentDate);
        userMap.put("time", saveCurrentTime);


        orderRef.updateChildren(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful())
                {
                    FirebaseDatabase.getInstance().getReference().child("New User")
                            .child(edt_roll.getText().toString())
                            .removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(getContext(), "Your Registration Successfully.", Toast.LENGTH_SHORT).show();
                            Toast.makeText(getContext(), "Current user"+Prevalent.roll, Toast.LENGTH_LONG).show();
                            Paper.book().destroy();
                            saveInfo(name, roll, regi, dept, semi, institute, blood);
                            dismiss();
                        }
                    });
                }
            }
        });
    }
    private void saveInfo(String name, String roll, String regi, String dept, String semi, String institute, String blood) {
        Paper.book().write(Prevalent.u_name, name);
        Paper.book().write(Prevalent.roll, roll);
        Paper.book().write(Prevalent.registration, regi);
        Paper.book().write(Prevalent.department, dept);
        Paper.book().write(Prevalent.poly, institute);
        Paper.book().write(Prevalent.semester, semi);
        Paper.book().write(Prevalent.blood, blood);
    }

}
