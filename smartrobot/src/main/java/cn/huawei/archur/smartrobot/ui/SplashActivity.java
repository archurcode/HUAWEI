package cn.huawei.archur.smartrobot.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.huawei.archur.smartrobot.MainActivity;
import cn.huawei.archur.smartrobot.R;
import cn.huawei.archur.smartrobot.utils.ShareUtils;
import cn.huawei.archur.smartrobot.utils.StaticClass;
import cn.huawei.archur.smartrobot.utils.UtilTools;

public class SplashActivity extends AppCompatActivity {

    private TextView tv_splash;

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == StaticClass.HANDLER_SPLASH){
                if(isFirstRun()){
                    //跳到GuideActivity
                    startActivity(new Intent(SplashActivity.this, GuideActivity.class));
                }else{
                    //跳到LoginActivity
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                }

                finish();
            }
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }

    private void initView() {
        tv_splash = (TextView) findViewById(R.id.tv_splash);

        //设置字体
        UtilTools.setFont(this, tv_splash);

        mHandler.sendEmptyMessageDelayed(StaticClass.HANDLER_SPLASH, 1500);
    }

    private boolean isFirstRun() {
        boolean isFirst = ShareUtils.getBoolean(this, StaticClass.IS_FIRST_RUN, true);
        if (isFirst){
            ShareUtils.putBoolean(this, StaticClass.IS_FIRST_RUN, false);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
