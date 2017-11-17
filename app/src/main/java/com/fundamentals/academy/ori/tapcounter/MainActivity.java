package com.fundamentals.academy.ori.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    private TextView counter_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter_tv = findViewById(R.id.tv_counter);
    }

    public void increaseNumber(View view) {
        counter++;
        counter_tv.setText(String.valueOf(counter));
    }
}
