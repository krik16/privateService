package com.rongyi.rss.coupon;

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

    Map<String, List<UserCouponVO>> findUnusedRedenvelope(List<String> productIds, String userId);

    UserRedenvelope findByCode(String couponCode);

    boolean updateStatus(String couponCode, Integer status);

    boolean checkReceived(String couponId, String userId);
}
