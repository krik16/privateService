/**
 * @Title: CouponService.java
 * @Package com.rongyi.rss.coupon
 * @Description: RMMM优惠券接口
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年4月23日 上午11:33:49
 * @version V1.0
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.old_vo.OldCouponVO;
import com.rongyi.easy.coupon.param.RmmmCouponParam;
import com.rongyi.easy.coupon.param.RmmmCouponQueryParam;
import com.rongyi.easy.coupon.vo.RmmmCouponQueryListVO;
import com.rongyi.easy.solr.retrival.result.ActivityData;

/**
 * 功能描述： 摩店 优惠券操作接口
 *
 * @author Breggor
 */
public interface RmmmCouponService {

    /**
     * 创建优惠券
     */
    ResponseResult createCoupon(RmmmCouponParam param);

    /**
     * 查询优惠券
     */
    RmmmCouponQueryListVO listCoupon(RmmmCouponQueryParam param);

    /**
     * 删除优惠券
     */
    boolean removeCoupon(String couponId);

    /**
     * 更新优惠券状态
     * 目前修改优惠券下线状态，下线状态值：4
     */
    boolean updateCouponStatus(String couponId, String status);


    /**
     * 优惠券详情
     *
     * @param couponId
     * @return
     */
    OldCouponVO getCouponDetail(String couponId);


    /**
     * solr搜索优惠券详情页
     * @param couponId
     * @return
     */
    ActivityData getCouponInfoForSolr(String couponId);


    /**
     * 根据id查看优惠券是否存在
     * @param couponId
     * @return
     */
    boolean hasCoupon(String couponId);

}

