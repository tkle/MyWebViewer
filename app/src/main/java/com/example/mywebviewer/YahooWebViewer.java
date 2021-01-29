package com.example.mywebviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class YahooWebViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo_web_viewer);

        // Load www.yahoo.com
        WebView yahooWebView = (WebView)findViewById(R.id.yahooWebView);
        yahooWebView.loadUrl("https://www.yahoo.com/");
    }
}