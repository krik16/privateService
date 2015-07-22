package com.rongyi.rss.mallshop.customer;

import com.rongyi.easy.mallshop.customer.CustomerTag;
import com.rongyi.easy.mallshop.customer.CustomerTagVO;

import java.util.List;

/**
 * Created by xgq on 2015/7/22.
 */
public interface ROACustomerTagService {
    public List<CustomerTagVO> selectTagList(Integer customerId) throws Exception;

    public List<CustomerTagVO> selectDefaultTagList() throws Exception;

    public Integer saveCustomerTag(CustomerTag customerTag);

    public void deleteCustomerTag(Integer tagId, Integer customerId);
}
