package com.rongyi.rss.mallshop.aftersale;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.mallshop.customer.ServiceDescriptionParam;

import java.util.List;

/**
 * Created by 武辉 on 2016/12/15.
 * 售后说明服务接口
 */
public interface ServiceDescriptionService {

    /**
     * 根据用户id获得售后说明列表
     * @param userId 用户id
     * @return
     */
    ResponseResult getServiceDescList(String userId);

    /**
     * 根据用户id获取该用户的默认售后说明
     * @param userId
     * @return
     */
    ResponseResult  getDefaultByUserId(String userId);

    /**
     * 更新售后说明
     * @param param
     */
    ResponseResult insertUpdateRecord(ServiceDescriptionParam param);

    /**
     *删除一条售后说明
     * @param param
     */
    ResponseResult deleteRecode(ServiceDescriptionParam param);

    /**
     * 设置默认售后说明
     * @param param
     */
    ResponseResult setDefault(ServiceDescriptionParam param);

}
