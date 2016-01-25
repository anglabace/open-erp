package com.skysport.inerfaces.mapper.info;

import com.skysport.inerfaces.bean.info.ProductTypeInfo;
import com.skysport.core.mapper.CommonDao;
import org.springframework.stereotype.Component;

/**
 * Created by zhangjh on 2015/6/9.
 */
@Component("productTypeManageDao")
public interface ProductTypeManageMapper extends CommonDao<ProductTypeInfo> {
}
