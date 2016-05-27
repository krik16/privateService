package com.rongyi.rss.code;


import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.code.ValidCouponVO;
import net.sf.json.JSONObject;

import java.util.Map;

/**
 * Description: 验码接口
 * Author: 袁波
 * DATE: 2016/5/25 19:46
 * Package:com.rongyi.rss.code
 * Project:easy-market
 */
public interface ValidCodeService {

    /**
     * 验码之前查询码的信息
     * @param couponCode
     * @param shopId
     * @param mallId
     * @param identity
     * @return
     */
    public ValidCouponVO validSearchCoupon(String couponCode, String shopId, String mallId, Integer identity);

    /**
     * 查询礼品码的信息
     * @param giftCode
     * @param mallId
     */
    public JSONObject validSearchGift(String giftCode, String mallId);


    /**
     * 验证券码
     * @param code
     * @param sessionUserInfo
     * @return
     */
    public boolean validCouponCode(String code,SessionUserInfo sessionUserInfo);

    /**
     * 验证礼品码
     * @param code
     * @param sessionUserInfo
     * @return
     */
    public boolean validGiftCode(String code, SessionUserInfo sessionUserInfo);
}
