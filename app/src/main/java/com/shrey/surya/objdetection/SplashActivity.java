package com.shrey.surya.objdetection;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by s
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(SplashActivity.this, DetectorActivity.class);
        SplashActivity.this.startActivity(intent);
        finish();
    }
}