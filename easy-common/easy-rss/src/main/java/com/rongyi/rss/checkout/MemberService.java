package com.rongyi.rss.checkout;

import com.rongyi.core.bean.DubboVO;
import com.rongyi.easy.tradecenter.vo.UserCenterVO;

import java.util.Date;
import java.util.Map;

/**
 * 会员服务
 *
 * @author wangjh7
 * @date 2017-03-01
 */
public interface MemberService {

    /**
     * 获取统一用户的基本信息
     *
     * @param userId      用户id
     * @param mallId      商场id
     * @param platform    平台
     * @param serviceType 微信下单时对应的公众号类型
     * @return
     */
    UserCenterVO getUserInfo(String userId, String mallId, String platform, Integer serviceType);

    /**
     * 扣减用户积分
     *
     * @param credit      积分
     * @param userId      用户id
     * @param mallId      商场id
     * @param orderChanel 订单渠道
     * @param orderNo     订单号
     * @param serviceType 微信下单时对应的公众号类型
     */
    void decreaseCredit(int credit, String userId, String mallId, String orderChanel, String orderNo, String remark, Integer serviceType);

    /**
     * 返还用户积分
     *
     * @param credit      积分
     * @param userId      用户id
     * @param mallId      商场id
     * @param orderChanel 订单渠道
     * @param orderNo     订单号
     * @param remark      备注
     * @param serviceType 微信下单时对应的公众号类型
     */
    void increaseCredit(int credit, String userId, String mallId, String orderChanel, String orderNo, String remark, Integer serviceType);

    /**
     * 返还用户积分
     *
     * @param userId       用户id
     * @param mallId       商场id
     * @param creditNumber 积分
     * @param orderNo      订单号
     * @param orderChannel 订单渠道
     * @param remark       备注
     */
    void increaseCredit(String userId, String mallId, int creditNumber, String orderNo, String orderChannel, String remark);

    /**
     * 验证是否有权限验券
     *
     * @param mallId        商场id
     * @param shopId        店铺id
     * @param commodityType 商品类型
     * @param serviceType   微信下单时对应的公众号类型
     * @return
     */
    boolean checkingCode(String mallId, String shopId, String commodityType, Integer serviceType);

    /**
     * 消费送积分
     *
     * @param platform    平台
     * @param mallId      商场id
     * @param serviceType 微信下单时对应的公众号类型
     * @param userId      用户id
     * @param payAmount   支付金额（实付金额-运费）
     * @param payDate     支付时间
     * @param activityId     活动id
     * @param shopId     店铺id
     * @return
     */
    DubboVO pushCreditMsg(Integer platform, String mallId, Integer serviceType, String userId, String orderNo, double payAmount, Date payDate, String activityId, String shopId);

    /**
     * 获取当前消费送积分
     *
     * @param platform    平台
     * @param mallId      商场id
     * @param shopId     店铺id
     * @return {"consumeActivityId":"活动id"}
     */
    public DubboVO<Map<String,Object>> getCreditMsg(Integer platform, String mallId,String shopId);
}