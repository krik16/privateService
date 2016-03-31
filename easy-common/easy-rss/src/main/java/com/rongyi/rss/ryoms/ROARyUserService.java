package com.rongyi.rss.ryoms;

import java.util.List;
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
	
	/**
	 * 判断当前用户是否具有指定角色权限
	 * @param ryst
	 * @param authority
	 * @return
	 */
	public boolean hasRoleAuthority(String ryst,String authority) throws Exception;
	
	/**
	 * 判断当前用户是否具有指定角色权限中的任何一个
	 * @param request
	 * @param roleAuthorities
	 * @return
	 */
	public boolean hasAnyRoleAuthority(String ryst,List<String> authorities) throws Exception;
	
}
