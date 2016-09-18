package com.rongyi.rss.code;

import com.rongyi.easy.code.ValidCouponVO;
import com.rongyi.easy.coupon.entity.Coupon;

import java.util.List;

/**
 * Description:验码记录
 * Author: 袁波
 * DATE: 2016/9/18 16:03
 * Package:com.rongyi.rss.code
 * Project:easy-market
 */
public interface ValidRecordService {

    public int createValidRecord(List<String> codes, Coupon coupon, Byte couponType, Integer validUserId, String validUserName, String mallId,String shopId,int validChannel) throws Exception;

    public int createValidRecord(String code,ValidCouponVO validCouponVO, Integer validUserId, String validUserName, String mallId,String shopId,int validChannel) throws Exception;

    public int createValidRecord(String code, Coupon coupon, Byte couponType, Integer validUserId, String validUserName, String mallId,String shopId,int validChannel) throws Exception;
}
