package com.rongyi.settle.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rongyi.settle.unit.SendEmailUnit;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.rss.rpb.IRpbService;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.dto.CouponCodeExcelDto;
import com.rongyi.settle.dto.CouponExcelDto;
import com.rongyi.settle.dto.CouponStatementDetailDto;
import com.rongyi.settle.dto.OrderSettlementDetailDto;
import com.rongyi.settle.dto.OrderSettlementDetailVO;
import com.rongyi.settle.dto.OrderSettlementTopDto;
import com.rongyi.settle.dto.PaymentStatementExcelDto;
import com.rongyi.settle.mapper.OperationLogMapper;
import com.rongyi.settle.mapper.PaymentStatementMapper;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.PaymentStatementService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.AmountUtil;
import com.rongyi.settle.util.DateUtils;
import com.rongyi.settle.util.ExcelUtils;

/**
 * Created by xgq on 2015/9/22. Modified by ZhengYl on 2015/12/08
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

	@Autowired
	OrderNoGenService orderNoGenService;

	@Autowired
	private ROARedisService redisService;

	@Autowired
	private SendEmailUnit sendEmailUnit;

	@Override
	public List<PaymentStatementDto> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
		if (currentPage != null && pageSize != null) {
			map.put("currentPage", (currentPage - 1) * pageSize);
			map.put("pageSize", pageSize);
		}
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
	}

	@Override
	public List<PaymentStatementDto> selectPageListForMerchant(Map<String, Object> map, Integer currentPage, Integer pageSize) {
		if (currentPage != null && pageSize != null) {
			map.put("currentPage", (currentPage - 1) * pageSize);
			map.put("pageSize", pageSize);
		}
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageListForMerchant", map);
	}

	@Override
	public Integer selectPageListCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
	}

	@Override
	public Integer selectPageListCountForMerchant(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCountForMerchant", map);
	}

	@Override
	public void insert(PaymentStatement paymentStatement) {
		this.getBaseDao().insertBySql(NAMESPACE + ".insert", paymentStatement);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
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
					} else if (ConstantEnum.STATUS_4.getCodeInt().equals(status)) {
						PaymentStatement paymentStatement = get(ids.get(i));
						if (paymentStatement.getPayTotal() == null || paymentStatement.getPayTotal() == 0) {
							paramsMap.put("status", ConstantEnum.STATUS_12.getCodeByte());
							desc += ",0元商家审核确认，状态直接为已付款";
						}
					}

					saveOperationLog(ids.get(i), status, desc, userId);
					//检查是否需要发送对账单邮件
					if(ConstantEnum.STATUS_1.getCodeByte().equals(status) || ConstantEnum.STATUS_3.getCodeByte().equals(status)){
						PaymentStatementDto paymentStatementDto = paymentStatementMapper.searchDtoById(ids.get(i));
							sendEmailUnit.sendMail(paymentStatementDto);
					}

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
		if (dto.getPayTotal() != null) {
			BigDecimal bd = new BigDecimal(dto.getPayTotal() + "").divide(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP);
			param.setPayTotal(bd.doubleValue());
		}
		return iRpbService.generatePayment(param);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rongyi.settle.service.PaymentStatementService#
	 * selectForStatementDetails(java.lang.String, java.lang.String,
	 * java.lang.String, java.util.Date, java.util.Date)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<CouponStatementDetailDto> selectForStatementDetails(String mallId, String brandId, String shopId, Date startTime, Date endTime) {
		Map map = new HashMap();
		map.put("mallId", mallId);
		map.put("brandId", brandId);
		map.put("shopId", shopId);
		map.put("startTime", DateUtil.dateToString(startTime));
		map.put("endTime", DateUtil.dateToString(endTime));
		List<CouponStatementDetailDto> result = this.getBaseDao().selectListBySql(NAMESPACE + ".selectForStatementDetailsByMid", map);

		return result;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<CouponStatementDetailDto> selectForStatementDetailsByUsers(String userIds, Date startTime, Date endTime) {
		Map map = new HashMap();
		map.put("userIds", userIds);
		map.put("startTime", DateUtil.dateToString(startTime));
		map.put("endTime", DateUtil.dateToString(endTime));
		List<CouponStatementDetailDto> result = this.getBaseDao().selectListBySql(NAMESPACE + ".selectForStatementDetailsByUsers", map);

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rongyi.settle.service.PaymentStatementService#selectForConfigShops(
	 * java.lang.String)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<String> selectForConfigShops(Integer configId) {
		Map map = new HashMap();
		map.put("configId", configId);
		List<String> result = this.getBaseDao().selectListBySql(NAMESPACE + ".selectForConfigShopsById", map);

		return result;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<CouponStatementDetailDto> selectForStatementDetails(String shopId, Date startTime, Date endTime, Date cycleStartTime, Date cycleEndTime, String shopName,
			String mallId, String mallName) {
		Map map = new HashMap();
		map.put("shopId", shopId);
		map.put("cycleStartTime", DateUtil.dateToString(cycleStartTime));
		map.put("cycleEndTime", DateUtil.dateToString(cycleEndTime));
		map.put("startTime", DateUtil.dateToString(startTime));
		map.put("endTime", DateUtil.dateToString(endTime));
		// map.put("shopName", shopName);
		// map.put("mallId", mallId);
		// map.put("mallName", mallName);
		List<CouponStatementDetailDto> result = this.getBaseDao().selectListBySql(NAMESPACE + ".selectForStatementDetails", map);
		for (CouponStatementDetailDto couponStatementDetailDto : result) {
			couponStatementDetailDto.setShopName(shopName);
			couponStatementDetailDto.setMallId(mallId);
			couponStatementDetailDto.setMallName(mallName);
		}
		return result;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<CouponExcelDto> selectForCouponExcelDto(String mallId, String brandId, String shopId, Date startTime, Date endTime) {
		Map map = new HashMap();
		map.put("mallId", mallId);
		map.put("brandId", brandId);
		map.put("shopId", shopId);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForCouponExcelDtoByMid", map);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<CouponExcelDto> selectForCouponExcelDtoByUsers(String userIds, Date startTime, Date endTime) {
		Map map = new HashMap();
		map.put("userIds", userIds);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForCouponExcelDtoByUsers", map);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<CouponExcelDto> selectForCouponExcelDto(String shopId, Date startTime, Date endTime) {
		Map map = new HashMap();
		map.put("shopId", shopId);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForCouponExcelDto", map);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rongyi.settle.service.PaymentStatementService#selectForOrderTopDto(
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * java.util.Date, java.util.Date)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<OrderSettlementTopDto> selectForOrderTopDto(String shopId, String mallId, String brandId, String userIds, Date startTime, Date endTime) {
		Map map = new HashMap();
		map.put("mallId", mallId);
		map.put("brandId", brandId);
		map.put("shopId", shopId);
		map.put("userIds", userIds);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForOrderTopDto", map);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rongyi.settle.service.PaymentStatementService#selectForOrderDetailDto
	 * (java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * java.util.Date, java.util.Date)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<OrderSettlementDetailDto> selectForOrderDetailDto(String shopId, String mallId, String brandId, String userIds, Date startTime, Date endTime) {
		Map map = new HashMap();
		map.put("mallId", mallId);
		map.put("brandId", brandId);
		map.put("shopId", shopId);
		map.put("userIds", userIds);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForOrderDetailDto", map);
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
		operatioLog.setCreateAt(new Date());
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
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPrimaryKey", map);
	}

	@Override
	public void generate(Integer id, String userId) throws Exception {
		logger.info("重新生成对账单开始，id= " + id + "userId: " + userId);
		PaymentStatement paymentStatement = get(id);
		if (ConstantEnum.STATUS_8.getCodeByte().equals(paymentStatement.getStatus())) {
			logger.error("作废对账单不能重新生成。id=" + id);
			throw new Exception("作废对账单不能重新生成。id=" + id);
		}
		StatementConfig statementConfig = statementConfigService.selectById(paymentStatement.getConfigId());

		PaymentStatement paymentStatementNew = new PaymentStatement();
		paymentStatementNew.setConfigId(statementConfig.getId());
		paymentStatementNew.setRuleCode(statementConfig.getRuleCode());
		paymentStatementNew.setCycleStartTime(paymentStatement.getCycleStartTime());
		paymentStatementNew.setCycleEndTime(paymentStatement.getCycleEndTime());
		paymentStatementNew.setType(SettleConstant.PaymentStatementType.SHOP);
		paymentStatementNew.setBatchNo(getBatchNo());
		paymentStatementNew.setStatus(SettleConstant.PaymentStatementStatus.INIT);
		paymentStatementNew.setCreateAt(new Date());
		paymentStatementNew.setIsDelete(new Byte("0"));
		paymentStatementNew.setPayNo(orderNoGenService.getOrderNo("3"));
		createExcel(id, paymentStatementNew, statementConfig, userId);
	}

	@Override
	public void createExcel(Integer id, PaymentStatement paymentStatement, StatementConfig statementConfig, String userId) throws Exception {
		PaymentStatementExcelDto paymentStatementExcelDto = new PaymentStatementExcelDto();
		List<CouponStatementDetailDto> couponStatementDetailDtoList = new ArrayList<>();
		List<CouponExcelDto> couponExcelDtoList = new ArrayList<>();
		List<OrderSettlementTopDto> orderTopDtoList = new ArrayList<>();
		List<OrderSettlementDetailDto> orderDetailDtoList = new ArrayList<>();

		boolean dataLoad = false;

		logger.info("对账单获取数据开始，BusinessId = " + statementConfig.getBussinessId() + "BusinessType = " + statementConfig.getBussinessType());
		if (statementConfig.getLinkType().equals(SettleConstant.LinkType.ALL)) {
			if (statementConfig.getBussinessType().equals(SettleConstant.BussinessType.MALL)) {
				// 商场 & all
				couponStatementDetailDtoList = selectForStatementDetails(statementConfig.getBussinessId(), null, null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				couponExcelDtoList = selectForCouponExcelDto(statementConfig.getBussinessId(), null, null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				orderTopDtoList = selectForOrderTopDto(null, statementConfig.getBussinessId(), null, null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				orderDetailDtoList = selectForOrderDetailDto(null, statementConfig.getBussinessId(), null, null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				paymentStatementExcelDto.setMallName(statementConfig.getBussinessName());

				dataLoad = true;

			} else if (statementConfig.getBussinessType().equals(SettleConstant.BussinessType.BRAND)) {
				// 品牌 & all
				couponStatementDetailDtoList = selectForStatementDetails(null, statementConfig.getBussinessId(), null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				couponExcelDtoList = selectForCouponExcelDto(null, statementConfig.getBussinessId(), null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				orderTopDtoList = selectForOrderTopDto(null, null, statementConfig.getBussinessId(), null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				orderDetailDtoList = selectForOrderDetailDto(null, null, statementConfig.getBussinessId(), null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				paymentStatementExcelDto.setMallName(statementConfig.getBussinessName());

				dataLoad = true;
			} else if (statementConfig.getBussinessType().equals(SettleConstant.BussinessType.SHOP)) {
				// 店铺 & all
				couponStatementDetailDtoList = selectForStatementDetails(null, null, statementConfig.getBussinessId(), paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				couponExcelDtoList = selectForCouponExcelDto(null, null, statementConfig.getBussinessId(), paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				orderTopDtoList = selectForOrderTopDto(statementConfig.getBussinessId(), null, null, null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				orderDetailDtoList = selectForOrderDetailDto(statementConfig.getBussinessId(), null, null, null, paymentStatement.getCycleStartTime(),
						paymentStatement.getCycleEndTime());

				ShopVO shopVO = roaShopService.getShopVOById(statementConfig.getBussinessId());
				paymentStatementExcelDto.setShopName(shopVO.getName());
				paymentStatementExcelDto.setMallName(shopVO.getPosition().getMall());

				dataLoad = true;
			}
		}

		if (!dataLoad) {
			// part
			List<String> userIds = selectForConfigShops(statementConfig.getId());
			for (String idStr : userIds) {
				couponStatementDetailDtoList.addAll(selectForStatementDetailsByUsers(idStr, statementConfig.getCycleStartTime(), statementConfig.getCycleEndTime()));

				couponExcelDtoList.addAll(selectForCouponExcelDtoByUsers(idStr, statementConfig.getCycleStartTime(), statementConfig.getCycleEndTime()));

				orderTopDtoList.addAll(selectForOrderTopDto(null, null, null, idStr, paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime()));

				orderDetailDtoList.addAll(selectForOrderDetailDto(null, null, null, idStr, paymentStatement.getCycleStartTime(), paymentStatement.getCycleEndTime()));

			}
			if (statementConfig.getBussinessType().equals(SettleConstant.BussinessType.SHOP)) {
				ShopVO shopVO = roaShopService.getShopVOById(statementConfig.getBussinessId());
				paymentStatementExcelDto.setShopName(shopVO.getName());
				paymentStatementExcelDto.setMallName(shopVO.getPosition().getMall());
			} else {
				paymentStatementExcelDto.setMallName(statementConfig.getBussinessName());
			}
			// 汇总券对账单的汇总信息（对账单第一页）
			couponExcelDtoList = adjustCouponExcelDtoList(couponExcelDtoList);
			// 汇总商品对账单的汇总信息（对账单第一页）
			orderTopDtoList = adjustOrderExcelDtoList(orderTopDtoList);
		}

		List<CouponCodeExcelDto> couponCodeExcelDtoList = new ArrayList<>();
		List<OrderSettlementDetailVO> orderSettlementDetailVOs = new ArrayList<>();
		double total = 0;
		double totalCoupon = 0;
		double payTotalCoupon = 0;
		for (CouponStatementDetailDto couponStatementDetailDto : couponStatementDetailDtoList) {
			CouponCodeExcelDto couponCodeExcelDto = couponStatementDetailDto.toCouponCodeExcelDto();
			couponCodeExcelDtoList.add(couponCodeExcelDto);
			totalCoupon += couponCodeExcelDto.getOrigPrice();
			payTotalCoupon += couponCodeExcelDto.getPayAmount();
		}

		double totalOrder = 0;
		double payTotalOrder = 0;
		for (OrderSettlementDetailDto orderSettlementDetailDto : orderDetailDtoList) {
			OrderSettlementDetailVO orderDetailVO = orderSettlementDetailDto.toVO();
			orderSettlementDetailVOs.add(orderDetailVO);
			totalOrder += orderDetailVO.getOrigPrice();
			payTotalOrder += orderDetailVO.getPayAmount();
		}

		paymentStatementExcelDto.setBatchNo(paymentStatement.getBatchNo());
		paymentStatementExcelDto
				.setCycleTime(DateUtils.getDateTimeStr(paymentStatement.getCycleStartTime()) + " - " + DateUtils.getDateTimeStr(paymentStatement.getCycleEndTime()));

		paymentStatementExcelDto.setPayTotalCoupon(totalCoupon);
		paymentStatementExcelDto.setRongyiDiscountCoupon(totalCoupon - payTotalCoupon);

		paymentStatementExcelDto.setPayTotalOrder(totalOrder);
		paymentStatementExcelDto.setRongyiDiscountOrder(totalOrder - payTotalOrder);

		total = totalOrder + totalCoupon;
		paymentStatementExcelDto.setPayTotal(total);
		paymentStatementExcelDto.setRongyiDiscount(total - payTotalCoupon - payTotalOrder);

		BussinessInfo bussinessInfo = bussinessInfoService.selectByConfigId(statementConfig.getId());
		paymentStatementExcelDto.setShopAccountName(bussinessInfo.getPayName());
		paymentStatementExcelDto.setShopAccountNo(bussinessInfo.getPayAccount());
		paymentStatementExcelDto.setShopBank(bussinessInfo.getBlankName());
		paymentStatementExcelDto.setPayChannel(getPayChannelName(statementConfig.getPayChannel()));

		// 券总计
		paymentStatementExcelDto.setCouponExcelDtoList(couponExcelDtoList);
		// 券明细
		paymentStatementExcelDto.setCouponCodeExcelDtoList(couponCodeExcelDtoList);
		// 商品总计
		paymentStatementExcelDto.setOrderSettlementTopDtoList(orderTopDtoList);
		// 商品明细
		paymentStatementExcelDto.setOrderSettlementDetailVOList(orderSettlementDetailVOs);

		paymentStatementExcelDto.setUnitType(statementConfig.getBussinessType());

		// 生成excel文件
		ExcelUtils.write(propertyConfigurer.getProperty("settle.template.file"), propertyConfigurer.getProperty("settle.file.path"), statementConfig.getBussinessId(),
				getFileName(statementConfig.getBussinessName(), DateUtils.getDateStr(paymentStatement.getCycleStartTime())), paymentStatementExcelDto);

		// 插入生成记录
		paymentStatement.setPayTotal(AmountUtil.changYuanToFen(total));
		if (id != null) {
			List<Integer> ids = new ArrayList<Integer>();
			ids.add(id);
			updatePaymentStatusByIds(ids, ConstantEnum.STATUS_8.getCodeInt(), "重新生成或作废", userId);
		}
		insert(paymentStatement);
	}

	/**
	 * 券订单汇总数据再汇总
	 * 
	 * @param list
	 *            原始数据
	 * @return 再汇总后的数据
	 */
	private List<CouponExcelDto> adjustCouponExcelDtoList(List<CouponExcelDto> list) {
		Map<String, CouponExcelDto> map = new HashMap();
		for (CouponExcelDto couponExcelDto : list) {
			CouponExcelDto existCouponExcelDto = map.get(couponExcelDto.getCouponId());
			if (existCouponExcelDto == null) {
				map.put(couponExcelDto.getCouponId(), couponExcelDto);
			} else {
				// 汇总数量
				existCouponExcelDto.setCouponCount(existCouponExcelDto.getCouponCount() + couponExcelDto.getCouponCount());
				// 汇总券面额（应付金额）
				existCouponExcelDto.setCouponPriceTotal((existCouponExcelDto.getCouponPriceTotal() == null ? 0 : existCouponExcelDto.getCouponPriceTotal())
						+ (couponExcelDto.getCouponPriceTotal() == null ? 0 : couponExcelDto.getCouponPriceTotal()));
				// 汇总券补贴金额
				existCouponExcelDto.setCouponDiscountTotal((existCouponExcelDto.getCouponDiscountTotal() == null ? 0 : existCouponExcelDto.getCouponDiscountTotal())
						+ (couponExcelDto.getCouponDiscountTotal() == null ? 0 : couponExcelDto.getCouponDiscountTotal()));
				// 汇总购券使用红包总金额
				existCouponExcelDto.setCouponHbTotal((existCouponExcelDto.getCouponHbTotal() == null ? 0 : existCouponExcelDto.getCouponHbTotal())
						+ (couponExcelDto.getCouponHbTotal() == null ? 0 : couponExcelDto.getCouponHbTotal()));
				// 汇总购券使用积分总金额
				existCouponExcelDto.setCouponScoreTotal((existCouponExcelDto.getCouponScoreTotal() == null ? 0 : existCouponExcelDto.getCouponScoreTotal())
						+ (couponExcelDto.getCouponScoreTotal() == null ? 0 : couponExcelDto.getCouponScoreTotal()));
			}
		}
		return new ArrayList(map.values());
	}

	/**
	 * 商品订单汇总数据再汇总，用于多家（店铺/导购）的数据汇总到一张（商场、品牌的）报表中
	 * 商品订单汇总数据不拆分到具体的商品类型；仅根据订单类型（商品订单，退货订单等）进行合并
	 * 
	 * @param list
	 *            原始数据
	 * @return 再汇总后的数据
	 */
	private List<OrderSettlementTopDto> adjustOrderExcelDtoList(List<OrderSettlementTopDto> list) {
		Map<String, OrderSettlementTopDto> map = new HashMap();
		for (OrderSettlementTopDto orderTopDto : list) {
			OrderSettlementTopDto existOrderTopDto = map.get(orderTopDto.getOrderType());
			if (existOrderTopDto == null) {
				map.put(orderTopDto.getOrderType(), orderTopDto);
			} else {
				// 汇总订单数量
				existOrderTopDto.setOrderCount(existOrderTopDto.getOrderCount() + orderTopDto.getOrderCount());
				// 汇总红包抵扣金额
				existOrderTopDto.setHbDiscountTotal((existOrderTopDto.getHbDiscountTotal() == null ? 0 : existOrderTopDto.getHbDiscountTotal())
						+ (orderTopDto.getHbDiscountTotal() == null ? 0 : orderTopDto.getHbDiscountTotal()));
				// 汇总积分抵扣金额
				existOrderTopDto.setScoreDiscountTotal((existOrderTopDto.getScoreDiscountTotal() == null ? 0 : existOrderTopDto.getScoreDiscountTotal())
						+ (orderTopDto.getScoreDiscountTotal() == null ? 0 : orderTopDto.getScoreDiscountTotal()));
				// 汇总订单总金额
				existOrderTopDto.setOrderAmountTotal((existOrderTopDto.getOrderAmountTotal() == null ? 0 : existOrderTopDto.getOrderAmountTotal())
						+ (orderTopDto.getOrderAmountTotal() == null ? 0 : orderTopDto.getOrderAmountTotal()));
				// 汇总订单补贴金额
				existOrderTopDto.setOrderDiscountTotal((existOrderTopDto.getOrderDiscountTotal() == null ? 0 : existOrderTopDto.getOrderDiscountTotal())
						+ (orderTopDto.getOrderDiscountTotal() == null ? 0 : orderTopDto.getOrderDiscountTotal()));
			}
		}
		return new ArrayList(map.values());
	}

	@Override
	public String getBatchNo() {
		String dateStr = "";
		String batchNo = "";
		try {
			dateStr = DateUtils.getDateSimpleStr();
			String key = "PAYMENT_STATEMENT_BATCH_NO_" + dateStr;
			batchNo = redisService.get(key);
			if (org.springframework.util.StringUtils.isEmpty(batchNo)) {
				batchNo = "0001";
			}
			int num = Integer.valueOf(batchNo);
			String nextBatchNo = String.format("%04d", ++num);
			redisService.set(key, nextBatchNo);
			redisService.expire(key, 60 * 60 * 48);// 两天后失效
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return dateStr + batchNo;
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
