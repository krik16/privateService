/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月15日下午5:52:38
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.coupon.entity.CouponOrder;
import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.entity.MallLifeUserEntity;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.rss.coupon.MMUserCouponService;
import com.rongyi.rss.coupon.RoaCouponOrderService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.moudle.vo.TradeDetailCount;
import com.rongyi.tms.service.TradeDetailService;

/**
 * @Author: 柯军
 * @Description: 交易记录实现
 * @datetime:2015年5月15日下午5:52:38
 * 
 **/

@Service
public class TradeDetailServiceImpl extends BaseServiceImpl implements TradeDetailService {

	private static final String PAYMENTENTITY_NAMESPACE = "com.rongyi.tms.mapper.xml.TradeMapper";
	
	private static final Logger LOGGER = Logger.getLogger(TradeDetailServiceImpl.class);

	@Autowired
	ROAMalllifeUserService rOAMallLifeUserService;

	@Autowired
	RoaCouponOrderService raoCouponOrderService;

	@Autowired
	MMUserCouponService mmUserCouponService;

	@Override
	public List<TradeVO> selectTradePageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
		if (pageSize != null && currentPage != null) {
			map.put("currentPage", (currentPage - 1) * pageSize);
			map.put("pageSize", pageSize);
		}
		if (map.get("tradeType") == null || StringUtils.isEmpty(map.get("tradeType").toString())) {
			map.remove("tradeType");
		}
		if (map.get("buyerName") != null && StringUtils.isNotBlank(map.get("buyerName").toString())) {
			try {
				List<UserInfoVO> userVoList = rOAMallLifeUserService.getUserDetailByName(map.get("buyerName").toString());
				List<String> buyerIds = new ArrayList<String>();
				for (UserInfoVO userVO : userVoList) {
					buyerIds.add(userVO.getUserId());
				}
				if (buyerIds.isEmpty())
					buyerIds.add("null");
				map.put("buyerIds", buyerIds);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		List<TradeVO> list = this.getBaseDao().selectListBySql(PAYMENTENTITY_NAMESPACE + ".selectTradePageList", map);
		String buyerId = null;
		for (TradeVO tradeVO : list) {
			tradeVO.setIntegral(getIntegral(tradeVO.getIntegralDiscount()));
			buyerId = tradeVO.getBuyerId();
			try {
				if (ConstantEnum.PAYMENT_ORDER_TYPE1.getCodeInt() == tradeVO.getOrderType()) {// 优惠券订单
					CouponOrder couponOrder = raoCouponOrderService.findOneByOrderNo(tradeVO.getOrderNo());
					if (couponOrder != null)
						buyerId = couponOrder.getBuyerId();
				}
				if (StringUtils.isNotEmpty(buyerId)) {
					MallLifeUserEntity mallLifeUserEntity = rOAMallLifeUserService.getEntityByUid(buyerId);
					if (mallLifeUserEntity != null) {
						tradeVO.setBuyerAccount(mallLifeUserEntity.getPhone());
						tradeVO.setBuyerName(mallLifeUserEntity.getUserName());
					}
				}
			} catch (Exception e) {
				LOGGER.error(" roa inteface no provider error!"+e.getMessage());
			}

		}
		return list;
	}


	@Override
	public Integer selectTradePageListCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(PAYMENTENTITY_NAMESPACE + ".selectTradePageListCount", map);
	}

	@Override
	public TradeDetailCount selectTradeCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(PAYMENTENTITY_NAMESPACE + ".selectTradeCount", map);
	}

	@Override
	public TradeVO selectById(Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		return this.getBaseDao().selectOneBySql(PAYMENTENTITY_NAMESPACE + ".selectById", map);
	}

	@Override
	public UserCoupon getCouponOrderRecordByOrderNo(String orderNo) {
		CouponOrder couponOrder = raoCouponOrderService.findOneByOrderNo(orderNo);
		UserCoupon userCoupon = null;
		if (couponOrder != null)
			userCoupon = mmUserCouponService.findUserCouponByCouponCode(couponOrder.getCashCouponCode());
		return userCoupon;
	}


	@Override
	public Integer getIntegral(String integralDiscount) {
		int integral = 0;
		if (StringUtils.isEmpty(integralDiscount))
			return integral;
		JSONObject jsonObject = JSONObject.fromObject(integralDiscount);
		if (jsonObject != null && jsonObject.get("score") != null)
			integral = jsonObject.getInt("score");
		return integral;
	}
}
