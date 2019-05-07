package com.test.myapplication;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* mImageView = findViewById(R.id.imageView);
        //属性动画
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(mImageView,"translationX",500);
                objectAnimator.start();
            }
        });*/
//        Animation animation = new TranslateAnimation(0,1f,1,2f);


        /**
         *
         */
//        ViewPropertyAnimator
//        TypeEvaluator




    }
}
