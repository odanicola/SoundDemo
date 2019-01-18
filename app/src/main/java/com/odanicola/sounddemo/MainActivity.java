package com.odanicola.sounddemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mplayer;

    public void doPlay(View view){

        mplayer.start();
    }

    public void doPause(View view){
        if(mplayer.isPlaying()){
            mplayer.pause();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mplayer = MediaPlayer.create(this, R.raw.cinderella);
    }
}
