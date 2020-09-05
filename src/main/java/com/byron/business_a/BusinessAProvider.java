package com.byron.business_a;

import com.byron.base.router.BaseProvider;
import com.byron.business_a.actions.OpenMainActivityAction;

/**
 * 组件的provider，负责注册action
 */
public class BusinessAProvider extends BaseProvider {
    @Override
    protected void registerAction() {
        actions.put("business_a_open_activity_action", new OpenMainActivityAction());
    }
}
