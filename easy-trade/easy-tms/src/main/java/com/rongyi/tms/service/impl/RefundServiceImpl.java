/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日上午10:26:18
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.coupon.entity.CouponOrder;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.easy.usercenter.entity.MalllifeUserInfoEntity;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.rpb.IRpbService;
import com.rongyi.rss.tradecenter.RoaProxyCouponOrderService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.RefundService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: 柯军
 * @Description: 退款接口
 * @datetime:2015年5月26日下午2:55:54
 * 
 **/
@Service
public class RefundServiceImpl extends BaseServiceImpl implements RefundService {

	private static final String PAYMENTENTITY_NAMESPACE = "com.rongyi.tms.mapper.xml.RefundMapper";

	@Autowired
	ROAMalllifeUserService rOAMallLifeUserService;

	@Autowired
	IRpbService rpbService;

	@Autowired
	RoaProxyCouponOrderService roaProxyCouponOrderService;

	@Override
	public List<TradeVO> selectRefundPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
		List<TradeVO> tradeVOList = new ArrayList<TradeVO>();
		List<String> buyerIds = new ArrayList<String>();
		if (map.get("buyerName") != null && StringUtils.isNotBlank(map.get("buyerName").toString())) {
			try {
				List<UserInfoVO> userVoList = rOAMallLifeUserService.getUserDetailByName(map.get("buyerName").toString());
				for (UserInfoVO userVO : userVoList) {
					buyerIds.add(userVO.getUserId());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (map.get("buyerAccount") != null && StringUtils.isNotBlank(map.get("buyerAccount").toString())) {
			try {
				UserInfoVO userInfoVO = rOAMallLifeUserService.getByPhone(map.get("buyerAccount").toString());
				if (userInfoVO != null)
					buyerIds.add(userInfoVO.getUserId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!buyerIds.isEmpty())
			map.put("buyerIds", buyerIds);
		map.put("currentPage", (currentPage - 1) * pageSize);
		map.put("pageSize", pageSize);
		tradeVOList = this.getBaseDao().selectListBySql(PAYMENTENTITY_NAMESPACE + ".selectPayPageList", map);
		for (TradeVO tradeVO : tradeVOList) {
			PaymentEntity hisPayEntity = null;
			if (ConstantEnum.TRADE_TYPE_REFUND.getCodeInt() == tradeVO.getTradeType())// 正常付款记录退款
				hisPayEntity = rpbService.selectByOrderNumAndTradeType(tradeVO.getOrderNo(), ConstantEnum.TRADE_TYPE_PAY.getCodeInt(), ConstantEnum.TRADE_STATUS_PAY_YES.getCodeInt(),
						tradeVO.getPayChannel());
			else if (ConstantEnum.TRADE_TYPE_REPAY_REFUND.getCodeInt() == tradeVO.getTradeType())// 重复付款记录退款
				hisPayEntity = rpbService.selectByOrderNumAndTradeType(tradeVO.getOrderNo(), ConstantEnum.TRADE_TYPE_REPAY.getCodeInt(), ConstantEnum.TRADE_STATUS_PAY_YES.getCodeInt(),
						tradeVO.getPayChannel());
			if (hisPayEntity != null)// 此处把付款记录的付款单号放入退款明细，以便直接在第三方支付系统查询
				tradeVO.setPayNo(hisPayEntity.getPayNo());
			if (ConstantEnum.PAYMENT_ORDER_TYPE1.getCodeInt() == tradeVO.getOrderType()) {// 优惠券订单
				CouponOrder couponOrder = roaProxyCouponOrderService.findOneByOrderNo(tradeVO.getOrderNo());
				if (couponOrder != null && couponOrder.getBuyerId() != null) {
					try {
						MalllifeUserInfoEntity mallLifeUserEntity = rOAMallLifeUserService.getEntityByUid(couponOrder.getBuyerId());
						if (mallLifeUserEntity != null) {
							tradeVO.setBuyerAccount(mallLifeUserEntity.getPhone());
							tradeVO.setBuyerName(mallLifeUserEntity.getUserName());
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		}
		return tradeVOList;
	}

	@Override
	public Integer selectRefundPageListCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(PAYMENTENTITY_NAMESPACE + ".selectPayPageListCount", map);
	}

}
