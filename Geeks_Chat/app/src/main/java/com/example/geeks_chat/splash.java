package com.example.geeks_chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    TextView Logo;
    Animation topAnin,bottoAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar();
        Logo=findViewById(R.id.textView);
        topAnin= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottoAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        Logo.setAnimation(topAnin);
        Logo.setAnimation(bottoAnim);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
              Intent intent=new Intent(splash.this, login.class);
              startActivity(intent);
              finish();
            }
        },4000);


    }
}