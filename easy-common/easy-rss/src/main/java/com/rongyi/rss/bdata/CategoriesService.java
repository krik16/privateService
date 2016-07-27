package com.rongyi.rss.bdata;

import com.rongyi.core.bean.ResponseVO;

public interface CategoriesService {
	/**
	 * 通过上级ID查询品牌分类信息
	 * @param parentId
	 * @return
	 */
	public ResponseVO getVoListByParentId(String parentId);
}
