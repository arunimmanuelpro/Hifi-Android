package com.brilliantbird.hifi_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.brilliantbird.hifi_android.exception.CustomException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        throw new CustomException("Intentionally thrown");
    }
}
