/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年10月23日下午4:25:25
 * @Description: TODO
 *
 **/

package com.rongyi.cheat.util;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.sms.SmsConfig;
import com.rongyi.core.sms.param.SmsParam;
import com.rongyi.easy.malllife.config.SystemConfig;
import com.rongyi.easy.malllife.exception.MallLifeException;
import com.rongyi.rss.sms.ISmsSendService;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**	
 * @Author:  柯军
 * @Description: 短信发送 
 * @datetime:2015年10月23日下午4:25:25
 *
 **/
@Component
public class SmsUtil {

	@Autowired
	ISmsSendService smsSendService;

	private static final Logger LOGGER = Logger.getLogger(SmsUtil.class);
	  /**
     * @Description: 刷单短信发送 
     * @param sendPhoneList 发送人手机号列表
     * @param count 刷单数量
     * @param payAccount 支付账号
     * @param payType 账号类型
     * @param startTime 刷单数量统计开始时间
     * @param endTime	刷单数量统计结束时间
     * @param otherMessage	额外消息
     * @Author:  柯军
     * @datetime:2015年10月23日下午4:43:43
     **/
    public  void sendMoreMsMessage(String[] sendPhoneList, Integer count,String payAccount,String payType,Date startTime,Date endTime,String otherMessage){
    	for (String phone : sendPhoneList) {
    		sendMsMessage(phone, count, payAccount, payType, startTime, endTime,otherMessage);
		}
    }
	
    /**	
     * @Description: 刷单短信发送 
     * @param sendPhone 发送人手机号
     * @param count 刷单数量
     * @param payAccount 支付账号
     * @param payType 账号类型
     * @param startTime 刷单数量统计开始时间
     * @param endTime	刷单数量统计结束时间
     * @param  otherMessage	额外消息
     * @Author:  柯军
     * @datetime:2015年10月23日下午4:43:43
     **/
    public  void sendMsMessage(String sendPhone, Integer count,String payAccount,String payType,Date startTime,Date endTime,String otherMessage) {
		try {

			//组织短信明文
			StringBuffer sb = new StringBuffer();
			sb.append("【上海摩购】");
			sb.append(payType);
			sb.append("支付账号:");
			sb.append(payAccount);
			if(startTime != null && endTime != null){
				sb.append(" ");
				sb.append("在");
				sb.append(DateUtil.dateToString(startTime));
				sb.append("至");
				sb.append(DateUtil.dateToString(endTime));
				sb.append("时间内");
			}
			sb.append("一共支付");
			sb.append(count);
			sb.append("笔订单");
			sb.append(",请注意检查该账号是否存在刷单行为。");
			sb.append(otherMessage);
			LOGGER.info("手机号为：" + sendPhone+",短信内容为:"+sb.toString());
			//短信发送
			if (StringUtils.isBlank(sendPhone) || !SystemConfig.isMobileNO(sendPhone)){
				throw new MallLifeException("手机号码无效");
			}
			else{
//				MessageManger msm = MessageManger.getInstance();
//				String returnCode = msm.sendYunSmsMessage(sendPhone, sb.toString());
//				LOGGER.info("短信通道返回：" + returnCode);
				SmsParam smsParam = new SmsParam();
				smsParam.setMsgStr(sb.toString());
				smsParam.setPhone(sendPhone);
				smsParam.setProductType(SmsConfig.PRODUCT_TYPE.TOB_NOTICE);
				smsParam.setSendModule(SmsConfig.SEND_MODULE.DEALMSM);
				smsSendService.sendSmsMessage(smsParam);
			}
			
		} catch (MallLifeException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
