package com.rongyi.rss.mallshop.customer;

import com.rongyi.easy.mallshop.customer.CustomerGroup;

import java.util.List;

/**
 * Created by xgq on 2015/7/17.
 */
public interface ROACustomerGroupService {

    /**
     * 获取导购的客户组列表
     * @param guideId
     * @return
     * @throws Exception
     */
    public List<CustomerGroup> selectByGuide(Integer guideId) throws Exception;
}
