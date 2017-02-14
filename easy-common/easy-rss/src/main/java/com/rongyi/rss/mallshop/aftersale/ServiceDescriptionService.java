package com.rongyi.rss.mallshop.aftersale;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mallshop.customer.ServiceDescriptionParam;

import java.util.List;

/**
 * Created by 武辉 on 2016/12/15.
 * 售后说明服务接口
 */
public interface ServiceDescriptionService {

    /**
     * 根据用户id获得售后说明列表
     * @param param param
     * @return
     */
    ResponseVO getServiceDescList(ServiceDescriptionParam param);

    /**
     * 根据用户id获取该用户的默认售后说明
     * @param param
     * @return
     */
    ResponseVO  getDefaultByUserId(ServiceDescriptionParam param);

    /**
     * 更新售后说明
     * @param param
     */
    ResponseVO insertUpdateRecord(ServiceDescriptionParam param);

    /**
     *删除一条售后说明
     * @param param
     */
    ResponseVO deleteRecode(ServiceDescriptionParam param);

    /**
     * 设置默认售后说明
     * @param param
     */
    ResponseVO setDefault(ServiceDescriptionParam param);

    /**
     * 获取预设文案
     * @return
     */
    ResponseVO getPreInstalled();

    /**
     * 修改预设文案
     * @param param
     * @return
     */
    ResponseVO changePreInstalled(ServiceDescriptionParam param);

    ServiceDescriptionParam getById(Integer id);

}
