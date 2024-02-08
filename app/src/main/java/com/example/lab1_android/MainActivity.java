package com.example.lab1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // referencing code that I downloaded from lecture
        setContentView(R.layout.drawstuff);

        TextView myFavTextView = new TextView(this);
        myFavTextView.setText("some text");
    }

    /**
    * changeMax (PART OF CODE FROM LECTURE)
    *
    * is called whenever the user taps the Update Count Button
    * It increments the max count by 1.
    */
    public void changeMax(View v) {
        // find the text view that contains the max number
        TextView maxTextView = findViewById(R.id.textViewMaxValue);

        // retrieve the value (a string)
        CharSequence sequence = maxTextView.getText();
        String textVal = sequence.toString();

        // convert the String to an integer
        int intVal = Integer.parseInt(textVal);

        // increment integer
        intVal++;

        // convert back to String, put it back into the text view
        String newTextVal = "" + intVal;
        maxTextView.setText(newTextVal);
    }
}