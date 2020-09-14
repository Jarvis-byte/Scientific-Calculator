package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        new Timer().schedule(new TimerTask(){
            public void run() {
                FirstPage.this.runOnUiThread(new Runnable() {
                    public void run() {
                        startActivity(new Intent(FirstPage.this, MainActivity.class));
                    }
                });
            }
        }, 800);
    }
}