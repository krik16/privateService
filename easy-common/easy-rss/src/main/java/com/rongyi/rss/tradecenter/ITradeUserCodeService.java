package com.rongyi.rss.tradecenter;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.mybatis.pojo.Page;
import com.rongyi.easy.tradecenter.TradeUserCode;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by xgq on 2015/8/19.
 */
public interface ITradeUserCodeService {

    TradeUserCode getTradeUserCode(String code);

    void updateTradeUserCode(TradeUserCode tradeUserCode);

    TradeUserCode findTradeUserCouponById(Integer id);

    int buyedCouponCount(String couponId, String userId);

    List<TradeUserCode> findTradeUserCodeList(Integer orderId, String couponId);

    void updateTradeUserCodeStatusByIds(List<Integer> tradeUserCodeIds, int status);

}
