package com.rongyi.cheat.constants;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.framework.spring.context.utils.SpringContextUtil;

public interface Constant {

	PropertyConfigurer propertyConfigurer = (PropertyConfigurer) SpringContextUtil.getBean("propertyConfigurer");
	interface BLACKLIST_CONFIG {
		String WARN_COUNT = propertyConfigurer.getProperty("WARN.COUNT").toString();//报警数量
		String FREEZE_COUNT = propertyConfigurer.getProperty("FREEZE.COUNT").toString();//直接冻结数量
		String SEND_ADDRESS = propertyConfigurer.getProperty("SEND_ADDRESS").toString();//发送邮件地址
		String TO_ADDRESS = propertyConfigurer.getProperty("TO_ADDRESS").toString();//接收邮件地址
		String BLACKLIST_URL = propertyConfigurer.getProperty("BLACKLIST_URL").toString();//黑名单列表URL
		String BLACK_SECOND = propertyConfigurer.getProperty("BLACK_SECOND").toString();//黑名单查询时间跨度
		String SEND_PHONE = propertyConfigurer.getProperty("SEND_PHONE").toString();//发送短信手机号
		String ORDER_TYPE = propertyConfigurer.getProperty("ORDER_TYPE").toString();//0:商品订单,1:优惠券订单,2:全部
		
//		String WARN_COUNT = "10";//报警数量
//		String FREEZE_COUNT = "15";//直接冻结数量
//		String SEND_ADDRESS = "anti@rongyi.com";//发送邮件地址
//		String TO_ADDRESS = "kejun@rongyi.com";//接收邮件地址
//		String BLACKLIST_URL = "test";//黑名单列表URL
//		String BLACK_SECOND ="86400";//黑名单查询时间跨度
//		String SEND_PHONE = "13564452580";//发送短信手机号
//		String ORDER_TYPE = "1";//0:商品订单,1:优惠券订单,2:全部
	}

	
	String USER_SESSION_KEY = "user_session_key"; //
	interface DATE_FROMAT{
	    String FORMAT_SECOND="yyyy-MM-dd HH:mm:ss";
	}
	interface VIEW_MSG{
	    String MSG="msg";
	    String DETAIL="detail";
	    String ERROR="error";
	}
	
	interface PAGE {
	    int CURRENTPAGE = 1;
	    int PAGESIZE = 15;
	}
	interface SENDSIZE{
	    int SIZE=50;
	}
	interface INSERTSIZE{
        int SIZE=500;
    }
	interface USERINFO {
		/** 超级管理员 */
		String TYPE_SUPER_ADMIN = "superAdmin";
		/** 商场管理员 */
		String TYPE_MALL_ADMIN = "mallAdmin";
		
	}
	

}