package com.rongyi.rss.bsoms;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.bsoms.entity.BRoles;

public interface IRoleService {
	Integer saveOrUpdate(Map paramsMap,List auths,Integer optId) throws Exception;
	
	PagingVO<BRoles> pagingRolesList(Map<String, Object> paramsMap,int startRecordIndex, int pageSize) throws Exception;
}
