package cn.huawei.archur.smartrobot;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import cn.huawei.archur.smartrobot.fragment.ButlerFragment;
import cn.huawei.archur.smartrobot.fragment.GirlFragment;
import cn.huawei.archur.smartrobot.fragment.UserFragment;
import cn.huawei.archur.smartrobot.fragment.WechatFragment;
import cn.huawei.archur.smartrobot.ui.SettingActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TabLayout mTabLayout;

    private ViewPager mViewPager;

    private FloatingActionButton mFloatBtn;

    private List<String> mTitle;

    private List<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //去掉ActionBar下的阴影
        getSupportActionBar().setElevation(0);

        initData();
        initView();

//        Toasty.info(this, "name="+ShareUtils.getString(this,"name", "def"), Toast.LENGTH_SHORT).show();
    }

    private void initData() {
        mTitle = new ArrayList<>();
        mTitle.add("服务管家");
        mTitle.add("微信精选");
        mTitle.add("美女如云");
        mTitle.add("用户中心");

        mFragments = new ArrayList<>();
        mFragments.add(new ButlerFragment());
        mFragments.add(new WechatFragment());
        mFragments.add(new GirlFragment());
        mFragments.add(new UserFragment());
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);

        mFloatBtn = (FloatingActionButton) findViewById(R.id.fab_setting);
        mFloatBtn.setVisibility(View.GONE);

        mViewPager.setOffscreenPageLimit(mFragments.size());
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    mFloatBtn.setVisibility(View.GONE);
                } else {
                    mFloatBtn.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragments.get(position);
            }

            @Override
            public int getCount() {
                return mFragments.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });

        mTabLayout.setupWithViewPager(mViewPager);
        mFloatBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab_setting:
                startActivity(new Intent(this, SettingActivity.class));
                break;
        }
    }
}
