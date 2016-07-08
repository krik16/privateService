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
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.ExcelUtil;
import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.coupon.vo.CouponGeneralVO;
import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.MallVO;
import com.rongyi.easy.rpb.dto.DivideAccountDto;
import com.rongyi.easy.settle.entity.SmDivideAccount;
import com.rongyi.easy.settle.entity.SmDivideAccountDetail;
import com.rongyi.rss.bdata.MallService;
import com.rongyi.rss.bdata.ShopService;
import com.rongyi.rss.coupon.merchant.TradeCouponService;
import com.rongyi.rss.roa.ROAMallService;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.DivideAccountConstant;
import com.rongyi.settle.constants.UserInfoConstant;
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

	@Autowired
	private ROAMallService mallService;

//	@Autowired
//	private ROAShopService shopService;

	@Autowired
	private ShopService bdatashopService;

	@Autowired
	private MallService bdataMallService;

	/**
	 * @see com.rongyi.settle.service.DivideAccountService#findPageList(com.rongyi.settle.dto.DivideAccountDto)
	 */
	public List<DivideAccountVo> findPageList(DivideAccountDto divideAccountDto, SessionUserInfo sessionUserInfo) {
		List<String> mallMidList = this.getMallMidListByGroupId(sessionUserInfo);
		// 根据mallName，模糊查询mallMidList
		List<String> intersectMallMidList = this.intersectMallMidList(mallMidList, divideAccountDto.getMallName());
		if (CollectionUtils.isEmpty(intersectMallMidList)) {
			return new ArrayList<DivideAccountVo>();
		}
		divideAccountDto.setMallMidList(intersectMallMidList);
		
		List<DivideAccountVo> resultList = smDivideAccountMapper.findPageList(divideAccountDto);
		// 获取shopMids集合
		this.fillMallInfo(resultList);
		return resultList;
	}

	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#findPageListCount(com.rongyi.easy.rpb.dto.DivideAccountDto)
	 */
	public Integer findPageListCount(DivideAccountDto divideAccountDto, SessionUserInfo sessionUserInfo) {
		List<String> mallMidList = this.getMallMidListByGroupId(sessionUserInfo);
		// 根据mallName，模糊查询mallMidList
		List<String> intersectMallMidList = this.intersectMallMidList(mallMidList, divideAccountDto.getMallName());
		if (CollectionUtils.isEmpty(intersectMallMidList)) {
			return 0;
		}
		divideAccountDto.setMallMidList(mallMidList);
		return smDivideAccountMapper.findPageListCount(divideAccountDto);
	}

	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#findDivideAccount(com.rongyi.easy.rpb.dto.DivideAccountDto)
	 */
	public DivideAccountVo findDivideAccount(DivideAccountDto divideAccountDto) {
		DivideAccountVo divideAccountVo = smDivideAccountMapper.findDivideAccount(divideAccountDto);
		if (null != divideAccountVo && null != divideAccountVo.getMallMid()) {
			MallVO mallVo = this.getMallByMallMid(divideAccountVo.getMallMid());
			divideAccountVo.setMallName(mallVo.getName());
		}
		return divideAccountVo;
	}

	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#findDetailPageList(com.rongyi.easy.rpb.dto.DivideAccountDto)
	 */
	public List<DivideAccountVo> findDetailPageList(DivideAccountDto divideAccountDto) {
		List<DivideAccountVo> resultList = smDivideAccountDetailMapper.findDetailPageList(divideAccountDto);
		// 添加商场信息
		this.fillMallInfo(resultList);
		// 添加商铺信息
		this.fillShopInfo(resultList);
		return resultList;
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

		List<DivideAccountVo> divideAccountList = smDivideAccountMapper.findDivideAccountList(divideAccountDto);
		if (CollectionUtils.isNotEmpty(divideAccountList)) {
			log.info("分账定时器于" + DateUtils.formateDate(date) + "已生成账单");
			return;
		}
		// 查询前一天B端商品订单
		List<DivideAccountVo> orderList = this.findOrderList(divideAccountDto);
		// for循环结果集，增加分账记录、分账详情记录
		this.doBatchAddSmDivideAccount(orderList);
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

		return this.initExportInfo(productOrderList);
	}

	/**
	 * @Description 调用卡券接口，筛选出非通用券订单
	 * @param divideAccountVoList
	 */
	private List<DivideAccountVo> getNoUniveralCouponList(List<DivideAccountVo> divideAccountVoList) {
		List<DivideAccountVo> resultList = new ArrayList<>();
		// 筛选非通用券订单
		if (CollectionUtils.isNotEmpty(divideAccountVoList)) {
			List<String> couponIdList = new ArrayList<>();
			for (DivideAccountVo vo : divideAccountVoList) {
				if (null != vo && null != vo.getCouponId()) {
					String couponId = vo.getCouponId();
					couponIdList.add(couponId);
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
				List<String> couponEnableIdList = new ArrayList<>();// 非通用券couponId集合
				for (CouponGeneralVO vo : couponList) {
					if (null != vo && null != vo.getCouponId() && !vo.getIsGeneral()) {
						couponEnableIdList.add(vo.getCouponId());
					}
				}
				for (DivideAccountVo vo : divideAccountVoList) {
					if (null != vo && null != vo.getCouponId() && couponEnableIdList.contains(vo.getCouponId())) {
						resultList.add(vo);
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
			Map<String, SmDivideAccount> accountMap, Map<String, List<SmDivideAccountDetail>> accountDetailMap) {
		String mallMid = divideAccountVo.getMallMid();
		SmDivideAccount smDivideAccount = null;
		List<SmDivideAccountDetail> detailList = null;
		if (!accountMap.containsKey(mallMid)) {
			smDivideAccount = this.initSmDivideAccount(billDate, billBatchNo, divideAccountVo);// 初始化分账信息
			detailList = this.initSmDivdeAccountDetail(billDate, billBatchNo, divideAccountVo);// 初始化分账详情信息
		} else {
			smDivideAccount = accountMap.get(mallMid);
			this.replaceSmDivideAccount(divideAccountVo, smDivideAccount);// 更新分账详情信息

			detailList = accountDetailMap.get(mallMid);
			this.replaceSmDivideAccountDetail(billDate, billBatchNo, divideAccountVo, detailList);// 更新分账详情信息
		}
		accountMap.put(mallMid, smDivideAccount);
		accountDetailMap.put(mallMid, detailList);
	}

	/**
	 * @Description 初始化分账信息
	 * @param divideAccountVo
	 * @return
	 */
	private SmDivideAccount initSmDivideAccount(Date billDate, String billBatchNo, DivideAccountVo divideAccountVo) {
		SmDivideAccount smDivideAccount = new SmDivideAccount();
		smDivideAccount.setMallMid(divideAccountVo.getMallMid());
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
		smDivideAccountDetail.setMallMid(divideAccountVo.getMallMid());
		smDivideAccountDetail.setShopMid(divideAccountVo.getShopMid());
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
		String shopMid = divideAccountVo.getShopMid();
		SmDivideAccountDetail smDivideAccountDetail;
		Map<String, SmDivideAccountDetail> detailMap = new HashMap<>();
		for (SmDivideAccountDetail detail : detailList) {
			if (null != detail && null != detail.getShopMid()) {
				detailMap.put(detail.getShopMid(), detail);
			}
		}
		Integer orderType = divideAccountVo.getOrderType();
		if (!detailMap.containsKey(shopMid)) {// 不同店铺，不同记录
			smDivideAccountDetail = new SmDivideAccountDetail();
			smDivideAccountDetail.setMallMid(divideAccountVo.getMallMid());
			smDivideAccountDetail.setShopMid(shopMid);
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
			smDivideAccountDetail = detailMap.get(shopMid);
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
			detailMap.put(shopMid, smDivideAccountDetail);

			detailList = new ArrayList<>(detailMap.values());
		}
	}

	/**
	 * @Description 填充分账信息，分账详情信息
	 * @param divideAccountList
	 * @param smDivideAccountList
	 * @param smDivideAccountDetailList
	 */
	private void doBatchAddSmDivideAccount(List<DivideAccountVo> divideAccountList) {
		if (CollectionUtils.isNotEmpty(divideAccountList)) {// 商品、卡券订单集合
			// 分账信息map
			Map<String, SmDivideAccount> mallMap = new HashMap<>();
			// 分账详情信息map
			Map<String, List<SmDivideAccountDetail>> shopMap = new HashMap<>();
			// 账期，前一天
			Date billDate = DateUtils.getYesterdayDate();
			String dateStr = DateUtils.getYesterdayDateSimpleStr();
			// 循环订单集合，分别初始化账单信息、账单详情信息
			Integer num = DivideAccountConstant.BILL_BATCH_NO_DEFAULT;
			for (DivideAccountVo vo : divideAccountList) {
				String mallMid = vo.getMallMid();
				String billBatchNo;
				if (mallMap.containsKey(mallMid)) {
					billBatchNo = mallMap.get(mallMid).getBillBatchNo();
				} else {
					billBatchNo = this.getBillBatchNo(dateStr, num++);
				}
				// 填充分账信息, 分账详情信息
				this.fillDivideAccountMap(billDate, billBatchNo, vo, mallMap, shopMap);
			}

			List<SmDivideAccount> smDivideAccountList = new ArrayList<>(mallMap.values());
			// 新增分账记录
			this.doBatchAddDivideAccount(smDivideAccountList, shopMap);
		}
	}

	/**
	 * @Description 根据shopId查询mallId
	 * @param divideAccountDto
	 * @return
	 */
	private List<DivideAccountVo> initProductOrderList(DivideAccountDto divideAccountDto) {
		return smDivideAccountMapper.findProductOrderList(divideAccountDto);
	}

	/**
	 * @Description 根据店铺mongoID查询店铺ID，根据商场mongoID查询商场ID
	 * @param divideAccountDto
	 * @return
	 */
	private List<DivideAccountVo> initTradeOrderList(DivideAccountDto divideAccountDto) {
		return smDivideAccountMapper.findTradeOrderList(divideAccountDto);
	}

	/**
	 * @Description 批量插入分账、分账详情
	 * @param smDivideAccountList
	 * @param smDivideAccountMap
	 */
	private void doBatchAddDivideAccount(List<SmDivideAccount> smDivideAccountList,
			Map<String, List<SmDivideAccountDetail>> smDivideAccountMap) {
		if (CollectionUtils.isEmpty(smDivideAccountList)) {
			return;
		}
		Map<String, Integer> acountKeyMap = new HashMap<>();
		List<SmDivideAccountDetail> resultList = new ArrayList<>();
		for (SmDivideAccount sm : smDivideAccountList) {
			smDivideAccountMapper.insertSelective(sm);
			acountKeyMap.put(sm.getMallMid(), sm.getId());
		}
		for (Map.Entry<String, List<SmDivideAccountDetail>> entry : smDivideAccountMap.entrySet()) {
			String mallId = entry.getKey();
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
		divideAccountDto.setShopMid(smDivideAccountDetail.getShopMid());
		divideAccountDto.setMallMid(smDivideAccountDetail.getMallMid());
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
		divideAccountDto.setMallMid(smDivideAccount.getMallMid());
		
		List<String> shopMidList = new ArrayList<>();// 根据mallMid查询shopMidList
		List<DivideAccountVo> divideAccountVoList = smDivideAccountDetailMapper.findDetailList(divideAccountDto);
		for (DivideAccountVo vo:divideAccountVoList) {
			if (null != vo && StringUtils.isNotBlank(vo.getShopMid())) {
				shopMidList.add(vo.getShopMid());
			}
		}
		// 查询前一天B端商品订单
		List<DivideAccountVo> orderList;
		if (CollectionUtils.isEmpty(shopMidList)) {
			orderList = new ArrayList<>();
		} else {
			divideAccountDto.setShopMidList(shopMidList);
			orderList = this.findOrderList(divideAccountDto);
		}
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
			sheet.getRow(titleRow).createCell(column++).setCellValue(vo.getShopMid());
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

	private List<String> getMallMidListByGroupId(SessionUserInfo sessionUserInfo) {
		String bindingMid = sessionUserInfo.getBindingMid();
		Integer identity = sessionUserInfo.getIdentity();
		List<String> mallMidList = new ArrayList<>();
		log.info("账号类型identity=" + identity);
		if (UserInfoConstant.IDENTITY_GROUP.equals(identity)) {
			try {
				List<MallEntity> mallList = mallService.getMallEntitysByGroupId(bindingMid);
				for (MallEntity mall : mallList) {
					if (null != mall && null != mall.getId()) {
						mallMidList.add(mall.getId().toString());
					}
				}
			} catch (Exception e) {
				log.error("调用商场接口失败-roaMallService.getMallEntitysByGroupId，入参bindingMid：" + bindingMid, e);
				throw new BizException(CodeEnum.ERROR_SYSTEM);
			}
			if (CollectionUtils.isEmpty(mallMidList)) {
				log.error("查询商场集合为空，roaMallService.getMallEntitysByGroupId，入参bindingMid：" + bindingMid);
				throw new BizException(CodeEnum.MALL_NOT_EXIST);
			}
		} else if (UserInfoConstant.IDENTITY_MALL.equals(identity)) {
			mallMidList.add(bindingMid);
		}
		log.info("账号所拥有的商场：" + mallMidList);
		return mallMidList;
	}

//	private String getMallMidByShopMid(String shopMid) {
//		String id = "";
//		try {
//			ShopVO shopVo = shopService.getShopVOById(shopMid);
//			if (null != shopVo && StringUtils.isNotBlank(shopVo.getMall_id())) {
//				String mallMid = shopVo.getMall_id();
//				MallVO mallVo = mallService.getMallVOById(mallMid);
//				if (null != mallVo) {
//					id = mallVo.getId();
//				}
//			}
//		} catch (Exception e) {
//			log.error("调用店铺接口异常, SmDivideAccountServiceImpl.getMallMidByShopMid", e);
//		}
//		return id;
//	}

//	private MallVO getMallByShopMid(String shopMid) {
//		MallVO mallVo;
//		ShopVO shopVo;
//		try {
//			shopVo = shopService.getShopVOById(shopMid);
//		} catch (Exception e) {
//			log.error("调用店铺接口异常, SmDivideAccountServiceImpl.getShopVOById", e);
//			throw new BizException(CodeEnum.ERROR_SYSTEM);
//		}
//		if (null == shopVo || StringUtils.isBlank(shopVo.getMall_id())) {
//			throw new BizException(CodeEnum.SHOP_NOT_EXIST);
//		}
//
//		try {
//			String mallMid = shopVo.getMall_id();
//			mallVo = mallService.getMallVOById(mallMid);
//		} catch (Exception e) {
//			log.error("调用店铺接口异常, SmDivideAccountServiceImpl.getMallVOById", e);
//			throw new BizException(CodeEnum.ERROR_SYSTEM);
//		}
//		if (null == mallVo) {
//			throw new BizException(CodeEnum.MALL_NOT_EXIST);
//		}
//		return mallVo;
//	}

	private MallVO getMallByMallMid(String mallMid) {
		MallVO mallVo;
		try {
			mallVo = mallService.getMallVOById(mallMid);
		} catch (Exception e) {
			log.error("调用店铺接口异常, SmDivideAccountServiceImpl.getMallVOById", e);
			throw new BizException(CodeEnum.ERROR_SYSTEM);
		}
		if (null == mallVo) {
			throw new BizException(CodeEnum.MALL_NOT_EXIST);
		}
		return mallVo;
	}

	private List<DivideAccountVo> initExportInfo(List<DivideAccountVo> divideAccoutList) {
		List<DivideAccountVo> resultList = new ArrayList<>();
		StringBuilder shopSb = new StringBuilder();// 店铺ID
		StringBuilder mallSb = new StringBuilder();// 商场ID
		// 获取shopMids集合
		for (DivideAccountVo vo : divideAccoutList) {
			if (null != vo && StringUtils.isNotBlank(vo.getShopMid())) {
				shopSb.append(DivideAccountConstant.SEPARATE_COMMA).append(vo.getShopMid());
			}
		}
		// 根据shopMids，查询对应的店铺信息
		List<com.rongyi.easy.bdata.vo.ShopVO> shopList = new ArrayList<>();
		Map<String, com.rongyi.easy.bdata.vo.ShopVO> shopMap = new HashMap<>();
		if (null != shopSb && StringUtils.isNotBlank(shopSb.toString())) {
			List<com.rongyi.easy.bdata.vo.ShopVO> shopVoList = this.getShopVoList(shopSb.toString().substring(1));
			for (com.rongyi.easy.bdata.vo.ShopVO vo : shopVoList) {
				if (null != vo && StringUtils.isNotBlank(vo.getId()) && null != vo.getPosition()
						&& StringUtils.isNotBlank(vo.getPosition().getMallId())) {
					mallSb.append(DivideAccountConstant.SEPARATE_COMMA).append(vo.getPosition().getMallId());
					shopList.add(vo);
					shopMap.put(vo.getId(), vo);
				}
			}
		}
		// 根据shopList店铺信息，批量查询商场信息
		Map<String, com.rongyi.easy.bdata.vo.MallVO> mallMap = new HashMap<>();
		if (null != mallSb) {
			List<com.rongyi.easy.bdata.vo.MallVO> mallVoList = this.getMallVoList(mallSb.substring(1).toString());
			Map<String, com.rongyi.easy.bdata.vo.MallVO> mallVoMap = new HashMap<>();
			for (com.rongyi.easy.bdata.vo.MallVO vo : mallVoList) {
				if (null != vo && StringUtils.isNotBlank(vo.getId())) {
					mallVoMap.put(vo.getId(), vo);
				}
			}
			for (com.rongyi.easy.bdata.vo.ShopVO vo : shopList) {
				String shopMid = vo.getId();
				String mallMid = vo.getPosition().getMallId();
				if (mallVoMap.containsKey(mallMid)) {
					mallMap.put(shopMid, mallVoMap.get(mallMid));
				}
			}
		}
		// 循环商场map，删选匹配上的订单信息
		if (MapUtils.isNotEmpty(mallMap)) {
			for (DivideAccountVo vo : divideAccoutList) {
				String shopMid = vo.getShopMid();
				if (mallMap.containsKey(shopMid)) {
					com.rongyi.easy.bdata.vo.MallVO mallVo = mallMap.get(shopMid);
					vo.setMallMid(mallVo.getId());
					vo.setMallName(mallVo.getName());
					vo.setShopName(shopMap.get(shopMid).getName());
					resultList.add(vo);
				}
			}
		}
		return resultList;
	}

	/**
	 * @Description 根据shopMids，批量查询店铺信息
	 * @param shopMids
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<com.rongyi.easy.bdata.vo.ShopVO> getShopVoList(String shopMids) {
		List<com.rongyi.easy.bdata.vo.ShopVO> shopVoList = new ArrayList<>();
		try {
			ResponseVO vo = bdatashopService.getShopsByIds(shopMids);
			if (null != vo && null != vo.getResult() && null != vo.getResult().getData()) {
				shopVoList = (List<com.rongyi.easy.bdata.vo.ShopVO>) vo.getResult().getData();
			}
		} catch (Exception e) {
			log.error("调用店铺接口异常-bdatashopService.getShopsByIds，入参shopMids=" + shopMids.toString());
			throw new BizException(CodeEnum.ERROR_SYSTEM);
		}
		return shopVoList;
	}

	/**
	 * @Description 根据mallMids，批量查询商场信息
	 * @param mallMids
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<com.rongyi.easy.bdata.vo.MallVO> getMallVoList(String mallMids) {
		List<com.rongyi.easy.bdata.vo.MallVO> mallVoList = new ArrayList<>();
		try {
			ResponseVO vo = bdataMallService.getMallsByIds(mallMids);
			if (null != vo && null != vo.getResult() && null != vo.getResult().getData()) {
				mallVoList = (List<com.rongyi.easy.bdata.vo.MallVO>) vo.getResult().getData();
			}
		} catch (Exception e) {
			log.error("调用店铺接口异常-bdataMallService.getMallsByIds，入参mallMids=" + mallMids.toString());
			throw new BizException(CodeEnum.ERROR_SYSTEM);
		}
		return mallVoList;
	}
	
	/**
	 * @Description 获取用户能权限下的商场，和输入的商场名称集合的交集 
	 * @param mallMidList
	 * @param mallName
	 */
	private List<String> intersectMallMidList(List<String> mallMidList, String mallName) {
		if (StringUtils.isNotBlank(mallName)) {
			List<String> mallMidNameList = this.getMallMidListByMallName(mallName);
			if (CollectionUtils.isEmpty(mallMidNameList)) {// 商场不存在
				return new ArrayList<>();
			}
			// 并集
//			mallMidList.removeAll(mallMidNameList);
//			mallMidList.addAll(mallMidNameList);
			// 交集
			mallMidList.retainAll(mallMidNameList);
		}
		return mallMidList;
	}
	
	/**
	 * @Description 根据mallName，模糊查询mallId集合 
	 * @param mallName
	 * @return
	 */
	private List<String> getMallMidListByMallName(String mallName) {
		List<String> mallMidList = new ArrayList<>();
		List<com.rongyi.easy.bdata.vo.MallVO> mallVoList = this.getMallVoByMallName(mallName);
		if (CollectionUtils.isNotEmpty(mallVoList)) {
			for (com.rongyi.easy.bdata.vo.MallVO vo:mallVoList) {
				mallMidList.add(vo.getId());
			}
		}
		return mallMidList;
	}

	/**
	 * @Description 根据mallName，模糊查询MallVo集合 
	 * @param mallName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<com.rongyi.easy.bdata.vo.MallVO> getMallVoByMallName(String mallName) {
		List<com.rongyi.easy.bdata.vo.MallVO> mallVoList = new ArrayList<>();
		try {
			ResponseVO vo = bdataMallService.getMallList(mallName, 1, Integer.MAX_VALUE);
			if (null != vo && null != vo.getResult() && null != vo.getResult().getData()) {
				mallVoList = (List<com.rongyi.easy.bdata.vo.MallVO>) vo.getResult().getData();
			}
		} catch (Exception e) {
			log.error("调用店铺接口异常-bdataMallService.getMallList，入参mallName=" + mallName);
			throw new BizException(CodeEnum.ERROR_SYSTEM);
		}
		return mallVoList;
	}
	
	private void fillMallInfo(List<DivideAccountVo> divideAccountVoList) {
		if (CollectionUtils.isNotEmpty(divideAccountVoList)) {
			StringBuilder mallSb = new StringBuilder();// 商场ID
			for (DivideAccountVo vo : divideAccountVoList) {
				if (null != vo && StringUtils.isNotBlank(vo.getMallMid())) {
					mallSb.append(DivideAccountConstant.SEPARATE_COMMA).append(vo.getMallMid());
				}
			}
			if (null != mallSb && StringUtils.isNotBlank(mallSb.toString())) {
				List<com.rongyi.easy.bdata.vo.MallVO> mallVoList = this.getMallVoList(mallSb.substring(1).toString());
				if (CollectionUtils.isNotEmpty(mallVoList)) {
					Map<String, com.rongyi.easy.bdata.vo.MallVO> mallVoMap = new HashMap<>();
					for (com.rongyi.easy.bdata.vo.MallVO vo : mallVoList) {
						if (null != vo && StringUtils.isNotBlank(vo.getId())) {
							mallVoMap.put(vo.getId(), vo);
						}
					}
					for (DivideAccountVo vo : divideAccountVoList) {
						if (null != vo && StringUtils.isNotBlank(vo.getMallMid())) {
							String mallMid = vo.getMallMid();
							if (mallVoMap.containsKey(mallMid)) {
								vo.setMallName(mallVoMap.get(mallMid).getName());
							}
						}
					}
				}
			}
		}
	}
	
	private void fillShopInfo(List<DivideAccountVo> divideAccountVoList) {
		if (CollectionUtils.isNotEmpty(divideAccountVoList)) {
			StringBuilder shopSb = new StringBuilder();// 商场ID
			for (DivideAccountVo vo : divideAccountVoList) {
				if (null != vo && StringUtils.isNotBlank(vo.getShopMid())) {
					shopSb.append(DivideAccountConstant.SEPARATE_COMMA).append(vo.getShopMid());
				}
			}
			if (null != shopSb && StringUtils.isNotBlank(shopSb.toString())) {
				List<com.rongyi.easy.bdata.vo.ShopVO> shopVoList = this.getShopVoList(shopSb.substring(1).toString());
				if (CollectionUtils.isNotEmpty(shopVoList)) {
					Map<String, com.rongyi.easy.bdata.vo.ShopVO> shopVoMap = new HashMap<>();
					for (com.rongyi.easy.bdata.vo.ShopVO vo : shopVoList) {
						if (null != vo && StringUtils.isNotBlank(vo.getId())) {
							shopVoMap.put(vo.getId(), vo);
						}
					}
					for (DivideAccountVo vo : divideAccountVoList) {
						if (null != vo && StringUtils.isNotBlank(vo.getShopMid())) {
							String shopMid = vo.getShopMid();
							if (shopVoMap.containsKey(shopMid)) {
								vo.setShopName(shopVoMap.get(shopMid).getName());
							}
						}
					}
				}
			}
		}
	}
}