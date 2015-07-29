package com.rongyi.rss.coupon.voucher;

import java.util.List;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.entity.mysql.Coupon;
import com.rongyi.easy.coupon.entity.mysql.CouponSort;

/**
 * @Description:大运营平台代金券接口
 * @author:lqy
 * @time:2015年7月21日 下午3:21:20
 */
public interface IVoucherCouponService {

	/**
	 * @Description:添加、更新代金券
	 * @author:lqy
	 * @param coupon
	 * @return 成功：true 失败：false
	 */
	Boolean saveOrUpdate(Coupon coupon);

	/**
	 * @Description:根据id删除代金券
	 * @author:lqy
	 * @param id 代金券id
	 * @return 成功：true 失败：false
	 */
	Boolean deleteById(Integer id);


	/**
	 * @Description:审核代金券
	 * @author:lqy
	 * @param ids 代金券id
	 * @param status 审核状态 ：待审核[0] 未通过[1] 已通过[2]
	 * @param reason 未通过原因
	 * @return 成功：true 失败：false
	 */
	Boolean verifyCoupon(List<Integer> ids, Integer status,
			String reason) throws Exception;

	/**
	 * @Description:下架代金券
	 * @author:lqy
	 * @param ids 代金券id
	 * @param status 下架状态为[3]
	 * @param reason 下架原因
	 * @return 成功：true 失败：false
	 * @throws Exception
	 */
	Boolean soldOutCoupon(List<Integer> ids, Integer status, String reason)
			throws Exception;

	/**
	 * @Description:根据id查询代金券
	 * @author:lqy
	 * @param id 代金券id
	 * @return 返回coupon
	 */
	Coupon findOneById(Integer id);


	/**
	 * @Description:追加代金券
	 * @author:lqy
	 * @param id 代金券id
	 * @param addCount 追加数量
	 * @return
	 */
	Boolean addCouponCount(Integer id, Integer addCount) throws Exception;






	/***********置顶代金券 start***************/

	/**
	 * @Description:代金券置顶
	 * @author:lqy
	 * @param couponSortList 置顶对象集合
	 * @return
	 */
	ResponseResult stick(List<CouponSort> couponSortList);

	/***********置顶代金券 end***************/

}
