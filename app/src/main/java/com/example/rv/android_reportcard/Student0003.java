package com.example.rv.android_reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by developer on 2/21/17.
 */

public class Student0003 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_list);

        ArrayList<ReportCard> grades = new ArrayList<ReportCard>();

        //        Course + Grades
        grades.add(new ReportCard("English", "A+", "A", "A", "A"));
        grades.add(new ReportCard("Math", "B", "A", "B", "A"));
        grades.add(new ReportCard("Science", "A", "C", "B", "A"));
        grades.add(new ReportCard("History", "B+", "B", "B", "B+"));
        grades.add(new ReportCard("Spanish", "C", "B", "B", "A"));

        StudentAdapter studentListAdapter = new StudentAdapter(this, grades);

        ListView student_listView = (ListView) findViewById(R.id.grade_list);

        student_listView.setAdapter(studentListAdapter);
    }
}
