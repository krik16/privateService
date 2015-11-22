package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.param.RebateAndRedenvelopParam;
import com.rongyi.easy.coupon.vo.PlatformRebateForOrderVO;
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
    boolean validPlatformRebate(RebateAndRedenvelopParam param);

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
    PagingVO<PlatformRebateVO> getUserPlatformRebates(RebateAndRedenvelopParam param);

    /**
     * 查询对订单可使用抵扣券和不可使用的抵扣券(不需要分页)
     * @param param
     * @return PlatformRebateForOrderVO
     * @author lqy
     */
    PlatformRebateForOrderVO getUserPlatformRebatesForOrder(RebateAndRedenvelopParam param);

    /**
     * 删除我的抵扣券
     * @param couponCode 抵扣券券码
     * @param userId 用户id
     * @return Boolean
     */
    boolean removeUserPlatformRebate(String couponCode, String userId);

    /**
     * 获取用户在某个时间点以后领取到的可使用的抵扣券数量
     * @param param 参数含 userId、receiveAt
     * @return count 数量
     * @author lqy
     */
    int getUserPlatformRebateCount(RebateAndRedenvelopParam param);
}
