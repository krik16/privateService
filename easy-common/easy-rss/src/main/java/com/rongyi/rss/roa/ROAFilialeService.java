package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.roa.vo.FilialeVo;

/**
 * 分公司 
 * @author user
 *
 */
public interface ROAFilialeService {
	/**
	 * 查询分公司列表 
	 * @param paramMap
	 *             id  分公司ID
	 *             brandId  集团ID
	 *             name  集团名称
	 * @param currpage 
	 * @param pageSize
	 * @return
	 */
	public List<FilialeVo> getFilialeList(Map paramMap,int currpage,int pageSize);

	/**
	 * 
	* @Title: getFilialeById 
	* @Description: 根据分公司id查询分公司信息
	* @param @param id
	* @param @return    设定文件 
	* @return FilialeVo    返回类型 
	* @throws
	 */
	public FilialeVo getFilialeById(String id);
		/**
	 * 根据MongoID查询分公司
	 * @param id
	 * @return
	 */
	public FilialeVo getFilialeVoByMongoId(String id);
	}
