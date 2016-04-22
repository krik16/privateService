package com.rongyi.rss.bdata;

import java.util.List;

import com.rongyi.easy.bdata.dto.AreaDto;
import com.rongyi.easy.bdata.entity.BdArea;
import com.rongyi.easy.bdata.vo.BdAreaVo;

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
	public AreaDto getAreaByAreaId(Integer areaId);
	
	/**
	 * 根据父级ID查询区域列表
	 * @param parentId （查询所有省传1）
	 * @return
	 */
	public List<AreaDto> getAreaListByParentId(Integer parentId);
	
	/**
	 * 查询所有区域信息
	 */
	public List<AreaDto> getAreaList();
	
	/**
	 * 根据区域ID查询区域信息VO
	 * @param areaId
	 * @return
	 */
	public BdAreaVo getAreaVoByAreaId(Integer areaId);
	
	/**
	 * 根据父级ID查询区域Vo列表
	 * @param parentId （查询所有省传1）
	 * @return
	 */
	public List<BdAreaVo> getAreaVoByParentId(Integer parentId);
}
