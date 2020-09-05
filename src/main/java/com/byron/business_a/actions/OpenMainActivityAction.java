package com.byron.business_a.actions;

import android.app.Activity;
import android.content.Intent;

import com.byron.base.router.BaseAction;
import com.byron.base.router.Response;
import com.byron.business_a.MainActivity;

/**
 * 开启组件activity的动作
 */
public class OpenMainActivityAction extends BaseAction {
    @Override
    public void execute(Response response, Object... params) {
        Activity activity = (Activity) params[0];
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
        response.response("跳转成功");
    }
}
