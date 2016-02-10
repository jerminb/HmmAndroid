package com.hmm.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by arash on 1/25/16.
 */
public class Utils {

    public static void hideKeyboard(Activity activity) {
        View view = activity.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
    public static boolean hasCamera(Context context) {
        PackageManager pm = context.getPackageManager();
        if(pm.hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY)) {
            return true;
        }
        return false;
    }
    public static int getScreenWidth(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        return width;
    }
    public static int dpToPx(int dp)
    {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }
    public static String generateQueryForLimitOffset(int limit, int offset) {
        String query = "";
        if(limit > 0) {
            query += " LIMIT " + String.valueOf(limit);
            if(offset > 0) {
                query += " OFFSET " + String.valueOf(offset);
            }
        }
        return query;
    }
    public static boolean isEmpty(String str) {
        if(str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
