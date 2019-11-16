package com.TeamGala.views;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;


public class Gala_SplashScreen extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_gala__splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goToBoardingScreen = new Intent(Gala_SplashScreen.this,Gala_OnBoadingScreen.class);
                Gala_SplashScreen.this.startActivity(goToBoardingScreen);
                Gala_SplashScreen.this.finish();
            }
        },3500);

    }
}
