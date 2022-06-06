package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.animation);
        AnimationDrawable animation = (AnimationDrawable) imageView.getBackground();
        animation.start();

        new Handler().postDelayed(() ->{
            Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
            startActivity(intent);
        },2000);
    }
}