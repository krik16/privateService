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
	MerchantRoleVO getRoleVOById(Integer id);
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
}
