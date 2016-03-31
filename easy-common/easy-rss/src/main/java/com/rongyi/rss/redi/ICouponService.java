package com.rongyi.rss.redi;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.redi.param.BailianParam;

public interface ICouponService {
	
	/**
	 * 20150112 lim
	 * 用户行为事件活动查询(后加的)
	 * 接口新增“用户行为事件活动查询”用来处理新用户送停车券活动。
	 * @param bailianParam
	 * @return
	 */
	public ResponseResult eventActivityQuery(BailianParam bailianParam, String methodName);
	
	/**
	 * 门店领取优惠券  lim
	 * @param bailianParam
	 * @return
	 */
	public ResponseResult getCoupon(BailianParam bailianParam, String methodName);
	
	/**
	 * 获取线下渠道可领取的优惠券模板列表 （线下券） Lc
	 * @param bailianParam
	 * @return
	 */
	public ResponseResult queryCouponTemplate(BailianParam bailianParam, String methodName);
	
	/**
	 * 20150203 lim
	 * 只返回用户还未使用的优惠券列表
	 * @param bailianParam
	 * @return
	 */
	public ResponseResult queryUnusedCouponTemplate(BailianParam bailianParam, String methodName);

}
