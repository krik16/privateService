package com.rongyi.rss.coupon.operation;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.param.RedenvelopeParam;
import com.rongyi.easy.coupon.vo.operation.RedenvelopCouponVO;

public interface IRedenvelopeService {
	 /**
     * 根据PK查询
     *
     * @param id
     * @return
     */
    Coupon findOne(String id);

    /**
     * 保存
     *
     * @param coupon
     * @return
     */
    public boolean save(Coupon coupon) throws Exception;
    
    /**
     * 修改
     *
     * @param coupon
     * @return
     */
    public boolean update(Coupon coupon) throws Exception;

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     */
    boolean remove(String id) throws Exception;

   

    /**
     * 分页查询
     *
     * @param param
     * @return
     */
    PagingVO<RedenvelopCouponVO> findAllByPage(RedenvelopeParam param);

    /**
     * 审核现金劵
     *
     * @param id          现金劵Id
     * @param checkStatus 审核状态
     * @param checkDesc   审核说明
     * @return
     */
    boolean checkCoupon(String id, int checkStatus, String checkDesc) throws Exception;

    /**
     * 配置红包
     *
     * @param cashCoupon 关联商品
     * @return
     */
    boolean allocateCoupon(Coupon cashCoupon) throws Exception;

    /**
     * 根据卡券Id减少库存
     *
     * @param coupongId
     * @return
     */
    ResponseResult subtractCouponInventory(String coupongId);

    /**
     * 根据卡券Id减少库存
     *
     * @param coupongId amount
     * @return
     */
    ResponseResult subtractCouponInventory(String coupongId, int amount);

    /**
     * 根据卡券码查询优惠券
     *
     * @param couponCode
     * @return
     */
    Coupon getCouponByCode(String couponCode);

    /**
     * 追加券码
     *
     * @param couponId
     * @param addCount
     * @param userId
     * @return
     */
    Boolean addCouponCount(String couponId, Integer addCount, String userId) throws Exception;
}
