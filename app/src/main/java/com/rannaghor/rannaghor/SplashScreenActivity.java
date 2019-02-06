package com.rannaghor.rannaghor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                //.withSplashTimeOut(1000)
                .withBackgroundColor(Color.rgb(173, 20, 87))
                //.withHeaderText("Welcome to Ranna Ghor")
                //.withFooterText("Copyright 2018")
                .withLogo(R.drawable.logo)
                .withAfterLogoText("Welcome to bdrannaghar");

//        config.getHeaderTextView().setTextColor(Color.rgb(171,218,252));
//        config.getHeaderTextView().setTextSize(28);
//        config.getHeaderTextView().setPadding(0, 15, 0, 0);

        config.getAfterLogoTextView().setTextColor(Color.rgb(171,218,252));
        config.getAfterLogoTextView().setPadding(0, 15, 0, 0);

//        config.getFooterTextView().setTextColor(Color.rgb(171,218,252));
//        config.getFooterTextView().setPadding(0, 0, 0, 15);


        View view = config.create();

        setContentView(view);

    }
}
