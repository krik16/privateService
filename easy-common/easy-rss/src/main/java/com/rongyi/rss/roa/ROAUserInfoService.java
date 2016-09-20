package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.bsoms.entity.BAuthorities;
import com.rongyi.easy.bsoms.entity.UserInfo;
import com.rongyi.easy.bsoms.vo.BusinessAccountVO;
import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.param.user.UserManagerParam;
import com.rongyi.easy.va.vo.VirtualAccountVO;

/**
 * 账户用户相关
 * @author hebo 2015/07/17
 *
 */
public interface ROAUserInfoService {

	/**
	 * 分页查询商家账户列表
	 * @param paramsMap
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	PagingVO<BusinessAccountVO> searchAccountListByMap(Map<String, Object> paramsMap, int currentPage, int pageSize);
	
	/**
	 * 资金账户：冻结/解冻
	 * @param userId
	 * @param isSuspended
	 * @return
	 */
	boolean updateAccountSuspended(String userId, boolean isSuspended, String stopReason);

	/**
	 * 根据id修改账户状态：启用/停用
	 * @param paraMap
	 */
	boolean updateAccountStatus(int id, int accountStatus, String stopReason, Integer userId);
	
	UserInfo getUserInfoById(Integer id);

	/**
	 * 查询商家账户信息（包含关联信息）
	 * @param id
	 * @return
	 */
	BusinessAccountVO getUserDetailInfoById(Integer id);

	/**
	 * 新增商家账号
	 * @param userParam
	 * @return
	 * @throws MallShopException
	 * @throws Exception 
	 */
	boolean insertUserInfo (UserManagerParam userParam)throws MallShopException, Exception;
	
	/**
	 * 修改商家账号
	 * @param param
	 * @param merUserId
	 * @return
	 * @throws Exception
	 */
	public Boolean updateMerAccountInfo(UserManagerParam param,Integer merUserId) throws Exception;
	
	/**
	 * 虚拟账户查询
	 * 
	 * @date 2015年8月24日 
	 * @param userId
	 *            用户id
	 * @return
	 */
	public VirtualAccountVO queryVirtualAccount(String userId);
	
	/**
	 * 获取角色下的所有账户（）
	 * @param roleId
	 * @return
	 */
	public List<Integer> getAllUserIdByRole(Integer roleId);
	
	/**
	 * 修改个人信息
	 * @param paramsMap
	 * @return
	 */
	public boolean updateUserInfo(Map<String, Object> paramsMap) throws Exception;

	UserInfo getUserByMap(Map<String, Object> paramsMap);
	
	/**
	 * 得到用户的所有权限值
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<String> getAuthsValueByUserId(Integer userId) throws Exception;
	
	/**
	 * 得到用户的特殊权限
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<BAuthorities> getUserAuthsByUserId(Integer userId) throws Exception;
		
	/**
	 * 得到用户的角色权限
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<BAuthorities> getRoleAuthsByUserId(Integer userId) throws Exception;

	/**
	 * 通过service ticket获取登录用户信息
	 * @param bsst
	 * @param bConvertToObj	true:返回为对象
	 * 						false:返回为json
	 * @return Map{com.rongyi.easy.bsoms.entity.SessionUserInfo , List}
	 * @throws Exception
	 */
	public Map getSessionUser(String bsst,boolean bConvertToObj) throws Exception;
	
	/**
	 * 通过service ticket获取登录用户信息
	 * @param bsst 
	 * @param bConvertToObj	true:返回为对象
	 * 						false:返回为json
	 * @return Map{com.rongyi.easy.bsoms.entity.SessionUserInfo , List}
	 * @throws Exception
	 */
	public Map getSessionUser(String bsst,boolean bConvertToObj,String source) throws Exception;
	
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
	
	/**
	 * 查询bs top页信息
	 * @param bsst
	 * @return
	 * @throws Exception
	 */
	public Map getBsTop(String bsst)throws Exception;
}
