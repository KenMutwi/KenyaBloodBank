package com.ken.kenyabloodbank.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.ken.kenyabloodbank.R;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,MainActivity.class));
                finish();

            }
        },2500);
    }
}
