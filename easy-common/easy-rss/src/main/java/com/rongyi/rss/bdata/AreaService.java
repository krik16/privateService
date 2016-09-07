package com.rongyi.rss.bdata;

import java.util.List;
import java.util.Map;

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
	
	/**
	 * 查询区域VO列表
	 * @param map
	 *          areaIds  区域ID集合w
	 * @return
	 */
	public List<BdAreaVo> getAreaVoByParam(Map map);

	/**
	 * 通过区域mongoId查询信息
	 * @param areaMid mongoId
	 * @return 城市信息
	 */
	public BdAreaVo getAreaVoByAreaMid(String areaMid);


	/**
	 * 查询城市信息列表
	 * @param paramMap
	 *            cityName 城市中文or英文名称
	 *            type     （0:国、1:省、2:市、3:区、4:商圈）
	 * @return 城市信息列表
	 */
	 List<AreaDto> getAreaDtoByParam(Map<String,Object> paramMap);

	/**
	 * 处理城市信息接口（用一次）
	 * @return 影响行数
	 */
	 int areaHandle();
}
