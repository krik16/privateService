package com.rongyi.rss.shop;

import com.rongyi.easy.roa.entity.FilialeEntity;

/**
 * 分公司管理（mongo）
 * @author sj
 *
 */
public interface IFilialeService {
	/**
	 * 新建or修改分公司
	 * @param filialeEntity
	 * @return
	 */
	public String saveOrUpdate(FilialeEntity filialeEntity) throws Exception;
}
