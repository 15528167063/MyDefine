package com.example.administrator.mydefine.defineline.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.mydefine.utils.DensityUtils;

@SuppressLint("AppCompatCustomView")
public class defineLine extends TextView {
    private Paint paint;

    public defineLine(Context context) {
        super(context);
        init();
    }


    public defineLine(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public defineLine(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint=new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(2);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);//绘图样式，对于设文字和几何图形都有效
        paint.setTextAlign(Paint.Align.CENTER);//设置文字对齐方式，取值：align.CENTER、align.LEFT或align.RIGHT
        paint.setTextSize(DensityUtils.sp2px(getContext(),22));//设置文字大小
        //样式设置
        paint.setShadowLayer(8,10,10,Color.BLUE);
        setLayerType(View.LAYER_TYPE_HARDWARE, paint);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String text="红色最高最低线 蓝色建议最高最低线   白色中线 绿色基基准线abcgjhf";
        float x = getWidth() / 2;//宽度一半（基线）
        float y = getHeight() / 2;//高度一半

        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float ascentY = fontMetrics.ascent +  y;
        float descentY = fontMetrics.descent + y;
        float topY = fontMetrics.top + y;
        float bottomY = fontMetrics.bottom + y;

        float x1 = x-paint.measureText(text)/2;
        float x2 = x+paint.measureText(text)/2;
        paint.setColor(Color.BLACK);
        canvas.drawText(text,x, y,paint);


        /**
         * -1> topLine–可绘制最高线
         * -2> ascentLine–建议绘制单行字符最高线
         * -3> descentLine–建议绘制单行字符最低线
         * -4> bottomLine–可绘制最低线
         *          中线=最高加最低
         */
        paint.setStrokeWidth(5);
        paint.setColor(Color.WHITE);
        float middleline=(ascentY+descentY)/2;
        canvas.drawLine(x1, middleline, x2, middleline, paint); //中线

        paint.setColor(Color.GREEN);
        canvas.drawLine(x1,y , x2, y, paint);            //基准线
        paint.setColor(Color.BLUE);
        canvas.drawLine(x1, ascentY, x2, ascentY, paint);  //建议最高线
        paint.setColor(Color.BLUE);
        canvas.drawLine(x1, descentY, x2, descentY, paint);//建议最低线
        paint.setColor(Color.RED);
        canvas.drawLine(x1, topY, x2, topY, paint);   //绘制最高线
        paint.setColor(Color.RED);
        canvas.drawLine(x1, bottomY, x2, bottomY, paint);  //绘制最低线
    }
}
