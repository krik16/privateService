package com.rongyi.rss.malllife.roa;


import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.malllife.domain.AppReference2DO;
import com.rongyi.easy.malllife.domain.AppReferenceDO;
import com.rongyi.easy.malllife.domain.ContentDDO;
import com.rongyi.easy.malllife.domain.ContentDO;
import com.rongyi.easy.malllife.param.ActivitiesParam;
import com.rongyi.easy.malllife.pojo.ContentConnectPojo;
import com.rongyi.easy.malllife.pojo.ContentPojo;
import com.rongyi.easy.malllife.pojo.ExistArticlePojo;
import com.rongyi.easy.malllife.vo.*;

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
public interface ROAContentService {


    public ContentDO getById(Integer id) ;

    public ContentDO getActivityByShopId(String id);

    /**
     * 分页查询
     */
    public List<ContentDO> listPageContent(Integer startRecordIndex, Integer pageSize);

    public Integer getTotalNum();

    public MallVO getMallInfo(String mallId);

    public List<ShopCategoryVO> getShopCats(String mallId) throws Exception;

    public OldMallVO getOldMallInfo(String mallId);



    public List<MallVO> getMallList(double x, double y);

    public MallVO findMallByZoneIds(List<String> ids) throws Exception ;

    public List floorCountList(String mallId) throws Exception;

//    public FavourableVO getVistedNum(String activityId);

    public boolean favAction(Integer id);

    public boolean cancelFavAction(Integer id);

    public String insertFavInfo(String userId, String contentId);

    public void deleteFavInfo(String userId, String contentId);

    public AppReferenceDO getAppRefById(Integer id);


    public List<AppReferenceDO> getReferenceID(String id);

    public List<AppReference2DO> getActivityMall(Integer id);

    public boolean isFav(String userId, String contentId);

    public String getUserIdByToken(String tokenOrUserId) throws Exception;

    public Map<String, Object> listPageContentIds(Integer page, Integer pageSize, String userId,String collectableType);

    public List<ContentPojo> listContentPojo(List<Integer> ids);

    public List<GroupVO>listActivities (List<String> ids);

    public List<ContentPojo> listContentPojoByRefID(List<Integer> ids);

    public ShopVO getShopInfoByShopId(String shopId, String tokenOrUserId);

    public List<ProductionVO> getNewProList(String shopId);

    public String getBrandName(String brandId);

    public BrandVO getBrandInfo(String brandId);

    public String getAreaName(String code1, String code2);

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
     * 通过uid & pwd get User
     *
     * @param uid
     * @param pwd
     * @return
     */
    public UserInfoVO getUserByUidAndPwd(String uid, String pwd) throws Exception;

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

    public List<CommentsVO> getComments(String commentable_id);

    public String insertFavInfo(String userId, String contentId, String collectableType);

    public void deleteFavInfo(String userId, String contentId, String collectableType);

    public List<ShopVO> getCategoryShops(String zoneId,String categoryId,Double coord_x, Double coord_y);

    public List<ShopVO> getShopsByFloor(String floorId,Double coord_x, Double coord_y);

    public List<ShopVO> getCity_branch_Shops(String shopId);

    public List<ShopVO> getSameBrandShop(String zoneId, List<String> categoryIds);

    /**
     * 用户收藏活动文章列表
     * @param ids
     * @return
     */
    public List<ContentPojo> userCollectionList(List<Integer> ids);
    
    public Integer init();

    public ContentDDO getFullById(Integer id);
    
    /**
     * 收藏店铺
     * 兼容店铺的mysqlId,mongoId
     * @param userId
     * @param
     * @param
     * @return
     */
    public String insertShop(String userId, String shopId);
    /**
     * 微商城精彩活动
     * @param param
     * @return
     * @throws Exception
     */
	public PagingVO<ContentPojo> pagingActivitiesList(ActivitiesParam param) throws Exception;
	/**
	 * 
	* @Title: pagingArticleList 
	* @Description: 容易逛 精彩活动(吃喝玩乐)接口
	* @param @param category
	* @param @param type
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
	* @date 2016年5月5日 下午7:16:54 
	* @throws
	 */
	public PagingVO<ContentPojo> pagingArticleList(String mallId, String shopId, String type, double lng, double lat, String cityId, int pageSize, Integer currentPage) throws Exception ;
	/**
	 * 
	* @Title: pagingArticleList 
	* @Description: 查询优惠信息接口
	* @param @param cityId
	* @param @param pageSize
	* @param @param currentPage
	* @param @return
	* @param @throws Exception    设定文件 
	* @return PagingVO<ContentPojo>    返回类型 
	* @author shaozhou
	* @date 2016年5月5日 下午7:24:22 
	* @throws
	 */
    public PagingVO<ContentPojo> pagingFavorList(String mallId, String shopId, String cityId, Integer pageSize, Integer currentPage) throws Exception ;
	/**
	 * 
	* @Title: pagingContentListByMallId 
	* @Description: 根据商场获取精彩活动和优惠列表
	* @param @param id
	* @param @param pageSize
	* @param @param currentPage
	* @param @return
	* @param @throws Exception    设定文件 
	* @return PagingVO<ContentPojo>    返回类型 
	* @author shaozhou
	* @date 2016年5月5日 下午7:30:00 
	* @throws
	 */
	public PagingVO<ContentPojo> pagingContentListByMallId(String id,int pageSize, Integer currentPage) throws Exception ;
	/**
	 * 
	* @Title: allListWelfareNew 
	* @Description: 爱品牌根据品牌list查询所有的新数据 String 列表
	* @param @param pullAt
	* @param @param brandIdList
	* @param @return
	* @param @throws Exception    设定文件 
	* @return List<String>    返回类型 
	* @author shaozhou
	* @date 2016年5月6日 上午10:30:43 
	* @throws
	 */
	public List<Map<String,Object>> allListWelfareNew(Date pullAt,List<String> brandIdList) throws Exception;

