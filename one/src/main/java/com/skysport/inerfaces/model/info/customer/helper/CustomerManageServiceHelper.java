package com.skysport.inerfaces.model.info.customer.helper;

import com.skysport.core.bean.system.SelectItem2;
import com.skysport.core.init.SpringContextHolder;
import com.skysport.core.instance.SystemBaseInfo;
import com.skysport.inerfaces.model.info.customer.service.impl.CustomerManageServiceImpl;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * 类说明:
 * Created by zhangjh on 2015/7/7.
 */
public enum CustomerManageServiceHelper {
    SINGLETONE;

    public void refreshSelect() {
        CustomerManageServiceImpl customerManageService = SpringContextHolder.getBean("customerManageService");
        List<SelectItem2> customerItems = customerManageService.querySelectList(null);
        SystemBaseInfo.SINGLETONE.pushBom("customerItems", customerItems);
        SystemBaseInfo.SINGLETONE.pushProject("customerItems", customerItems);
    }
}
