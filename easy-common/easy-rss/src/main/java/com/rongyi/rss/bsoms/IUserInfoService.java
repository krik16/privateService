package com.rongyi.rss.bsoms;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
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
	boolean updateAccountSuspended(String userId, boolean isSuspended);

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

	UserInfo getUserByMap(Map<String, Object> paramsMap);
}
