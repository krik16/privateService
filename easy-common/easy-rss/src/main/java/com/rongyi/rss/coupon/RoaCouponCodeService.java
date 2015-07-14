package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.CouponCode;
import com.rongyi.easy.coupon.vo.CouponHistoryVO;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RoaCouponCodeService {

    /**
     * 根据券码查找券码信息
     *
     * @param code
     */
    CouponCode findCouponCodeByCode(String code);

    PagingVO<CouponHistoryVO> searchCouponCodeListAndCount(Map paramMap);

    /**
     * 通过couponId获取对应的券码List
     */
    List<CouponCode> getCouponCodeListByCouponId(Map paramsMap);

    /**
     * 更新券码表，成功返回true，失败返回false
     */
    int updateCouponCodeById(CouponCode couponCode);

    /**
     * 通过id改变券码当前状态
     *
     * @param id
     * @param status
     * @return
     */
    public Boolean changeStatusById(Long id, Integer status);

    /**
     * 根据券码Id查询
     *
     * @param couponCodeId
     * @return
     */
    public CouponCode findOne(Long couponCodeId);

    /**
     * 根据卡券码更新状态
     *
     * @param couponCode
     * @param status
     * @return
     */
    boolean changeStatusByCode(String couponCode, Integer status);


    /**
     * 是否有优惠券
     *
     * @param couponId
     * @return
     */
    boolean isHasCouponCode(String couponId);

    /**
     * @Description（券码） 把未领取已经过期的券码状态改为过期状态（定时任务）
     * @author yb
     */
    public void updateAllCouponCodeValid();
}
