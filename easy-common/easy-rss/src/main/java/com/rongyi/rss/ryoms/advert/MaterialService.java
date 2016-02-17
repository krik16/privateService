/**   
* @Title: MaterialService.java 
* @Package com.rongyi.rss.ryoms.advert 
* @Description: 素材管理接口
* @author wangjh
* @date 2016年2月15日 下午4:38:09 
* @version V1.0   
*/
package com.rongyi.rss.ryoms.advert;

import java.util.List;

import com.rongyi.easy.ryoms.advert.entity.MaterialEntity;
import com.rongyi.easy.ryoms.advert.param.MaterialSearchParam;
import com.rongyi.easy.ryoms.advert.vo.MaterialVO;

/**
 * @ClassName: MaterialService
 * @Description: 素材管理接口
 * @author wangjh
 * @date 2016年2月15日 下午4:38:09
 */
public interface MaterialService {

	/**
	 * 素材列表
	 * 
	 * @param param
	 * @return
	 */
	public List<MaterialVO> list(MaterialSearchParam param);

	/**
	 * 新增素材
	 * 
	 * @param entity
	 * @return
	 */
	public int add(MaterialEntity entity);

	/**
	 * 修改素材
	 * 
	 * @param entity
	 * @return
	 */
	public int save(MaterialEntity entity);

	/**
	 * 素材详情
	 * 
	 * @param materialId
	 * @return
	 */
	public MaterialVO info(int materialId);

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
	public int sort(int materialId, int type, int userId);
}