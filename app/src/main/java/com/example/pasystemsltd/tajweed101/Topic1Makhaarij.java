package com.example.pasystemsltd.tajweed101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Topic1Makhaarij extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_list);

        ArrayList<lessons_class> lessons=new ArrayList<>();

        //lessons.add(new"lesson 1")//

        lessons.add(new lessons_class("Lesson 1","Introduction to Makhaarij"));
        lessons.add(new lessons_class("Lesson 2","Letters of The Throat (Al-Halq)"));
        lessons.add(new lessons_class("Lesson 3","Letters of The Lips (Al-Shafataan) "));
        lessons.add(new lessons_class("Lesson 4","Letters of The Nasal Cavity (Al-Khayshoom) "));
        lessons.add(new lessons_class("Lesson 5","Letters of The Tongue (Al-Lisaan) "));
        lessons.add(new lessons_class("Lesson 6","Letters of The Oral Cavity (Al-Jawf) "));
        lessons.add(new lessons_class("Lesson 7","Summary of Makhaarij "));
        lessons.add(new lessons_class("Lesson 8","Heavy and Light Letters "));
        lessons.add(new lessons_class("Lesson 9","Quiz "));

        //lessonAdaptor to link and display single lesson//
        LessonAdaptor adaptor=
                new LessonAdaptor(this, lessons);

        ListView listView= (ListView) findViewById(R.id.list);


        listView.setAdapter(adaptor);


    }
}
