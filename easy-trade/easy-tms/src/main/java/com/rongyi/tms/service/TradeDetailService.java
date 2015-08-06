/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月15日下午5:49:01
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.tms.moudle.vo.TradeDetailCount;


/**	
 * @Author:  柯军
 * @Description:交易明细接口
 * @datetime:2015年5月15日下午5:49:01
 *
 **/

public interface TradeDetailService {

    /**	
     * @Description: 分页查询交易明细
     * @param map
     * @param currentPage
     * @param pageSize
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月15日下午5:51:21
     **/
    public List<TradeVO> selectTradePageList(Map<String,Object> map,Integer currentPage,Integer pageSize);
    
    /**	
     * @Description: 查询交易明细总记录数 
     * @param map
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月15日下午5:51:40
     **/
    public Integer selectTradePageListCount(Map<String,Object> map);
    
    /**	
     * @Description: 查询交易总收入或支出
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月27日下午2:17:19
     **/
    public TradeDetailCount selectTradeCount(Map<String, Object> map);
    
    /**	
     * @Description: 根据id查询
     * @param id
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月27日下午3:25:14
     **/
    public TradeVO selectById(Integer id);
    
    /**	
     * @Description: 根据订单号查询订单使用现金券记录 
     * @param orderNo
     * @return	
     * @Author:  柯军
     * @datetime:2015年7月22日下午5:44:54
     **/
    public UserCoupon getCouponOrderRecordByOrderNo(String orderNo); 

    /**
	 * @Description: 计算优惠信息中包含的折扣（积分，红包）信息
	 * @param TradeVO tradeVo
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年7月23日下午2:29:10
	 **/
    public TradeVO setIntegralAndCouponDiscount(TradeVO tradeVo);

}
