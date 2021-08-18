package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mainscreen extends AppCompatActivity {

    Button btn, btn2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        btn = (Button) findViewById(R.id.event_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mainscreen.this, survey.class);
                startActivity(intent);
            }
        });

        btn2 = (Button) findViewById(R.id.main_to_mypage);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mainscreen.this, Mypage.class);
                startActivity(intent);
            }
        });

        img=(ImageView)findViewById(R.id.img1);
        img.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Mainscreen.this, show_info.class);
                startActivity(intent);
            }
        });
    }
}