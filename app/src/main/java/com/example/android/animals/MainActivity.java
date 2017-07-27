package com.example.android.animals;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton b1,b2, b3,b4,b5,b6,b7,b8;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        b1 = (ImageButton) findViewById(R.id.bee);
        b2 = (ImageButton) findViewById(R.id.bird);
        b3 = (ImageButton) findViewById(R.id.cow);
        b4 = (ImageButton) findViewById(R.id.horse);
        b5 = (ImageButton) findViewById(R.id.dolphin);
        b6 = (ImageButton) findViewById(R.id.rhino);
        b7 = (ImageButton) findViewById(R.id.rooster);
        b8 = (ImageButton) findViewById(R.id.goat);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
    }

    @Override
    public void onPause(){
        super.onPause();
        if(mp!=null)
            mp.stop();
    }
    @Override
    public void onClick(View v) {
        if(b1.isPressed())
            play(R.raw.bees);
        else if(b2.isPressed())
            play(R.raw.bird);
        else if(b3.isPressed())
            play(R.raw.cow);
        else if(b4.isPressed())
            play(R.raw.horse);
        else if(b5.isPressed())
            play(R.raw.dolphin);
        else if(b6.isPressed())
            play(R.raw.rhino);
        else if(b7.isPressed())
            play(R.raw.rooster);
        else if(b8.isPressed())
            play(R.raw.goat);
    }


    void play(int id){
        if(mp!=null)
            mp.stop();
        mp = MediaPlayer.create(this, id);
        mp.start();
    }
}
