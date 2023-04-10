package com.example.krec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AReceptActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitActivity(findViewById(R.id.textView),findViewById(R.id.textView2),findViewById(R.id.textView3),findViewById(R.id.textView4),findViewById(R.id.textView5));
    }
}