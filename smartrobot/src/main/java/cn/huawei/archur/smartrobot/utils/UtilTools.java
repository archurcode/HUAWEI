package cn.huawei.archur.smartrobot.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * 项目名： HUAWEI
 * 包名： cn.huawei.archur.smartrobot.utils
 * 文件名： UtilTools
 * 创建者： archur
 * 创建时间： 2017/9/2 9:59
 * 描述：TODO
 */

public class UtilTools {

    //设置字体
    public static void setFont(Context mContext, TextView tv){
        Typeface typeface = Typeface.createFromAsset(mContext.getAssets(),"fonts/FONT.TTF");
        tv.setTypeface(typeface);
    }

}
