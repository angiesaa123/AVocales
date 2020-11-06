package com.example.aprenvocales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class inicio extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void a(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.aaa);
        mp.start();
    }
    public void e(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.eee);
        mp.start();
    }
    public void i(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.iii);
        mp.start();
    }
    public void o(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.ooo);
        mp.start();
    }
    public void u(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.uuu);
        mp.start();
    }
}