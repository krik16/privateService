package com.rongyi.rss.shop;

import com.rongyi.easy.shop.entity.GroupEntity;

public interface IGroupService {
	
	/**
	 * 根据id查询集团
	 * @param id
	 * @return
	 */
	public GroupEntity getGroupById(String id);
}
