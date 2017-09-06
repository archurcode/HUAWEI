package cn.huawei.archur.smartrobot.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import cn.huawei.archur.smartrobot.R;

/**
 * 项目名： HUAWEI
 * 包名： cn.huawei.archur.smartrobot.ui
 * 文件名： BaseActivity
 * 创建者： archur
 * 创建时间： 2017/9/2 9:43
 * 描述：TODO
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
