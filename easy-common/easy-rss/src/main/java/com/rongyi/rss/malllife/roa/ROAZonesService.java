/** 
* @Title: ROAZonesService.java 
* @Package com.rongyi.rss.malllife.roa 
* @Description: TODO
* @author 朱泽 zhuze@rongyi.com
* @date 2015年6月3日 下午5:17:33 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.malllife.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.domain.CityDO;

/** 
 * 
 */
public interface ROAZonesService {

	/**
	 * @param cityId
	 * @return
	 */
	public List<Map<String, Object>> zoneListV5_1(String cityId);

	/**
	 * @param cityId
	 * @return
	 */
	public List<Map<String, Object>> zoneList(String cityId);

	/**
	 * @param parentid
	 * @return
	 */
	public List<Map<String, Object>> queryHotListByParentIdV5_1(String parentid);

	/**
	 * @param parentid
	 * @return
	 */
	public List<Map<String, Object>> queryListByParentId(String parentid);

	/**
	 * @param parentid
	 * @return
	 */
	public List<Map<String, Object>> queryHotListByParentId(String parentid);

	/**
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public CityDO getCityById(String id) throws Exception;

	/**
	 * @return
	 */
	public List<CityDO> queryOpenCitys();

}
