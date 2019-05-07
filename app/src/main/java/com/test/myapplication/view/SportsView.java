package com.test.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class SportsView extends View {

    float mProgress = 0;
    //抗锯齿
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();

    public float getProgress() {
        return mProgress;
    }

    public void setProgress(float progress) {
        this.mProgress = progress;

        invalidate();//自动调用onDraw()
    }


    public SportsView(Context context) {
        super(context);
    }

    public SportsView(Context context, AttributeSet attrs) {
        super(context, attrs);
//        initPath();
    }

    public SportsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void initPath() {

//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);

        //添加圆
        path.addCircle(300, 300, 200, Path.Direction.CW);
//        path.addOval(); 添加椭圆
//        path.addRect();//添加矩形
//        path.addRoundRect();//添加圆角矩形
//        path.addPath();//添加另外一个Path
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //红色圆
//        paint.setColor(Color.RED);
//        canvas.drawCircle(300, 300, 200, paint);
        //圆环
//        paint.setStyle(Paint.Style.STROKE);// FILL-填充模式;STROKE-画线模式
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(20);//线条宽度为20像素
//        canvas.drawCircle(300,300,200,paint);


        //绘制矩形
//        paint.setStyle(Paint.Style.FILL);//填充
//        canvas.drawRect(50,100,500,500,paint);
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawRect(600,100,1100,500,paint);

        //画点
    /*    paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.SQUARE);//ROUND -圆点 SQUARE -矩形
        canvas.drawPoint(50,50,paint);*/

        //椭圆
      /*  paint.setStyle(Paint.Style.FILL);
        canvas.drawOval(50,50,350,200,paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawOval(400,50,700,200,paint);*/

        //画线
//        canvas.drawLine(200,200,800,500,paint);
//        canvas.drawLines();
        //圆角矩形
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawRoundRect(100,100,500,300,50,50,paint);

        //绘制扇形
       /* paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint);
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint);
        paint.setStyle(Paint.Style.STROKE);//画线模式
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint);



         paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200, 100, 800, 500, -100, 100, true, paint);
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint);
        */


        //绘制黑桃♥
//        canvas.drawPath(path, paint);

        //
      /*  paint.setStyle(Paint.Style.STROKE);
        path.lineTo(100, 100);
        path.arcTo(100, 100, 300, 300, -90, 90, true);
        path.addCircle(300, 300, 200, Path.Direction.CW);
        canvas.drawPath(path, paint);
        */

        //绘制三角形
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(100, 100);
        path.lineTo(200, 100);
        path.lineTo(150, 150);
        path.close();
        canvas.drawPath(path, paint);

//        paint.setStyle();//设置绘制模式
//        paint.setColor();//设置颜色
//        paint.setStrokeWidth();//设置线条宽度
//        paint.setTextSize();//设置文字大小
//        paint.setAntiAlias();//设置抗锯齿开关
    }

//    ViewPropertyAnimator viewPropertyAnimator =

//    ObjectAnimator animator = ObjectAnimator.ofFloat(view,"progress",0,65);

}
