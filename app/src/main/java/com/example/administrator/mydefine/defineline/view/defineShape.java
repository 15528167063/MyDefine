package com.example.administrator.mydefine.defineline.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.mydefine.utils.DensityUtils;

@SuppressLint("AppCompatCustomView")
public class defineShape extends TextView {
    private Paint paint;

    public defineShape(Context context) {
        super(context);
        init();
    }


    public defineShape(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public defineShape(Context context, AttributeSet attrs, int defStyleAttr) {
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
        //样式设置
        paint.setShadowLayer(8,10,10,Color.BLUE);
        setLayerType(View.LAYER_TYPE_HARDWARE, paint);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawColor(Color.CYAN);

        float x = getWidth() / 2;//宽度一半（基线）
        float y = getHeight() / 2;//高度一半
        Rect rect1=new Rect(10,10,300,300);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(rect1,paint);
        /**
         * 带圆角的长方
         */
        paint.setStyle((Paint.Style.FILL_AND_STROKE));
        RectF rect2=new RectF(310,10,620,300);
        canvas.drawRoundRect(rect2,20,20,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rect2,22,180,true,paint);
        /**
         * 圆
         */
        paint.setColor(Color.RED);
        paint.setStyle((Paint.Style.FILL_AND_STROKE));
        canvas.drawCircle(770,150,150,paint);
        /**
         *扇形
         */
        paint.setColor(Color.GREEN);
        RectF rectF=new RectF(10,10,300,300);
        canvas.drawArc(rectF,0,90,true,paint);
        /**
         *椭圆(590 290代表椭圆的高宽)
         */
        RectF rectF1=new RectF(10,310,600,600);
        paint.setColor(Color.BLUE);
        canvas.drawRect(rectF1,paint);
        paint.setColor(Color.RED);
        canvas.drawRoundRect(rectF1,590,290,paint);
        /**
         *椭圆2
         */
        RectF rectF3=new RectF(620,310,1200,600);
        paint.setColor(Color.BLUE);
        canvas.drawRect(rectF3,paint);
        paint.setColor(Color.RED);
        canvas.drawOval(rectF3,paint);

    }
}
