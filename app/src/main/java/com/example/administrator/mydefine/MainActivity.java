package com.example.administrator.mydefine;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.mydefine.defineline.DefineLineActicity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mbtn_01;
    private Button mbtn_02;
    private Button mbtn_03;
    private Button mbtn_04;
    private Button mbtn_05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mbtn_01=findViewById(R.id.mbtn_1);
        mbtn_02=findViewById(R.id.mbtn_2);
        mbtn_03=findViewById(R.id.mbtn_3);
        mbtn_04=findViewById(R.id.mbtn_4);
        mbtn_05=findViewById(R.id.mbtn_5);
        mbtn_01.setOnClickListener(this);
        mbtn_02.setOnClickListener(this);
        mbtn_03.setOnClickListener(this);
        mbtn_04.setOnClickListener(this);
        mbtn_05.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mbtn_1:
                Intent intent=new Intent(this,DefineLineActicity.class);
                startActivity(intent);
                break;
            case R.id.mbtn_2:
                break;
            case R.id.mbtn_3:
                break;
            case R.id.mbtn_4:
                break;
            case R.id.mbtn_5:
                break;
        }
    }

}
