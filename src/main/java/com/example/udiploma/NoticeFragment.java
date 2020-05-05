package com.example.udiploma;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.udiploma.Model.Notice;
import com.example.udiploma.ViewHolder.NoticeViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.os.Environment.DIRECTORY_DOWNLOADS;


public class NoticeFragment extends Fragment {


    public NoticeFragment() {

    }

    private RecyclerView notice;
    private DatabaseReference notice_data;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_notification, container, false);

        notice = root.findViewById(R.id.notice_recyclerId);
        layoutManager = new LinearLayoutManager(getContext());
        notice.setLayoutManager(layoutManager);


        notice_data = FirebaseDatabase.getInstance().getReference().child("Admin").child("Notice");

        FirebaseRecyclerOptions<Notice> options = new FirebaseRecyclerOptions.Builder<Notice>()
                .setQuery(notice_data, Notice.class).build();

        FirebaseRecyclerAdapter<Notice, NoticeViewHolder> adapter = new FirebaseRecyclerAdapter<Notice, NoticeViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull NoticeViewHolder noticeViewHolder, int i, @NonNull Notice notice) {
                noticeViewHolder.time.setText(notice.getTime());
                noticeViewHolder.date.setText(notice.getDate()+",");
                noticeViewHolder.notice_title.setText(notice.getTitle());

                noticeViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        CharSequence options[] = new CharSequence[]{"Download", "Open"};
                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("Notice");
                        builder.setItems(options, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (i == 0)
                                {
                                    downloadFile(getContext(), notice.getTitle(),".pdf",DIRECTORY_DOWNLOADS, notice.getUri());
                                }else if (i == 1)
                                {
                                    openWebPage(notice.getUri());
                                }
                            }
                        });
                        builder.show();

                    }
                });
            }

            @NonNull
            @Override
            public NoticeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notice_sample, parent, false);
                NoticeViewHolder holder = new NoticeViewHolder(view);
                return holder;
            }
        };

        notice.setAdapter(adapter);
        adapter.startListening();


        return root;
    }
    public long downloadFile(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {


        DownloadManager downloadmanager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        return downloadmanager.enqueue(request);
    }

    public void openWebPage(String url) {
//        Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
//        intent.setDataAndType(Uri.parse(url), "application/pdf");
//        startActivity(Intent.createChooser(intent, "Choose an Application:"));

        Intent intent = new Intent(getContext(), AllPdfViewer.class);
        intent.putExtra("link", url);
        startActivity(intent);
    }
}
