/**   
* @Title: ConfigService.java 
* @Package com.rongyi.rss.ryoms.advert 
* @Description: 参数配置管理接口
* @author wangjh
* @date 2016年2月15日 下午4:38:09 
* @version V1.0   
*/
package com.rongyi.rss.ryoms.advert;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.ryoms.advert.entity.AdPoolSearch;
import com.rongyi.easy.ryoms.advert.entity.ConfigEntity;
import com.rongyi.easy.ryoms.advert.param.ConfigSearchParam;
import com.rongyi.easy.ryoms.advert.vo.AdPoolDetail;
import com.rongyi.easy.ryoms.advert.vo.CityVO;
import com.rongyi.easy.ryoms.advert.vo.ConfigVO;
import com.rongyi.easy.ryoms.advert.vo.ReasonVO;
import redis.clients.jedis.BinaryClient;

/**
 * @Description: 参数配置管理接口
 * @author wangjh
 * @date 2016年2月19日
 */
public interface ConfigService {

	/**
	 * 配置列表
	 * 
	 * @param param
	 * @return
	 */
	public List<ConfigVO> list(ConfigSearchParam param);

	/**
	 * 配置列表数
	 * 
	 * @param param
	 * @return
	 */
	public int listCnt(ConfigSearchParam param);

	/**
	 * 新增配置
	 * 
	 * @param entity
	 * @return
	 */
	public int add(ConfigEntity entity);

	/**
	 * 修改配置
	 * 
	 * @param entity
	 * @return
	 */
	public int save(ConfigEntity entity);

	/**
	 * 配置详情
	 * 
	 * @param id
	 * @return
	 */
	public ConfigVO info(int configId);

	/**
	 * 启用配置
	 * 
	 * @param id
	 * @param userId
	 * @return
	 */
	public int enable(int configId, int userId);

	/**
	 * 停用配置
	 * 
	 * @param id
	 * @param userId
	 * @return
	 */
	public int disable(int configId, String content, int userId);

	/**
	 * 停用理由列表（TOP5）
	 * 
	 * @param configId
	 * @return
	 */
	public List<ReasonVO> topDisableList(int configId);

	/**
	 * 停用理由列表
	 * 
	 * @param id
	 * @param size
	 * @return
	 */
	public List<CityVO> cityListByArea(int areaId);

	public List<ConfigVO> getConfigByMallId(String mallId);
	
	/**
	 * 
	* @Title: collectAreaCnt 
	* @Description: 广告管理查询可关联的商场数量
	* @param @param query
	* @param @return    设定文件 
	* @return int    返回类型 
	* @author shaozhou
	* @date 2016年2月29日 上午11:38:26
	* @throws
	 */
	public int collectAreaCnt(ConfigSearchParam query);
	/**
	 * 
	* @Title: collectAreaList 
	* @Description: 广告管理查询可关联的商场list 
	* @param @param query
	* @param @return    设定文件 
	* @return List<ConfigVO>    返回类型 
	* @author shaozhou
	* @date 2016年2月29日 上午11:39:11
	* @throws
	 */
	public List<ConfigVO> collectAreaList(ConfigSearchParam query);

	public List<String> selectAllMall();

	boolean checkExistConfig(Map<String, Object> checkConfigMap);

	void addList(List<ConfigEntity> configList);

	int updateConfigPoolInfo(ConfigEntity entity);

	int updateConfigPoolIsAllowPlayBatch(ConfigEntity entity);

	List<ConfigVO> getNeedUpdatePoolData();
	List<ConfigVO> getNeedUpdateBlack();

	AdPoolDetail getAdPoolDetail(int id,Date begin,Date end);


	List<AdPoolDetail> queryAdPool(AdPoolSearch param);
	int  queryAdPoolCount(AdPoolSearch param);
	List<Map<String,Object>> adPoolItemAdInfo(AdPoolSearch param);


	List<AdPoolDetail> queryAdPoolForExcel(AdPoolSearch param);



}