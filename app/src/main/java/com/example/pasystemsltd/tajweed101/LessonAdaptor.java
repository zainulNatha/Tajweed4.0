package com.example.pasystemsltd.tajweed101;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PAsystemsltd on 01/02/2018.
 */

public class LessonAdaptor extends ArrayAdapter<lessons_class> {

    public LessonAdaptor(Activity context, ArrayList<lessons_class> lessons){


        super (context, 0,lessons);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
//check if view being reused otherwise inflate view//
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item, parent, false);
        }

        // get the object located at this position on list//
        lessons_class currentLessons_class= getItem(position);

        TextView lessonNumberTextView=(TextView) listItemView.findViewById(R.id.lesson_number);
        //set text on lesson number text  view//
        lessonNumberTextView.setText(currentLessons_class.getLessonNumber());

        TextView lessonDescriptionTextView=(TextView) listItemView.findViewById(R.id.lesson_description);
        //set text on lesson description text  view//
        lessonDescriptionTextView.setText(currentLessons_class.getLessonDescription());

        //RETURN WHOLE LIST ITEM LAYOUT (2 TEXT VIEWS AND IMAGE VIEW), SHOWN IN LIST VIEW//
        return  listItemView;
    }
}
