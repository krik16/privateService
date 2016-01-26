package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.entity.FilialeInfoEntity;

/**
 * 查询分公司信息接口 
 * @author user 苏娟
 *
 */
public interface IFilialeService {
	/**
	 * 根据MongoID查询分公司
	 * @param mongoId
	 * @return
	 * @throws Exception
	 */
	public FilialeInfoEntity getFilialeByMongoId(String mongoId) throws Exception;
	
	/**
	 * 根据sqlID查询分公司 
	 * @param id
	 * @return
	 */
	public FilialeInfoEntity getFilialeById(Integer id);
	
	/**
	 * 通过mongoId查询sqlId 
	 * @param mongoId
	 * @return
	 */
	public Integer getSqlIdByMongoId(String mongoId);
}
