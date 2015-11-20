package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.param.PlatformRebateParam;
import com.rongyi.easy.coupon.vo.PlatformRebateVO;

/**
 * 容易逛用户平台抵扣券接口
 * Created by lqy on 2015/11/18.
 */
public interface RoaPlatformRebateService {

    /**
     * 校验抵扣券是否可用
     * @param param 校验参数
     * @return boolean
     * @author lqy
     */
    boolean validPlatformRebate(PlatformRebateParam param);

    /**
     * 根据券码查询抵扣券的抵扣金额（元）
     * @param couponCode 券码
     * @return discount
     * @author lqy
     */
    Double getPlatformRebateDiscount(String couponCode);

    /**
     * 根据券码查询抵扣券详情
     * @param couponCode 券码
     * @return PlatformRebateVO
     * @author lqy
     */
    PlatformRebateVO getPlatformRebate(String couponCode);

    /**
     * 使用抵扣券
     * @param couponCode 券码
     * @param orderNo 订单号
     * @return boolean
     * @author lqy
     */
    boolean usePlatformRebate(String couponCode, String orderNo);

    /**
     * 恢复抵扣券
     * @param couponCode
     * @return boolean
     * @author lqy
     */
    boolean recoverPlatformRebate(String couponCode);

    /**
     * 分页查询我的可使用抵扣券和已失效抵扣券
     * @param param
     * @return PagingVO
     * @author lqy
     */
    PagingVO<PlatformRebateVO> getUserPlatformRebates(PlatformRebateParam param);
}
