package com.rongyi.rss.ryoms;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.ryoms.entity.RyUserInfo;

/**
 * 
 * @author kenny
 *
 */
public interface IUserService {

	/**
	 * 通过service ticket获取登录用户信息
	 * 返回Map{userInfo:com.rongyi.easy.ryoms.entity.RyUserInfo,authorities:List<String>}
	 * @param bsst
	 * @return
	 * @throws Exception
	 */
	public Map getSessionUserFromRedis(String ryst,boolean bConvertToObj) throws Exception;
	
	public RyUserInfo getUserById(Integer userId);
	
	
	public List<RyUserInfo> getUserByName(String userName,int offset, int pageSize);
	
}
