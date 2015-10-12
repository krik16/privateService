package com.rongyi.settle.service.impl;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.easy.rpb.vo.PaymentParamVO;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.OperationLog;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.rss.rpb.IRpbService;
import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.dto.CouponCodeExcelDto;
import com.rongyi.settle.dto.CouponExcelDto;
import com.rongyi.settle.dto.PaymentStatementDetailDto;
import com.rongyi.settle.dto.PaymentStatementExcelDto;
import com.rongyi.settle.mapper.OperationLogMapper;
import com.rongyi.settle.mapper.PaymentStatementMapper;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.PaymentStatementService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.DateUtils;
import com.rongyi.settle.util.ExcelUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by xgq on 2015/9/22.
 */
@Service
public class PaymentStatementServiceImpl extends BaseServiceImpl implements PaymentStatementService {

	private static final String NAMESPACE = "com.rongyi.settle.mapper.PaymentStatementMapper";

	Logger logger = LoggerFactory.getLogger(PaymentStatementServiceImpl.class);

	@Autowired
	private PaymentStatementMapper paymentStatementMapper;

	@Autowired
	private OperationLogMapper operationLogMapper;

	@Autowired
	IRpbService iRpbService;

	@Autowired
	private StatementConfigService statementConfigService;

	@Autowired
	private BussinessInfoService bussinessInfoService;

	@Autowired
	private PropertyConfigurer propertyConfigurer;

	@Autowired
	private ROAShopService roaShopService;

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
	public void insert(PaymentStatement paymentStatement) {
		this.getBaseDao().insertBySql(NAMESPACE + ".insert", paymentStatement);
	}

	@Override
	public List<PaymentStatement> selectByCycleTime(Integer configId, Date yesterdayFirstSecond, Date yesterdayLastSecond) {
		Map map = new HashMap();
		map.put("configId", configId);
		map.put("cycleStartTime", yesterdayFirstSecond);
		map.put("cycleEndTime", yesterdayLastSecond);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectByCycleTime", map);
	}

