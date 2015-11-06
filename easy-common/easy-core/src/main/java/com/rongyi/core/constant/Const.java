package com.rongyi.core.constant;

import java.util.HashMap;

/**
 * 常量类
 * 
 * @author xiaobo
 *
 */
public interface Const {
	/**
	 * 请求超时时间
	 */
	final int REQUEST_TIME_OUT = 10;

	final int DEFAULT_FULLAD_NUM   = 6;
	final int DEFAULT_BANNERAD_NUM = 6;

	final String UPAIYUN_URL_MALL_APPEARANCE_PIC = "http://rongyi.b0.upaiyun.com/system/mall/appearance_pic/"; // 云盘路径-商场app外景图
	final String UPAIYUN_URL_MALL_WEB_APPEARANCE_PIC = "http://rongyi.b0.upaiyun.com/system/mall/web_appearance_pic/"; // 云盘路径-商场web外景图
	final String UPAIYUN_URL_MALL_TRAFFIC_PIC = "http://rongyi.b0.upaiyun.com/system/mall/traffic_pic/"; // 云盘路径-商场交通图
	final String UPAIYUN_URL_MALL_WEB_INTRODUCTION_PIC = "http://rongyi.b0.upaiyun.com/system/mall/introduction_pic/"; // 云盘路径-商场介绍图
	final String UPAIYUN_URL_MALL_WEB_TERMINAL_LOGO = "http://rongyi.b0.upaiyun.com/system/mall/terminal_logo/"; // 云盘路径-终端机logo
	final String UPAIYUN_URL_MALL_WECHAT_PIC = "http://rongyi.b0.upaiyun.com/system/mall/wechat/"; // 云盘路径-微信展示商场的图片
	final String UPAIYUN_URL_MALL_ICON="http://rongyi.b0.upaiyun.com/system/mall/icon/";

	public final static HashMap<String, String> CHANNEL_TOKEN = new HashMap() {{
		put("terminal", "156b8d147a2c11e5b7a9000c29a33e38");
		put("weChat", "156b8d147a2c11e5b7a9000c29a33e39");
	}};

	public final static HashMap<Integer, String> AREA_TYPE = new HashMap() {{
		put(1, "Province");
		put(2, "City");
		put(3, "District");
		put(4, "BusinessDistrict");
	}};

}