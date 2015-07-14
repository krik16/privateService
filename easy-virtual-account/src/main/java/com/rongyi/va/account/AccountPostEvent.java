/** 
* @Title: AccountBalanceChangesEvent.java 
* @Package com.rongyi.va.account 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月13日 下午7:05:22 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.account;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.context.ApplicationContext;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.CommissionEnum;
import com.rongyi.core.constant.VirtualAccountEventType;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.rss.mallshop.order.ROACommodityCommissionService;
import com.rongyi.va.service.VirtualAccountService;

/**
 * @author ZhengYl
 *
 */
public class AccountPostEvent extends AccountEvent {

	private VirtualAccountDetailEntity virtualAccountDetailEntity;

	@SuppressWarnings("unchecked")
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);

		JSONObject param = (JSONObject) getBody();

		setVirtualAccountDetailEntity((VirtualAccountDetailEntity) JsonUtil.getDTO(param.get("detail").toString(),
				VirtualAccountDetailEntity.class));
	}

	public VirtualAccountDetailEntity getVirtualAccountDetailEntity() {
		return virtualAccountDetailEntity;
	}

	public void setVirtualAccountDetailEntity(VirtualAccountDetailEntity virtualAccountDetailEntity) {
		this.virtualAccountDetailEntity = virtualAccountDetailEntity;
	}

	public void process(ApplicationContext ctx) throws Exception {
		VirtualAccountService virtualAccountService = ctx.getBean(VirtualAccountService.class);

		ROACommodityCommissionService roaCommodityCommissionService = ctx.getBean(ROACommodityCommissionService.class);

		// 明细入账时间
		virtualAccountDetailEntity.setCreateAt(new Date());
		
		// 符号
		if (this.virtualAccountDetailEntity.getSign() == null) {
			throw new Exception("[AccountPostEvent ERROR]: Account detail has no sign");
		}
		BigDecimal sign = this.virtualAccountDetailEntity.getSign() < 0 ? new BigDecimal(-1) : new BigDecimal(1);
		
		// 更新账户余额
		int detailId = virtualAccountService.updateBalance(super.userId, this.virtualAccountDetailEntity.getAmount()
				.multiply(sign), this.virtualAccountDetailEntity);
		
		if (detailId > 0) {
			if (this.virtualAccountDetailEntity.getItemType().equals(VirtualAccountEventType.BONUS)) {
				try {
					Map<String, String> map = new HashMap<String, String>();
					map.put("commission", virtualAccountDetailEntity.getAmount().toString());
					map.put("eventType", CommissionEnum.COMMISSION_AWARD.getCode().toString());
					map.put("guideId", virtualAccountDetailEntity.getUserId());
					roaCommodityCommissionService.sendBodyByOrderEventType(map);
				} catch (Exception e) {
					e.printStackTrace();
					throw e;
				}
			}

		}
	}
}
