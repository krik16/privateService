package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.entity.CouponRejectRecord;
import com.rongyi.easy.coupon.vo.merchant.MerchantPaging;
import com.rongyi.easy.coupon.vo.merchant.StatisticsCountVO;
import com.rongyi.easy.coupon.vo.merchant.UserInfoVo;
import com.rongyi.easy.page.QueryParam;

import java.util.List;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/28 11:03.
 */
public interface ROAMerchantCouponService {
    /**
     * 卡券通用查询接口
     *
     * @param queryParam
     * @return
     */
    public MerchantPaging<Coupon> getCouponByPageMysql(QueryParam queryParam, UserInfoVo UserInfoVo);

    /**
     * 商家优惠券，新增，修改，审核，删除等操作
     *
     * @param coupon
     * @return
     */
    public Boolean updateCoupon(Coupon coupon, UserInfoVo userInfoVo) throws Exception;

    /**
     * 插入一条coupon
     *
     * @return coupon id
     */
    public String insertCoupon(Integer inChannel,UserInfoVo userInfoVo);

    /**
     * 获取未通过列表
     *
     * @param couponId
     * @param type
     * @return
     */
    public List<CouponRejectRecord> getUnpassReasons(String couponId, Integer type);

    /**
     * 根据登录用户统计，该用户所对应集团/品牌/分公司/商场 下面优惠券的 审核状态的数量
     *
     * @param userInfoVo
     * @return
     */
    public StatisticsCountVO statisticsCheckCount(UserInfoVo userInfoVo);

    /**
     * 根据登录用户统计，该用户所对应集团/品牌/分公司/商场 下面优惠券的 发布状态的数量
     *
     * @param userInfoVo
     * @return
     */
    public StatisticsCountVO statisticsPublishCount(UserInfoVo userInfoVo);

    public Coupon selectByPrimaryKey(String couponId);
}
