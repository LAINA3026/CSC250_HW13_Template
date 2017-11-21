package com.example.laina.csc250_hw13_template;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.inputET = (EditText)this.findViewById(R.id.inputET);

    }

    public void onNextPageButtonPressed(View v)

    {
        if(this.inputET.getText().toString().length() > 0)
        {
            //this = current situation
            //Screen2.class = where you are going
            Intent i = new Intent(this, Screen2.class);
            String numberText = this.InputET.getText().toString();
            int number = Integer.parseInt(numberText);
            i.putExtra("ArrayCount", number);
            //makes screen 2 reliant on something that came from screeone/main
            this.startActivity(i);

            //this activity will start new activity using previous intent
        }


    }
}
//instructors have the same name as the class
//field has no parenthesis

//Interface - Like a class, but without an implementation
    //Lists fields, and function names that classes that
    // choose to implement this interface MUST implement in
    // in order to successfully use the interface

    // like classes, but don't give implementation **xbox controller - what is needed to make 3rd party controller

// putExtra - moving data from one activity to another

    //Naming convention: Usually ends in ABLE
