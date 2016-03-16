package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activitymanage.entity.ActivityInfo;
import com.rongyi.easy.merchantactivity.param.EnrollCoupon;

import java.util.List;

/**
 * create by com.rongyi.rss.activitymanage ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/3/15
 * TIME : 11:13
 * ideaworkspace.
 */
public interface MerchantActivityCouponService {
    /**
     * 查询 未开始  进行中的所有活动
     * @Param relevanId id
     *
     * @Param relevanType 代表大运营  1代表商场 2达标店铺 3代表品牌 4代表集团
     * @return
     */
    public List<ActivityInfo> searchMerchantActivtyList(String relevanId,Integer relevanType);

    /**
     * 通过活动id 查询活动详情
     * @param activityId
     * @return
     */
    public ActivityInfo searchMerchantActivityInfo(Integer activityId);


    /**
     * 创建卡券报名活动
     * @param enrollCoupon
     * @return
     */
    public Boolean saveEnrollCouponActivity(EnrollCoupon enrollCoupon);
}
