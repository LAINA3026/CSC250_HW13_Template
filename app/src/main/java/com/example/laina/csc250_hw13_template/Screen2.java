package com.example.laina.csc250_hw13_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class Screen2 extends AppCompatActivity {
    private int[] ar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_screen2);
        //String theName = this.getIntent().getStringExtra("MyName");

        //String theName = this.getIntent().getStringExtra
        // ("myName");
        int arrayCount = this.getIntent().getIntExtra("arrayCount", 0);
        // this.ar = new int[arrayCount];
        int[] ar = new int[arrayCount];

        Random r = new Random();
        //fill the array
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = r.nextInt();
        }

        ViewGroup theVLL = (ViewGroup) this.findViewById(R.id.theVerticalLinearLayout);
        //sort array
       // this.sort(ar);
        Arrays.sort(ar);


        //design pattern = proposed good solution to a common problem
        //singleton = it's a good idea to keep information that needs to be
        //shared among more than one other object in a single place.
        //generate textview based on the array's content
        //method because parenthesis
        //class because calling it from name of class (Capital A)

        //generate textviews base ond the array's content
        for (int i = 0; i < ar.length; i++)
        {
            TextView tv = new TextView(this);
            tv.setText("" + ar[i]);
            theVLL.addView(tv);

        }
    }




    //THIS IS VERY IMPORTANT
    private void sort(int[] ar)
    {
        int follower;
        int temp;
        for(int i = 1; i < ar.length; i++)
        {
            follower = i;
            while(follower != 0 && ar[follower] < ar[follower-1])
            {
                temp = ar[follower];
                ar[follower] = ar[follower-1];
                ar[follower-1] = temp;
                follower--;
            }
        }
    }
}
//coupling = when two objects rely on each other. Can't seperate them
//for loop = pre check
//Primitive type: capable of holding a value

//Singleton Rule of Thumb -- Use a singleton when a piece of data needs to be shared between more
//than 2 screens.

//Use putExtra when a piece of data needs to be shared between 1 or 2 screens.

//Coupling -- the Concept that one Class is reliant on another Class
//We have a goal of minimizing coupling
//(11/14/2017)'

//ViewGroup = A collection of views and other ViewGroups
