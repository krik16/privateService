package com.rongyi.rss.mallshop.customer;

import com.rongyi.easy.mallshop.customer.*;

/**
 * Created by xgq on 2015/7/22.
 */
public interface ROACustomerService {
    public CustomerVO selectCustomer(Integer customerId) throws Exception;

    public Integer saveCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public void moveGroup(CustomerMoveGroupParam moveGroupParam);

    public CustomerOrderListVO selectOrderList(Integer guideId, CustomerOrderListParam customerOrderListParam) throws Exception;

    public CustomerSimpleVO selectCustomerSimpleVOsByGroup(Integer guideId, Integer groupId) throws Exception;
}
