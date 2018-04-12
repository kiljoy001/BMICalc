package com.example.kiljo.bmicalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Called when the user click Calculate button **/
    public void sendMessage(View view)
    {
        Intent calculate = new Intent(this, DisplayCalculation.class);
        EditText heightstring = findViewById(R.id.editText1);
        EditText weightstring = findViewById(R.id.editText3);
        //convert input into integer values
        int height = Integer.parseInt(heightstring.getText().toString());
        int weight = Integer.parseInt(weightstring.getText().toString());
        //calculation
        double BMICalc =  (weight * 703) / (height * height);

        //TextView output = findViewById(R.id.textView5);
        //output.setText(String.valueOf(BMICalc));
        //create bundle to pass value on to next activity
        Bundle data = new Bundle();
        //add data to bundle
        data.putDouble("result", BMICalc);
        //add bundle to intent
        calculate.putExtras(data);
        //pass intent to next activity
        startActivity(calculate);
    }
}
