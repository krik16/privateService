
package com.rongyi.tms.service;

import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.easy.usercenter.entity.MalllifeUserInfoEntity;
import com.rongyi.rss.bdata.ShopService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.tms.BaseTest;
import com.rongyi.tms.moudle.vo.TradeDetailCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradeServiceTest extends BaseTest{

    @Autowired
    TradeDetailService tradeDetailService;

    //    @Autowired
    ROAMalllifeUserService rOAMallLifeUserService;

    @Autowired
    ROAShopService shopService;


    @Rollback(true)
    @Test(description = "rpb接口调用--交易明细")
    public void rpbTradeDetailTest(){
        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("orderNo","0825182220801455");
        List<TradeVO> list = tradeDetailService.selectTradePageList(map, 1, 10);
        System.err.println(list.size());
    }

    @Rollback(true)
//    @Test(description = "roa接口调用--根据买家ID查询买家信息")
    public void roaGetUserByUserIdTest(){
        try {
            MalllifeUserInfoEntity user = rOAMallLifeUserService.getEntityByUid("51f9eb5b31d65584ab00f44a");
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
    
//    @Test
    public void testGetUserCouponByOrderNo(){
        UserCoupon userCoupon = tradeDetailService.getCouponOrderRecordByOrderNo("2015071300350917");
        System.err.println("result=" + userCoupon.getDiscount());
    }

    @Test
    public void testGetShops(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("shopName", "五角场巴黎春天特卖场");
        Map<String, Object> result = null;
        try {
            result = shopService.getShops(map, 1, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<ShopVO> shops = (List<ShopVO>) result.get("list");
        System.err.println("shops="+shops.toString());
    }
}
