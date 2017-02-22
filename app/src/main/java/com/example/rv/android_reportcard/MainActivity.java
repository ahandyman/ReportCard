package com.example.rv.android_reportcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * ****************************** STUDENT 1  ***************************************
         */
        // Find the View that shows the student category
        TextView studentGrades = (TextView) findViewById(R.id.student1);

        // Set a click listener on that View
        studentGrades.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Student0001}
                Intent gradesIntent = new Intent(MainActivity.this, Student0001.class);

                // Start the new activity
                startActivity(gradesIntent);
            }
        });

        /**
         * ****************************** STUDENT 2  ***************************************
         */
        // Find the View that shows the student category
        TextView studentGrades_2 = (TextView) findViewById(R.id.student2);

        // Set a click listener on that View
        studentGrades_2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Student0002}
                Intent gradesIntent = new Intent(MainActivity.this, Student0002.class);

                // Start the new activity
                startActivity(gradesIntent);
            }
        });

        /**
         * ****************************** STUDENT 3  ***************************************
         */
        // Find the View that shows the student category
        TextView studentGrades_3 = (TextView) findViewById(R.id.student3);

        // Set a click listener on that View
        studentGrades_3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Student0003}
                Intent gradesIntent = new Intent(MainActivity.this, Student0003.class);

                // Start the new activity
                startActivity(gradesIntent);
            }
        });

        /**
         * ****************************** STUDENT 4  ***************************************
         */
        // Find the View that shows the student category
        TextView studentGrades_4 = (TextView) findViewById(R.id.student4);

        // Set a click listener on that View
        studentGrades_4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Student0004}
                Intent gradesIntent = new Intent(MainActivity.this, Student0004.class);

                // Start the new activity
                startActivity(gradesIntent);
            }
        });
    }
}
