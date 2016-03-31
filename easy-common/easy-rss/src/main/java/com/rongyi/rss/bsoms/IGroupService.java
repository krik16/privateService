package com.rongyi.rss.bsoms;

import com.rongyi.easy.bsoms.entity.GroupsInfo;

/**
 * 集团信息相关
 * @author Ventures 2015/08/10
 *
 */
public interface IGroupService {

	GroupsInfo searchGroupById(Integer id);
	
	GroupsInfo getByMongoId(String mongoId) throws Exception;
}
