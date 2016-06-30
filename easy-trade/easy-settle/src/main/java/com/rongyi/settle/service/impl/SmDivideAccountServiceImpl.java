package com.rongyi.settle.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.easy.coupon.vo.CouponGeneralVO;
import com.rongyi.easy.rpb.dto.DivideAccountDto;
import com.rongyi.easy.settle.entity.SmDivideAccount;
import com.rongyi.easy.settle.entity.SmDivideAccountDetail;
import com.rongyi.rss.coupon.merchant.TradeCouponService;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.DivideAccountConstant;
import com.rongyi.settle.exception.BizException;
import com.rongyi.settle.mapper.SmDivideAccountDetailMapper;
import com.rongyi.settle.mapper.SmDivideAccountMapper;
import com.rongyi.settle.service.SmDivideAccountService;
import com.rongyi.settle.util.AmountUtil;
import com.rongyi.settle.util.DateUtils;
import com.rongyi.settle.vo.DivideAccountVo;

@Service
public class SmDivideAccountServiceImpl implements SmDivideAccountService {

	private static final Logger log = Logger.getLogger(SmDivideAccountServiceImpl.class);

	@Autowired
	private SmDivideAccountMapper smDivideAccountMapper;

	@Autowired
	private SmDivideAccountDetailMapper smDivideAccountDetailMapper;

	@Autowired
	private TradeCouponService tradeCouponService;

	/**
	 * @see com.rongyi.settle.service.DivideAccountService#findPageList(com.rongyi.settle.dto.DivideAccountDto)
	 */
	public List<DivideAccountVo> findPageList(DivideAccountDto divideAccountDto) {
		return smDivideAccountMapper.findPageList(divideAccountDto);
	}
	
	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#findPageListCount(com.rongyi.easy.rpb.dto.DivideAccountDto)
	 */
	public Integer findPageListCount(DivideAccountDto divideAccountDto) {
		return smDivideAccountMapper.findPageListCount(divideAccountDto);
	}

	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#findDivideAccount(com.rongyi.easy.rpb.dto.DivideAccountDto)
	 */
	public DivideAccountVo findDivideAccount(DivideAccountDto divideAccountDto) {
		return smDivideAccountMapper.findDivideAccount(divideAccountDto);
	}

	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#findDetailPageList(com.rongyi.easy.rpb.dto.DivideAccountDto)
	 */
	public List<DivideAccountVo> findDetailPageList(DivideAccountDto divideAccountDto) {
		return smDivideAccountDetailMapper.findDetailPageList(divideAccountDto);
	}
	
	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#findDetailPageListCount(com.rongyi.easy.rpb.dto.DivideAccountDto)
	 */
	public Integer findDetailPageListCount(DivideAccountDto divideAccountDto) {
		return smDivideAccountDetailMapper.findDetailPageListCount(divideAccountDto);
	}


	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#generateDivideAccount()
	 */
	public void batchGenerateDivideAccount() {
		Date date = DateUtils.parseDate(new Date());
		DivideAccountDto divideAccountDto = new DivideAccountDto();
		divideAccountDto.setAccountDate(date);
		// 查询前一天B端商品订单
		List<DivideAccountVo> orderList = this.findOrderList(divideAccountDto);
		// for循环结果集，增加分账记录、分账详情记录
		this.addSmDivideAccount(orderList);
	}

	/**
	 * @Description 查询商品订单、卡券订单合集
	 * @param divideAccountDto
	 * @return
	 */
	private List<DivideAccountVo> findOrderList(DivideAccountDto divideAccountDto) {
		// 查询前一天B端商品订单
		List<DivideAccountVo> productOrderList = this.initProductOrderList(divideAccountDto);
		// 查询前一天B端卡券订单
		List<DivideAccountVo> tradeOrderList = this.initTradeOrderList(divideAccountDto);
		// 筛选出非通用券订单
		tradeOrderList = this.getNoUniveralCouponList(tradeOrderList);
		// 合并商品订单、卡券订单
		productOrderList.addAll(tradeOrderList);

		return productOrderList;
	}

