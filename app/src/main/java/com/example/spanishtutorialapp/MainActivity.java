package com.example.spanishtutorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void play(View view){
        Button button=(Button)view;
        MediaPlayer mediaPlayer=MediaPlayer.create(
                this,
                getResources().getIdentifier(button.getTag().toString(),
                        "raw",
                        getPackageName()));
        mediaPlayer.start();
    }
}