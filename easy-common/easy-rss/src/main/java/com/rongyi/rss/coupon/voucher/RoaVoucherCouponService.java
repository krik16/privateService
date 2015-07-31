package com.rongyi.rss.coupon.voucher;

import java.util.List;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.mysql.Coupon;
import com.rongyi.easy.coupon.entity.mysql.CouponSort;
import com.rongyi.easy.coupon.param.operation.VoucherCouponParam;
import com.rongyi.easy.coupon.vo.operation.VoucherCouponVO;

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
	 * @return VoucherCouponVO集合
	 */
	PagingVO<VoucherCouponVO> findAllByPage(VoucherCouponParam param);

	/**
	 * @Description:审核代金券
	 * @author:lqy
	 * @param ids 代金券id
	 * @param status 审核状态 ：待审核[0] 未通过[1] 已通过[2]
	 * @param reason 未通过原因
	 * @return 成功：true 失败：false
	 * @throws Exception
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
	 * @throws Exception
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

	/**
	 * @Description:代金券取消置顶
	 * @author:lqy
	 * @param id 代金券id
	 * @return 成功返回true 失败返回false
	 */
	boolean unstick(Integer id);

	/**
	 * @Description:置顶代金券排序
	 * @author:lqy
	 * @param couponSortId 排序id
	 * @param sortIndex 排序值
	 * @return 成功返回true 失败返回false
	 */
	boolean sort(Integer couponSortId, Integer sortIndex);

	/***********置顶代金券 end***************/

}
