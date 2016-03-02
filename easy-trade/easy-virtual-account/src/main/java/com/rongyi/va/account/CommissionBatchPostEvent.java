/** 
 * @Title: CommissionBatchPostEvent.java 
 * @Package com.rongyi.va.account 
 * @Description: TODO
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月28日 下午5:26:23 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.account;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.CommissionEnum;
import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.rss.mallshop.order.ROACommodityCommissionService;
import com.rongyi.va.constants.VirtualAccountDetailTypes;
import com.rongyi.va.service.VirtualAccountService;
import com.rongyi.va.vo.CommissionBatchPostVO;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * author ZhengYl
 * 
 */
public class CommissionBatchPostEvent extends BaseEvent {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommissionBatchPostEvent.class);
	/** 佣金列表 */
	private CommissionBatchPostVO[] commissionList;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);

		JSONObject param = getBody();

		Object[] objList = JsonUtil.getDTOArray(param.get("detailList").toString(), CommissionBatchPostVO.class);

		CommissionBatchPostVO[] list = new CommissionBatchPostVO[objList.length];
		int i = 0;
		for (Object obj : objList) {
			list[i] = (CommissionBatchPostVO) obj;
			i++;
		}
		setCommissionList(list);
	}

	public CommissionBatchPostVO[] getCommissionList() {
		return commissionList;
	}

	public void setCommissionList(CommissionBatchPostVO[] commissionList) {
		this.commissionList = commissionList;
	}

	@Override
	public void process(ApplicationContext ctx) throws Exception {
		VirtualAccountService virtualAccountService = ctx.getBean(VirtualAccountService.class);
		ROACommodityCommissionService roaCommodityCommissionService = ctx.getBean(ROACommodityCommissionService.class);

		String failureList = "";
		String eventType ;
		LOGGER.info("佣金处理,commissionList={}",getCommissionList());
		for (CommissionBatchPostVO postedCommission : this.commissionList) {
			VirtualAccountDetailEntity detailEntity = new VirtualAccountDetailEntity();
			detailEntity.setCreateAt(new Date());
			detailEntity.setAmount(postedCommission.getCommissionAmount());
			detailEntity.setUserId(postedCommission.getGuideId());
			if(VirtualAccountEventTypeEnum.COMMISSION_BATCH_POST.getCode().equals(this.getType())){
				//商品佣金
				detailEntity.setItemType(VirtualAccountDetailTypes.COMMISSION);
				eventType = CommissionEnum.COMMISSION_ISSUE.getCode().toString();
			}else if(VirtualAccountEventTypeEnum.COMMISSION_TYPE_EXPAND.getCode().equals(this.getType())){
				//推广返佣
				detailEntity.setItemType(VirtualAccountDetailTypes.EXTEND_COMMISSION);
				eventType = CommissionEnum.COMMISSION_ISSUE.getCode().toString();
			}else if(VirtualAccountEventTypeEnum.COMMISSION_TYPE_FIRST.getCode().equals(this.getType())){
				//首单返佣
				detailEntity.setItemType(VirtualAccountDetailTypes.FIRST_COMMISSION);
				eventType = CommissionEnum.COMMISSION_ISSUE.getCode().toString();
			}else{//优惠券佣金
				detailEntity.setItemType(VirtualAccountDetailTypes.COUPON_COMMISSION);
				eventType = CommissionEnum.COMMISSION_VALID.getCode().toString();
			}
			detailEntity.setSign(1);
			int detailId;
			try {
				detailId = virtualAccountService.updateBalance(postedCommission.getGuideId(),
						postedCommission.getCommissionAmount(), detailEntity);
			} catch (Exception e) {
				failureList += "更新虚拟账号失败, 金额未入账, 用户Id: " + postedCommission.getGuideId() + "\r\n";
				e.printStackTrace();
				continue;
			}

			if (detailId > 0) {
				try {
					Map<String, String> map = new HashMap<>();
					map.put("commission", postedCommission.getCommissionAmount().toString());
					map.put("eventType",eventType);
					map.put("guideId", postedCommission.getGuideId());
					roaCommodityCommissionService.sendBodyByOrderEventType(map);
				} catch (Exception e) {
					failureList += "发送提醒事件失败, 用户Id: " + postedCommission.getGuideId() + "\r\n";
					e.printStackTrace();
				}
			} else {
				failureList += "更新虚拟账号失败, 金额未入账, 用户Id: " + postedCommission.getGuideId() + "\r\n";
			}
		}
		if(failureList.length() > 0){
			throw new Exception(failureList);
		}
	}
}
