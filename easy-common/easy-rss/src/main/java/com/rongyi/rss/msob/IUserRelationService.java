package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;

/**
 * 
* @ClassName: IUserRelationService 
* @Description: 关联导购
* @author wzh
* @date 2015年5月27日 上午11:16:01 
*
 */
public interface IUserRelationService {
	
	/**
	 * 关联导购
	 * @param mallUserMid
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public int guideAssociated(String mallUserMid,Integer userId) throws Exception;
	
	/**
	 * 获得专属导购
	 * @param mallUserMid
	 * @param shopId
	 * @return
	 * @throws Exception
	 */
	public RmmmUserInfoEntity getExclusiveGuide(String mallUserMid,Integer shopId) throws Exception;
	
	/**
	 * 获取专属导购imId
	 * @param mallUserMid
	 * @param shopId
	 * @return
	 * @throws Exception
	 */
	public String getUserRelationIMIdByUserIdAndShopId(String mallUserMid,String shopMid) throws Exception;
	
}
