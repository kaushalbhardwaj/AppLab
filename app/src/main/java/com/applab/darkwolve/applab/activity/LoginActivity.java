package com.applab.darkwolve.applab.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

import com.applab.darkwolve.applab.R;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Login");

    }


    @OnClick(R.id.login)
    public void login()
    {
        Intent i=new Intent(LoginActivity.this,LabActivity.class);
        startActivity(i);
        finish();

    }


}
