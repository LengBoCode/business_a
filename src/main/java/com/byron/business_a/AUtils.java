package com.byron.business_a;

import android.content.Context;
import android.widget.Toast;

import com.byron.base.BaseUtils;
import com.byron.base.router.Response;
import com.byron.base.router.RouterUtils;

public class AUtils {
    public static void sayHello(Context context) {
        RouterUtils.request("business_b", "business_b_say_hello_action", new Response() {
            @Override
            public void response(Object... params) {

            }
        });
        Toast.makeText(context, "hello "+ BaseUtils.getNetHello(), Toast.LENGTH_LONG).show();
    }
}
