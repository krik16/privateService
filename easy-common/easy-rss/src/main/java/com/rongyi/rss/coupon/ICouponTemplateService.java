package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;

import java.util.Map;

public interface ICouponTemplateService {
    /**
     * 这个是保存优惠卷模版表的
     *
     * @param content
     * @param shopId
     * @return
     */
    ResponseResult saveCouponTemplate(String content, String shopId, String type) throws Exception;

    /**
     * 删除
     *
     * @param shopId
     * @param id
     * @return
     */
    ResponseResult deleteCouponTemplate(String shopId, String id, String type) throws Exception;

    /**
     * 修改
     *
     * @param id
     * @param content
     * @return
     */
    ResponseResult updateCouponTemplate(String id, String content, String type) throws Exception;

    /**
     * 得到模版集合
     *
     * @param shopId
     * @param offer
     * @param pagesize
     * @return
     */
    Map<String, Object> getCouponTemplateList(String shopId, Integer offer, Integer pagesize, String type) throws Exception;

    /**
     * 设置为默认
     *
     * @param id
     * @param isDefault true设置为默认  false  取消默认状态 type 使用方式[1],使用限制[2]
     * @return
     */
    ResponseResult setDefaultTemplate(String id, boolean isDefault, String type) throws Exception;
}