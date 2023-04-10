package com.example.krec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button brownie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        brownie = findViewById(R.id.button);
        brownie.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        Brownie brownie = new Brownie();
        intent.putExtra("Recept", brownie);
        startActivity(intent);
    }
}