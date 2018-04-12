package com.example.kiljo.bmicalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayCalculation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_calculation);

        //get intent from main activity
        Bundle result = getIntent().getExtras();
        //pull data out of bundle
        double calc = result.getDouble("result");
        //set textview to result
        TextView displayResult = findViewById(R.id.textView2);
        displayResult.setText(Double.toString(calc));
    }
}
