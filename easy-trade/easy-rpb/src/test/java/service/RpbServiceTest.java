/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月25日上午11:00:03
 * @Description: TODO
 *
 **/

package service;

import base.BaseTest;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.WeixinMch;
import com.rongyi.easy.rpb.vo.PaymentParamVO;
import com.rongyi.rss.rpb.IRpbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**	
 * @Author:  柯军
 * @Description: TODO 
 * @datetime:2015年8月25日上午11:00:03
 *
 **/

public class RpbServiceTest extends BaseTest{

	@Autowired
	IRpbService iRpbService;
	
//	@Test
	public void testOperateWeixinRefund(){
		Map<String,Object> map = iRpbService.operateWeixinRefund(14376);
		System.err.println(map.toString());
	}
	
	@Test
	public void testGetPaySign(){
//		{"body":{"weidianId":"\"\"","title":"测试优惠券 勿买","orderType":"1",
//		"orderDetailNum":"\"\"","orderNum":"\"1009351119361126\"","totalPrice":0.01},"source":"coupon_order_queue","target":"rpb","timestamp":1444361283613,"type":"5"}
		MessageEvent event = new MessageEvent();
		event.setSource("coupon_order_queue");
		event.setTarget("rpb");
		event.setType("5");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("weidianId","\"\"");
		map.put("title", "测试优惠券 勿买");
		map.put("orderType", "1");
		map.put("orderDetailNum", "\"\"");
		map.put("orderNum", "1009351119361126");
		map.put("totalPrice", "0.01");
		event.setBody(map);
		iRpbService.getPaySign(event);
	}
	
//	@Test
	@Rollback(false)
	public void testGeneratePayment(){
		PaymentParamVO paymentParamVO = new PaymentParamVO();
		paymentParamVO.setCreateAt(DateUtil.getCurrDateTime());
		paymentParamVO.setOperateNo("1232131231");
		paymentParamVO.setOperateType("15");
		paymentParamVO.setPayAccount("13564452580");
		paymentParamVO.setPayChannel(0);
		paymentParamVO.setPayName("柯军");
		paymentParamVO.setPayTotal(1d);
		paymentParamVO.setUserId("superadmin");
		Map<String,Object> map = iRpbService.generatePayment(paymentParamVO);
		System.err.println(map.toString());
	}
	@Test
	@Rollback(false)
	public void testAddWeixinMch(){
		WeixinMch weixinMch = new WeixinMch();
		weixinMch.setIsRongyiPay((byte)0);
		weixinMch.setTradeType("1");
		weixinMch.setAppId("aaaa");
		weixinMch.setCretPath("/test/test2");
		weixinMch.setKey("1231");
		weixinMch.setMchId("1001");
		weixinMch.setPublicCode("asda");
		weixinMch.setUserId("1231");
		iRpbService.addWeixinMch(weixinMch);
	}
}
