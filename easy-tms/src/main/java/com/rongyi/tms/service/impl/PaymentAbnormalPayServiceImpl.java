/** 
* @Title: PaymentAbnormalPayServiceImpl.java 
* @Package com.rongyi.tms.service.impl 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月24日 上午11:17:13 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.constant.Constants;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.tms.moudle.vo.AbnormalVO;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.PaymentAbnormalService;
import com.rongyi.tms.web.controller.DrawApplyController;

/**
 * @author ZhengYl
 *
 */
@Service
public class PaymentAbnormalPayServiceImpl {
	private static final Log logger = LogFactory.getLog(DrawApplyController.class);

	@Autowired
	private Sender sender;

	@Autowired
	private PaymentAbnormalService paymentAbnormalService;

	public void abnormalPay(int[] idArray) {
		logger.info("Abnormal Pay Start>>>>>> idList: " + idArray.toString());
		try {
			for (Integer id : idArray) {
				AbnormalVO abnormalVO = paymentAbnormalService.selectOneById(id);
				Map<String, Object> bodyMap = new HashMap<String, Object>();
				bodyMap.put("userId", abnormalVO.getUserId());
				bodyMap.put("orderNo", abnormalVO.getOrderNo());
				String abnormalIdStr = abnormalVO.getId().toString();
				bodyMap.put("exceTradeNo", ("00000000000" + abnormalIdStr).substring(abnormalIdStr.length()));
				bodyMap.put("drawAmount", abnormalVO.getAmount());
				Short originPayType = abnormalVO.getPaymentType();
				if (originPayType == 1)
					originPayType = 2;
				bodyMap.put("payType", originPayType.toString());
				bodyMap.put("payAccount", abnormalVO.getPaymentAccount());
				bodyMap.put("payName", abnormalVO.getPaymentName());
				MessageEvent event = MessageEvent.getMessageEvent(bodyMap,
						Constants.MQRequestParam.REQUEST_QUEUENAME_TMS, Constants.MQRequestParam.REQUEST_QUEUENAME_RPB,
						PaymentEventType.EXCE_PAY);
				sender.convertAndSend(event);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}

	}
}
