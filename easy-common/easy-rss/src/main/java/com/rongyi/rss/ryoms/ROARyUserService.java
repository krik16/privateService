package com.rongyi.rss.ryoms;

import java.util.Map;

/**
 * 
 * @author kenny
 *
 */
public interface ROARyUserService {
	/**
	 * 通过service ticket获取登录用户信息
	 * 返回Map{userInfo:com.rongyi.easy.ryoms.entity.RyUserInfo,authorities:List<String>}
	 * @param bsst 
	 * @param bConvertToObj	true:返回为对象
	 * 						false:返回为json
	 * @return
	 * @throws Exception
	 */
	public Map getSessionUser(String ryst,boolean bConvertToObj) throws Exception;
}
