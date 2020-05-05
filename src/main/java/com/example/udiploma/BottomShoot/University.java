package com.example.udiploma.BottomShoot;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.udiploma.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class University extends BottomSheetDialogFragment {

    private ListView private_uni;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        View view = View.inflate(getContext(), R.layout.fragment_university, null);
        dialog.setContentView(view);

        private_uni = view.findViewById(R.id.private_university_list);

        ArrayList<String> private_university = new ArrayList<>();
        private_university.add("Daffodil University");
        private_university.add( "World University");
        private_university.add( "Green University");
        private_university.add( "City University");
        private_university.add( "Southeast University");
        private_university.add( "Northern University");
        private_university.add( "Uttara University");
        private_university.add( "IUBAT");
        private_university.add( "BUBT");
        private_university.add( "Dhaka International University");
        private_university.add( "Sonargaon University");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), R.layout.university_sample, R.id.uni_listId, private_university);
        private_uni.setAdapter(adapter);


        return dialog;
    }
}
