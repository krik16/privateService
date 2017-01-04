package com.rongyi.rss.tradecenter;

import com.rongyi.core.bean.DubboVO;
import com.rongyi.easy.tradecenter.param.UserCenterParam;
import com.rongyi.easy.tradecenter.vo.UserCenterVO;

/**
 * 统一用户（微信）
 *
 * @author wangjh7
 * @date 2016-11-14
 */
public interface UserCenterService {

    /**
     * 获取统一用户的基本信息
     *
     * @param userId
     * @return
     */
    DubboVO<UserCenterVO> getUserInfo(String userId, String mallId);

    /**
     * 扣减用户积分
     *
     * @param param
     * @return
     */
    DubboVO<Integer> decreaseCredit(UserCenterParam param);

    /**
     * 返还库存
     *
     * @param param
     * @return
     */
    DubboVO<Integer> increaseCredit(UserCenterParam param);

}
