package com.rongyi.rss.tradecenter;

import com.rongyi.easy.malllife.vo.CouponRefundDetailVO;
import com.rongyi.easy.tradecenter.TradeUserCode;
import com.rongyi.easy.tradecenter.vo.CouponOrderVO;

import java.util.List;
import java.util.Map;

/**
 * 哈根达斯中秋券 同步数据
 *
 * @author wangjh7
 * @date 2016-08-08
 */
public interface IHgdzTradeUserCodeService {

    /**
     * 同步哈格达斯中秋券状态
     */
    void syncHgdzCouponStatus();

}
