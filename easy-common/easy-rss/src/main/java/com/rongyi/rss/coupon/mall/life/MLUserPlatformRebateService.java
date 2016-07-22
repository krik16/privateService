package com.rongyi.rss.coupon.mall.life;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.param.RebateAndRedenvelopParam;
import com.rongyi.easy.coupon.param.UserRebateParam;
import com.rongyi.easy.coupon.vo.PlatformRebateForOrderVO;
import com.rongyi.easy.coupon.vo.PlatformRebateVO;

/**
 * 提供给容易逛的平台抵扣券接口
 * Created by lqy on 2015/11/23.
 */
public interface MLUserPlatformRebateService {

    /**
     * 根据券码查询抵扣券详情
     * @param couponCode 券码
     * @return PlatformRebateVO
     * @author lqy
     */
    PlatformRebateVO getPlatformRebate(String couponCode);

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

    /**
     * 分页查询我的可使用抵扣券和已失效抵扣券
     * @param param
     * @return PagingVO
     * @author lqy
     */
    PagingVO<PlatformRebateVO> getUserPlatformRebates(RebateAndRedenvelopParam param);

    /**
     * 查询对订单可使用抵扣券和不可使用的抵扣券(不需要分页)
     * 目前是商品订单和代金券订单
     * @param param
     * @return PlatformRebateForOrderVO
     * @author lqy
     */
    PlatformRebateForOrderVO getUserPlatformRebatesForOrder(RebateAndRedenvelopParam param);

    /**
     * 领取抵扣券
     * @param param 用户抵扣券参数
     * @return true | false
     * @author lqy
     */
    boolean receiveRebates(UserRebateParam param);
    
    /**
     * 根据券码查询抵扣券的抵扣金额（元）和满多少金额（元）
     * @param couponCode 券码
     * @return discount & origPrice
     * @author lqy
     */
    PlatformRebateVO getPlatformRebateDiscountAndOrigPrice(String couponCode);


    /**
     * 获取平台促销券适用的店铺id列表和分类id列表
     * @param couponId
     * @return
     */
    PlatformRebateVO getShopIdsAndCategiryIds(String couponId);
}
