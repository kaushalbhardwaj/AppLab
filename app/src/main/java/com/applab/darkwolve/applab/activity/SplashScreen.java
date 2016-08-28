package com.applab.darkwolve.applab.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.applab.darkwolve.applab.R;
import com.applab.darkwolve.applab.activity.LoginActivity;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setStatusBarColor("#3f51b5");


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
                finish();

            }
        }, SPLASH_TIME_OUT);
    }
    private void setStatusBarColor(String color) {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT&&Build.VERSION.SDK_INT<Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setTintColor(Color.parseColor(color));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(Color.parseColor(color));
        }
    }
}
