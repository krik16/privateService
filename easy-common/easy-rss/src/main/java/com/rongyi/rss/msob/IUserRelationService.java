package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.rmmm.entity.RmmmUserRelationEntity;
import com.rongyi.easy.rmmm.param.ExclusiveGuideParam;
import com.rongyi.easy.rmmm.vo.ExclusiveGuideListVO;

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
	/**
	 * 取消专属导购
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Boolean cancelExclusiveGuide(Integer userId,String mallUserMid) throws Exception;
	/**
	 * 根据容易逛用户id获取专属导购列表
	 * @param param
	 * @param mallUserMid
	 * @return
	 * @throws Exception
	 */
	public ExclusiveGuideListVO getExclusiveGuideListVO(ExclusiveGuideParam param,String mallUserMid) throws Exception;
	
	/**
	 * 通过买家id和店铺id查正常的专属导购信息
	 * @param mallUserMid
	 * @param shopId
	 * @return
	 * @throws Exception
	 */
	public RmmmUserRelationEntity getGuideInfoByMallUserIdAndShopIdAndStatus(String mallUserMid,Integer shopId) throws Exception;
	
	/**
	 * 通过导购id查用户关联导购表
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public RmmmUserRelationEntity getUserRelationInfoByUserId(Integer userId,String mallUserMid) throws Exception;
}
