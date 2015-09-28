/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月6日下午4:42:43
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.InviteCommission;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.InviteCommissionService;
import com.rongyi.tms.util.MapUtils;

/**
 * @Author: 柯军
 * @Description: 邀请佣金接口实现
 * @datetime:2015年9月6日下午4:42:43
 * 
 **/

@Service
public class InviteCommissionServiceImpl extends BaseServiceImpl implements InviteCommissionService {

	private static final String NAMESPACE = "com.rongyi.easy.tms.mapper.xml.InviteCommissionMapper";

	@Override
	public void insert(InviteCommission inviteCommission) {
		this.getBaseDao().insertBySql(NAMESPACE + ".insertSelective", inviteCommission);
	}

	@Override
	public void update(InviteCommission inviteCommission) {
		this.getBaseDao().insertBySql(NAMESPACE + ".updateByPrimaryKeySelective", inviteCommission);
	}

	@Override
	public List<InviteCommission> selectPageList(Integer currentPage, Integer pageSize, Map<String, Object> map) {
		map.put("currentPage", (currentPage - 1) * pageSize);
		map.put("pageSize", pageSize);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
	}

	@Override
	public Integer selectPageListCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void insertByMQ(MessageEvent messageEvent) {
		try {
			Map<String, Object> bodyMap = JsonUtil.getMapFromJson(messageEvent.getBody().toString());
			InviteCommission inviteCommission = MapUtils.toObject(InviteCommission.class, bodyMap);
			inviteCommission.setCreateAt(DateUtil.getCurrDateTime());
			inviteCommission.setStatus(ConstantEnum.INVITE_COMMISSION_STATUS0.getCodeByte());
			inviteCommission.setIsDelete(ConstantEnum.IS_DELETE_0.getCodeByte());
			insert(inviteCommission);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
