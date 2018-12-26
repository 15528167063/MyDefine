package com.example.administrator.mydefine.defineline;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.administrator.mydefine.R;
import com.example.administrator.mydefine.bean.PieData;
import com.example.administrator.mydefine.defineline.view.defineOverl;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DefineLineActicity  extends AppCompatActivity {
    @BindView(R.id.tv_1)
    TextView textView01;
    @BindView(R.id.tv_4)
    defineOverl textView04;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_define_line);
        ButterKnife.bind(this);
        textView01.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        initdata4();
    }
    private ArrayList<PieData> mData=new ArrayList<>();
    private void initdata4() {
        PieData pieData = new PieData("11", 20);
        PieData pieData1 = new PieData("22", 30);
        PieData pieData2= new PieData("33", 30);
        mData.add(pieData);
        mData.add(pieData1);
        mData.add(pieData2);
        textView04.setData(mData);
    }
}
