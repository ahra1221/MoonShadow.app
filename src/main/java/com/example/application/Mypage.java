package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class Mypage extends AppCompatActivity {

    private Button btn_1,btn_2, btn_3, btn_4, btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);


        btn_1 = findViewById(R.id.btn_move);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mypage.this, period_info.class);
                startActivity(intent);
            }
        });

        btn_3 = findViewById(R.id.btn_move3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mypage.this, Myrank.class);
                startActivity(intent);
            }
        });

        btn_4 = findViewById(R.id.btn_move4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mypage.this, num_recommend.class);
                startActivity(intent);
            }
        });
        btn_home = findViewById(R.id.mypage_to_main);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mypage.this, Mainscreen.class);
                startActivity(intent);
            }
        });
    }
}