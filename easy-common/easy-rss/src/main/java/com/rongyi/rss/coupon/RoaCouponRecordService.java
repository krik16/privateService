package com.rongyi.rss.coupon;

import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.CouponRecord;

public interface RoaCouponRecordService {

	/**
	 * 分页查询现卡券领用记录
	 * @return
	 */
	PagingVO<CouponRecord> findAllByPage(Map<String, Object> paramMap, int curPage, int pageSize);

	/**
	 * 保存卡券记录信息
	 * @param couponRecord
	 * @return
	 */
	boolean saveOrUpdate(CouponRecord couponRecord);

	/**
	 * 通过券码查询领用记录
	 * @param couponCode
	 * @return
	 */
	CouponRecord getRecordByCouponCode(String couponCode);

	/**
     * 定时修改已过期的领用记录状态（定时任务）
     */
    public void updateAllCouponRecordValid();

	/**
	* @Title: updateRecordByUse
	* @Description: TODO(使用红包时修改红包领用记录)
	* @param couponCode
	* @param orderNo
	* @param orderType 订单类型: 商品订单[0] 优惠券订单[1]
	* @param sellerId
	* @return boolean    返回类型
	*/
	boolean updateRecordByUse(String couponCode, String orderNo, Integer orderType,
			Integer sellerId);

	/**
	 * @param couponCode
	 * @param orderNo
	 * @param orderType
	 * @param sellerId
	 * @param status
	 */
	public void updateRecordStatusByCode(String couponCode, String orderNo, Integer orderType, Integer sellerId, Integer status);
}
