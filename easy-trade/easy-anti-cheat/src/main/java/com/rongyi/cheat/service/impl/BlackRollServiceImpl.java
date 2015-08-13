/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月12日上午10:27:10
 * @Description: TODO
 *
 **/

package com.rongyi.cheat.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.cheat.constants.Constant.BLACK_ROLL;
import com.rongyi.cheat.constants.ConstantEnum;
import com.rongyi.cheat.service.BlackRollService;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.cheat.BlackRoll;
import com.rongyi.easy.rpb.vo.PayAccountUseTotal;
import com.rongyi.rss.rpb.IRpbService;

/**
 * @Author: 柯军
 * @Description: 黑名单列表接口实现
 * @datetime:2015年8月12日上午10:27:10
 * 
 **/
@Service
public class BlackRollServiceImpl extends BaseServiceImpl implements BlackRollService {

	@Autowired
	IRpbService rpbService;

	private static final String NAMESPACE = "com.rongyi.cheat.mapper.xml.BlackRollMapper";

	@Override
	public void insert(BlackRoll blackRoll) {
		this.getBaseDao().insertBySql(NAMESPACE + ".insert", blackRoll);
	}

	@Override
	public void update(BlackRoll blackRoll) {
		this.getBaseDao().updateBySql(NAMESPACE + ".updateByPrimaryKeySelective", blackRoll);

	}

	@Override
	public BlackRoll selectByPayAccount(String payAccout, Byte payType) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("payAccout", payAccout);
		map.put("payType", payType);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPayAccount", map);
	}

	@Override
	public void valadatePayAccount(Map<String, Object> map) {
		map.put("count", BLACK_ROLL.WARN_COUNT);
		List<PayAccountUseTotal> list = rpbService.selectPayAccountUseTotal(map);
		for (PayAccountUseTotal payAccountUseTotal : list) {
			BlackRoll blackRoll = selectByPayAccount(payAccountUseTotal.getPayAccount(), Integer.valueOf(payAccountUseTotal.getPayType()).byteValue());
			if (blackRoll == null) {
				blackRoll = getBlackRoll(payAccountUseTotal);
				insert(blackRoll);
			} else {
				blackRoll.setCount(payAccountUseTotal.getCount());
				blackRoll.setUpdateAt(DateUtil.getCurrDateTime());
				update(blackRoll);
			}
		}
	}

	private BlackRoll getBlackRoll(PayAccountUseTotal payAccountUseTotal) {
		BlackRoll blackRoll = new BlackRoll();
		blackRoll.setCreateAt(DateUtil.getCurrDateTime());
		blackRoll.setStatus(ConstantEnum.BLACK_ROLL_STATUS_0.getCodeInt().byteValue());
		blackRoll.setPayAccount(payAccountUseTotal.getPayAccount());
		blackRoll.setPayType(Integer.valueOf(payAccountUseTotal.getPayType()).byteValue());
		blackRoll.setCount(payAccountUseTotal.getCount());
		return blackRoll;

	}
}
