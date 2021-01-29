package com.example.mywebviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class UCSDWebViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsd_web_viewer);

        // load extension.ucsd.edu
        WebView ucsdWebView = (WebView)findViewById(R.id.ucsdWebView);
        ucsdWebView.loadUrl("https://extension.ucsd.edu/");
    }
}