package com.bigsong.animationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button translateBtn, alphaBtn, rotateBtn, scaleBtn;
    private ImageView mImageView;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView mImageView = (ImageView) findViewById(R.id.iv_frame);
//        AnimationDrawable mAnimationDrawable = (AnimationDrawable) mImageView.getBackground();
//        mAnimationDrawable.start();

        mImageView = (ImageView) findViewById(R.id.iv_frame);

        translateBtn = (Button) findViewById(R.id.btn_translate);
        alphaBtn = (Button) findViewById(R.id.btn_alpha);
        rotateBtn = (Button) findViewById(R.id.btn_rotate);
        scaleBtn = (Button) findViewById(R.id.btn_scale);
        translateBtn.setOnClickListener(this);
        alphaBtn.setOnClickListener(this);
        rotateBtn.setOnClickListener(this);
        scaleBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_translate:
                animation = AnimationUtils.loadAnimation(this, R.anim.translate);
                break;
            case R.id.btn_alpha:
                animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
                break;
            case R.id.btn_rotate:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
                break;
            case R.id.btn_scale:
                animation = AnimationUtils.loadAnimation(this, R.anim.scale);
                break;
            default:
                break;
        }
        mImageView.setAnimation(animation);
        mImageView.startAnimation(animation);
    }
}
