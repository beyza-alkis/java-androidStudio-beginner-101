package com.example.kronometre;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<button> extends AppCompatActivity {
    TextView twTime;
    Runnable runnable;
    Handler handler;
    int sayac;
    Button buttonStart;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        twTime = findViewById(R.id.textView);
        sayac = 0;
        buttonStart = findViewById(R.id.buttonStart);

    }


    public void start(View view) {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                twTime.setText("Time: " + sayac);
                sayac++;
                twTime.setText("Time: " + sayac);
                handler.postDelayed(runnable, 1000);

            }
        };
        handler.post(runnable);
        buttonStart.setEnabled(false);

    }
    public void stopped (View view) {
        buttonStart.setEnabled(true);
        handler.removeCallbacks(runnable);
        sayac = 0;
        twTime.setText("Time: ");
    }
    public void finish (View view) {
        buttonStart.setEnabled(true);
        handler.removeCallbacks(runnable);

    }



        }

