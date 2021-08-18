package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class show_info extends AppCompatActivity {
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        btn1 = (Button) findViewById(R.id.info_to_main);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(show_info.this, Mainscreen.class);
                startActivity(intent);
            }
        });
        btn2 = (Button) findViewById(R.id.info_to_mypage);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(show_info.this, Mypage.class);
                startActivity(intent);
            }
        });
        btn3 = (Button) findViewById(R.id.info_to_num);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(show_info.this, Myrank.class);
                startActivity(intent);
            }
        });
    }
}