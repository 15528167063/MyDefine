package com.example.administrator.mydefine.defineline;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.mydefine.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DefineLineActicity  extends AppCompatActivity {
    @BindView(R.id.tv_1)
    TextView textView01;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_define_line);
        ButterKnife.bind(this);
        textView01.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
    }
}
