/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日上午10:15:30
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.tms.vo.TradeVO;


/**	
 * @Author:  柯军
 * @Description: 退款接口 
 * @datetime:2015年5月26日下午2:55:00
 *
 **/
public interface RefundService {

    /**	
     * @Description: 退款列表分页数据
     * @param map
     * @param currentPage
     * @param pageSize
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日上午10:17:14
     **/
    public List<TradeVO> selectRefundPageList(Map<String,Object> map,Integer currentPage,Integer pageSize);
    
    /**	
     * @Description: 退款列表总数
     * @param map
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日上午10:18:21
     **/
    public Integer selectRefundPageListCount(Map<String,Object> map);
    
    
}
