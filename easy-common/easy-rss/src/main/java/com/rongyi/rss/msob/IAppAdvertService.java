package com.rongyi.rss.msob;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.rmmm.param.AppAdvertParam;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年9月9日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年9月9日               1.0              创建文件
 */
public interface IAppAdvertService {
	
	/**
	 * 添加用户登记记录
	 * @param entity
	 * @throws Exception
	 */
	public void insertAppAdvert(String appid, String idfa, String channel) throws Exception;
	
	/**
	 * 激活通知回调广告商接口
	 * @param appId
	 * @param idfa
	 * @param dayNum
	 * @throws Exception
	 */
	public ResponseResult activateNotice(String appId, String idfa,Integer dayNum)throws Exception;

}
