/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年5月19日上午10:26:18
 * @Description: TODO
 **/

package com.rongyi.tms.service.impl;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.coupon.entity.CouponOrder;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.easy.usercenter.entity.MalllifeUserInfoEntity;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.mallshop.order.ROAOrderFormService;
import com.rongyi.rss.rpb.IRpbService;
import com.rongyi.rss.tradecenter.RoaProxyCouponOrderService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.RefundService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(RefundServiceImpl.class);

    @Autowired
    ROAMalllifeUserService rOAMallLifeUserService;

    @Autowired
    IRpbService rpbService;

    @Autowired
    RoaProxyCouponOrderService roaProxyCouponOrderService;

    @Autowired
    ROAOrderFormService rOAOrderFormService;

    @Override
    public List<TradeVO> selectRefundPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
        LOGGER.info("selectRefundPageList map={}", map);
        List<TradeVO> tradeVOList = new ArrayList<TradeVO>();
        map.put("currentPage", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        Date startTime = DateUtil.getCurrDateTime();
        LOGGER.info("startTime=" + startTime);
        tradeVOList = this.getBaseDao().selectListBySql(PAYMENTENTITY_NAMESPACE + ".selectPayPageList", map);
        Date endTime = DateUtil.getCurrDateTime();
        LOGGER.info("endTime=" + endTime);
        LOGGER.info("time="+(endTime.getTime()-startTime.getTime()));
        if (tradeVOList != null && !tradeVOList.isEmpty())
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
            try {
                OrderFormEntity orderFormEntity = rOAOrderFormService.getOrderFormByOrderNum(tradeVO.getOrderNo());
                if (orderFormEntity != null) {
                    tradeVO.setOrderId(orderFormEntity.getId().toString());
                    tradeVO.setOrderUserId(orderFormEntity.getBuyerId());
                }
            } catch (Exception e) {
                LOGGER.error(" roa inteface no provider error!" + e.getMessage());
            }
        }
        return tradeVOList;
    }

    @Override
    public Integer selectRefundPageListCount(Map<String, Object> map) {
        return this.getBaseDao().selectOneBySql(PAYMENTENTITY_NAMESPACE + ".selectPayPageListCount", map);
    }

}
