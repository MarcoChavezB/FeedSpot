package com.example.feedspot;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.example.feedspot.Routes.Router;

public class MainActivity extends AppCompatActivity {

    CountDownTimer timeout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeout = new CountDownTimer(1500, 1500) {
            @Override
            public void onTick(long millisUntilFinished) {

            }
            @Override
            public void onFinish() {

                Router.redirectTo(MainActivity.this, register.class);
            }
        };

        timeout.start();
    }

}