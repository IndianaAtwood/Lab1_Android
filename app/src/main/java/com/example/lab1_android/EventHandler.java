package com.example.lab1_android;

import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * This class's job is to handle events from the GUI
 *
 * i.e., this is a "Controller" class
 */
public class EventHandler implements View.OnClickListener, SeekBar.OnSeekBarChangeListener{

    // a reference to the activity I'm part of
    private MainActivity myActivity;

    // the constructor requires the MainActivity to it can call findViewById()
    public EventHandler(MainActivity initActivity) {
        myActivity = initActivity;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        // get reference to the Min value's text view
        TextView minTextView = myActivity.findViewById(R.id.textViewMinValue);

        // set its value to be equal with the progress
        minTextView.setText("" + progress);
    }

    // MADE A DELIBERATE CHOICE TO LEAVE onStartTrackingTouch() and
    //      onStopTrackingTouch() empty from interface
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {}

    @Override
    public void onClick(View view) {
        if (view instanceof Button) {
            Button clickedButton = (Button) view;
            String buttonLabel = clickedButton.getText().toString();

            if (buttonLabel.equals("Update Count")) {
                changeMax();
            }
        }
    }

    /**
     * changeMax (PART OF CODE FROM LECTURE)
     *
     * is called whenever the user taps the Update Count Button
     * It increments the max count by 1.
     */
    public void changeMax() {
        // find the text view that contains the max number
        TextView maxTextView = myActivity.findViewById(R.id.textViewMaxValue);

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
