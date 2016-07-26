package com.rongyi.rss.coupon.special;

import com.rongyi.easy.coupon.entity.SpecialGetRecord;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/7/26 11:41
 * Package:com.rongyi.rss.coupon
 * Project:easy-market
 */
public interface SpecialGetRecordService {
    public int insert(SpecialGetRecord specialGetRecord);

    public int countByUserId(String userId);
}
