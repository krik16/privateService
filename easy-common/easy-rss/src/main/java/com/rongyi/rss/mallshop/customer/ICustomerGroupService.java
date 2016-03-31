package com.rongyi.rss.mallshop.customer;

import com.rongyi.easy.mallshop.customer.CustomerGroup;
import com.rongyi.easy.mallshop.customer.CustomerGroupPageVO;
import com.rongyi.easy.mallshop.customer.PageParam;

/**
 * Created by xgq on 2015/7/17.
 */
public interface ICustomerGroupService {

    public CustomerGroupPageVO selectByGuide(Integer guideId, PageParam pageParam) throws Exception;

    public Integer saveCustomerGroup(CustomerGroup customerGroup);

    public void updateCustomerGroup(CustomerGroup customerGroup);

    public void deleteCustomerGroup(Integer groupId) throws Exception;
}
