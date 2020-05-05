package com.example.udiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class AllWebsiteShow extends AppCompatActivity {


    private WebView myWebView;
    private ProgressBar progressBar;
    private String Url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_website_show);


//        Url = getIntent().getStringExtra("url");
//
//        myWebView = (WebView) findViewById(R.id.webview);
//        progressBar = findViewById(R.id.bar);
//        WebSettings webSettings = myWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webView.setWebChromeClient(new WebChromeClient(){
//
//            @Override
//            public void onProgressChanged(WebView view, int newProgress) {
//
//                progressBar.setVisibility(View.VISIBLE);
//                progressBar.setProgress(newProgress);
//                if (newProgress == 100){
//                    progressBar.setVisibility(View.GONE);
//                }
//                super.onProgressChanged(view, newProgress);
//            }
//        });
//
//        webView.setWebViewClient(new WebViewClient(){
//
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return true;
//            }
//        });
//        webView.loadUrl(Url);
    }
}
