package com.rongyi.rss.roa;

import java.util.List;

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
}
