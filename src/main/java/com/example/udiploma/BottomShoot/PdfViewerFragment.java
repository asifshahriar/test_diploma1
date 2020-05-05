package com.example.udiploma.BottomShoot;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.udiploma.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

import static androidx.constraintlayout.widget.Constraints.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class PdfViewerFragment extends BottomSheetDialogFragment {

    public PdfViewerFragment() {
        // Required empty public constructor
    }


    PDFView pdfView;
    private String url;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        View view = View.inflate(getContext(), R.layout.fragment_pdf_viewer, null);
        dialog.setContentView(view);

        url = getArguments().getString("url");

        pdfView = view.findViewById(R.id.all_pdf_viewer);

        pdfView.fromAsset(url)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(getContext()))
                .load();

        return dialog;
    }
}
