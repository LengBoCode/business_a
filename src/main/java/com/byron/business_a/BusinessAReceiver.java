package com.byron.business_a;

import com.byron.base.router.BaseReceiver;
import com.byron.business_a.actions.OpenMainActivityAction;

/**
 * 组件的receiver，负责注册action
 */
public class BusinessAReceiver extends BaseReceiver {
    @Override
    protected void registerAction() {
        actions.put("business_a_open_activity_action", // action名称
                new OpenMainActivityAction()); // action执行对象
    }
}
