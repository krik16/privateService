package com.rongyi.rss.activity.push;
import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.coupon.param.CouponOrderParam;


/**
 * @Title: ROAPushCouponService.java
 * @Package:
 * @Description: TODO
 * @author 袁波
 * @date 2015年6月19日 下午5:56:30
 */

/**
 *
 * @Description
 * @author 袁波
 * @date 2015年6月19日 下午5:56:30
 */

public interface ROAPushCouponService {
    /**
     *
     * @Description 插入一条 user_coupon
     * @author 袁波
     * @param userCoupon
     */
    public void saveUserCoupon(UserCoupon userCoupon);
    /**
     *
     * @Description 更新卡券库存
     * @author 袁波
     * @param coupongId 卡券id
     * @param amount 要更新的数量
     * @return
     */
    public ResponseResult subtractCouponInventory(String coupongId, int amount);


}
