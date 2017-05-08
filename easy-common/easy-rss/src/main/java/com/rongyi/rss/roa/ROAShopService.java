package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.roa.param.ShopAreaParams;
import com.rongyi.easy.roa.vo.ShopAreaVO;
import com.rongyi.easy.roa.vo.ShopVO;

/**
 * 类ROAShopService.java的描述：TODO 类实现描述
 * 
 * @author PingKang 2015年1月8日 下午2:49:20
 */
public interface ROAShopService {

    /**
     * 根据搜索参数查询店铺数据
     * 
     * @param params
     * @param currentpage
     * @param pagesize
     * @return	Map<String,Object>
     * 			"success"   	成功：true;失败：false
     * 			"list"			shop列表
     * 			"totalCount"	总数
     * @throws Exception
     */
     Map getShops(Map params, int currentpage, int pagesize) throws Exception;
    
    /**
     * 根据店铺id查询出店铺信息
     * @param id
     * @return
     * @throws Exception
     */
    ShopVO getShopVOById(String id)throws Exception;
    
	/**
     * 通过分公司id查店铺
     * @param filialeId
     * @return
     * @throws Exception
     */
     List<ShopVO> getShopDetailByFilialeId(String filialeId) throws Exception ;

    List<ShopVO> getShopVOByMallIds(List<ObjectId> mallIds);

    /**
     * 查询集团、商场、品牌、店铺的地址信息（省市）
     * @param params
     * @return
     * @throws Exception
     */
	List<ShopAreaVO> searchShopAreas(ShopAreaParams params) throws Exception;

	/**
     * 通过ids查询店铺
     * @param ids
     * @return
     */
     List<ShopVO> getShopsByIds(List<ObjectId> ids) throws Exception;

    /**
     * 获取品牌下面所有店铺
     * @param brandId 品牌id
     * @return
     */
     List<ShopVO> getShopVOsByBrandId(String brandId);

	List<ShopVO> getShopVOsByBrandIds(List<ObjectId> list);

     
     public ShopVO getShopsVOById2(String id);
     
     public List<ShopVO> getShopsVOByShopMidOrFilialeMidOrBrandMid(String shopMid,String filialeMid,String brandMid);

     public com.rongyi.easy.entity.ShopEntity getShopById(String id);

    List<ShopVO> getSimpleShopsByIds(List<ObjectId> shopIds);

    public List<ShopVO> getShopsByObjectIds(List<ObjectId> shopIds);

    /**
     * 根据条件查询店铺列表
     * @param paramMap 参数
     *               parentIds
     * @param currpage 页码 从1开始第一页
     * @param pageSize 显示行数
     * @return
     */
    List<ShopVO> searchShop(Map<String, Object> paramMap, int currpage, int pageSize);
}
