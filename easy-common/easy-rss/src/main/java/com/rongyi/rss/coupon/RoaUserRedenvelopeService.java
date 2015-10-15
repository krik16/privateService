package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.mybatis.pojo.Page;
import com.rongyi.easy.coupon.entity.UserRedenvelope;
import com.rongyi.easy.coupon.param.UserRedenvelopeParam;
import com.rongyi.easy.coupon.vo.UserCouponVO;

import java.util.List;
import java.util.Map;

/**
 * 用户红包业务接口
 * Created by Breggor on 2015/10/12.
 */
public interface RoaUserRedenvelopeService {

    boolean create(UserRedenvelope userRedenvelope);

    boolean update(UserRedenvelope userRedenvelope);

    Page findAllByPage(UserRedenvelopeParam param);

    boolean remove(Integer id);

    UserRedenvelope findById(Integer id);

    Map<String, List<UserCouponVO>> findUnusedRedenvelopeList(List<String> productIds, String userId);

    UserRedenvelope findByCode(String couponCode);

    boolean updateStatus(String couponCode, Integer status);

    boolean checkReceived(String couponId, String userId);

    /**
     * 根据用户Id查询用户红包
     *
     * @param userId
     * @param currentPage
     * @param pageSize
     * @return
     */
    PagingVO<UserRedenvelope> findUserCouponByUserId(String userId, Integer currentPage, Integer pageSize);

    /**
     * 根据券码与商品Id验证红包
     *
     * @param couponCode
     * @param commodityId 商品Id
     * @return
     */
    boolean validCashCoupon(String couponCode, String commodityId);

    /**
     * 根据券码查询红包状态
     *
     * @param couponCode
     * @return
     */
    Integer getCashCouponStatus(String couponCode);

    /**
     * 修改红包状态
     *
     * @param couponCode
     * @param status
     * @param orderNo
     * @param sellerId
     * @return
     */
    boolean changeCashCouponStatus(String couponCode, Integer status, String orderNo, Integer sellerId);


    /**
     * 根据券码查询红包信息
     *
     * @param couponCode
     * @return
     */
    UserCouponVO findCashCoupon(String couponCode);

    /**
     * 根据券码查询红包抵扣金额
     *
     * @param couponCode
     * @return
     */
    Double getCashCouponDiscount(String couponCode);
}
