package com.rongyi.rss.shop;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.solr.PoiDocument;
import com.rongyi.easy.solr.ShopDocument;
import org.bson.types.ObjectId;

import com.rongyi.easy.rmmm.entity.ShopInfoEntity;
import com.rongyi.easy.shop.entity.ShopEntity;

public interface IShopService {
	
	public String updateShop(ShopEntity entity);
	
	public ShopEntity getShopById(String id);
	
	public List<ShopEntity> searchShop(Map<String,Object> paramMap,int currpage,int pageSize);
	
	public Long searchShopCount(Map<String,Object> paramMap);
	
	public void updateStatus(List<ObjectId> ids,String reason,int type,int userId) throws Exception;
	
	public List<ShopEntity> searchShopForOperation(Map<String, Object> paramMap,int currpage, int pageSize);
	
	public Long searchShopCountForOperation(Map<String, Object> paramMap);
	/**
	 * 微信端查询店铺
	 * @param paramMap
	 * @return
	 */
	public List<ShopEntity> searchShop(Map<String,Object> paramMap);
	
	public void insertShopList(List<ShopEntity> shops);

	/**
	 * 根据系统编号查询
	 * @param number		店铺编号
	 * @param filialeMid	分公司ID
	 * @return
	 */
	public ShopEntity serachShopByNumber(String number,String filialeMid);
	
	/**
	 * 根据商场和店铺性质查询店铺
	 * @param mallId
	 * @param type
	 * @param pageSize >0分页 <=0部分页
	 * @param currpage
	 * @return
	 */
	public List<ShopEntity> searchShopByMallAreaIdAndType(String mallId,
			int type, int pageSize, int currpage);
	
	
	/**
	 * 根据商场和店铺性质查询店铺数量
	 * @param mallId
	 * @param type
	 * @return
	 */
	public Long searchShopCountByMallAreaIdAndType(String mallId,int type);
	
	/**
	 * 
	* @Title: selectByShopId 
	* @Description: 查询店铺mysql表信息
	* @param @param shopMid
	* @param @return    设定文件 
	* @return ShopInfoEntity    返回类型 
	* @throws
	 */
	public ShopInfoEntity selectByShopId(String shopMid);
	
	/**
	 * 根据分公司Id查询店铺
	 * @param filialeId 分公司mongoId
	 * @return
	 */
	public List<ShopEntity> searchShopByFilialeId(String filialeId);

	/**
	 * 0第一页 pageSize为0不分页
	 *
	 * @param filialeId
	 * @param currpage
	 * @param pageSize
	 * @return
	 */
	public List<String> searchShop(String filialeId, int currpage, int pageSize);

	/**
	 * 获取店铺数量
	 * @return
	 */
	public long getShopCount();

	/**
	 * 分页查询店铺转换成solr对象
	 * @param skip
	 * @param pageSize
	 * @return
	 */
	public List<ShopDocument> getShopDocumentList(int skip,int pageSize);

	/**
	 * id对应的店铺转换成solr对象
	 * @param shopMid
	 * @return
	 */
	public ShopDocument getShopDocument(String shopMid);

	/**
	 * 根据店铺id集合查询店铺
	 * @param ids
	 * @return
	 */
	public List<ShopEntity> searchShopByIds(List<ObjectId> ids);

	/**
	 * 分页获取店铺solr对象（poi库）
	 * @param skip
	 * @param pageSize
	 * @return
	 */
	public List<PoiDocument> getShopPoiDocumentList(int skip,int pageSize) throws Exception;

	/**
	 * 获取店铺solr对象（poi库）
	 * @param shopMid
	 * @return
	 */
	public PoiDocument getShopPoiDocument(String shopMid) throws Exception;
}
