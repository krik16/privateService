package com.rongyi.rss.mallshop.customer;

import com.rongyi.easy.mallshop.customer.CustomerTagIdsParam;
import com.rongyi.easy.mallshop.customer.CustomerTagVO;
import com.rongyi.easy.mallshop.customer.CustomerTagsCreateParam;

import java.util.List;

/**
 * Created by xgq on 2015/7/22.
 */
public interface ROACustomerTagService {
    public List<CustomerTagVO> selectTagList(Integer customerId);

    public List<CustomerTagVO> selectDefaultTagList() throws Exception;

    public void saveCustomerTagList(CustomerTagsCreateParam customerTagsCreateParam);

    public void deleteCustomerTagList(CustomerTagIdsParam customerTagsDeleteParam);

    public void setupCustomerDefaultTagList(CustomerTagIdsParam customerTagIdsParam);
}
