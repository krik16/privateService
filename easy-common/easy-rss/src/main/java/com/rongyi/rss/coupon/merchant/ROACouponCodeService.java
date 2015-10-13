package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.entity.CouponCode;

import java.util.List;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/8/17 10:50.
 */
public interface ROACouponCodeService {
    /**
     * 批量插入第三方券码
     * @param list
     * @return
     */
    public int batchInsert(List<CouponCode> list);

    /**
     * 批量插入生成的券码
     * @param list
     * @return
     */
    public int batchGenerateInsert(List<CouponCode> list) ;

    /**
     * 统计某个卡券的券码
     * @param couponId
     * @return
     */
    public int countByCouponId(String couponId);

    public List<CouponCode> getCodesByCouponId(String couponId);


    /**
     * 更改券码状态 （推送用）
     *
     * @param couponCode
     * @param status
     * @return
     */
    public int updateStatusByCouponCode(String couponCode, Integer status);

    /**
     * 通过版本号获取券码数量
     * @param couponId
     * @param version
     * @return
     */
    public int countByVersion(String couponId, String version);

    /**
     * 通过版本号获取券码列表
     * @param couponId
     * @param version
     * @return
     */
    List<String> getCodeByVersion(String couponId, String version);
}
