/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月12日上午10:27:10
 * @Description: TODO
 *
 **/

package com.rongyi.cheat.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.cheat.constants.ConstantEnum;
import com.rongyi.cheat.mail.MailService;
import com.rongyi.cheat.service.AccountBlacklistService;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.cheat.AccountBlacklist;
import com.rongyi.easy.rpb.vo.PayAccountUseTotal;
import com.rongyi.rss.rpb.IRpbService;

/**
 * @Author: 柯军
 * @Description: 黑名单列表接口实现
 * @datetime:2015年8月12日上午10:27:10
 * 
 **/
@Service
public class AccountBlacklistServiceImpl extends BaseServiceImpl implements AccountBlacklistService {

	@Autowired
	IRpbService rpbService;

	@Autowired
	MailService mailService;

	private static final String NAMESPACE = "com.rongyi.cheat.mapper.xml.AccountBlacklistMapper";

	private static final Logger LOGGER = Logger.getLogger(AccountBlacklistServiceImpl.class);

	@Override
	public void insert(AccountBlacklist accountBlacklist) {
		this.getBaseDao().insertBySql(NAMESPACE + ".insert", accountBlacklist);
	}

	@Override
	public void update(AccountBlacklist accountBlacklist) {
		this.getBaseDao().updateBySql(NAMESPACE + ".updateByPrimaryKeySelective", accountBlacklist);

	}

	@Override
	public AccountBlacklist selectByPayAccount(String payAccount, Byte payType, Byte status) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("payAccount", payAccount);
		map.put("payType", payType);
		map.put("status", status);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPayAccount", map);
	}

	@Override
	public void valadatePayAccount(Map<String, Object> map) {
		map.put("count", 10);
		LOGGER.info("扫描是否有账号符合黑名单条件，购买次数大于" + 10);
		List<PayAccountUseTotal> list = rpbService.selectPayAccountUseTotal(map);
		List<AccountBlacklist> mailWranList = new ArrayList<AccountBlacklist>();
		for (PayAccountUseTotal payAccountUseTotal : list) {
			AccountBlacklist accountBlacklist = selectByPayAccount(payAccountUseTotal.getPayAccount(), Integer.valueOf(payAccountUseTotal.getPayType()).byteValue(),
					ConstantEnum.BLACK_ROLL_STATUS_0.getCodeByte());
			if (accountBlacklist == null) {
				accountBlacklist = getAccountBlacklist(payAccountUseTotal);
				insert(accountBlacklist);
				mailWranList.add(accountBlacklist);
			} else if (payAccountUseTotal.getCount() > accountBlacklist.getCount()) {
				accountBlacklist.setCount(payAccountUseTotal.getCount());
				accountBlacklist.setUpdateAt(DateUtil.getCurrDateTime());
				update(accountBlacklist);
				if (ConstantEnum.BLACK_ROLL_STATUS_0.getCodeInt().equals(accountBlacklist.getStatus()))
					mailWranList.add(accountBlacklist);
			}
		}
		if (!mailWranList.isEmpty())
			sendWranEmail(mailWranList);
	}

	@Override
	public Map<String, Object> selectPageList(Integer currentPage, Integer pageSize, Map<String, Object> map) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		map.put("currentPage", (currentPage - 1) * pageSize);
		map.put("pageSize", pageSize);
		List<AccountBlacklist> list = this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
		Integer count = this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
		resultMap.put("list", list);
		resultMap.put("count", count);
		return resultMap;
	}

	private void sendWranEmail(List<AccountBlacklist> mailWranList) {
		Set<String> toAdrs = new HashSet<String>();
		toAdrs.add("kejun@rongyi.com");
		StringBuffer sb = new StringBuffer();
		sb.append("以下账号存在刷单风险：\n");
		for (AccountBlacklist accountBlacklist : mailWranList) {
			sb.append("账号：");
			sb.append(accountBlacklist.getPayAccount());
			sb.append(",账号类型：");
			sb.append((accountBlacklist.getPayType() == 0) ? "支付宝" : "微信");
			sb.append(",购买总数量：");
			sb.append(accountBlacklist.getCount());
			sb.append(";");
			sb.append("\n");
		}

		try {
			LOGGER.info("发送报警邮件，收件人列表" + toAdrs.toString());
			mailService.sendAttachmentEmail("刷单账号预警", "kejun@rongyi.com", toAdrs, sb.toString(), null);
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	private AccountBlacklist getAccountBlacklist(PayAccountUseTotal payAccountUseTotal) {
		AccountBlacklist accountBlacklist = new AccountBlacklist();
		accountBlacklist.setCreateAt(DateUtil.getCurrDateTime());
		accountBlacklist.setStatus(ConstantEnum.BLACK_ROLL_STATUS_0.getCodeInt().byteValue());
		accountBlacklist.setPayAccount(payAccountUseTotal.getPayAccount());
		accountBlacklist.setPayType(Integer.valueOf(payAccountUseTotal.getPayType()).byteValue());
		accountBlacklist.setCount(payAccountUseTotal.getCount());
		return accountBlacklist;

	}

}
