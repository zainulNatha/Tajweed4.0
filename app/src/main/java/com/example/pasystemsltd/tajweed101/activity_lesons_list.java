package com.example.pasystemsltd.tajweed101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class activity_lesons_list extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesons_list);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //set event//
        setSingleEvent(mainGrid);
    }


    private void setSingleEvent(GridLayout mainGrid) {
        //loop all child items of main grid//
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //cast object to cardView

            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI == 0) //open activty one//
                    {
                        Intent intent = new Intent(activity_lesons_list.this, Topic1Makhaarij.class);
                    }

                }
            });
        }
    }
}
