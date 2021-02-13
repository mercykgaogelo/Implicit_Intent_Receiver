package com.example.implicitintentreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intentReceiver = getIntent();
       // Get the Intent data. Intent data is always a URI object:
        Uri uriIntentData = intentReceiver.getData();
        if(uriIntentData != null) {
       //Check to make sure that the uri variable is not null.
        // If that check passes, create a string from that URI object:
            String stringUri = "URL:" + uriIntentData.toString();
        //Extract the "URI: " portion of the above into a string resource (uri_label).
            TextView textView = findViewById(R.id.text_uri_message);
            textView.setText(stringUri);
        }

    }
}