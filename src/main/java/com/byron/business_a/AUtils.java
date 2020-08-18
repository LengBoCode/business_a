package com.byron.business_a;

import android.content.Context;
import android.widget.Toast;

import com.byron.base.BaseUtils;

public class AUtils {
    public static void sayHello(Context context) {
        Toast.makeText(context, "hello "+ BaseUtils.getNetHello(), Toast.LENGTH_LONG).show();
    }
}
