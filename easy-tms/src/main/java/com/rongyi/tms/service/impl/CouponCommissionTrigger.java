/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月20日上午9:45:31
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.CouponCommission;
import com.rongyi.easy.tms.vo.CouponCommissionMqVO;
import com.rongyi.rss.service.trigger.ICouponCommissionTrigger;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.CouponCommissionService;

/**	
 * @Author:  柯军
 * @Description: 优惠券佣金定时任务实现 
 * @datetime:2015年7月20日上午9:45:31
 *
 **/
@Service
public class CouponCommissionTrigger implements ICouponCommissionTrigger{

	@Autowired
	CouponCommissionService couponCommissionService;
	
	@Autowired
	Sender sender;
	
	@Override
	public void couponCommissionTrigger() {
		Map<String,Object> map = new HashMap<String,Object>();
		int currentPage = Constant.PAGE.CURRENTPAGE;
		int size = Constant.SENDSIZE.SIZE;
		List<CouponCommission> list = couponCommissionService.selectPageList(currentPage,size,map);
		do {
			JSONArray array=new JSONArray();
			Map<String,Object> bodyMap = new HashMap<String,Object>();
			//TODO 更新状态为已打款到虚拟账号
//			couponCommissionService.batchUpdate(list);
			for (CouponCommission couponCommission : list) {
//				couponCommission.setStatus(ConstantEnum);
				CouponCommissionMqVO couponCommissionMqVO = new CouponCommissionMqVO();
				BeanUtils.copyProperties(couponCommission, couponCommissionMqVO);
		        JSONObject jsonObject=JSONObject.fromObject(couponCommissionMqVO);
		        array.add(jsonObject);
                bodyMap.put("detailList", array);
			}
			MessageEvent event = MessageEvent.getMessageEvent(bodyMap,ConstantEnum.MESSAGE_EVENT_TMS.getCodeStr(),ConstantEnum.MESSAGE_EVENT_VA.getCodeStr(), VirtualAccountEventTypeEnum.COUPON_COMMISSION_BATCH_POST.getCode());
			sender.convertAndSend(event);
			currentPage++;
			list = couponCommissionService.selectPageList(currentPage,size,map);
		} while (list != null && !list.isEmpty());
	}

}