	/**
	 * @Description 调用卡券接口，筛选出非通用券订单
	 * @param divideAccountVoList
	 */
	private List<DivideAccountVo> getNoUniveralCouponList(List<DivideAccountVo> divideAccountVoList) {
		List<DivideAccountVo> resultList = new ArrayList<>();
		// 筛选非通用券订单
		if (CollectionUtils.isNotEmpty(divideAccountVoList)) {
			Map<String, DivideAccountVo> divideAccountMap = new HashMap<>();
			List<String> couponIdList = new ArrayList<>();
			for (DivideAccountVo vo : divideAccountVoList) {
				if (null != vo && null != vo.getCouponId()) {
					String couponId = vo.getCouponId();
					couponIdList.add(couponId);
					divideAccountMap.put(couponId, vo);
				}
			}

			if (CollectionUtils.isNotEmpty(couponIdList)) {
				// 调用接口判断非通用券
				List<CouponGeneralVO> couponList;
				try {
					couponList = tradeCouponService.jugeGeneralByIds(couponIdList);
				} catch (Exception e) {
					log.error("调用卡券接口异常：tradeCouponService.jugeGeneralByIds, 入参couponIdList: " + couponIdList, e);
					throw new BizException(CodeEnum.ERROR_SYSTEM);
				}
				for (CouponGeneralVO vo : couponList) {
					if (null != vo && null != vo.getCouponId() && !vo.getIsGeneral()) {
						resultList.add(divideAccountMap.get(vo.getCouponId()));
					}
				}
			}
		}
		return resultList;
	}

	/**
	 * @Description 填充分账记录, 分账详情记录
	 * @param divideAccountVo
	 * @param accountMap
	 * @param accountDetailMap
	 */
	private void fillDivideAccountMap(Date billDate, String billBatchNo, DivideAccountVo divideAccountVo,
			Map<Integer, SmDivideAccount> accountMap, Map<Integer, List<SmDivideAccountDetail>> accountDetailMap) {
		Integer mallId = divideAccountVo.getMallId();
		SmDivideAccount smDivideAccount = null;
		List<SmDivideAccountDetail> detailList = null;
		if (!accountMap.containsKey(mallId)) {
			smDivideAccount = this.initSmDivideAccount(billDate, billBatchNo, divideAccountVo);// 初始化分账信息
			detailList = this.initSmDivdeAccountDetail(billDate, billBatchNo, divideAccountVo);// 初始化分账详情信息
		} else {
			smDivideAccount = accountMap.get(mallId);
			this.replaceSmDivideAccount(divideAccountVo, smDivideAccount);// 更新分账详情信息

			detailList = accountDetailMap.get(mallId);
			this.replaceSmDivideAccountDetail(billDate, billBatchNo, divideAccountVo, detailList);// 更新分账详情信息
		}
		accountMap.put(mallId, smDivideAccount);
		accountDetailMap.put(mallId, detailList);
	}

