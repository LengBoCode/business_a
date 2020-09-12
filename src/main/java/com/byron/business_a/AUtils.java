package com.byron.business_a;

import android.content.Context;
import android.widget.Toast;

import com.byron.base.router.Response;
import com.byron.base.router.Dispatcher;

public class AUtils {
    public static void sayHello(Context context) {
        Dispatcher.request("business_b", // receiver名称
                "business_b_say_hello_action", // 执行的动作
                new Response() { // 结果回调
                    @Override
                    public void response(Object... params) {

                    }
                });

        Toast.makeText(context, "hello " + context.getResources().getString(R.string.from_net), Toast.LENGTH_LONG).show();
    }
}
