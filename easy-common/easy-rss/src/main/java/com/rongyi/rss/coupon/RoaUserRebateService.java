package com.rongyi.rss.coupon;

import com.rongyi.core.framework.mybatis.pojo.Page;
import com.rongyi.easy.coupon.entity.UserRebate;
import com.rongyi.easy.coupon.param.UserRebateParam;

/**
 * 用户抵扣券业务接口
 * Created by Breggor on 2015/10/12.
 */
public interface RoaUserRebateService {

    boolean create(UserRebate userRebate);

    boolean update(UserRebate userRebate);

    Page findAllByPage(UserRebateParam param);

    boolean remove(Integer id);

    UserRebate findById(Integer id);
}
