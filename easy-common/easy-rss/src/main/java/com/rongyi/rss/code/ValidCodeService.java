package com.rongyi.rss.code;


import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.code.StatisticsValidCountVO;
import com.rongyi.easy.code.ValidCouponVO;
import com.rongyi.easy.coupon.vo.merchant.StatisticsCountVO;
import com.rongyi.easy.tradecenter.param.BizzValidHistoryParam;
import com.rongyi.easy.tradecenter.vo.BizzValidHistoryVO;
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
    public ValidCouponVO validSearchGift(String giftCode, String mallId);


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

    /**
     * 统计各个类型的总验码数量和当天验码数
     * @param param
     * @param sessionUserInfo
     * @return
     */
    public StatisticsValidCountVO statisticsValidCount(BizzValidHistoryParam param,SessionUserInfo sessionUserInfo);

    /**
     * 获取礼品验证列表
     * @param param
     * @param sessionUserInfo
     * @return
     */
    public BizzValidHistoryVO queryGiftValidList(BizzValidHistoryParam param, SessionUserInfo sessionUserInfo);
}
