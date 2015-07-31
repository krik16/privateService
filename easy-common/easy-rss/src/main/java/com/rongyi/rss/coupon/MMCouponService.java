package com.rongyi.rss.coupon;


import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;


import com.rongyi.easy.coupon.entity.Coupon;



import com.rongyi.easy.coupon.old_vo.OldCouponVO;


/**
 * 1.优惠券订单提交  2.查询优惠详情浏览次数
 *
 * @author hebo
 * @Description: TODO(优惠券模板接口，提供给mall-shop的controller使用)
 * @date 2015年6月8日 下午
 */
public interface MMCouponService {


    /**
     * 通过id查询优惠券
     *
     * @param id
     * @return
     */
    public Coupon getCouponById(ObjectId id);

    /**
     * 老优惠:通过id修改优惠券详情浏览次数
     *
     * @param couponId
     * @return FavourableVO
     */
    public void updateCouponVistiedCount(String couponId, int visitedCount);

//	/**
//	 * 通过优惠券id得到优惠券详情，再封装到list返回
//	 *
//	 * @param grouponIds
//	 * @return map
//	 * @throws Exception
//	 */
//	public Map<String, Object> buildGroupMap(String couponId, String userId) throws Exception;
	
	  /**
     * 通过ids得懂啊oldCOuponVO  List
     * @param ids
     * @return
     */
    public List<OldCouponVO> getCouponDetailLIstOne(List<String> ids);

    /**
     * 推荐优惠券首页（优化）
     * @param ids
     * @return
     */
    public List<OldCouponVO> getCouponIndexLIstOne(List<String> ids);
}
