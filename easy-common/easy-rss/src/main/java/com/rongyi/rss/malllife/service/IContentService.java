package com.rongyi.rss.malllife.service;


import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.malllife.domain.AppReference2DO;
import com.rongyi.easy.malllife.domain.AppReferenceDO;
import com.rongyi.easy.malllife.domain.ContentDDO;
import com.rongyi.easy.malllife.domain.ContentDO;
import com.rongyi.easy.malllife.param.ActivitiesParam;
import com.rongyi.easy.malllife.pojo.ContentConnectPojo;
import com.rongyi.easy.malllife.pojo.ContentPojo;
import com.rongyi.easy.malllife.vo.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/6/1
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/1              1.0            创建文件
 *
 */
public interface IContentService {


    public ContentDO getById(Integer id) ;


    public ContentDO getActivityByShopId(String id);


    /**
     * 分页查询
     */
    public List<ContentDO> listPageContent(Integer startRecordIndex, Integer pageSize);

    public Integer getTotalNum();

//    public MallVO getMallInfo(String mallId);

//    public OldMallVO getOldMallInfo(String mallId);



//    public List<MallVO> getMallList(double x, double y);

//    public MallVO findMallByZoneIds(List<String> ids) throws Exception ;

//    public List floorCountList(String mallId) throws Exception;

//    public FavourableVO getVistedNum(String activityId);

    public boolean favAction(Integer id);

    public boolean cancelFavAction(Integer id);

    public String insertFavInfo(String userId, String contentId);

    public void deleteFavInfo(String userId, String contentId);

    public AppReferenceDO getAppRefById(Integer id);


    public List<AppReferenceDO> getReferenceID(String id);

    public List<AppReference2DO> getActivityMall(Integer id);

    public boolean isFav(String userId, String contentId);

    public Map<String, Object> listPageContentIds(Integer page, Integer pageSize, String userId,String collectableType);

    public List<ContentPojo> listContentPojo(List<Integer> ids);

    public List<GroupVO>listActivities (List<String> ids);

    public List<ContentPojo> listContentPojoByRefID(List<Integer> ids);

//    public ShopVO getShopInfoByShopId(String shopId, String tokenOrUserId);

//    public List<ProductionVO> getNewProList(String shopId);

//    public String getBrandName(String brandId);

//    public BrandVO getBrandInfo(String brandId);

//    public String getAreaName(String code1, String code2);

    // 根据
    public List<ContentPojo> listAll();

    public List<ContentPojo> moNvRecommend(List<Integer> ids);

    /**
     * 20140805 lim 同城活动详细内容
     *
     * @param content
     * @param bool 为true则是IOS端发起请求，去掉其中<br/>
     * @return
     * @throws Exception
     */
    public Map<String, Object> buildMap(ContentDO content, String userId, boolean bool) throws Exception;

    /**
     * 分页显示我的报名 20140806 lim
     *
     * @param userId
     * @param pageSize
     * @param currentPage
     * @return
     * @throws Exception
     */
    public PagingVO<ContentDO> pagingSameCityByUserId(String userId, int pageSize, Integer currentPage, short entityType) throws Exception;

    /**
     * 我的报名列表转正MAP返回 20140806 lim
     *
     * @param list
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> buildApplyListMap(List<ContentDO> list,String version) throws Exception;

    /**
     * 20140805 lim 报名的同城活动详细内容
     *
     * @param content
     * @return
     * @throws Exception
     */
    public Map<String, Object> buildApplyMap(ContentDO content, String version) throws Exception;

    /**
     * 获取已发布的
     *
     * @param id
     * @return
     */
    public ContentDO getPublishedById(int id);
    /**
     * 用户名是：phone和name 密码：encrypted_password
     *
     * @param uid
     * @return
     * @throws Exception
     */
    public UserInfoVO getUserByUid(String uid) throws Exception;

    /**
     * 查询所有的文章和活動对象 使用在老版本裏面 20140808lim
     */
    public List<ContentPojo> listAllBeforeV5() throws Exception ;

    /**
     * 通過ID查詢的文章和活動对象 使用在老版本裏面 20140808lim
     */
    public List<ContentPojo> listContentPojoBeforeV5(List<Integer> ids) throws Exception;

    /**
     * 商场小摩女特色推荐 使用在老版本裏面 20140808lim
     *
     * @param ids
     * @return
     */
    public List<ContentPojo> moNvRecommendBeforeV5(List<Integer> ids) throws Exception;

    /**
     * 查询所有的文章和活動对象的数量 使用在老版本裏面 20140808lim
     */
    public Integer getTotalNumBeforeV5() throws Exception;

    /***
     * 更新文章或活动的访问数量
     *
     */
    public void updateVistedNum(Integer id);

    /**
     * 更新文章和活动分享数量
     */
    public void updateShareNum(Integer id);

    public void updateActivityRecommend(Map<String, Integer> map);

    /**
     * 初始化app_content表中的share_num字段，默认值都设为0.
     */
    public void initShareNum() ;

    /**
     * 初始化app_content表中的visited_num字段，默认值都设为0.
     */
    public void initVisitedNum();

    /**
     * 更新优惠的分享数量
     *
     * @param activityId
     * @return
     */
    public FavourableVO updateFavourableShareNum(String activityId);

    /**
     * APP三期新首页 20140814 lim
     * @param category
     * @param type
     * @param lng
     * @param lat
     * @param pageSize
     * @param currentPage
     * @return
     * @throws Exception
     */
    public PagingVO<ContentPojo> pagingHomeIndexList(String category, String type, double lng, double lat, String cityId, int pageSize, Integer currentPage, String version) throws Exception ;