	/**
	 * @Description 初始化分账信息
	 * @param divideAccountVo
	 * @return
	 */
	private SmDivideAccount initSmDivideAccount(Date billDate, String billBatchNo, DivideAccountVo divideAccountVo) {
		SmDivideAccount smDivideAccount = new SmDivideAccount();
		smDivideAccount.setMallId(divideAccountVo.getMallId());
		smDivideAccount.setOrderNum(DivideAccountConstant.ORDER_NUM);
		smDivideAccount.setBillBatchNo(billBatchNo);
		smDivideAccount.setBillDate(billDate);
		Integer orderType = divideAccountVo.getOrderType();
		if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(orderType)) {// 商品订单
			smDivideAccount.setUnitNum(divideAccountVo.getTotalQuantity());// 商品数量
			smDivideAccount.setPayAmount(AmountUtil.changYuanToFen(divideAccountVo.getTotalAmount().doubleValue()));// 支付金额
		} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(orderType)) {// 卡券订单
			smDivideAccount.setUnitNum(DivideAccountConstant.UNIT_NUM);// 系统无法区分每次核销了几张卡券，因此默认每使用一次卡券，都单独是一次核销
			smDivideAccount.setPayAmount(divideAccountVo.getUnitPrice());// 支付金额，每使用一次卡券都是一次核销，所以金额就是单价
		}
		return smDivideAccount;
	}

	/**
	 * @Description 初始化分账详情信息
	 * @param divideAccountVo
	 * @return
	 */
	private List<SmDivideAccountDetail> initSmDivdeAccountDetail(Date billDate, String billBatchNo,
			DivideAccountVo divideAccountVo) {
		List<SmDivideAccountDetail> smDivideAccountDetailList = new ArrayList<>();
		SmDivideAccountDetail smDivideAccountDetail = new SmDivideAccountDetail();
		smDivideAccountDetail.setMallId(divideAccountVo.getMallId());
		smDivideAccountDetail.setShopId(divideAccountVo.getShopId());
		smDivideAccountDetail.setOrderNum(DivideAccountConstant.ORDER_NUM);
		smDivideAccountDetail.setBillBatchNo(billBatchNo);
		smDivideAccountDetail.setBillDate(billDate);
		Integer orderType = divideAccountVo.getOrderType();
		if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(orderType)) {// 商品订单
			smDivideAccountDetail.setUnitNum(divideAccountVo.getTotalQuantity());// 商品数量
			smDivideAccountDetail
					.setPayAmount(AmountUtil.changYuanToFen(divideAccountVo.getTotalAmount().doubleValue()));// 支付金额
		} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(orderType)) {// 卡券订单
			smDivideAccountDetail.setUnitNum(DivideAccountConstant.UNIT_NUM);// 系统无法区分每次核销了几张卡券，因此默认每使用一次卡券，都单独是一次核销
			smDivideAccountDetail.setPayAmount(divideAccountVo.getUnitPrice());// 支付金额，每使用一次卡券都是一次核销，所以金额就是单价
		}
		smDivideAccountDetailList.add(smDivideAccountDetail);
		return smDivideAccountDetailList;
	}

	/**
	 * @Description 添加分账信息
	 * @param divideAccountVo
	 * @param smDivideAccount
	 */
	private void replaceSmDivideAccount(DivideAccountVo divideAccountVo, SmDivideAccount smDivideAccount) {
		smDivideAccount.setOrderNum(smDivideAccount.getOrderNum() + DivideAccountConstant.ORDER_NUM);// 订单数自增
		Integer orderType = divideAccountVo.getOrderType();
		if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(orderType)) {// 商品订单
			smDivideAccount.setPayAmount(smDivideAccount.getPayAmount()
					+ AmountUtil.changYuanToFen(divideAccountVo.getTotalAmount().doubleValue()));// 支付金额
			smDivideAccount.setUnitNum(smDivideAccount.getUnitNum() + divideAccountVo.getTotalQuantity());
		} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(orderType)) {// 卡券订单
			smDivideAccount.setPayAmount(smDivideAccount.getPayAmount() + divideAccountVo.getUnitPrice());
			smDivideAccount.setUnitNum(smDivideAccount.getUnitNum() + DivideAccountConstant.UNIT_NUM);
		}
	}

	/**
	 * @Description 添加分账详情信息
	 * @param divideAccountVo
	 * @param detailList
	 */
	private void replaceSmDivideAccountDetail(Date billDate, String billBatchNo, DivideAccountVo divideAccountVo,
			List<SmDivideAccountDetail> detailList) {
		Integer shopId = divideAccountVo.getShopId();
		SmDivideAccountDetail smDivideAccountDetail;
		Map<Integer, SmDivideAccountDetail> detailMap = new HashMap<>();
		for (SmDivideAccountDetail detail : detailList) {
			if (null != detail && null != detail.getShopId()) {
				detailMap.put(detail.getShopId(), detail);
			}
		}
		Integer orderType = divideAccountVo.getOrderType();
		if (!detailMap.containsKey(shopId)) {// 不同店铺，不同记录
			smDivideAccountDetail = new SmDivideAccountDetail();
			smDivideAccountDetail.setMallId(divideAccountVo.getMallId());
			smDivideAccountDetail.setShopId(shopId);
			smDivideAccountDetail.setOrderNum(DivideAccountConstant.ORDER_NUM);
			smDivideAccountDetail.setBillBatchNo(billBatchNo);
			smDivideAccountDetail.setBillDate(billDate);
			if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(orderType)) {// 商品订单
				smDivideAccountDetail
						.setPayAmount(AmountUtil.changYuanToFen(divideAccountVo.getTotalAmount().doubleValue()));
				smDivideAccountDetail.setUnitNum(divideAccountVo.getTotalQuantity());
			} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(orderType)) {// 卡券订单
				smDivideAccountDetail.setPayAmount(divideAccountVo.getUnitPrice());
				smDivideAccountDetail.setUnitNum(DivideAccountConstant.UNIT_NUM);
			}
			detailList.add(smDivideAccountDetail);
		} else {// 同一店铺，只记录一条记录
			smDivideAccountDetail = detailMap.get(shopId);
			smDivideAccountDetail.setOrderNum(smDivideAccountDetail.getOrderNum() + DivideAccountConstant.ORDER_NUM);
			if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(orderType)) {// 商品订单
				smDivideAccountDetail.setPayAmount(smDivideAccountDetail.getPayAmount()
						+ AmountUtil.changYuanToFen(divideAccountVo.getTotalAmount().doubleValue()));
				smDivideAccountDetail
						.setUnitNum(smDivideAccountDetail.getUnitNum() + divideAccountVo.getTotalQuantity());
			} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(orderType)) {// 卡券订单
				smDivideAccountDetail
						.setPayAmount(smDivideAccountDetail.getPayAmount() + divideAccountVo.getUnitPrice());
				smDivideAccountDetail.setUnitNum(smDivideAccountDetail.getUnitNum() + DivideAccountConstant.UNIT_NUM);
			}
			detailMap.put(shopId, smDivideAccountDetail);

			detailList = new ArrayList<>(detailMap.values());
		}
	}

	/**
	 * @Description 填充分账信息，分账详情信息
	 * @param divideAccountList
	 * @param smDivideAccountList
	 * @param smDivideAccountDetailList
	 */
	private void addSmDivideAccount(List<DivideAccountVo> divideAccountList) {
		if (CollectionUtils.isNotEmpty(divideAccountList)) {// 商品、卡券订单集合
			// 分账信息map
			Map<Integer, SmDivideAccount> mallMap = new HashMap<>();
			// 分账详情信息map
			Map<Integer, List<SmDivideAccountDetail>> shopMap = new HashMap<>();
			// 账期，前一天
			Date billDate = DateUtils.getYesterdayDate();
			String dateStr = DateUtils.getYesterdayDateSimpleStr();
			// 循环订单集合，分别初始化账单信息、账单详情信息
			Integer num = DivideAccountConstant.BILL_BATCH_NO_DEFAULT;
			for (DivideAccountVo vo : divideAccountList) {
				if (null != vo && null != vo.getShopId() && null != vo.getMallId()) {
					Integer mallId = vo.getMallId();
					String billBatchNo;
					if (mallMap.containsKey(mallId)) {
						billBatchNo = mallMap.get(mallId).getBillBatchNo();
					} else {
						billBatchNo = this.getBillBatchNo(dateStr, num);
						num++;
					}
					// 填充分账信息, 分账详情信息
					this.fillDivideAccountMap(billDate, billBatchNo, vo, mallMap, shopMap);
				}
			}

			List<SmDivideAccount> smDivideAccountList = new ArrayList<>(mallMap.values());
			// 新增分账记录
			this.batchAddDivideAccount(smDivideAccountList, shopMap);
		}
	}

	/**
	 * @Description 根据shopId查询mallId
	 * @param divideAccountDto
	 * @return
	 */
	private List<DivideAccountVo> initProductOrderList(DivideAccountDto divideAccountDto) {
		List<DivideAccountVo> productOrderList = smDivideAccountMapper.findProductOrderList(divideAccountDto);
		// 循环获取shopId
		// if (CollectionUtils.isNotEmpty(productOrderList)) {
		// List<Integer> shopIdList = new ArrayList<>();
		// for (DivideAccountVo vo : productOrderList) {
		// if (null != vo && null != vo.getShopId()) {
		// Integer shopId = vo.getShopId();
		// shopIdList.add(shopId);
		// }
		// }
		// TODO 调用接口，根据店铺ID查询商场ID
		// }
		return productOrderList;
	}

	/**
	 * @Description 根据店铺mongoID查询店铺ID，根据商场mongoID查询商场ID
	 * @param divideAccountDto
	 * @return
	 */
	private List<DivideAccountVo> initTradeOrderList(DivideAccountDto divideAccountDto) {
		List<DivideAccountVo> tradeOrderList = smDivideAccountMapper.findTradeOrderList(divideAccountDto);
		// 循环获取shopId
		// if (CollectionUtils.isNotEmpty(tradeOrderList)) {
		// List<String> shopIdList = new ArrayList<>();
		// List<String> mallIdList = new ArrayList<>();
		// for (DivideAccountVo vo : tradeOrderList) {
		// if (null != vo) {
		// String shopMid = vo.getShopMid();
		// String mallMid = vo.getMallMid();
		// if (StringUtils.isNotBlank(shopMid) &&
		// StringUtils.isNotBlank(mallMid)) {
		// shopIdList.add(shopMid);
		// mallIdList.add(mallMid);
		// }
		// }
		// }
		// TODO 调用接口，根据店铺mongoID查询店铺ID
		// TODO 调用接口，根据商场mongoID查询商场ID
		// }
		return tradeOrderList;
	}

	/**
	 * @Description 批量插入分账、分账详情
	 * @param smDivideAccountList
	 * @param smDivideAccountMap
	 */
	private void batchAddDivideAccount(List<SmDivideAccount> smDivideAccountList,
			Map<Integer, List<SmDivideAccountDetail>> smDivideAccountMap) {
		Map<Integer, Integer> acountKeyMap = new HashMap<>();
		List<SmDivideAccountDetail> resultList = new ArrayList<>();
		for (SmDivideAccount sm : smDivideAccountList) {
			smDivideAccountMapper.insertSelective(sm);
			acountKeyMap.put(sm.getMallId(), sm.getId());
		}
		for (Map.Entry<Integer, List<SmDivideAccountDetail>> entry : smDivideAccountMap.entrySet()) {
			Integer mallId = entry.getKey();
			List<SmDivideAccountDetail> entryList = entry.getValue();
			for (SmDivideAccountDetail sm : entryList) {
				sm.setDivideAccountId(acountKeyMap.get(mallId));
			}
			resultList.addAll(entryList);
		}
		smDivideAccountDetailMapper.batchInsertSelective(resultList);
	}

	/**
	 * @Description 获取账单批次号
	 * @param dateStr
	 * @param num
	 * @return
	 */
	private String getBillBatchNo(String dateStr, Integer num) {
		return dateStr + String.format("%04d", num++);
	}

	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#export(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse, java.lang.Integer)
	 */
	public void export(HttpServletRequest request, HttpServletResponse response, Integer id) {
		SmDivideAccountDetail smDivideAccountDetail = smDivideAccountDetailMapper.selectByPrimaryKey(id);
		if (null == smDivideAccountDetail) {
			throw new BizException(CodeEnum.NOT_EXIST_DIVIDE_ACCOUNT);
		}

		DivideAccountDto divideAccountDto = new DivideAccountDto();
		divideAccountDto.setAccountDate(DateUtil.getDaysInAdd(smDivideAccountDetail.getBillDate(), 1));
		divideAccountDto.setShopId(smDivideAccountDetail.getShopId());
		divideAccountDto.setMallId(smDivideAccountDetail.getMallId());
		// 查询前一天B端商品订单
		List<DivideAccountVo> orderList = this.findOrderList(divideAccountDto);

		// 导出邀请码
		this.doExport(request, response, orderList);
	}

	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#exportAll(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse, java.lang.Integer)
	 */
	public void exportAll(HttpServletRequest request, HttpServletResponse response, Integer divideAccountId) {
		SmDivideAccount smDivideAccount = smDivideAccountMapper.selectByPrimaryKey(divideAccountId);
		if (null == smDivideAccount) {
			throw new BizException(CodeEnum.NOT_EXIST_DIVIDE_ACCOUNT);
		}

		DivideAccountDto divideAccountDto = new DivideAccountDto();
		divideAccountDto.setAccountDate(DateUtil.getDaysInAdd(smDivideAccount.getBillDate(), 1));
		divideAccountDto.setMallId(smDivideAccount.getMallId());
		// 查询前一天B端商品订单
		List<DivideAccountVo> orderList = this.findOrderList(divideAccountDto);

		// 导出邀请码
		this.doExport(request, response, orderList);
	}

	private void doExport(HttpServletRequest request, HttpServletResponse response,
			List<DivideAccountVo> divideAccoutList) {
		String path = request.getSession().getServletContext().getRealPath(File.separator);
		InputStream myxls;
		XSSFWorkbook wb;
		XSSFSheet sheet;
		try {
			myxls = new FileInputStream(path + "excel/DivideAccount.xlsx");
			wb = new XSSFWorkbook(myxls);
			sheet = wb.getSheetAt(0);
		} catch (Exception e1) {
			log.error("导出邀请码, 生成xlsx异常,doExport-DivideAccount.xlsx:" + "\n" + e1);
			throw new BizException(CodeEnum.FAIL_GENERATE_XML);
		}
		try {
			// 初始化邀请码
			this.initDivideAccountExport(sheet, divideAccoutList);
			// 导出名称
			String outFile = "分账详情" + DateUtil.getCurrentDateYYYYMMDD() + ".xlsx";

			ExcelUtil.exportExcel(response, wb, outFile);
		} catch (Exception e) {
			log.error("导出邀请码异常,doExport divideAccoutList:" + "\n" + e);
			throw new BizException(CodeEnum.ERROR_SYSTEM);
		}
	}

	private void initDivideAccountExport(XSSFSheet sheet, List<DivideAccountVo> divideAccoutList) {
		int titleRow = 0;
		for (DivideAccountVo vo : divideAccoutList) {
			sheet.createRow(++titleRow);
			int column = 0;
			sheet.getRow(titleRow).createCell(column++).setCellValue(vo.getMallName());
			sheet.getRow(titleRow).createCell(column++).setCellValue(vo.getShopName());
			sheet.getRow(titleRow).createCell(column++).setCellValue(vo.getOrderNo());
			sheet.getRow(titleRow).createCell(column++).setCellValue(DateUtils.formateDateFull(vo.getFinishTime()));
			Integer unitNum = 0;
			String settleAmount = "";
			Integer orderType = vo.getOrderType();
			String orderTypeName = DivideAccountConstant.orderTypeMap.get(orderType);
			if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(orderType)) {
				unitNum = vo.getTotalQuantity();
				settleAmount = vo.getTotalAmount().toString();
			} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(vo.getOrderType())) {
				unitNum = DivideAccountConstant.UNIT_NUM;
				settleAmount = String.valueOf(AmountUtil.changFenToYuan(vo.getUnitPrice()));
			}
			sheet.getRow(titleRow).createCell(column++).setCellValue(orderTypeName);
			sheet.getRow(titleRow).createCell(column++).setCellValue(unitNum);
			sheet.getRow(titleRow).createCell(column++).setCellValue(settleAmount);
		}
	}

}
