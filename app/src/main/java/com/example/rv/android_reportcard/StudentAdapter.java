package com.example.rv.android_reportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by developer on 2/20/17.
 */

public class StudentAdapter extends ArrayAdapter<ReportCard> {

    public StudentAdapter(Activity context, ArrayList<ReportCard> grades) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, grades);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_layout, parent, false);
        }

        // Get the {@link ReportCard} object located at this position in the list
        ReportCard currentStudent = getItem(position);

        // Find the TextView in the card_layout.xml layout
        TextView subjectTextView = (TextView) listItemView.findViewById(R.id.subject);
        // Get the subject name from the current Student object and
        // set this text on the TextView
        subjectTextView.setText(currentStudent.getSubject());

        // Find the TextView in the card_layout.xml layout
        TextView quarter_one_TextView = (TextView) listItemView.findViewById(R.id.quarter_1);
        // Get the grade from the current Student object and
        // set this text on the TextView
        quarter_one_TextView.setText(currentStudent.getQuarter_1());

        // Find the TextView in the card_layout.xml layout
        TextView quarter_two_TextView = (TextView) listItemView.findViewById(R.id.quarter_2);
        // Get the grade from the current Student object and
        // set this text on the TextView
        quarter_two_TextView.setText(currentStudent.getQuarter_2());

        // Find the TextView in the card_layout.xml layout
        TextView quarter_three_TextView = (TextView) listItemView.findViewById(R.id.quarter_3);
        // Get the grade from the current Student object and
        // set this text on the number TextView
        quarter_three_TextView.setText(currentStudent.getQuarter_3());

        // Find the TextView in the card_layout.xml layout
        TextView quarter_four_TextView = (TextView) listItemView.findViewById(R.id.quarter_4);
        // Get the grade from the current Student object and
        // set this text on the number TextView
        quarter_four_TextView.setText(currentStudent.getQuarter_4());

        // Return the entire layout
        // so that it can be shown in the ListView
        return listItemView;
    }

}