    /**
     * 根据文章Id返回文章信息
     * @param id
     * @return
     */
    public ContentPojo getContentInfo(Integer id) throws Exception;




    /**
     * 我的报名列表转正MAP返回 20140806 lim
     * @param list
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> buildHomeIndexList(List<ContentPojo> list, String userId, String version) throws Exception;
    /**
     * 20140814 lim
     * @param c
     * @param userId
     * @return
     * @throws Exception
     */
    public Map<String, Object> buildHomeIndexMap(ContentPojo c, String userId, String version) throws Exception;

    /**
     * 生成首页分类
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> buildCategoryMap() throws Exception ;

    /**
     * v5_1 四期下开发添加
     * 生成首页分类
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> buildCategoryMapV5_1() throws Exception;

    public List<CommentsVO> getComments(String commentable_id)throws Exception;

    public String insertFavInfo(String userId, String contentId, String collectableType);

    public void deleteFavInfo(String userId, String contentId, String collectableType);

//    public List<ShopVO> getCategoryShops(String zoneId,String categoryId,Double coord_x, Double coord_y);

//    public List<ShopVO> getShopsByFloor(String floorId,Double coord_x, Double coord_y);

//    public List<ShopVO> getCity_branch_Shops(String shopId);

//    public List<ShopVO> getSameBrandShop(String zoneId, List<String> categoryIds);

    /**
     * 用户收藏活动文章列表
     * @param ids
     * @return
     */
    public List<ContentPojo> userCollectionList(List<Integer> ids);
    /**
     * 更新报名人数
     * 20140807 lim
     * @return
     */
    public Integer updateParticipantsNumber(int participantsNumber, int id)throws Exception;
  
    public Integer init();
    
    public ContentDDO getFullById(Integer id);
    
    /**
     * 收藏店铺
     * 兼容店铺的mysqlId,mongoId
     * @param userId
     * @param contentId
     * @param collectableType
     * @return
     */
    public String insertShop(String userId, String shopId);
    /**
     * 微商城精彩活动
     * @param param
     * @return
     * @throws Exception
     */
	PagingVO<ContentPojo> pagingActivitiesList(ActivitiesParam param) throws Exception;


	public List<String> getMallIdsContent(String type);
	/**
	 * 
	* @Title: pagingActivityList 
	* @Description: 查询精彩活动接口
	* @param @param type 0全部，1附近，2吃喝，3玩乐
	* @param @param lng
	* @param @param lat
	* @param @param cityId
	* @param @param pageSize
	* @param @param currentPage
	* @param @param version
	* @param @return
	* @param @throws Exception    设定文件
	* @param mallId
     *@param shopId @return PagingVO<ContentPojo>    返回类型
	* @author shaozhou
	* @date 2016年5月5日 下午6:52:00 
	* @throws
	 */
	public PagingVO<ContentPojo> pagingArticleList(String mallId, String shopId, String type, double lng, double lat, String cityId, int pageSize, Integer currentPage) throws Exception ;
	/**
	 * 
	* @Title: pagingFavorList 
	* @Description: 查询优惠信息接口
	* @param @param cityId
	* @param @param pageSize
	* @param @param currentPage
	* @param @return    设定文件 
	* @return PagingVO<ContentPojo>    返回类型 
	* @author shaozhou
	* @date 2016年5月5日 下午7:32:25 
	* @throws
	 */
	public PagingVO<ContentPojo> pagingFavorList(String mallId, String shopId,  String cityId, int pageSize, Integer currentPage);
	/**
	 * 
	* @Title: pagingContentListByMallId 
	* @Description: 根据商场获取精彩活动和优惠列表
	* @param @param id
	* @param @param pageSize
	* @param @param currentPage
	* @param @return    设定文件 
	* @return PagingVO<ContentPojo>    返回类型 
	* @author shaozhou
	* @date 2016年5月5日 下午7:32:34 
	* @throws
	 */
	public PagingVO<ContentPojo> pagingContentListByMallId(String id, int pageSize, Integer currentPage);


	public List<Map<String, Object>> allListWelfareNew(Date pullAt, List<String> brandIdList);

    public int countWelfareNew(Date pullAt, List<String> brandIdList);


	public List<ContentPojo> allListWelFareOld(List<Map<String, Object>> activityIdList) throws Exception;


	public ResponseVO pagingListWelFare(Integer pageSize, Integer currentPage) throws Exception;
	
	public int countWelFareNew(Date pullAt);

	public ResponseVO allListWelFarePage(List<String> brandIdList, Integer pageSize, Integer currentPage) throws Exception;

	public List<Map<String, Object>> getConnectListById(String content_id, String connect_type, double lng, double lat) throws Exception;

	public List<MallAndShopVO> getSubMallAndShopVo(String type, String content_id, String mallOrBrandId) throws Exception;

	public ContentDO getContentDoById(String content_id);
	
	/**
     * 同城详情转换
     * @param content
     * @param userId
     * @param bool
     * @return
     * @throws Exception 
     * @see com.rongyi.rss.malllife.service.IContentService#buildMap(com.rongyi.easy.malllife.domain.ContentDO, java.lang.String, boolean) 
     */

    public Map<String, Object> buildMapByV700(ContentDO content, String userId, boolean bool,Integer appVersion) throws Exception ;

    /**
     * 查询潮人攻略列表数据
     *
     * @param mallMId
     * @param shopMId
     *@param pageSize
     * @param currentPage   @return
     */
    public PagingVO<ContentPojo> pagingRaidersList(String mallMId, String shopMId, int pageSize, Integer currentPage);

   public List<ContentConnectPojo> getContentConnectByContentId(String content_id);

    public ResponseVO pageSubMallAndShopVo(int pageSize, int currentPage, String refType, String contentId)throws Exception;

}
