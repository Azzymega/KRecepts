package com.example.krec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity{

    protected Button brownie;
    protected Button kulichShuchenka;
    protected Button rediska;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        brownie = findViewById(R.id.button);
        kulichShuchenka = findViewById(R.id.button2);
        rediska = findViewById(R.id.button3);
        rediska.setOnClickListener(this::onRediskaClick);
        brownie.setOnClickListener(this::onBrownieClick);
        kulichShuchenka.setOnClickListener(this::onKulichShuchenkaClick);
    }
    public void onRediskaClick(View view){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("Recept", new RediskaVMasle());
        startActivity(intent);
    }
    public void onKulichShuchenkaClick(View view){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("Recept", new KulichShuchenka());
        startActivity(intent);
    }
    public void onBrownieClick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("Recept", new Brownie());
        startActivity(intent);
    }
}