	@Override
	public boolean updatePaymentStatusByIds(List<Integer> ids, Integer status, String desc, String userId) {
		boolean result = false;
		try {
			if (CollectionUtils.isNotEmpty(ids) && status != null) {
				Map<String, Object> paramsMap = new HashMap<>();
				paramsMap.put("ids", ids);
				paramsMap.put("status", status);
				paramsMap.put("statusUpdateTime", new Date());
				for (int i = 0; i < ids.size(); i++) {
					if (status.intValue() == 6) {
						// 待付款审核通过，生成付款
						Map<String, Object> reMap = generatePayment(ids.get(i), userId);
						if (!(boolean) reMap.get("success")) {
							logger.info(ids.get(i) + "未生成付款，原因:" + reMap.get("message"));
							ids.remove(i);
						}
					}
					saveOperationLog(ids.get(i), status, desc, userId);
				}
				paymentStatementMapper.updateStatusByIds(paramsMap);
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(e.getMessage());
		}
		return result;
	}

	private Map<String, Object> generatePayment(Integer id, String userId) {
		PaymentParamVO param = new PaymentParamVO();
		param.setUserId(userId);
		PaymentStatementDto dto = paymentStatementMapper.searchDtoById(id);
		param.setCreateAt(new Date());
		param.setOperateNo(dto.getPayNo());
		param.setOperateType("15");
		param.setPayAccount(dto.getPayAccount());
		param.setPayChannel(Integer.valueOf(dto.getPayChannel().toString()));
		param.setPayName(dto.getPayName());
		param.setPayTotal(Double.valueOf(dto.getPayTotal().toString()));
		return iRpbService.generatePayment(param);
	}

	@Override
	public List<PaymentStatementDetailDto> selectForStatementDetails(String shopId, Date startTime, Date endTime, Date cycleStartTime, Date cycleEndTime, String shopName, String mallId,
			String mallName) {
		Map map = new HashMap();
		map.put("shopId", shopId);
		map.put("cycleStartTime", DateUtil.dateToString(cycleStartTime));
		map.put("cycleEndTime", DateUtil.dateToString(cycleEndTime));
		map.put("startTime", DateUtil.dateToString(startTime));
		map.put("endTime", DateUtil.dateToString(endTime));
		map.put("shopName", shopName);
		map.put("mallId", mallId);
		map.put("mallName", mallName);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForStatementDetails", map);
	}

	@Override
	public List<CouponExcelDto> selectForCouponExcelDto(String shopId, Date startTime, Date endTime, Date cycleStartTime, Date cycleEndTime) {
		Map map = new HashMap();
		map.put("shopId", shopId);
		map.put("cycleStartTime", cycleStartTime);
		map.put("cycleEndTime", cycleEndTime);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForCouponExcelDto", map);
	}

	/**
	 * 插入日志记录
	 * 
	 * @param id
	 * @param status
	 * @param desc
	 * @param userId
	 */
	private void saveOperationLog(Integer id, Integer status, String desc, String userId) {
		OperationLog operatioLog = new OperationLog();
		operatioLog.setCreateUserId(userId);
		operatioLog.setDesc(desc);
		operatioLog.setOperationModel((byte) 1);
		operatioLog.setOperationType(status.byteValue());
		operatioLog.setCreadeAt(new Date());
		operatioLog.setOperationId(id);
		operatioLog.setIsDelete(Byte.valueOf((byte) 0));
		operationLogMapper.insertSelective(operatioLog);
	}

	@Override
	public void cancel(Integer id) {
		this.getBaseDao().updateBySql(NAMESPACE + ".cancel", id);
	}

	@Override
	public PaymentStatement get(Integer id) {
		Map<String, Object> map = new HashMap();
		map.put("id", id);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPrimaryKey", map);
	}

	@Override
	public void generate(Integer id) throws Exception {
		PaymentStatement paymentStatement = get(id);
		StatementConfig statementConfig = statementConfigService.selectById(paymentStatement.getConfigId());
		cancel(id);

		PaymentStatement paymentStatementNew = new PaymentStatement();
		paymentStatementNew.setConfigId(statementConfig.getId());
		paymentStatementNew.setRuleCode(statementConfig.getRuleCode());
		paymentStatementNew.setCycleStartTime(paymentStatement.getCycleStartTime());
		paymentStatementNew.setCycleEndTime(paymentStatement.getCycleEndTime());
		paymentStatementNew.setType(SettleConstant.PaymentStatementType.SHOP);
		paymentStatementNew.setBatchNo(getBatchNo(paymentStatement.getBatchNo()));
		paymentStatementNew.setStatus(SettleConstant.PaymentStatementStatus.INIT);
		paymentStatementNew.setCreateAt(new Date());
		paymentStatementNew.setIsDelete(new Byte("0"));
		insert(paymentStatementNew);
		createExcel(paymentStatementNew, statementConfig);
	}

	public String getBatchNo(String batchNo) {
		String endTwo = StringUtils.substring(batchNo, batchNo.length() - 2, batchNo.length());
		Integer count = Integer.valueOf(endTwo);
		count = count + 1;
		if (count < 10) {
			return StringUtils.substring(batchNo, 0, batchNo.length() - 2) + "0" + count;
		} else
			return StringUtils.substring(batchNo, 0, batchNo.length() - 2) + count.toString();
	}

	private void createExcel(PaymentStatement paymentStatement, StatementConfig statementConfig) throws Exception {
		PaymentStatementExcelDto paymentStatementExcelDto = new PaymentStatementExcelDto();
		List<PaymentStatementDetailDto> paymentStatementDetailDtoList = new ArrayList<>();
		List<CouponExcelDto> couponExcelDtoList = new ArrayList<>();
		if (statementConfig.getBussinessType().equals(SettleConstant.BussinessType.SHOP)) {
			ShopVO shopVO = roaShopService.getShopVOById(statementConfig.getBussinessId());
			paymentStatementDetailDtoList = selectForStatementDetails(statementConfig.getBussinessId(), paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime(),
					statementConfig.getCycleStartTime(), statementConfig.getCycleEndTime(), shopVO.getName(), shopVO.getPosition().getMallId(), shopVO.getPosition().getMall());
			couponExcelDtoList = selectForCouponExcelDto(statementConfig.getBussinessId(), paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime(),
					statementConfig.getCycleStartTime(), statementConfig.getCycleEndTime());
			paymentStatementExcelDto.setShopName(shopVO.getName());
			paymentStatementExcelDto.setMallName(shopVO.getPosition().getMall());
		} else if (statementConfig.getBussinessType().equals(SettleConstant.BussinessType.MALL)) {
			Map map = new HashMap();
			map.put("mallId", statementConfig.getBussinessId());
			Map result = roaShopService.getShops(map, 0, 10000);
			List<ShopVO> shopVOs = (List<ShopVO>) result.get("list");
			for (ShopVO shopVO : shopVOs) {
				paymentStatementDetailDtoList.addAll(selectForStatementDetails(shopVO.getId(), paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime(),
						statementConfig.getCycleStartTime(), statementConfig.getCycleEndTime(), shopVO.getName(), shopVO.getPosition().getMallId(), shopVO.getPosition().getMall()));
				couponExcelDtoList.addAll(selectForCouponExcelDto(shopVO.getId(), paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime(), statementConfig.getCycleStartTime(),
						statementConfig.getCycleEndTime()));
			}
			if (shopVOs != null && shopVOs.size() > 0) {
				paymentStatementExcelDto.setMallName(shopVOs.get(0).getPosition().getMall());
			}
		}

		List<CouponCodeExcelDto> couponCodeExcelDtoList = new ArrayList<>();
		double total = 0;
		double payTotal = 0;
		for (PaymentStatementDetailDto paymentStatementDetailDto : paymentStatementDetailDtoList) {
			CouponCodeExcelDto couponCodeExcelDto = paymentStatementDetailDto.toCouponCodeExcelDto();
			couponCodeExcelDtoList.add(couponCodeExcelDto);
			total += paymentStatementDetailDto.getOrigPrice();
			payTotal += paymentStatementDetailDto.getPayAmount();
		}
		paymentStatementExcelDto.setBatchNo(paymentStatement.getBatchNo());
		paymentStatementExcelDto.setCycleTime(DateUtils.getDateTimeStr(paymentStatement.getCycleStartTime()) + " - " + DateUtils.getDateTimeStr(paymentStatement.getCycleEndTime()));
		paymentStatementExcelDto.setPayTotal(total);
		paymentStatementExcelDto.setRongyiDiscount(total - payTotal);

		BussinessInfo bussinessInfo = bussinessInfoService.selectByConfigId(statementConfig.getId());
		paymentStatementExcelDto.setShopAccountName(bussinessInfo.getPayName());
		paymentStatementExcelDto.setShopAccountNo(bussinessInfo.getPayAccount());
		paymentStatementExcelDto.setShopBank(bussinessInfo.getBlankName());
		paymentStatementExcelDto.setPayChannel(getPayChannelName(statementConfig.getPayChannel()));
		paymentStatementExcelDto.setCouponExcelDtoList(couponExcelDtoList);
		paymentStatementExcelDto.setCouponCodeExcelDtoList(couponCodeExcelDtoList);
		ExcelUtils.write(propertyConfigurer.getProperty("settle.template.file"), propertyConfigurer.getProperty("settle.file.path"),
				getFileName(statementConfig.getBussinessName(), DateUtils.getDateStr(paymentStatement.getCycleStartTime())), paymentStatementExcelDto);
	}

	private String getPayChannelName(Byte payChannel) {
		if (SettleConstant.PayChannel.ZHIFUBAO.equals(payChannel)) {
			return "支付宝";
		}
		if (SettleConstant.PayChannel.WECHAT.equals(payChannel)) {
			return "微信";
		}
		if (SettleConstant.PayChannel.UNION.equals(payChannel)) {
			return "银联";
		}
		if (SettleConstant.PayChannel.CASH.equals(payChannel)) {
			return "现金";
		}
		return "支付宝";
	}

	private String getFileName(String name, String date) {
		return "容易网商户对账单-" + name + "-" + date + ".xlsx";
	}
}
