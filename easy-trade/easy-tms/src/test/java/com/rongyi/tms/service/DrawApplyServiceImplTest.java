package com.rongyi.tms.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import com.rongyi.easy.tms.entity.DrawApply;
import com.rongyi.tms.BaseTest;


/**	
 * @Author:  柯军
 * @Description:  提现申请service单元测试
 * @datetime:2015年5月11日下午4:17:03
 *
 **/
public class DrawApplyServiceImplTest extends BaseTest{

    @Autowired
    DrawApplyService drawApplyService;
    
    
    @Rollback(true)
//    @Test(description = "插入")
    public void selectListBySearchTest(){
        DrawApply drawApply = new DrawApply();
        drawApply.setCreateAt(new Date());
        drawApply.setDrawAmount(10d);
        drawApply.setEndAt(new Date());
        drawApply.setMallId("111");
        drawApply.setMallName("test");
        drawApply.setPayAccount("test");
        drawApply.setPayName("test");
        drawApply.setPayType(0);
        drawApply.setSellerAccount("test");
        drawApply.setSellerName("test");
        drawApply.setShopId("");
        drawApply.setShopName("test");
        drawApply.setStatus(0);
        drawApplyService.insert(drawApply);
        System.err.println("id="+drawApply.getId());
    }
 
    @Rollback(false)
//    @Test(description = "审核通过向RPB发送提现申请")
    public void sendToRpbTest(){
        Map<String,Object> bodyMap = new HashMap<String,Object>();
        bodyMap.put("userId", "2");
        bodyMap.put("drawAmount", 100d);
        bodyMap.put("drawNo", "100312311231");
        bodyMap.put("payType", 0);
        bodyMap.put("payAccount", "60003600");
        bodyMap.put("payName", "王五");
//        messageEventService.callMessageSender(bodyMap,"tms","rpb",PaymentEventType.DRAW_PAY);
    }
    
    @Rollback(false)
    @Test(description = "")
    public void selectOneTest(){
        DrawApply drawApply = drawApplyService.getOneById(1);
        System.err.println("userId="+drawApply.getDrawUserId());
    }
}
