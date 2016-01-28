package com.rongyi.rss.activitymanage;

import java.util.List;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.activity.entity.QueryActivityGoods;
import com.rongyi.easy.activitymanage.entity.*;
import com.rongyi.easy.activitymanage.param.ActivityGoodsImportParam;
import com.rongyi.easy.activitymanage.param.SearchActivityParam;
import com.rongyi.easy.activitymanage.vo.ActivityGoodsImportVO;
import com.rongyi.easy.activitymanage.vo.ActivityInfoListVO;
import com.rongyi.easy.activitymanage.vo.ActivityInfoVO;

/**
 * 活动后台管理接口
 * Created by Leon on 2016/1/20.
 */
public interface ActivityService {

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
      * 批量新增ActivityGoods数据
      * @param ActivityGoods
      * @return 
	  * @author wangzhiwen
      */
     public int batchInsert(List<ActivityGoods> listActivityGoods);
     /**
      * 新增ActivityGoods数据返回Id
      * @param activityGoods
      * @return 
	  * @author wangzhiwen
      */
     public ActivityGoods insertActivityGoodsReturnId(ActivityGoods activityGoods);
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

    /**
     * 保存添加商品导入的excel数据
     * @param activityGoodsImports
     * @return boolean
     * @author Leon
     */
    boolean saveActivityGoodsImport(List<ActivityGoodsImport> activityGoodsImports);

    /**
     * 查询导入的商品列表
     * @param param
     * @return PagingVO<ActivityGoodsImportVO>
     * @author Leon
     */
    PagingVO<ActivityGoodsImportVO> getGoodsImportsByPage(ActivityGoodsImportParam param);

    /**
     * 移除关联的商品
     * @param importIds 临时表id集合
     * @return Boolean
     * @author Leon
     */
    boolean removeActivityGoodsImport(List<Integer> importIds);

    /**
     * 获取导入商品的列表
     * @param param
     * @return List<ActivityGoodsImport>
     * @author Leon
     */
    List<ActivityGoodsImport> getGoodsImports(ActivityGoodsImportParam param);


    /**
     * 对外（交易使用）
     * 查询活动详情接口
     * @param goodsId 商品id
     * @param goodsType 商品[3] 卡券[1]
     * @return ActivityInfoVO
     */
    ActivityInfoVO getActivityInfoVO(String goodsId, Integer goodsType);

}