    /**
     * 获取新超过某个时间更新的爱品牌文章个数
     * @param pullAt
     * @param brandIdList
     * @return
     * @throws Exception
     */
    public int countWelfareNew(Date pullAt, List<String> brandIdList) throws Exception;

	/**
	 * 
	* @Title: allListWrlFaraOld 
	* @Description: 爱品牌根据文章列表id查询列表数据
	* @param @param activityIdList
	* @param @return
	* @param @throws Exception    设定文件 
	* @return List<ContentPojo>    返回类型 
	* @author shaozhou
	* @date 2016年5月6日 上午10:32:57 
	* @throws
	 */
	public List<ContentPojo> allListWelFareOld(List<Map<String,Object>> activityMap)throws Exception;
	/**
	 * 
	* @Title: pagingListWelFare 
	* @Description: 分页获取所有的爱品牌数据
	* @param @return
	* @param @throws Exception    设定文件 
	* @return PagingVO<ContentPojo>    返回类型 
	* @author shaozhou
	* @date 2016年5月6日 上午10:35:10 
	* @throws
	 */
	public ResponseVO pagingListWelFare(Integer pageSize,Integer currentPage) throws Exception;
	/**
	 * 
	* @Title: countWelFareNew 
	* @Description: 查询爱品牌最新数量用于前端展示
	* @param @param pullAt
	* @param @return
	* @param @throws Exception    设定文件 
	* @return int    返回类型 
	* @author shaozhou
	* @date 2016年5月9日 上午10:02:07 
	* @throws
	 */
	public int countWelFareNew(Date pullAt) throws Exception;
	/**
	 * 
	* @Title: allListWelFarePage 
	* @Description: 分页查询爱品牌
	* @param @param activityMap
	* @param @return
	* @param @throws Exception    设定文件 
	* @return List<ContentPojo>    返回类型 
	* @author shaozhou
	* @date 2016年5月11日 下午8:26:50 
	* @throws
	 */
	public ResponseVO allListWelFarePage(List<String> brandIdList,Integer pageSize,Integer currentPage)throws Exception;
	/**
	 * @throws Exception 
	 * 
	* @Title: getConnectListById 
	* @Description: 根据活动id和type类型 查询 活动类型,关联商场，店铺，品牌id,商场和品牌下关联店铺的num
	* @param @param content_id
	* @param @return    设定文件 
	* @return List<Map<String,Object>>    返回类型 
	* @author shaozhou
	* @date 2016年5月19日 下午4:21:28 
	* @throws
	 */
	public List<Map<String,Object>> getConnectListById(String content_id,String connect_type,double lng, double lat) throws Exception;
	/**
	 * @throws Exception 
	 * 
	* @Title: getSubMallAndShopVo 
	* @Description: 根据商场id，品牌id查询下面子店铺
	* @param @param type
	* @param @param content_id
	* @param @param mallOrBrandId
	* @param @return    设定文件 
	* @return List<MallAndShopVO>    返回类型 
	* @author shaozhou
	* @date 2016年5月19日 下午5:46:34 
	* @throws
	 */
	public List<MallAndShopVO> getSubMallAndShopVo(String type,String content_id,String mallOrBrandId) throws Exception;
    public ResponseVO pageSubMallAndShopVo(int pageSize, int currentPage, String refType, String contentId)throws Exception;
	/**
	 * 
	* @Title: getContentDoById 
	* @Description: 获取活动数据
	* @param @param content_id
	* @param @return    设定文件 
	* @return ContentDO    返回类型 
	* @author shaozhou
	* @date 2016年5月19日 下午5:48:24 
	* @throws
	 */
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
    public ShopVO getShopInfoByShopId(String shopId);

    public List<ContentConnectPojo> getContentConnectByContentId(String content_id);
    public ExistArticlePojo existArticle(String mallId, String shopId);
    
    /**
     * 查询特卖汇列表数据
     *
     *@param pageSize 每页显示行数
     * @param currentPage  当前页码
     * @return 列表
     */
    public PagingVO<ContentPojo> pagingSaleList(int pageSize, Integer currentPage);
}
