package com.rongyi.rss.shop;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.roa.entity.FilialeEntity;
import com.rongyi.easy.roa.vo.FilialeVo;

/**
 * 分公司管理（mongo）
 * @author sj
 *
 */
public interface IFilialeService {
	/**
	 * 新建or修改分公司
	 * @param filialeEntity
	 * @return
	 */
	public String saveOrUpdate(FilialeEntity filialeEntity,List<ObjectId> shop_ids) throws Exception;
	/**
	 *
	* @Title: filialeById
	* @Description: 通过分公司id查询分公司详情
	* @param @param id
	* @param @return    设定文件
	* @return FilialeVo    返回类型
	* @author shaozhou
	* @date 2015年12月12日 下午3:02:12
	* @throws
	 */
	public FilialeVo filialeById(String id);

	public List<FilialeVo> getFilialeList(Map<String, Object> filiaParamsMap, Integer currentPage, Integer pageSize);

	public int getFilialeCount(Map<String, Object> filiaParamsMap);

	public List<String>  getFilialeByName(String name);
}
