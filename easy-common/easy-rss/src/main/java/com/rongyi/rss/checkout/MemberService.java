package com.rongyi.rss.checkout;

import com.rongyi.core.bean.DubboVO;
import com.rongyi.easy.tradecenter.vo.UserCenterVO;

/**
 * 会员服务
 *
 * @author wangjh7
 * @date 2017-03-01
 */
public interface MemberService {

    /**
     * 获取会员用户信息
     *
     * @param userId
     * @param mallId
     * @param platform
     * @return
     */
    DubboVO<UserCenterVO> getMemberInfo(String userId, String mallId, String platform);

    /**
     * 扣减用户积分
     *
     * @param credit
     * @param userId
     * @param mallId
     * @param orderChanel
     * @param orderNo
     */
    DubboVO decreaseCredit(int credit, String userId, String mallId, String orderChanel, String orderNo, String remark);

    /**
     * 返还用户积分
     *
     * @param credit
     * @param userId
     * @param mallId
     * @param orderChanel
     * @param orderNo
     */
    DubboVO increaseCredit(int credit, String userId, String mallId, String orderChanel, String orderNo, String remark);

    /**
     * 验证是否有权限验券
     *
     * @param mallId
     * @param shopId
     * @param commodityType
     * @return
     */
    DubboVO<Boolean> checkingCode(String mallId, String shopId, String commodityType);

    /**
     * 消费送积分
     *
     * @param mallId
     * @param userId
     * @param amount
     * @return
     */
    DubboVO pushCreditMsg(String mallId, String userId, Integer amount);

}