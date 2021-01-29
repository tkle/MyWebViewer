package com.example.mywebviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button ucsdButton, yahooButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ucsdButton = (Button)findViewById(R.id.ucsdButton);
        yahooButton = (Button)findViewById(R.id.yahooButton);

        ucsdButton.setOnClickListener(this);
        yahooButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ucsdButton:
                // Start "activity_ucsd_web_viewer" activity and load URL "extension.ucsd.edu"
                Intent ucsdIntent = new Intent(this, UCSDWebViewer.class);
                startActivity(ucsdIntent);
                break;
            case R.id.yahooButton:
                // Start "activity_yahoo_web_viewer" activity and load URL "www.yahoo.com"
                Intent yahooIntent = new Intent(this, YahooWebViewer.class);
                startActivity(yahooIntent);
                break;
        }

    }
}