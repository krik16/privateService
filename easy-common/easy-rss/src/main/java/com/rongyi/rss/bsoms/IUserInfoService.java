package com.rongyi.rss.bsoms;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.bsoms.entity.BAuthorities;
import com.rongyi.easy.bsoms.entity.CertifiedCheckInfo;
import com.rongyi.easy.bsoms.entity.SessionUserInfo;
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
public interface IUserInfoService {

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
	 * @param id
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
	 * 返回Map{userInfo:com.rongyi.easy.bsoms.entity.SessionUserInfo,authorities:List<String>}
	 * @param bsst
	 * @return
	 * @throws Exception
	 */
	public Map getSessionUserFromRedis(String bsst,boolean bConvertToObj) throws Exception;
	
	/**
	 * 查询买手账号列表
	 * @param paramsMap
	 * @param currpage
	 * @param pageSize
	 * @return
	 */
	 PagingVO<BusinessAccountVO> getBuyerInfoListByMap(Map<String, Object>paramsMap,int currpage,int pageSize);

	/**
	 * 验证用户信息是否已存在
	 * @param paramsMap
	 * @return
	 * @throws Exception
	 */
	public boolean validateUserByUserParam(UserInfo userInfo)throws Exception;
	
	/**
	 * 查询买手账号详情
	 * @param id 用户ID
	 * @return
	 */
	public BusinessAccountVO getBuyerDetailById(Integer id);
	
	/**
	 * 根据角色ID查询关联账号
	 * @return
	 */
	public List<SessionUserInfo> getRelationUserListByRoleId(Map<String, Object> paramMap);
	

	/**
	 * 通过关联id（shopId,mallId,filialeId,brandId,shopId...）条件查询商家用户账户
	 * @param paramsMap
	 * @return
	 */
	List<UserInfo> getFullUserInfoByRelevanceId(Map<String, Object> paramsMap);
	
	/**
	 * 通过service ticket获取登录top页信息
	 * 返回Map{userInfo:com.rongyi.easy.bsoms.entity.SessionUserInfo,authorities:List<String>,logoutUrl}
	 * @param bsst
	 * @return
	 * @throws Exception
	 */
	public Map getBsTop(String bsst)throws Exception ;
	
	/**
	 * 查询各状态的用户数量
	 * @param map
	 * @return
	 */
	public Map<String, Integer> getUserStatusCount(Map map);
	
	/**
	 * 查询用户审核失败理由
	 * @param map
	 * @return
	 */
	public List<CertifiedCheckInfo> getCertifiedFailList(Map map);
	
	/**
	 * 审核用户信息
	 * @param paramMap
	 * @return
	 */
	public boolean checkCertifiedUser(Map paramMap);
	
	/**
	 * 查询用户审核记录
	 * @param paramMap
	 * @return
	 */
	public List<CertifiedCheckInfo> getCheckListByUserId(Map paramMap);
}
