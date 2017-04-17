package com.delaroystudios.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

/**
 * Created by dalla on 3/4/2017.
 */

public class BarInfo extends AppCompatActivity{

    //private String getBarTitle(TextView view){
        //return album.getName();
    //}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_page);

        //TextView bar_name = (TextView) findViewById(R.id.bar_name);
        //TextView bar_title = (TextView) findViewById(R.id.title);
        //String bar_nameTView = getBarTitle(bar_title);
        //bar_name.setText(bar_nameTView);



    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
                setContentView(R.layout.bar_page);
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    //for text view might have to do a switch statement


}
