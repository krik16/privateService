package com.rongyi.rss.coupon.voucher;

import java.util.List;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.mysql.Coupon;
import com.rongyi.easy.coupon.entity.mysql.CouponSort;
import com.rongyi.easy.coupon.param.operation.VoucherCouponParam;
import com.rongyi.easy.coupon.vo.operation.CouponCountVO;
import com.rongyi.easy.coupon.vo.operation.VoucherCouponVO;

/**
 * @Description:大运营平台代金券接口
 * @author:lqy
 * @time:2015年7月21日 下午3:24:21
 */
public interface RoaVoucherCouponService {


	/**
	 * @Description:创建代金券
	 * @author:lqy
	 * @param coupon 代金券entity
	 * @return 成功：true 失败：false
	 */
	boolean create(Coupon coupon) throws Exception;
	
	/**
	 * @Description:修改代金券
	 * @author:lqy
	 * @param coupon 代金券entity
	 * @return 成功：true 失败：false
	 */
	boolean update(Coupon coupon) throws Exception;
	

	/**
	 * @Description:根据id删除代金券
	 * @author:lqy
	 * @param id 代金券id
	 * @return 成功：true 失败：false
	 * @throws Exception 
	 */
	boolean remove(Integer id) throws Exception;

	/**
	 * @Description:多条件分页查询代金券
	 * @author:lqy
	 * @param param 参数对象
	 * @return VoucherCouponVO集合
	 * @throws Exception 
	 */
	PagingVO<VoucherCouponVO> findAllByPage(VoucherCouponParam param) throws Exception;

	/**
	 * @Description:统计卡券各个状态下数量
	 * @author:lqy
	 * @param param 参数对象
	 * @return CouponCountVO
	 */
	CouponCountVO countByStatus(VoucherCouponParam param);

	/**
	 * @Description:审核代金券
	 * @author:lqy
	 * @param ids 代金券id
	 * @param status 审核状态 ：待审核[0] 未通过[1] 已通过[2]
	 * @param reason 未通过原因
	 * @return 成功：true 失败：false
	 * @throws Exception
	 */
	boolean verifyCoupon(List<Integer> ids, Integer status,
			String reason) throws Exception;

	/**
	 * @Description:下架代金券
	 * @author:lqy
	 * @param ids 代金券id
	 * @param reason 下架原因
	 * @return 成功：true 失败：false
	 * @throws Exception
	 */
	boolean offStock(List<Integer> ids, String reason)
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
	 * @param count 追加数量
	 * @return
	 * @throws Exception
	 */
	boolean addCouponCount(Integer id, Integer count) throws Exception;

	/**
	 * @Description:设置展示区域
	 * @author:lqy
	 * @param ids 卡券集合
	 * @param displayRegion 展示区域： 常规区域,活动区域;未选中[0]，选中[1] 例如 "1,1"表示都选中
	 * @return
	 */
	ResponseResult deployRegion(List<Integer> ids, String displayRegion);





	/***********置顶代金券 start***************/

	/**
	 * 分页查询置顶代金券列表
	 * @param param 查询参数
	 * @return 
	 * @throws Exception
	 */
	PagingVO<VoucherCouponVO> findAllStickByPage(VoucherCouponParam param) throws Exception;
	
	/**
	 * @Description:代金券置顶
	 * @author:lqy
	 * @param couponSortList 置顶对象集合
	 * @return
	 * @throws Exception 
	 */
	ResponseResult stick(List<CouponSort> couponSortList) throws Exception;

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
	 * @param sortIdx 排序值
	 * @return 成功返回true 失败返回false
	 */
	boolean sort(Integer couponSortId, int sortIdx) throws Exception;



	/***********置顶代金券 end***************/

}
