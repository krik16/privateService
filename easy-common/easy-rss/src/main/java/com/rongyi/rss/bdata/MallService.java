package com.rongyi.rss.bdata;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.bdata.vo.CustomCategoryVO;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bdata.entity.CustomCategory;
import com.rongyi.easy.bdata.entity.Mall;
import com.rongyi.easy.bdata.vo.CommonTypeVO;
import com.rongyi.easy.bdata.vo.MallGroupVO;
import com.rongyi.easy.bdata.vo.MallVO;


/**
 * Desc: mall service
 * User: chris
 * Date: 2015/10/24 18:32
 */

public interface MallService {
    /**
     * 获取商场详情
     * @param mallId	商场ID
     * @return
     * @throws Exception 
     */

    ResponseVO getMall(String mallId);
    
    /**
	 * 通过商场ID列表获取商场详情
	 * @param ids 商场id列表
	 * @return 带List&lt;MallVO&gt;的ResponseVO
	 */
	ResponseVO getMallsByIds(String ids);

    /**
     * 获取商场楼层
     * @param mallId	商场ID
     * @return
     */
    ResponseVO getFloorsByMallId(String mallId);

    /**
     * 获取楼层详细
     * @param ids	floorId列表（，分隔）
     * @return
     */
    ResponseVO getFloorById(String ids);

    /**
     * 获取全部类别
     * @return
     */
    ResponseVO getAllCategories();

    /**
     * 根据商场ID获取自定义类别
     * @param mallId	商场ID
     * @return
     */
    ResponseVO getCustomCategoriesByMallId(String mallId);
    ResponseVO getCustomCategoriesAndChildByMallId(String mallId);

    /**
     *
     * @param brndId
     * @return
     */
    ResponseVO getBrandById(String brndId);
    
    /**
    *品牌分类接口
    * @param CategoryId
    * @return
    */
    ResponseVO getBrandCategory(String categoryId);

    /**
     *
     * @param mallId
     * @return
     */
    ResponseVO getAds(String mallId);


    /**
     * get communal facility
     * @param floorId
     * @return
     */
    ResponseVO getCommunalFacility(String floorId);

    /**
     * 根据类型和父级ID获取区域信息
     * @param type		类型
     * @param parentId	父级ID
     * @return
     */
    ResponseVO getArea(Integer type, String parentId);
    
    /**
     * 根据商场名称 模糊匹配查询商场列表
     * @param mallName		商场名称
     * @param page			当前页
     * @param pageSize		每页显示条数
     * @return	ResponseVO 对象
     */
    ResponseVO getMallList(String mallName, Integer page, Integer pageSize);
    
    /**
     * 根据集团 ID查询商场 
     * @param groupId
     * @return
     */
    ResponseVO getMallListByGroupId(String groupId);

	ResponseVO getAdNumByMallId(String mallId);

	ResponseVO getAdsByMallId(String mall_id, String position);

	ResponseVO getAdById(String ad_id);
	
	/**
	 * 获取默认素材列表
	 * @param ps 
	 * @param mall_id 
	 * 
	 * @return
	 */
	ResponseVO getDefaultAds(Integer ps, String mall_id);

	/**
	 * 获取默认素材详情
	 * 
	 * @param defaultId
	 * @param mall_id 
	 * @return
	 */
	ResponseVO getDefaultAdById(String defaultId, String mall_id);

	ResponseVO getDefaultSeq(Integer ps, String mall_id);

	ResponseVO getAdsSeqByMallId(String mall_id, String position);
	
	/**
	 * 获取公共类型
	 * @param type
	 * @return
	 */
	List<CommonTypeVO> getCommonType(Integer type);
	
	/**
	 * 获取集团信息
	 * @param params
	 * @return
	 */
	List<MallGroupVO> getMallGroups(Map params);
	
	int getMallGroupsCount(Map params);
	
	/**
	 * 保存商场信息
	 * @param vo
	 * @return
	 */
	String saveMall(Map map,String json,Map picMap);
	
	/**
	 * 设置商场营业状态
	 * @param vo
	 * @return
	 */
	boolean setMallBusinessStatus(String mallId,int businessStatus,String reason);
	
	/**
	 * 设置商场显示状态
	 * @param vo
	 * @return
	 */
	boolean setMallValid(String mallId,int valid,String reason);
	
	Mall getMallById(String mallId);
	
	Map<String, Object>getMalls(Map params, int currentpage, int pagesize);
	
	Map<String, Object>getMallsWithBusinessStatusCount(Map params, int currentpage, int pagesize);
	ResponseVO  getAllCommunalFacilityTypes();
	
	ResponseVO createCustomCategory(CustomCategoryVO cvo, int updateUserId);
	
	ResponseVO delCustomCategory(String  id, int updateUserId);
	
	ResponseVO sortCustomCategory(String  id,String sortType, int updateUserId);
	CustomCategory getCustomCateById(String customCateId);

}
