package com.rongyi.rss.bdata;

import java.util.List;

import com.rongyi.easy.bdata.entity.BdArea;

/**
 * sql区域表
 * @author sj
 *
 */
public interface AreaService {
	/**
	 * 根据区域Id查询区域信息
	 * @param areaId
	 * @retur
	 */
	public BdArea getAreaByAreaId(Integer areaId);
	
	/**
	 * 根据父级ID查询区域列表
	 * @param parentId （查询所有省传1）
	 * @return
	 */
	public List<BdArea> getAreaListByParentId(Integer parentId);
}
