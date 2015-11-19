/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日下午6:36:36
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.rss.roa.ROAMallService;
import com.rongyi.tms.BaseTest;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;

/**	
 * @Author:  柯军
 * @Description: TODO 
 * @datetime:2015年5月19日下午6:36:36
 *
 **/

public class PayServiceTest extends BaseTest{
    
    @Autowired
    PayService payService;
    
    @Autowired
    RefundService refundService;
    
    
//    @Test
    public void selectListTest(){
        payService.selectPayPageListCount(new HashMap<String, Object>());
        payService.selectPayPageList(new HashMap<String, Object>(), 1, 10);
    }
    
//    @Test
    public void getMailListTest(){
        String keywords ="test";
        logger.info("keywords:"+keywords);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name", keywords);
        try{
//            Map<String, Object> result = mallService.getMalls(map, 1, 10);
//            System.err.println(result.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void selectRefundList(){
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("tradeType", ConstantEnum.TRADE_TYPE_REFUND.getCodeInt());
    	map.put("tradeStartTime", "2015-08-25");
    	 List<TradeVO> list = refundService.selectRefundPageList(map, 1, Constant.PAGE.PAGESIZE);
    	System.err.println("totalSize="+list.size());
    }
}
