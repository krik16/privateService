package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.Coupon;

import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;

/**
 * 给WEB界面提供现金券接口
 *
 * @author Breggor
 */
public interface ICashCouponService {

    /**
     * 根据PK查询
     *
     * @param id
     * @return
     */
    Coupon findOne(String id);

    /**
     * 保存或更新
     *
     * @param coupon
     * @return
     */
    boolean saveOrUpdate(Coupon coupon);

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     */
    boolean remove(String id);

    /**
     * 返回所有数据
     *
     * @return
     */
    List<Coupon> findAll();

    /**
     * 分页查询数据
     *
     * @param paramMap
     * @param curPage
     * @param pageSize
     * @return
     */
    PagingVO<Coupon> findAllByPage(Map<String, Object> paramMap, int curPage, int pageSize);

    /**
     * 审核现金劵
     *
     * @param id          现金劵Id
     * @param checkStatus 审核状态
     * @param checkDesc   审核说明
     * @return
     */
    boolean checkCoupon(String id, String checkStatus, String checkDesc);

    /**
     * 配置现金券
     *
     * @param cashCoupon 关联商品
     * @return
     */
    boolean allocateCoupon(Coupon cashCoupon);

    /**
     * 追加券码
     *
     * @param couponId
     * @param addCount
     * @param userId
     * @return
     */
    public Boolean addCouponCount(ObjectId couponId, Integer addCount, String userId);

    /**
     * 根据卡券Id减少库存
     *
     * @param coupongId
     * @return
     */
    public ResponseResult subtractCouponInventory(String coupongId);
    
    /**
     * 卡券返库
     * 库存量，券码状态
     * @param couponId
     * @param couponCode
     * @return
     */
     boolean  restoreCouponInventory(String couponId,String couponCode);
}
