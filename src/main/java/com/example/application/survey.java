package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class survey extends AppCompatActivity {

    EditText editTextNumber4,editTextNumber2,et_wake,et_sleep;
    Button btn_plus1, btn_minus1,btn_plus2, btn_minus2,btn_plus3, btn_minus3,btn_plus4, btn_minus4, btn;
    String input,input2,input3,input4;
    int sum,sub, sum2, sub2,sum3,sub3,sum4,sub4;

    //생리 평균 일수 +, - 버튼
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        editTextNumber4 = (EditText) findViewById(R.id.editTextNumber4);
        btn_plus1 = (Button) findViewById(R.id.btn_plus1);

        btn_plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = editTextNumber4.getText().toString();
                sum = Integer.parseInt(input) + 1;
                editTextNumber4.setText(Integer.toString(sum));
            }
        });

        btn_minus1 = (Button) findViewById(R.id.btn_minus1);

        btn_minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = editTextNumber4.getText().toString();
                sub = Integer.parseInt(input) - 1;
                editTextNumber4.setText(Integer.toString(sub));
            }

        });

        //생리 평균 주기 +, - 버튼

        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        btn_plus2 = (Button) findViewById(R.id.btn_plus2);

        btn_plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input2 = editTextNumber2.getText().toString();
                sum2 = Integer.parseInt(input2) + 1;
                editTextNumber2.setText(Integer.toString(sum2));
            }

        });

        btn_minus2 = (Button) findViewById(R.id.btn_minus2);

        btn_minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input2 = editTextNumber2.getText().toString();
                sub2 = Integer.parseInt(input2) - 1;
                editTextNumber2.setText(Integer.toString(sub2));
            }

        });

        //기상 시간 +, - 버튼
        et_wake = (EditText) findViewById(R.id.et_wake);
        btn_plus3 = (Button) findViewById(R.id.btn_plus3);

        btn_plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input3 = et_wake.getText().toString();
                sum3 = Integer.parseInt(input3) + 1;
                et_wake.setText(Integer.toString(sum3));
            }
        });

        btn_minus3 = (Button) findViewById(R.id.btn_minus3);

        btn_minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input3= et_wake.getText().toString();
                sub3 = Integer.parseInt(input3) - 1;
                et_wake.setText(Integer.toString(sub3));
            }

        });

        //취침 시간 +, - 버튼
        et_sleep = (EditText) findViewById(R.id.et_sleep);
        btn_plus4 = (Button) findViewById(R.id.btn_plus4);

        btn_plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input4 = et_sleep.getText().toString();
                sum4 = Integer.parseInt(input4) + 1;
                et_sleep.setText(Integer.toString(sum4));
            }
        });

        btn_minus4 = (Button) findViewById(R.id.btn_minus4);

        btn_minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input4= et_sleep.getText().toString();
                sub4 = Integer.parseInt(input4) - 1;
                et_sleep.setText(Integer.toString(sub4));
            }

        });
        btn = (Button) findViewById(R.id.survey_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(survey.this, Mainscreen.class);
                startActivity(intent);
            }
        });
    }

}