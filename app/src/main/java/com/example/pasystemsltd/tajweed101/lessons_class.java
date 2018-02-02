package com.example.pasystemsltd.tajweed101;

/**
 * Created by PAsystemsltd on 01/02/2018.
 */

public class lessons_class {

    private String mLessonNumber;

    private String mLessonDescription;

    public lessons_class(String lessonNumber,String lessonDescription){

        mLessonNumber=lessonNumber;
        mLessonDescription=lessonDescription;
    }

    //get lesson number//

    public String getLessonNumber() {

        return mLessonNumber;
    }



    //get lesson description//

    public String getLessonDescription(){

        return mLessonDescription;
    }
}

