package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.roa.entity.FilialeEntity;
import com.rongyi.easy.roa.param.FilialeParam;
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
	
	public FilialeVo getFilialeById(String id);
		/**
	 * 根据MongoID查询分公司
	 * @param id
	 * @return
	 */
	public FilialeVo getFilialeVoByMongoId(String id);
	/**
	 * 
	* @Title: saveOrUpdate 
	* @Description: 新增或修改分公司接口
	* @param @param param    设定文件 
	* @return void    返回类型 
	* @author shaozhou 
	* @date 2015年12月12日 下午12:15:29
	* @throws
	 */
	public void saveOrUpdate(FilialeParam param) throws Exception;
	/**
	 * 
	* @Title: filialeById 
	* @Description: 通过id查询分公司信息
	* @param @param id    设定文件 
	* @return void    返回类型 
	* @author shaozhou 
	* @date 2015年12月12日 下午2:58:05
	* @throws
	 */
	public FilialeVo filialeById(String id);
	/**
	 * 
	* @Title: FilialeList 
	* @Description: 获取公司列表
	* @param @param filiaParamsMap
	* @param @param currentPage
	* @param @param pageSize
	* @param @return    设定文件 
	* @return List<FilialeVo>    返回类型 
	* @author shaozhou 
	* @date 2015年12月12日 下午5:14:10
	* @throws
	 */
	public List<FilialeVo> FilialeList(Map<String, Object> filiaParamsMap, Integer currentPage, Integer pageSize);
	/**
	 * 
	* @Title: filialeCount 
	* @Description: 获取分公司数量
	* @param @param filiaParamsMap
	* @param @return    设定文件 
	* @return Long    返回类型 
	* @author shaozhou 
	* @date 2015年12月12日 下午5:14:54
	* @throws
	 */
	public int filialeCount(Map<String, Object> filiaParamsMap);
	
}
