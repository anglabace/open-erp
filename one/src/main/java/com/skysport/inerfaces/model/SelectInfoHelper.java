package com.skysport.inerfaces.model;

import com.skysport.core.bean.system.SelectItem2;
import com.skysport.core.instance.SystemBaseInfo;

import java.util.List;
import java.util.Map;

/**
 * 说明:下拉列表信息辅助类
 * Created by zhangjh on 2016/1/8.
 */
public class SelectInfoHelper {

    /**
     * 通过下拉列表主键名查找下拉列表
     *
     * @param itemsName 下拉列表主键名
     * @return 下拉列表
     */
    public static List<SelectItem2> findSelectItemsByItemsName(String itemsName) {
        List<SelectItem2> selectItems;
        Map<String, List<SelectItem2>> bomBaseMaps = SystemBaseInfo.SINGLETONE.rtnBomInfoMap();
        selectItems = bomBaseMaps.get(itemsName);

        if (null == selectItems) {
            bomBaseMaps = SystemBaseInfo.SINGLETONE.rtnProjectInfoMap();
            selectItems = bomBaseMaps.get(itemsName);
        }
        return selectItems;
    }
}
