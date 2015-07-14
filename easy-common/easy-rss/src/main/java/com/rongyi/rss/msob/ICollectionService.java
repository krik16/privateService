package com.rongyi.rss.msob;

import org.bson.types.ObjectId;

import com.rongyi.easy.rmmm.param.CollectionParam;
import com.rongyi.easy.rmmm.param.MyCollectionTypeParam;
import com.rongyi.easy.rmmm.vo.MyFavBrandListVO;

public interface ICollectionService {
	
	/**
	 * 取消收藏(删除数据)
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public void deleteCollection(CollectionParam param, ObjectId userId,String collectableType) throws Exception;
	
	/**
	 * 判断是否收藏
	 * @param param
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public boolean getFav(CollectionParam param, ObjectId userId,String collectableType) throws Exception;
	
	/**
	 * 收藏(添加数据)
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public void insertCollection(CollectionParam param, ObjectId userId,String collectableType) throws Exception;
	
	/**
	 * 我的收藏，品牌收藏列表
	 * @param param
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public MyFavBrandListVO getMyFavList(MyCollectionTypeParam param, ObjectId userId,String collectableType) throws Exception;
	/**
     * 验证商场是否被用户关注
     * 
     * @param mallId
     * @param userId
     * @return
     * @throws Exception
     */
    public boolean queryCollectionByMallIdAndUserId(String mallId,String userId) throws Exception ;

}
