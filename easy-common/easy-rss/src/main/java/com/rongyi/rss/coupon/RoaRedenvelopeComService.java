package com.rongyi.rss.coupon;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.mysql.Coupon;
import com.rongyi.easy.coupon.param.operation.RedenvelopeParam;
import com.rongyi.easy.coupon.vo.operation.RedenvelopCouponVO;

public interface RoaRedenvelopeComService {
	 /**
     * 根据PK查询
     *
     * @param id
     * @return
     */
    Coupon findOne(int id);

    /**
     * 保存或更新
     *
     * @param coupon
     * @return
     */
    boolean saveOrUpdate(Coupon coupon) throws Exception;

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     */
    boolean remove(int id) throws Exception;

    /**
     * 返回所有数据
     *
     * @return
     */
    List<Coupon> findAll();

    /**
     * 分页查询
     *
     * @param RedenvelopeParam
     * @return
     */
    PagingVO<RedenvelopCouponVO> findAllByPage(RedenvelopeParam paramVo);

    /**
     * 审核现金劵
     *
     * @param id          现金劵Id
     * @param checkStatus 审核状态
     * @param checkDesc   审核说明
     * @return
     */
    boolean checkCoupon(int id, int checkStatus, String checkDesc) throws Exception;

    /**
     * 配置现金券
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
    Boolean addCouponCount(int couponId, Integer addCount, String userId) throws Exception;
}
