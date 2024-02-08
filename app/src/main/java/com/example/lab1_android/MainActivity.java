package com.example.lab1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_complex);

        // create an EventHandler object
        EventHandler handler = new EventHandler(this);

        // get a reference to the Update Count button object
        Button updateButton = findViewById(R.id.buttonUpdate);

        // register the EventHandler with the button
        updateButton.setOnClickListener(handler);

        //register the controller object with the SeekBar listener
        SeekBar minSeek = findViewById(R.id.seekBarMin);
        minSeek.setOnSeekBarChangeListener(handler);
    }


}