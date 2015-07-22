package com.rongyi.rss.mallshop.customer;

import com.rongyi.easy.mallshop.customer.CustomerTagVO;
import com.rongyi.easy.mallshop.customer.CustomerTagsCreateParam;
import com.rongyi.easy.mallshop.customer.CustomerTagsDeleteParam;

import java.util.List;

/**
 * Created by xgq on 2015/7/22.
 */
public interface ROACustomerTagService {
    public List<CustomerTagVO> selectTagList(Integer customerId) throws Exception;

    public List<CustomerTagVO> selectDefaultTagList() throws Exception;

    public void saveCustomerTagList(CustomerTagsCreateParam customerTagsCreateParam);

    public void deleteCustomerTagList(CustomerTagsDeleteParam customerTagsDeleteParam);
}
