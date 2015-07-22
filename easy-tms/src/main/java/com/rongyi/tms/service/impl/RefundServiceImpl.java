/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日上午10:26:18
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.coupon.entity.CouponOrder;
import com.rongyi.easy.entity.MallLifeUserEntity;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.rss.coupon.RoaCouponOrderService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.RefundService;

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
	RoaCouponOrderService roaCouponOrderService;

	@Override
	public List<TradeVO> selectRefundPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
		List<TradeVO> tradeVOList = new ArrayList<TradeVO>();

		try {
			if (map.get("buyerName") != null && StringUtils.isNotBlank(map.get("buyerName").toString())) {
				List<UserInfoVO> userVoList = rOAMallLifeUserService.getUserDetailByName(map.get("buyerName").toString());
				List<String> buyerIds = new ArrayList<String>();
				for (UserInfoVO userVO : userVoList) {
					buyerIds.add(userVO.getUserId());
				}
				map.put("buyerIds", buyerIds);
			}
			map.put("currentPage", (currentPage - 1) * pageSize);
			map.put("pageSize", pageSize);
			tradeVOList = this.getBaseDao().selectListBySql(PAYMENTENTITY_NAMESPACE + ".selectPayPageList", map);
			for (TradeVO tradeVO : tradeVOList) {
				if (ConstantEnum.PAYMENT_ORDER_TYPE1.getCodeInt() == tradeVO.getOrderType()) {// 优惠券订单
					CouponOrder couponOrder = roaCouponOrderService.findOneByOrderNo(tradeVO.getOrderNo());
					if (couponOrder != null && couponOrder.getBuyerId() != null) {
						MallLifeUserEntity mallLifeUserEntity = rOAMallLifeUserService.getEntityByUid(couponOrder.getBuyerId());
						if (mallLifeUserEntity != null) {
							tradeVO.setBuyerAccount(mallLifeUserEntity.getPhone());
							tradeVO.setBuyerName(mallLifeUserEntity.getUserName());
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tradeVOList;
	}

	@Override
	public Integer selectRefundPageListCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(PAYMENTENTITY_NAMESPACE + ".selectPayPageListCount", map);
	}

}
