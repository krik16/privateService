
package com.rongyi.tms.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import com.rongyi.easy.coupon.entity.CouponOrder;
import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.entity.MallLifeUserEntity;
import com.rongyi.rss.coupon.RoaCouponOrderService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.tms.BaseTest;
import com.rongyi.tms.moudle.vo.TradeDetailCount;

public class TradeServiceTest extends BaseTest{
   
    @Autowired
    TradeDetailService tradeDetailService;
    
//    @Autowired
    ROAMalllifeUserService rOAMallLifeUserService;
    
    @Autowired
    RoaCouponOrderService roaCouponOrderService;
    
    @Rollback(true)
//    @Test(description = "rpb接口调用--交易明细")
    public void rpbTradeDetailTest(){
        Map<String,Object> map = new HashMap<String,Object>();
        System.err.println(tradeDetailService.selectTradePageList(map, 1, 10).size());
    }
    
    @Rollback(true)
//    @Test(description = "roa接口调用--根据买家ID查询买家信息")
    public void roaGetUserByUserIdTest(){
        try {
            MallLifeUserEntity user = rOAMallLifeUserService.getEntityByUid("51f9eb5b31d65584ab00f44a");
            System.err.println(user.getUserName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @Rollback(false)
//    @Test(description = "总交易记录结果")
    public void selectInocmeCountTest(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("tradeType", 0);
        map.put("orderNo","1000001853335461");
        TradeDetailCount tradeDetailCount = tradeDetailService.selectTradeCount(map);
        System.err.println("总收入："+tradeDetailCount.getAmountCount());
//        TradeDetailCount tradeDetailCount2 = tradeDetailService.selectTradeCount(map);
//        System.err.println("总支出："+tradeDetailCount2.getAmountCount());
    }
    
    @Rollback(false)
//    @Test(description = "根据ID查询")
    public void selectByIdTest(){
        tradeDetailService.selectById(3513);
    }
    
    @Test
    public void testSelectCoupon(){
    	CouponOrder couponOrder = roaCouponOrderService.findOneByOrderNo("2015071300350917");
    	System.err.println("buyerId="+couponOrder.getBuyerId());
    }
    
    @Test
    public void testGetUserCouponByOrderNo(){
    	UserCoupon userCoupon = tradeDetailService.getCouponOrderRecordByOrderNo("2015071300350917");
    	System.err.println("result="+userCoupon.getDiscount());
    }
}