package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.bdata.vo.BdAreaVo;
import com.rongyi.easy.roa.vo.AreaCityVO;

import org.bson.types.ObjectId;

import com.rongyi.easy.roa.entity.AreaEntity;


/**
 * 
  * @Title: ROAAreaService.java 
  * @Package com.rongyi.rss.roa 
  * @Description: TODO
  * @author 平康  pingkang@rongyi.com
  * @date 2015年8月5日 上午10:59:10 
  * @version V1.0   
  * Copyright (C),上海容易网电子商务有限公司
 */
public interface ROAAreaService {
	/*
	 * 获取省列表
	 */
	public List<AreaEntity> getPro() throws Exception;
    
	/*
	 * 获取市区商圈列表
	 */
	
	public List<AreaEntity> getSub(String type,String id) throws Exception;
	
	public List<AreaEntity> getSubByTypeOrParentId(String type,String parentId) throws Exception;
	
	public AreaEntity getAreaById(String id) ;
	
	/**
	 * 根据地区类型和name(模糊)查询
	 * @param name
	 * @param type
	 * @return
	 */
	public List<AreaEntity> getAreaByTypeAndName(String name,String type,String parentId);
	
	public List<AreaEntity> getAreaListByIds(List<ObjectId> ids);

	/**
	 * 用于内容管理模版查询关联的城市
	 * @param provId
	 * @param cityId
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public AreaCityVO getAreaCityList(String provId,String cityId,Integer currentPage, Integer pageSize);

	/**
	 * 根据区域ID查询区域信息VO
	 * @param areaId
	 * @return
	 */
	public BdAreaVo getAreaVoByAreaId(Integer areaId);
	
	/**
	 * 查询区域VO列表
	 * @param map
	 *          areaIds  区域ID集合w
	 * @return
	 */
	public List<BdAreaVo> getAreaVoByParam(Map map);
}
