package com.mykj.qupingfang;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mykj.qupingfang.login.activity.LoginActivity;

/**
 * Description: 启动页
 * Created by jia on 2017/7/4.
 * 人之所以能，是相信能
 */
public class SplashActivity extends Activity implements View.OnClickListener{

    private TextView tv;

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what==0){
                // 跳转到登录界面
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tv= (TextView) findViewById(R.id.tv);
        handler.sendEmptyMessageDelayed(0,2000);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv:



                break;
        }
    }
}
