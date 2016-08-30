package com.rongyi.rss.bdata;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bdata.entity.Photo;
import com.rongyi.easy.bdata.entity.Shop;
import com.rongyi.easy.ryoms.entity.RyUserInfo;
import com.rongyi.easy.ryoms.param.ShopParam;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

/**
 * 店铺服务
 * @author xiaobo
 *
 */
public interface ShopService {
	
	 
	/**
	 * 店铺搜索
	 * @param mallId		商场ID
	 * @param keyword		关键词（商场名称）
	 * @param customCateId	自定义分类ID
	 * @param page			当前页
	 * @param pageSize		分页条数
	 * @param zoneId		区域Id（省市区商圈商场楼层）
	 * @return 带ShopVO 的ResponseVO
	 * @throws Exception
	 */
	ResponseVO searchShops(String mallId, String keyword, String customCateId, String zoneId, int page, int pageSize,String cateId) throws Exception;

	/**
	 * 获取单个店铺详情
	 * @param id 店铺id
	 * @return 带ShopVO 的ResponseVO
	 */
	ResponseVO getShopById(String id);
	/**
	 * 通过店铺id列表获取店铺列表
	 * @param ids 店铺id列表
	 * @return 带List&lt;ShopVO&gt;的ResponseVO
	 */
	ResponseVO getShopsByIds(String ids);
	
	/**
	 * 根据楼栋信息查询店铺列表
	 * @param paramMap
	 * @return
	 */
	List<Shop> searchShop(Map<String, Object> paramMap);
	
	/**
	 * 根据商场ID || 店铺名称获取店铺列表
	 * @param mallId		商场ID
	 * @param shopName		店铺名称
	 * @param page			当前页
	 * @param pageSize		分页条数
	 * @return
	 */
	public ResponseVO getShopListForName(String mallId, String shopName, Integer page, Integer pageSize);

	
	/**
	 * 修改店铺营业状态及系统状态
	 * @param paramsMap
	 *         ids： 要修改的店铺id 多个ID逗号分隔
	 *         valid: 店铺系统状态   0正常显示 1已隐藏
	 *         business_status:店铺营业状态
	 */
	public boolean updateShopSimple(Map paramsMap);
	
	/**
	 * 新建修改店铺
	 * @param param 店铺参数 
	 * @param user 操作人
	 * @return
	 */
	public String saveShop(ShopParam param)throws RuntimeException, Exception;
	
	/**
	 * 店铺搜索
	 */
	Map<String, Object>getShops(Map params, int currentpage, int pagesize);
	
	/*
	 * 店铺查询结果统计
	 */
	Map<String, Object>getShopsWithBusinessStatusCount(Map params, int currentpage, int pagesize);
	
	/**
	 * 保存店铺图片
	 * @param photo
	 * @return
	 */
	public Photo savePhoto(Photo photo);


	public ResponseVO getCouponInfoByShopIds(String ids);
	
	/**
	 * 通过店铺ID查询店铺实体
	 * @param id
	 * @return
	 */
	public Shop getShopEntityById(String id);
	
	/**
	 * 通过ids查询店铺实体列表
	 * @param ids
	 * @return
	 */
	public List<Shop> getShopListByIds(List<ObjectId> ids);
	
	public Map getZoneIdNameMap(Map<String, String> map,String type);
	
	/**
	 * 通知solr
	 * @param shopIds
	 */
	public void updateSorl(List<String> shopIds);
	
	
	public boolean updateShopLocation(String locationString, String shopName, String mallId); 
}
