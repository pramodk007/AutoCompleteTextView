package com.androiddev.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;
    //option user will get to select from
    String[] programmingLanguage = {"c++","java","python","c","javascript"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking the views
        autoCompleteTextView =  findViewById(R.id.autoCompleteView_input);
        textView = findViewById(R.id.textView_output);

        //display the option to the user
        textView.setText(getResources().getString(R.string.programLanguagesToDisplay));

        //adapter to connect our programming language array(data) to autoTextCompleteTextView
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,programmingLanguage);
        //setting the adapter data into the AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter);

        //will start working from first character
        autoCompleteTextView.setThreshold(1);
        //change text color
        autoCompleteTextView.setTextColor(Color.RED);


    }
}