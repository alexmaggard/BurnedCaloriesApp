package com.example.a660252397.burnedcaloriesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //define variables
    private EditText weightEditTextView;
    private TextView milesNumberTextView;
    private SeekBar seekBar;
    private TextView caloriesNumberTextView;
    private Spinner feetSpinner;
    private Spinner inchSpinner;
    private TextView bmiNumberLabelTextView;
    private EditText nameEditTextView;
    //define shared preferences

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set reference to widgets
        weightEditTextView = (EditText) findViewById(R.id.weightEditTextView);
        milesNumberTextView = (TextView) findViewById(R.id.milesNumberLabelTextView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        caloriesNumberTextView = (TextView) findViewById(R.id.caloriesNumberLabelTextView);
        feetSpinner = (Spinner) findViewById(R.id.feetSpinner);
        inchSpinner = (Spinner) findViewById(R.id.inchSpinner);
        bmiNumberLabelTextView = (TextView) findViewById(R.id.bmiNumberLabelTextView);
        nameEditTextView = (EditText) findViewById(R.id.nameEditTextView);
        //set reference to array adapter

        //set listeners

        //get shared preferences

    }


    //on pause

    //on resume methods

    //event listeners

    //calculations
}
