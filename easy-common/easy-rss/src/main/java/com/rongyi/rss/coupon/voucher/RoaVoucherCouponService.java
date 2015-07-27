package com.rongyi.rss.coupon.voucher;

import java.util.List;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.mysql.Coupon;
import com.rongyi.easy.coupon.param.VoucherCouponParam;

/**
 * @Description:大运营平台代金券接口
 * @author:lqy
 * @time:2015年7月21日 下午3:24:21
 */
public interface RoaVoucherCouponService {


	/**
	 * @Description:添加和修改代金券
	 * @author:lqy
	 * @param coupon 代金券entity
	 * @return 成功：true 失败：false
	 */
	Boolean saveOrUpdate(Coupon coupon) throws Exception;

	/**
	 * @Description:根据id删除代金券
	 * @author:lqy
	 * @param id 代金券id
	 * @return 成功：true 失败：false
	 */
	Boolean deleteById(Integer id);

	/**
	 * @Description:多条件分页查询代金券
	 * @author:lqy
	 * @param param 参数对象
	 * @return coupon集合
	 */
	PagingVO<Coupon> findAllByPage(VoucherCouponParam param);

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
	 * @throws Exception
	 */
	Boolean addCouponCount(Integer id, Integer addCount) throws Exception;
}
