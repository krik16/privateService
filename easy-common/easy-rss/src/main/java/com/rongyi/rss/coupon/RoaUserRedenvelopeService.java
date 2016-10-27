package com.rongyi.rss.coupon;

import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.mybatis.pojo.Page;
import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.coupon.entity.UserRedenvelope;
import com.rongyi.easy.coupon.param.*;
import com.rongyi.easy.coupon.vo.RedenvelopeCodeUseDetailVO;
import com.rongyi.easy.coupon.vo.UserCouponVO;
import com.rongyi.easy.coupon.vo.UserRedPacketForOrderVO;
import com.rongyi.easy.coupon.vo.UserRedPacketVO;

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
     * 根据用户ID查询我的全场红包
     * @param userId
     * @param currentPage
     * @param pageSize
     * @return
     */
    PagingVO<UserRedenvelope> findUserCouponByUserIdFull(String userId, Integer currentPage, Integer pageSize);

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
     * 根据券码查询红包抵扣金额(分)
     *
     * @param couponCode
     * @return
     */
    Integer getCashCouponDiscount(String couponCode);

    /**
     * 用户红包信息
     *
     * @param couponCode
     * @return
     */
    UserCoupon findUserCouponByCode(String couponCode);

    /**
     * 用户红包领取数
     *
     * @param couponId
     * @param userId
     * @return
     */
    int receivedCount(String couponId, String userId);

    /**
     * 根据老参数领取红包
     *
     * @param param
     * @return
     */
    ResponseResult createByCouponOrderParam(CouponOrderParam param);

    /**
     * 大运营平台查询券码详情接口接口
     * @param param
     * @return RedenvelopeCodeUseDetailVO
     * @auther 袁波
     * @Time 2015/11/20 15:38
     */
    public RedenvelopeCodeUseDetailVO selectCodeUseDetail(RedenvelopeUseDetailParam param);


    /**
     * 获取用户当日获取红包或抵扣券的个数
     * @param param
     * @return
     */
    public int getOneDayUserSkype(UserSkypeParam param);



    /**
     * 使用红包
     * @param couponCode 券码
     * @param orderNo 订单号
     * @return boolean
     * @author lqy
     */
    boolean useCashCoupon(String couponCode, String orderNo);

    /**
     * 恢复红包
     * @param couponCode 券码
     * @return boolean
     * @author lqy
     */
    boolean recoverCashCoupon(String couponCode);

    /**
     * 校验红包是否可用
     * @param param
     * 商品订单参数: couponCode、commodityId
     * 代金券订单参数：couponCode、voucherId
     * @return boolean
     * @author lqy
     */
    boolean validCashCoupon(RebateAndRedenvelopParam param);

    /**
     * 根据红包券码获取红包名称
     * @param couponCode 券码
     * @return name
     * @author lqy
     */
    String getRedPacketName(String couponCode);

    /**
     * 根据券码查询抵红包详情
     * @param couponCode 券码
     * @return UserRedPacketVO
     * @author lqy
     */
    UserRedPacketVO getUserRedPacket(String couponCode);

    /**
     * 分页查询我的可使用红包和已失效红包
     * @param param 参数：userId、isUsable、currentPage、pageSize
     * @return PagingVO
     * @author lqy
     */
    PagingVO<UserRedPacketVO> getUserRedPackets(RebateAndRedenvelopParam param);

    /**
     * 查询对订单可使用红包和不可使用的红包(不需要分页)
     * @param param
     * 商品订单参数：commodityId
     * 代金券订单参数：voucherId
     * @return UserRedPacketForOrderVO
     * @author lqy
     */
    UserRedPacketForOrderVO getUserRedPacketForOrder(RebateAndRedenvelopParam param);

    /**
     * 获取用户在某个时间点以后领取到的可使用的红包数量
     * @param param 参数含 userId、receiveAt
     * @return count 数量
     * @author lqy
     */
    int getUserRedPacketCount(RebateAndRedenvelopParam param);

    /**
     * 定时任务
     * 推送3天内要过期的红包和抵扣券给用户
     * @author lqy
     */
    void pushWillExpireTimerTask();

    /**
     * 检查红包是否使用(status未使用[0],已使用[1])
     * @param couponOrderParam
     * @return
     * @author wzw
     */
    boolean checkEnvelopeIsUse(CouponOrderParam couponOrderParam);

    /**
     * 砍价发送红包
     * @param couponOrderParam
     * @return
     * @author wzw
     */
    boolean sendEnvelope(CouponOrderParam couponOrderParam);

    List<String> getCommodityIdsByCouponId(String couponId);

    /**
     * 根据couponId获取当天领取红包的个数
     * @param couponId
     * @return
     */
    int getOneDayCouponSkype(String couponId);
}
