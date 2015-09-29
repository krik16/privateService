/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月29日下午6:17:54
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbitmq.client.Channel;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.core.constant.TmsEventTypeEnum;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.CouponCommissionService;
import com.rongyi.tms.service.DrawApplyService;
import com.rongyi.tms.service.InviteCommissionService;
import com.rongyi.tms.service.MqReceiverService;
import com.rongyi.tms.service.PaymentStatementService;
import com.rongyi.tms.service.SalesCommissionService;

/**
 * @Author: 柯军
 * @Description: TODO
 * @datetime:2015年5月29日下午6:17:54
 * 
 **/
@Service
public class MqReceiverServiceImpl implements MqReceiverService {
	
	private static final Logger LOGGER = Logger.getLogger(MqReceiverServiceImpl.class);

	@Autowired
	DrawApplyService drawApplyService;

	@Autowired
	SalesCommissionService salesCommissionService;

	@Autowired
	CouponCommissionService couponCommissionService;
	
	@Autowired
	InviteCommissionService inviteCommissionService;
	
	@Autowired
	PaymentStatementService paymentStatementService;
	
	@Autowired
	Sender sender;
	/**
	 * @Description: 回调函数
	 * @param message
	 * @param messageString
	 * @Author: 柯军
	 * @datetime:2015年6月2日上午10:27:32
	 **/
	@Override
	public void callBack(Message message, Channel channel, String messageString) {
		MessageEvent messageEvent = MessageEvent.messageToEvent(messageString);
		if (TmsEventTypeEnum.DRAWAPPLY.getCode().equals(messageEvent.getType())) {// 提现
			LOGGER.info("导购提现-->");
			Map<String, Object> messageMap = new HashMap<String, Object>();
			messageMap = drawApplyService.addDrawApplyByMQ(messageEvent);
			sender.rpcSend(messageMap, message, channel);
		} else if (PaymentEventType.PAY_NOTIFY.equals(messageEvent.getType())) {// 支付成功通知
			LOGGER.info("支付成功通知-->");
			drawApplyService.updateDrawApplyByMQ(messageEvent);
		} else if (TmsEventTypeEnum.COMMISSION_POST.getCode().equals(messageEvent.getType())) {// 佣金提审
			LOGGER.info("商品佣金提审-->");
			salesCommissionService.addCommissionByMQ(messageEvent);
		} else if (TmsEventTypeEnum.COUPON_COMMISSION.getCode().equals(messageEvent.getType())){//优惠券佣金
			LOGGER.info("优惠券佣金提审-->");
			couponCommissionService.insertByMq(messageEvent);
		}else if(TmsEventTypeEnum.INVITE_COMMISSION.getCode().equals(messageEvent.getType())){
			LOGGER.info("邀请佣金提审-->");
			inviteCommissionService.insertByMQ(messageEvent);
		}else if(PaymentEventType.STATEMENT_PAY_NOTIFY.equals(messageEvent.getType())){
			LOGGER.info("商家对账支付成功通知-->");
			Map<String,Object> map = new HashMap<String,Object>();
			paymentStatementService.updateByNotify(map);
		}
	}

}
