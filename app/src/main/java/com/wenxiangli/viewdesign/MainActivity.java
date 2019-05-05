package com.wenxiangli.viewdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvDir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDir = findViewById(R.id.tv_dir);
        testXY();
    }

    //测试坐标点
    private void testXY() {
        tvDir.postDelayed(new Runnable() {
            @Override
            public void run() {
                tvDir.append("获取子View左上角距父View顶部的距离");
                tvDir.append(tvDir.getTop() + "\n");
                tvDir.append("获取子View左上角距父View左侧的距离");
                tvDir.append(tvDir.getLeft() + "\n");
                tvDir.append("获取子View右下角距父View顶部的距离");
                tvDir.append(tvDir.getBottom() + "\n");
                tvDir.append("获取子View右下角距父View左侧的距离");
                tvDir.append(tvDir.getRight() + "\n");
            }
        }, 300);


        tvDir.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                tvDir.setText("");
                tvDir.append("触摸点getX:" + event.getX() + "getY:" + event.getY()+"\n");
                tvDir.append("触摸点getRawX:" + event.getRawX() + "getRawY:" + event.getRawY()+"\n");
                tvDir.append(tvDir.getRight() + "");
                return false;
            }
        });

    }
}
