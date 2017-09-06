package cn.huawei.archur.smartrobot.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.huawei.archur.smartrobot.R;

/**
 * 项目名： HUAWEI
 * 包名： cn.huawei.archur.smartrobot.fragment
 * 文件名： ButlerFragment
 * 创建者： archur
 * 创建时间： 2017/9/2 21:27
 * 描述：TODO
 */

public class ButlerFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_butler, null);
        return view;
    }
}
