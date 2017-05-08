package com.rongyi.rss.bsoms;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.bsoms.entity.BAuthorities;
import com.rongyi.easy.bsoms.entity.BRoles;
import com.rongyi.easy.bsoms.vo.MerchantRoleVO;
import com.rongyi.easy.rmmm.param.user.UserManagerParam;

public interface IRoleService {
	Integer saveOrUpdate(Map<String, Object> paramsMap,List<String> auths,Integer optId) throws Exception;
	
	PagingVO<BRoles> pagingRolesList(Map<String, Object> paramsMap,int startRecordIndex, int pageSize) throws Exception;

	/**
	 * 通过主键获取角色VO（包含关联信息）
	 * @param id
	 * @return
	 */
	List<MerchantRoleVO> getRoleVOById(Integer id);
	/**
	 * 通过角色id获取改角色对应的权限
	 * @param id
	 * @return
	 */
	List<BAuthorities> getAuthoritiesByRoleId(Integer id);
	
	/**
	 * 根据param条件获取角色
	 * @param userParam
	 * @return
	 */
	BRoles getBRoleByParam(UserManagerParam userParam);

	boolean updateAccountStatus(Integer id, int status, String reason,
			Integer userId);
	
	
	/**
	 * 新建or修改角色（可选所属范围）
	 * @param paramsMap
	 * @param auths
	 * @param optId
	 * @return
	 * @throws Exception
	 */
	Integer saveOrUpdateRole(Map<String, Object> paramsMap,List<String> auths,Integer optId) throws Exception;
	
	/**
	 * 查询角色关联范围
	 * @param roleIdentity
	 * @param relationMids
	 * @return
	 * @throws Exception
	 */
	List<Object> getRoleScope(Integer roleIdentity,List<String> relationMids) throws Exception;

	/**
	 * 通过ID查询角色
 	 * @param id 角色ID
	 * @return 角色实体
	 */
	BRoles getRoleById(Integer id);

	/**
	 * 通过角色ID修改继承自此角色权限的角色
	 * @param roleId 角色Id
	 * @param authsOldList 未修改前的角色权限
	 * @param auths 新的角色权限
	 * @return 修改的角色数量
	 */
	int updateRoleAuthsByExtendsRoleId(Integer roleId,List<String> authsOldList,List<String> auths);

	/**
	 * 根据用户ID及新旧权限列表更新此用户下所有角色的权限
	 * @param userId 用户ID
	 * @param authOldList 旧的权限列表
	 * @param authList 新的权限列表
	 * @return 影响的角色数量
	 */
	int updateRoleAuthByUserId(Integer userId, List<String> authOldList, List<String> authList);
	public List<BRoles> getRoleListForDis(Integer userId);
}
