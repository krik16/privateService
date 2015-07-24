/** 
* @Title: UpdateAccountEvent.java 
* @Package com.rongyi.va.account 
* @Description: 账户编辑事件
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月13日 下午4:52:40 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import net.sf.json.JSONObject;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.va.entity.VirtualAccountEntity;
import com.rongyi.va.service.VirtualAccountService;

/**
 * @author ZhengYl
 *
 */
public class AccountUpdateEvent extends BaseEvent{
    @Autowired
    VirtualAccountService virtualAccountService;
    
	VirtualAccountEntity virtualAccountEntity;
    
	@SuppressWarnings("unchecked")
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);

		JSONObject param = (JSONObject) getBody();

		setVirtualAccountEntity((VirtualAccountEntity) JsonUtil.getDTO(param
				.get("account").toString(), VirtualAccountEntity.class));
	}

	public VirtualAccountEntity getVirtualAccountEntity() {
		return virtualAccountEntity;
	}

	public void setVirtualAccountEntity(VirtualAccountEntity virtualAccountEntity) {
		this.virtualAccountEntity = virtualAccountEntity;
	}
	
	@Override
	public void process(ApplicationContext ctx) throws Exception {
		virtualAccountService.update(virtualAccountEntity);
	}
}
