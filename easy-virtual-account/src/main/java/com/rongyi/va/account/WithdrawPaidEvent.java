/** 
* @Title: WithdrawPaidEvent.java 
* @Package com.rongyi.va.account 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月14日 下午4:01:17 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.Constants;
import com.rongyi.core.constant.VirtualAccountEventType;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.va.mq.SpringAmqpSender;
import com.rongyi.va.service.VirtualAccountDetailService;
import com.rongyi.va.service.VirtualAccountService;

/**
 * @author ZhengYl
 *
 */
public class WithdrawPaidEvent extends BaseEvent {
    @Autowired
    private VirtualAccountService virtualAccountService;
	
    @Autowired
    private VirtualAccountDetailService virtualAccountDetailService;
    
	@Autowired
	private SpringAmqpSender mSender;
    
	/** 付款信息列表 */
	private PaymentInfo[] paymentInfos;
	
	@SuppressWarnings("unchecked")
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);

		JSONObject param = (JSONObject) getBody();
		
		Object[] objList = JsonUtil.getDTOArray(
				param.get("data").toString(), 
				PaymentInfo.class);
		
		PaymentInfo[] list = new PaymentInfo[objList.length];
		int i = 0;
		for (Object obj : objList) {
			list[i] = (PaymentInfo)obj;
			i++;
		}
		
		setPaymentInfos(list);
	}

	public PaymentInfo[] getPaymentInfos() {
		return paymentInfos;
	}

	public void setPaymentInfos(PaymentInfo[] paymentInfos) {
		this.paymentInfos = paymentInfos;
	}

	/* (non-Javadoc) 
	* @throws Exception 
	* @see com.rongyi.va.account.BaseEvent#process() 
	*/
	@Override
	public void process(ApplicationContext ctx) throws Exception {
		List<PaymentInfo> replyList = new ArrayList<>();
		
		for (PaymentInfo paymentInfo : paymentInfos) {
			//根据付款成功信息，更新账户变更明细
			VirtualAccountDetailEntity virtualAccountDetailEntity = new VirtualAccountDetailEntity();
			virtualAccountDetailEntity.setCollectedAt(new Date());
			virtualAccountDetailEntity.setIsCollected(true);
			virtualAccountDetailEntity.setApplicationNo(paymentInfo.getOrderNo());
			virtualAccountDetailEntity.setPaymentId(paymentInfo.getPaymentId());
			virtualAccountDetailEntity.setAmount(paymentInfo.getDrawAmount());

			// 账户余额变动
			// 根据提现金额取负数，加入账户余额
			int accountRow = virtualAccountService.updateBalance(paymentInfo.getUserId(),
					paymentInfo.getDrawAmount().negate(), virtualAccountDetailEntity);
			if (accountRow == 1) {
				replyList.add(paymentInfo);
			} else {
				// throws Exception
			}			
		}
		
		Map<String, Object> body = new HashMap<String, Object>();	
		body.put("data", replyList);

        BaseEvent event = new BaseEvent();
        event.setBody(JSONObject.fromObject(body));
        event.setSource(Constants.MQRequestParam.REQUEST_QUEUENAME_VA);
        event.setTimestamp((new Date()).getTime());
        event.setType(VirtualAccountEventType.WITHDRAW_COLLECTED);
        event.setTarget(Constants.MQRequestParam.REQUEST_QUEUENAME_TMS);
		if (getCorrelationId() != null) {
			event.setCorrelationId(getCorrelationId());
		}
		//向tms发送提现成功事件
		mSender.sendEvent(event);
		
		super.process(ctx);
	}

	
}
