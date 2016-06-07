package com.rongyi.rss.coupon.mall.shop;

import com.rongyi.easy.coupon.vo.ValidCommissionVO;

/**
 * Description:摩店验证记录接口，活动券和礼品券。店铺券不适用
 * Author: 袁波
 * DATE: 2016/6/7 20:25
 * Package:com.rongyi.rss.coupon.mall.shop
 * Project:easy-mobile
 */
public interface MSValidRecordService {
    /**
     *
     * @param shopMid
     * @return
     */
    public ValidCommissionVO recordList(String shopMid,String mallMid,Integer currentPage,Integer pageSize);
}
