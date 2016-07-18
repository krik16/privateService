/**   
* @Package com.rongyi.rss.ryoms.advert 
* @Description: 素材管理接口
* @author wangjh
* @date 2016年2月15日 下午4:38:09 
* @version V1.0   
*/
package com.rongyi.rss.ryoms.advert;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.ryoms.advert.entity.AdDefaultEntity;
import com.rongyi.easy.ryoms.advert.param.AdDefaultSearchParam;
import com.rongyi.easy.ryoms.advert.vo.AdDefaultVO;

/**
 * @Description: 素材管理接口
 * @author wangjh
 * @date 2016年2月15日 下午4:38:09
 */
public interface AdDefaultService {

	/**
	 * 素材列表
	 * 
	 * @param param
	 * @return
	 */
	public List<AdDefaultVO> list(AdDefaultSearchParam param);

	/**
	 * 新增素材
	 * 
	 * @param entity
	 * @return
	 */
	public int add(AdDefaultEntity entity,String materialType);

	/**
	 * 修改素材
	 * 
	 * @param entity
	 * @return
	 */
	public int save(AdDefaultEntity entity,String materialType);

	/**
	 * 素材详情
	 * 
	 * @param materialId
	 * @return
	 */
	public AdDefaultVO info(int materialId);

	/**
	 * 删除素材
	 * 
	 * @param materialId
	 * @param userId
	 *            登录用户ID
	 * @return
	 */
	public int delete(int materialId, int userId);

	/**
	 * 素材排序
	 * 
	 * @param materialId
	 * @param type
	 * @param userId
	 *            登录用户ID
	 * @return
	 */
	public int sort(int materialId, int seq, int type, int userId);

	/**
	 * 查询所有素材
	 * @return
	 */
	List<AdDefaultVO> getAllValidAdDefaults();

	void deleteAdDefaultToPhp(Map<String, Object> param);
}