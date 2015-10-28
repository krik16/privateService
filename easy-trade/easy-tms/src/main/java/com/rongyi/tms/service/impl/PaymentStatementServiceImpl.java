/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月28日上午10:14:24
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.PayEnum;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.rpb.vo.PayNotifyVO;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.tms.entity.DrawApply;
import com.rongyi.rss.rpb.IRpbService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.PaymentStatementService;

/**
 * @Author: 柯军
 * @Description: 对账单
 * @datetime:2015年9月28日上午10:14:24
 * 
 **/

@Service
public class PaymentStatementServiceImpl extends BaseServiceImpl implements PaymentStatementService {

	private static final String NAMESPACE = "com.rongyi.tms.mapper.PaymentStatementMapper";
	
	@Autowired
	IRpbService rpbService;
	

	@Override
	public List<PaymentStatementDto> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
		if (currentPage != null && pageSize != null) {
			map.put("currentPage", (currentPage - 1) * pageSize);
			map.put("pageSize", pageSize);
		}
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
	}

	@Override
	public Integer selectPageListCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
	}

	@Override
	public void updateByNotify(Map<String, Object> map) {
		 JSONObject responseJsonObject = JSONObject.fromObject(map);
		JSONArray jsonArray =  responseJsonObject.getJSONArray("statementList");
		List<PayNotifyVO> payNotifylist  = new ArrayList<PayNotifyVO>();
		  for (int i = 0, length = jsonArray.size(); i < length; i++) {
              JSONObject jsonObject = jsonArray.getJSONObject(i);
              PayNotifyVO payNotifyVO = new PayNotifyVO();
              payNotifyVO.setDrawNo(jsonObject.getString("drawNo"));
              payNotifyVO.setTradeNo(jsonObject.getString("tradeNo"));
              payNotifylist.add(payNotifyVO);
          }
		map.put("status", ConstantEnum.STATEMENT_STATUE_12.getCodeByte());
		map.put("payTime", DateUtil.getCurrDateTime());
		map.put("statusUpdateTime", DateUtil.getCurrDateTime());
		for (PayNotifyVO payNotifyVO : payNotifylist) {
			map.put("payNo", payNotifyVO.getDrawNo());
			map.put("tradeNo", payNotifyVO.getTradeNo());
			this.getBaseDao().updateBySql(NAMESPACE + ".updateByNotify", map);
		}
	}

	@Override
	public void updateByOffPay(String[] paymentIdsArray,String[] statementIdsArray, String tradeNo, Integer status) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", statementIdsArray);
		map.put("tradeNo", tradeNo);
		map.put("payTime", DateUtil.getCurrDateTime());
		map.put("status", status);
		map.put("statusUpdateTime", DateUtil.getCurrDateTime());
		this.getBaseDao().updateBySql(NAMESPACE + ".updateByOffPay", map);
		rpbService.updatePaymentStatus(paymentIdsArray, ConstantEnum.TRADE_STATUS_PAY_YES.getCodeInt(), ConstantEnum.TRADE_TYPE_STATEMENT.getCodeInt());
	}
	
	@Override
	public void updateByIds(Map<String,Object> map){
		this.getBaseDao().updateBySql(NAMESPACE + ".updateByIds", map);
	}

	@Override
	public Map<String, Object> validatePay(String[] ids, Integer operateType) {
		List<PaymentStatementDto> list = new ArrayList<PaymentStatementDto>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		list = this.getBaseDao().selectListBySql(NAMESPACE + ".validatePay", map);
		byte payChannel = 0;
		if (!list.isEmpty())
			payChannel = list.get(0).getPayChannel();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("success", true);
		resultMap.put("message", "验证通过");
		for (PaymentStatementDto paymentStatementDto : list) {
			if (PayEnum.STATEMENT_ONE.getCode().equals(operateType)) {// 单条付款
				if (!ConstantEnum.PAY_CHANNEL_ZHIFUBAO.getCodeByte().equals(paymentStatementDto.getPayChannel())
						&& !ConstantEnum.STATEMENT_STATUE_11.getCodeByte().equals(paymentStatementDto.getStatus())) {
					resultMap.put("success", false);
					resultMap.put("message", "对账单属于线下支付，尚未被下载，请下载付款后再操作");
					break;
				}
			}
			if (PayEnum.STATEMENT_MORE.getCode().equals(operateType)) {// 多条支付
				if (!paymentStatementDto.getPayChannel().equals(payChannel)) {
					resultMap.put("success", false);
					resultMap.put("message", "您只能选择一种支付方式进行批量付款操作");
					break;
				}else if(ConstantEnum.STATEMENT_STATUE_9.getCodeByte().equals(paymentStatementDto.getStatus())){
					resultMap.put("success", false);
					resultMap.put("message", "批量付款列表中存在付款冻结记录，请重新选择操作");
					break;
				}
			}
		}
		return resultMap;
	}

}
