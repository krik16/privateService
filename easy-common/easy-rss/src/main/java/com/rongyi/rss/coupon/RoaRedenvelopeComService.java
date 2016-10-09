package com.rongyi.rss.coupon;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.param.RedenvelopeParam;
import com.rongyi.easy.coupon.param.VoucherCouponParam;
import com.rongyi.easy.coupon.vo.RedenvelopVO;
import com.rongyi.easy.coupon.vo.UserVO;
import com.rongyi.easy.coupon.vo.operation.CouponCountVO;

import java.util.Date;
import java.util.List;

public interface RoaRedenvelopeComService {
	/**
	 * 根据PK查询
	 * 
	 * @param id
	 * @return
	 */
	Coupon findOne(String id);

	/**
	 * 根据PK查询
	 * 
	 * @param id
	 * @return
	 */
	RedenvelopVO findRedenvelopById(String id);

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
	boolean remove(String id,UserVO userVO) throws RYServiceException;

	/**
	 * 返回所有数据
	 * 
	 * @return
	 */
	List<Coupon> findAll();

	/**
	 * 分页查询促销券列表
	 * 
	 * @param param
	 * @return pagingVO
	 * @author lqy
	 */
	PagingVO<RedenvelopVO> findAllByPage(RedenvelopeParam param);

	/**
	 * 统计促销券各个状态的数量
	 * 
	 * @param param
	 * @return
	 */
	CouponCountVO countRedenvelopByStatus(RedenvelopeParam param);

	/**
	 * 审核现金劵
	 * 
	 * @param id
	 *            现金劵Id
	 * @param checkStatus
	 *            审核状态
	 * @param checkDesc
	 *            审核说明
	 * @return
	 */
	boolean checkCoupon(String id, int checkStatus, String checkDesc)
			throws Exception;

	/**
	 * 配置红包
	 * 
	 * @param cashCoupon
	 *            关联商品
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
	 * @param coupongId
	 *            amount
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
	Boolean addCouponCount(String couponId, Integer addCount, String userId)
			throws Exception;

	/*
	 * 审核
	 */
	boolean submitRedenvelopeVerify(List<String> ids, Integer status,
			String reason);
	
	PagingVO<RedenvelopVO> queryRedenvelopByPage(RedenvelopeParam param);

	/**
	 * 下架
	 * @param ids
	 * @param reason
	 * @return
	 * @throws Exception
	 */
	boolean submitOffStock(List<String> ids, String reason) throws Exception;

	/**
	 * 校验在同一发布时间段是否有注册类型红包
	 * @param param
	 * @return
	 */
	List<String> selectRedenveByStartEndAt(RedenvelopeParam param);

	/**
	 * 查询一分钱红包
	 * @return
	 */
	RedenvelopVO queryYifenqianRedenvelop();

}
