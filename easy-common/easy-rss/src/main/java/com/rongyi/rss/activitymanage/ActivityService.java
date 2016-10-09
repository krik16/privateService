package com.rongyi.rss.activitymanage;

import java.util.Date;
import java.util.List;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.activity.entity.QueryActivityGoods;
import com.rongyi.easy.activity.entity.QuerySecKillGoods;
import com.rongyi.easy.activitymanage.entity.*;
import com.rongyi.easy.activitymanage.param.ActivityGoodsImportParam;
import com.rongyi.easy.activitymanage.param.ActivityGoodsParam;
import com.rongyi.easy.activitymanage.param.CheckResGoods;
import com.rongyi.easy.activitymanage.param.SearchActivityParam;
import com.rongyi.easy.activitymanage.param.SearchActivityParamV2;
import com.rongyi.easy.activitymanage.vo.*;
import com.rongyi.easy.activitymanage.vo.ActivityInfoSimple;
import com.rongyi.easy.merchantactivity.vo.MerchantActivityEntryVO;

/**
 * 活动后台管理接口
 * Created by Leon on 2016/1/20.
 */
public interface ActivityService {

    /**
     * 根据activityGoodsId查询spec
     * @param id
     * @return
     */
    public List<ActivityGoodsSpec> selectSpecByActivityGoodsId(Integer id);

    /**
     * 根据主键获取活动商品
     * @param id
     * @return
     */
    public ActivityGoods selectActivityGoodsById(Integer id);

    /**
     * 新建活动
     * @param activityInfo
     * @return boolean
     * @author Leon
     */
    boolean saveActivityInfo(ActivityInfo activityInfo);


    /**
     * 审核活动
     * @param activityCheckRecord
     * @return boolean
     * @author Leon
     */
    boolean checkActivityInfo(ActivityCheckRecord activityCheckRecord);

    /**
     * 校验同一时间段内同一商品id是否已经存在
     * @param activityGoods
     * @return boolean
     * @author Leon
     */
    boolean validJoinDate(ActivityGoods activityGoods);

    /**
     * 保存商品
     * @param activityGoods
     * @return boolean
     * @author Leon
     */
    boolean saveActivityGoods(ActivityGoods activityGoods);

    /**
     * 批量新增ActivityGoods数据
     * @param ActivityGoods
     * @return boolean
     * @author Leon
     */
    boolean insertBatchGoods(List<ActivityGoods> ActivityGoods);

    /**
     * 保存导入失败的商品
     * @param activityGoodsImports
     * @return boolean
     * @author Leon
     */
    boolean saveActivityGoodsImport(List<ActivityGoodsImport> activityGoodsImports);

    /**
     * 获取导入失败记录
     * @param param
     * @return List<ActivityGoodsImport>
     * @author Leon
     */
    List<ActivityGoodsImport> getGoodsImports(ActivityGoodsImportParam param);

    /**
     * 查询导入的商品列表
     * @param param
     * @return PagingVO<ActivityGoodsVO>
     * @author Leon
     */
    PagingVO<ActivityGoodsVO> getActivityGoods(ActivityGoodsParam param);

    /**
     * 移除商品
     * @param activityGoodsIds
     * @return Boolean
     * @author Leon
     */
    boolean removeActivityGoodsImport(List<Integer> activityGoodsIds);

    /**
     * 根据id获取活动信息
     * @param activityId
     * @return ActivityInfo
     * @author Leon
     */
    ActivityInfo getActivityInfoById(Integer activityId);


    /**
     * 通过卡券Id查询活动信息
     * 如果卡券被移除了
     * @Author lijing
     * @param couponId
     * @param type   4是活动类型
     * @return
     */
    ActivityInfoCouponVO getActivityInfoByCoupon(String couponId, Integer type);







    /**
	 * 根据活动ID统计报名的商品卡券数量
	 * @param queryActivityGoods
	 * @return 
	 * @author wangzhiwen
	 */
     public int countActivityGoods(QueryActivityGoods queryActivityGoods);
     /**
 	 * 根据goodid，joinStartAt，joinEndAt查询商品卡券在同一时间是否参加其他活动
 	 * @param queryActivityGoods
 	 * @return 
	 * @author wangzhiwen
 	 */
     public List<ActivityGoods> getActivityGoodsInfo(QueryActivityGoods queryActivityGoods);

     /**
      * 新增操作记录
      * @param activityCheckRecord
      * @return 
	  * @author wangzhiwen
      */
     public int insertActivityCheckRecord(ActivityCheckRecord activityCheckRecord);
     /**
      * 新增商品规格
      * @param activityGoodsSpec
      * @return 
	  * @author wangzhiwen
      */
     public int insertActivityGoodsSpec(ActivityGoodsSpec activityGoodsSpec);

    /**
     * 查询活动列表
     * @param searchActivityParam
     * @return
     */
    public PagingVO<ActivityInfoListVO> getActivityList(SearchActivityParam searchActivityParam);
    
    public PagingVO<ActivityInfoListVOV2> getActivityListV2(SearchActivityParamV2 searchActivityParam);


    /**
     * 保存秒杀活动
     * @param activityInfo
     * @return
     */
    public ActivityInfo saveSecKillActivityInfo(ActivityInfo activityInfo);




    /**
     * 对外（交易使用）
     * 查询活动详情接口
     * @param goodsId 商品id
     * @param goodsType 商品[3] 卡券[1]
     * @return ActivityInfoVO
     */
    ActivityInfoVO getActivityInfoVO(String goodsId, Integer goodsType);


    /**
     * 对外（交易使用）
     * 查询活动详情接口
     * @param skuId 商品id
     * @param goodsType 商品[3] 卡券[1]
     * @return ActivityInfoVO
     */
    RoundGood getResActivityInfoVO(String skuId, Integer goodsType);
    

    /**
     * 查询活动关联的商品信息
     * @param ids
     * @param activityId
     * @param type
     * @return
     */
    List<ActivityGoodTemplateVO> selectActivityGoodsByActivity(List<String> ids,Integer activityId,Integer type);


    /**
     * 根据活动id查询推送的店铺人员id
     * @param activityId
     * @return
     */
    public  List<Integer> selectUserIdsByActivityId(Integer activityId);


    int countSecKillGoods(QuerySecKillGoods querySecKillGoods);

    public List<ActivityGoods> getSecKillGoods(QuerySecKillGoods querySecKillGoods);

    public List<Integer> batchInsertActivityGoods(List<ActivityGoods> activityGoodses);

    boolean updateActivityGoodsStatus(CheckResGoods checkResGoods);

    List<ActivityGoods> getShopActivityGoods(ActivityGoodsParam param);

    ActivityGoods selectAllActivityGoodsById(Integer activityGoodsId);

    public ActivityGoods selectAllByActivityIdGoodsId(Integer activityId, String goodsId);
    
    /**获取活动简要信息*/
    ActivityInfoSimple  getActivityInfoSimple(int activityId); 
    
    /**设置活动状态*/
    boolean setActivityOfflineState(int activityId);

    public List<MerchantActivityEntryVO> selectActivityEntryRuleByActivityId(Integer id);

    public ActivityGoodsRule selectByActivityId(Integer activityId);

    public  List<ActivityGoodsCategoryRule> selectActivityGoodsCategoryRuleByActivityId(Integer activityId);

    public ActivityInfoListVOV2 getActivityStatusCount(Integer activityId);
    
    
}
