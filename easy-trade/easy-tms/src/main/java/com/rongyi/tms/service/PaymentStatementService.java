/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月28日上午10:08:44
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.settle.dto.PaymentStatementDto;

/**	
 * @Author:  柯军
 * @Description: 对账单 
 * @datetime:2015年9月28日上午10:08:44
 *
 **/

public interface PaymentStatementService {
	
	
    /**	
     * @Description: 分页查询 
     * @param map
     * @param currentPage
     * @param pageSize
     * @return	
     * @Author:  柯军
     * @datetime:2015年9月28日上午10:11:42
     **/
    List<PaymentStatementDto> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize);

    /**	
     * @Description:  分页查询总数
     * @param map
     * @return	
     * @Author:  柯军
     * @datetime:2015年9月28日上午10:11:32
     **/
    Integer selectPageListCount(Map<String, Object> map);
    
    /**	
     * @Description: 更新对账单状态 
     * @param map	
     * @Author:  柯军
     * @datetime:2015年9月29日下午3:01:31
     **/
    void updateByNotify(Map<String,Object> map);
    
    /**	
     * @Description: 更新线下付款状态 
     * @param ids
     * @param payMemo	
     * @Author:  柯军
     * @datetime:2015年9月30日下午4:21:10
     **/
    void updateByOffPay(String[] ids,String payMemo,Integer status);
}
