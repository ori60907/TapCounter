package com.fundamentals.academy.ori.tapcounter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView information_tv;
    private static final String KEY_TEST = "KEY_TEST";

    public static void start(Context context, int counter){
        Intent openSecondActivity = new Intent(context, SecondActivity.class);
        openSecondActivity.putExtra(KEY_TEST, counter);
        context.startActivity(openSecondActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        information_tv = findViewById(R.id.second_activity_information_tv);

        int counterFromIntent = getIntent().getIntExtra(KEY_TEST, 0);
        Toast.makeText(this, String.valueOf(counterFromIntent), Toast.LENGTH_LONG).show();

        information_tv.setText(String.valueOf(counterFromIntent));
    }
}
