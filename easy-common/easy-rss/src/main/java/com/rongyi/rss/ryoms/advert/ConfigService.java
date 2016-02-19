/**   
* @Title: ConfigService.java 
* @Package com.rongyi.rss.ryoms.advert 
* @Description: 参数配置管理接口
* @author wangjh
* @date 2016年2月15日 下午4:38:09 
* @version V1.0   
*/
package com.rongyi.rss.ryoms.advert;

import java.util.List;

import com.rongyi.easy.ryoms.advert.entity.ConfigEntity;
import com.rongyi.easy.ryoms.advert.param.ConfigSearchParam;
import com.rongyi.easy.ryoms.advert.vo.CityVO;
import com.rongyi.easy.ryoms.advert.vo.ConfigVO;

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
	 * 停用理由列表
	 * 
	 * @param id
	 * @param size
	 * @return
	 */
	public List<CityVO> cityListByArea(int areaId);
}