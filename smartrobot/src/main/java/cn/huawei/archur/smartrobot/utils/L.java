package cn.huawei.archur.smartrobot.utils;

import android.util.Log;

/**
 * 项目名： HUAWEI
 * 包名： cn.huawei.archur.smartrobot.utils
 * 文件名： L
 * 创建者： archur
 * 创建时间： 2017/9/2 22:58
 * 描述：TODO
 */

public class L {
    //是否Debug模式
    public static final boolean DEBUG = true;

    private static final String TAG = "smartrobot";

    public static void v(String text){
        if(DEBUG){
            Log.v(TAG,text);
        }
    }

    public static void d(String text){
        if(DEBUG){
            Log.d(TAG,text);
        }
    }

    public static void i(String text){
        if(DEBUG){
            Log.i(TAG,text);
        }
    }

    public static void w(String text){
        if(DEBUG){
            Log.w(TAG,text);
        }
    }


    public static void e(String text){
        if(DEBUG){
            Log.e(TAG,text);
        }
    }


}
