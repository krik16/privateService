/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年9月21日上午11:15:53
 * @Description: TODO
 **/

package com.rongyi.settle.web.controller;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.constants.ResponseData;
import com.rongyi.settle.excel.ExportDataToExcel;
import com.rongyi.settle.excel.ExportFinanceVerifyExcel;
import com.rongyi.settle.service.AccessService;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.PaymentStatementService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.service.impl.PaymentStatementServiceImpl;
import com.rongyi.settle.service.impl.PaymentStatementServiceImpl.SettleConfigNotFoundException;
import com.rongyi.settle.util.DateUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.*;

/**
 * Author: 柯军
 * Description: 对账单列表
 * datetime:2015年9月21日上午11:15:53
 **/
@Controller
@RequestMapping("/paymentStatement")
public class PaymentStatementController extends BaseController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PaymentStatementController.class);

	@Autowired
	private PropertyConfigurer propertyConfigurer;

	@Autowired
	private PaymentStatementService paymentStatementService;

	@Autowired
	private StatementConfigService statementConfigService;

	@Autowired
	private BussinessInfoService bussinessInfoService;

	@Autowired
	private ExportDataToExcel exportDataToExcel;

	@Autowired
	ExportFinanceVerifyExcel exportFinanceVerifyExcel;

	@Autowired
	private AccessService accessService;

	/**
	 * param map
	 * return
	 * Description: 对账单列表（包括所有列表，审核列表，商家对账单列表）
	 * Author: 柯军
	 * datetime:2015年9月21日下午3:01:04
	 **/
	@RequestMapping("/list")
	@ResponseBody
	public ResponseData list(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		LOGGER.info("list map={}", map);
		try {
			Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
			Integer searchType = Integer.valueOf(map.get("searchType").toString());
			Integer searchStatus = -1;
			if (map.get("searchStatus") != null)
				searchStatus = Integer.valueOf(map.get("searchStatus").toString());
			List<Byte> statusList = new ArrayList<>();
			ResponseData responseData;
			switch (searchType) {
			case 0:// 查询对账单列表
				responseData = accessService.check(request, "FNC_STLBILL_VIEW");
				if (responseData.getMeta().getErrno() != 0) {
					return responseData;
				}
				if (searchStatus == 1)// 待确认列表
					statusList.add(ConstantEnum.STATUS_5.getCodeByte());
				break;
			case 1:// 查询对账单审核列表
				responseData = accessService.check(request, "FNC_STLBILLVFY_VIEW");
				if (responseData.getMeta().getErrno() != 0) {
					return responseData;
				}
				if (searchStatus == 0)
					statusList.add(ConstantEnum.STATUS_0.getCodeByte());
				if (searchStatus == 1) {
					statusList.add(ConstantEnum.STATUS_1.getCodeByte());
					statusList.add(ConstantEnum.STATUS_2.getCodeByte());
				}
				break;
			case 2:// 查询待付款审核列表
				responseData = accessService.check(request, "FNC_UNPVFY_VIEW");
				if (responseData.getMeta().getErrno() != 0) {
					return responseData;
				}
				if (searchStatus == 0) {
					map.put("predictPayTimeBegin", new Date());
					statusList.add(ConstantEnum.STATUS_4.getCodeByte());
				}else {
					statusList.add(ConstantEnum.STATUS_6.getCodeByte());
					statusList.add(ConstantEnum.STATUS_7.getCodeByte());
					statusList.add(ConstantEnum.STATUS_8.getCodeByte());
				}
				break;
			case 3:// 查询付款清单列表
				responseData = accessService.check(request, "FNC_PAYBILL_VIEW");
				if (responseData.getMeta().getErrno() != 0) {
					return responseData;
				}
				statusList.add(ConstantEnum.STATUS_6.getCodeByte());
				statusList.add(ConstantEnum.STATUS_11.getCodeByte());
				List<Byte> payChannelList = new ArrayList<>();
				payChannelList.add(ConstantEnum.STATUS_3.getCodeByte());
				payChannelList.add(ConstantEnum.STATUS_4.getCodeByte());
				map.put("payChannelList", payChannelList);
				// 操作日志查询
				map.put("op_model", 1);
				break;
			case 5:// 商家付款单列表
				responseData = accessService.checkMerchant(request, "FUND_CHECK_MGR");
				if (responseData.getMeta().getErrno() != 0) {
					return responseData;
				}
				map.put("bussinessAccount", getUserName(request));
				 if (searchStatus == 1) {// 待确认
					statusList.add(ConstantEnum.STATUS_1.getCodeByte());
					statusList.add(ConstantEnum.STATUS_3.getCodeByte());
				} else if (searchStatus == 2) {// 已确认
					statusList.add(ConstantEnum.STATUS_4.getCodeByte());
					// statusList.add(ConstantEnum.STATUS_12.getCodeByte());
				} else if (searchStatus == 3) {// 取消
					statusList.add(ConstantEnum.STATUS_5.getCodeByte());
					statusList.add(ConstantEnum.STATUS_7.getCodeByte());
					statusList.add(ConstantEnum.STATUS_8.getCodeByte());
				} else if (searchStatus == 4) {// 待付款
					statusList.add(ConstantEnum.STATUS_6.getCodeByte());
					statusList.add(ConstantEnum.STATUS_9.getCodeByte());
					statusList.add(ConstantEnum.STATUS_10.getCodeByte());
					statusList.add(ConstantEnum.STATUS_11.getCodeByte());
				} else if (searchStatus == 5) {// 待付款
					statusList.add(ConstantEnum.STATUS_12.getCodeByte());
				}
				break;
			default:
				responseData = accessService.check(request, "NO");
				if (responseData.getMeta().getErrno() != 0) {
					return responseData;
				}
				break;
			}
			if (!statusList.isEmpty())
				map.put("statusList", statusList);
			List<PaymentStatementDto> list;
			int count;
			LOGGER.info("query params map={}", map);
			if (searchType == 5) {
				list = paymentStatementService.selectPageListForMerchant(map, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt());
				count = paymentStatementService.selectPageListCountForMerchant(map);
				for (PaymentStatementDto paymentStatementDto : list) {
					if (paymentStatementDto.getPayMode() != null && paymentStatementDto.getPayMode().equals(ConstantEnum.PAY_MODE_1.getCodeByte())) {// 滚动日期
						if (paymentStatementDto.getRollType().equals(ConstantEnum.ROLL_TYPE_0.getCodeByte()) && !StringUtils.isEmpty(paymentStatementDto.getRollDay()))// 天
							paymentStatementDto
									.setPredictPayTime(DateUtil.getDaysInAdd(paymentStatementDto.getCreateAt(), Integer.valueOf(paymentStatementDto.getRollDay())));
						else if (paymentStatementDto.getRollType().equals(ConstantEnum.ROLL_TYPE_1.getCodeByte())
								&& !StringUtils.isEmpty(paymentStatementDto.getRollDay()))// 时
							paymentStatementDto
									.setPredictPayTime(DateUtil.addHours(paymentStatementDto.getCreateAt(), Integer.valueOf(paymentStatementDto.getRollDay())));
					}
				}
			} else {
				list = paymentStatementService.selectPageList(map, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt());
				count = paymentStatementService.selectPageListCount(map);
			}

			return ResponseData.success(list, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt(), count);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.FIAL_STATEMENT_LIST.getCodeInt(), CodeEnum.FIAL_STATEMENT_LIST.getValueStr());
		}
	}

	/**
	 * Description: 商家对账单不同状态总数
	 * param request
	 * param map
	 * return
	 * Author: 柯军
	 * datetime:2015年10月13日上午11:51:35
	 **/
	@RequestMapping("/bizListTotal")
	@ResponseBody
	public ResponseData bizListTotal(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		LOGGER.info("====bizListTotal====");
		ResponseData responseData;
		try {
			responseData = accessService.checkMerchant(request, "FUND_CHECK_MGR");
			if (responseData.getMeta().getErrno() != 0) {
				return responseData;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		if (map == null)
			map = new HashMap<>();
		map.put("bussinessAccount", getUserName(request));
		Map<String, Object> responseMap = new HashMap<>();
		List<Byte> statusList = new ArrayList<>();
		// statusList.add(ConstantEnum.STATUS_1.getCodeByte());
		// statusList.add(ConstantEnum.STATUS_3.getCodeByte());
		// statusList.add(ConstantEnum.STATUS_4.getCodeByte());
		// statusList.add(ConstantEnum.STATUS_5.getCodeByte());
		// statusList.add(ConstantEnum.STATUS_12.getCodeByte());
		// map.put("statusList", statusList);
		Integer allCount = paymentStatementService.selectPageListCountForMerchant(map);// 全部
		responseMap.put("allCount", allCount);
		statusList.clear();
		statusList.add(ConstantEnum.STATUS_1.getCodeByte());
		statusList.add(ConstantEnum.STATUS_3.getCodeByte());
		map.put("statusList", statusList);
		Integer unSureCount = paymentStatementService.selectPageListCountForMerchant(map);// 未确认
		responseMap.put("unSureCount", unSureCount);
		statusList.clear();
		statusList.add(ConstantEnum.STATUS_4.getCodeByte());
		map.put("statusList", statusList);
		Integer yesSureCount = paymentStatementService.selectPageListCountForMerchant(map);// 已确认
		responseMap.put("yesSureCount", yesSureCount);
		statusList.clear();
		statusList.add(ConstantEnum.STATUS_5.getCodeByte());
		statusList.add(ConstantEnum.STATUS_7.getCodeByte());
		statusList.add(ConstantEnum.STATUS_8.getCodeByte());
		map.put("statusList", statusList);
		Integer noSureCount = paymentStatementService.selectPageListCountForMerchant(map);// 取消
		responseMap.put("noSureCount", noSureCount);
		statusList.clear();
		statusList.add(ConstantEnum.STATUS_6.getCodeByte());
		statusList.add(ConstantEnum.STATUS_9.getCodeByte());
		statusList.add(ConstantEnum.STATUS_10.getCodeByte());
		statusList.add(ConstantEnum.STATUS_11.getCodeByte());
		map.put("statusList", statusList);
		Integer payingCount = paymentStatementService.selectPageListCountForMerchant(map);// 待付款
		responseMap.put("payingCount", payingCount);
		statusList.clear();
		statusList.add(ConstantEnum.STATUS_12.getCodeByte());
		map.put("statusList", statusList);
		Integer payedCount = paymentStatementService.selectPageListCountForMerchant(map);// 已付款
		responseMap.put("payedCount", payedCount);
		return ResponseData.success(responseMap);
	}

	/**
	 * param request
	 * param map
	 * return
	 * Description: 对账单审核（待付款）
	 * Author: 柯军
	 * datetime:2015年9月21日下午3:03:17
	 **/
	@RequestMapping("/verify")
	@ResponseBody
	public ResponseData verify(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		ResponseData result;
		try {

			LOGGER.info("verify map={}", map);
			String idStr = map.containsKey("ids") ? map.get("ids").toString() : null;
			Integer status = map.containsKey("status") ? Integer.valueOf(map.get("status").toString()) : null;
			String desc = map.containsKey("desc") ? map.get("desc").toString() : null;
			if (StringUtils.isBlank(idStr) || status == null) {
				return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
			}
			List<Integer> ids = new ArrayList<>();
			for (String id : idStr.split(",")) {
				ids.add(Integer.valueOf(id.trim()));
			}
			ResponseData responseData;
			if (status == 1 || status == 2) {//初始审核
				responseData = accessService.check(request, "FNC_STLCONF_VFY");
				if (responseData.getMeta().getErrno() != 0) {
					return responseData;
				}
			} else if (status == 4 || status == 5) {//商家审核
				responseData = accessService.checkMerchant(request, "FUND_CHECK_MGR");
				if (responseData.getMeta().getErrno() != 0) {
					return responseData;
				}
				for (Integer id : ids) {
					PaymentStatement paymentStatement = paymentStatementService.get(id);
					BussinessInfo bussinessInfo = bussinessInfoService.selectByConfigId(paymentStatement.getConfigId());
					if (!getUserName(request).equals(bussinessInfo.getBussinessAccount())) {
						LOGGER.error("商家账号只能审核对应的对账单。账号=" + getUserName(request) + " paymentStatementId=" + paymentStatement.getId());
						return ResponseData.failure(CodeEnum.FIAL_NO_AUTHORITY_PAYMENT.getCodeInt(), CodeEnum.FIAL_NO_AUTHORITY_PAYMENT.getValueStr());
					}
				}
			} else if (status == 6 || status == 7) {//财务审核
				responseData = accessService.check(request, "FNC_UNPVFY_VFY");
				if (responseData.getMeta().getErrno() != 0) {
					return responseData;
				}
			}
			if (paymentStatementService.updatePaymentStatusByIds(ids, status, desc, getUserName(request))) {
				result = ResponseData.success();
			} else {
				result = ResponseData.failure(CodeEnum.FIAL_UPDATE_PAYMENT.getCodeInt(), CodeEnum.FIAL_UPDATE_PAYMENT.getValueStr());
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		LOGGER.info(result.toString());
		return result;
	}

	/**
	 * param request
	 * param map
	 * return
	 * Description: 导出对账单明细（财务操作）
	 * Author: 柯军
	 * datetime:2015年9月21日下午3:03:26
	 **/
	@RequestMapping("/exportFinanceExcel")
	public ResponseData exportFinanceExcel(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String, Object> map) {
		LOGGER.info("exportFinanceExcel map=" + map);
		try {
			ResponseData responseData = accessService.check(request, "FNC_STLBILLVFY_EXPORT");
			if (responseData.getMeta().getErrno() != 0) {
				return responseData;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		if (map == null)
			map = new HashMap<>();
		exportFinanceVerifyExcel.exportExcel(request, response, map);
		return null;
	}

	/**
	 * return
	 * Description: 导出付款清单（财务操作）
	 * Author: 柯军
	 * datetime:2015年9月21日下午3:03:26
	 **/
	@RequestMapping("/exportPaymentExcel")
	public ResponseData exportPaymentSchedule(String ids, HttpServletResponse response, HttpServletRequest request) {
		LOGGER.info("exportPaymentExcel ids={}", ids);
		try {
			ResponseData responseData = accessService.check(request, "FNC_PAYBILL_DWON");
			if (responseData.getMeta().getErrno() != 0) {
				return responseData;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		if (StringUtils.isBlank(ids)) {
			return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
		}
		String[] idArray = ids.split(",");
		exportDataToExcel.exportPaymentScheduleExcel(request, response, idArray);
		return null;
	}

	/**
	 * param request
	 * param map
	 * return
	 * Description: 作废
	 * Author: 柯军
	 * datetime:2015年9月21日下午3:04:09
	 **/
	@RequestMapping("/invalid")
	@ResponseBody
	public ResponseData invalid(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		LOGGER.info("invalid map={}", map);
		try {
			ResponseData responseData = accessService.check(request, "FNC_UNPVFY_CANCEL");
			if (responseData.getMeta().getErrno() != 0) {
				return responseData;
			}
			Integer id = Integer.valueOf(map.get("id").toString());
			paymentStatementService.generate(id, getUserName(request));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		return ResponseData.success();
	}

	/**
	 * param request
	 * param map
	 * return
	 * Description: 商品订单查询(商家操作)
	 * Author: 柯军
	 * datetime:2015年9月21日下午3:04:23
	 **/
	@RequestMapping("/merchandiseList")
	public ResponseData merchandiseList() {
		return null;
	}

	/**
	 * param request
	 * param map
	 * return
	 * Description: 导出商品订单明细(商家操作)
	 * Author: 柯军
	 * datetime:2015年9月21日下午3:04:46
	 **/
	@RequestMapping("exportMerchandiseExcel")
	public ResponseData exportMerchandiseExcel() {
		return null;
	}

	/**
	 * param request
	 * param map
	 * return
	 * Description: 优惠券订单查询(商家操作)
	 * Author: 柯军
	 * datetime:2015年9月21日下午3:05:09
	 **/
	@RequestMapping("/couponList")
	public ResponseData couponList() {
		return null;
	}

	/**
	 * param request
	 * param map
	 * return
	 * Description: 导出优惠券订单明细(商家操作)
	 * Author: 柯军
	 * datetime:2015年9月21日下午3:05:30
	 **/
	@RequestMapping("exportCouponExcel")
	public ResponseData exportCouponExcel() {
		return null;
	}

	/**
	 * Description: 生成对账单
	 **/
	@RequestMapping("/generate")
	@ResponseBody
	public ResponseData generate(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		LOGGER.info("generate map={}", map);
		try {
			ResponseData responseData = accessService.check(request, "FNC_STLBILL_READD");
			if (responseData.getMeta().getErrno() != 0) {
				return responseData;
			}
			Integer id = Integer.valueOf(map.get("id").toString());
			paymentStatementService.generate(id, getUserName(request));
		} catch (SettleConfigNotFoundException sce) {
			return ResponseData.failure(CodeEnum.FIAL_CONFIG_NOT_FOUND.getCodeInt(), CodeEnum.FIAL_CONFIG_NOT_FOUND.getValueStr());
		} catch (PaymentStatementServiceImpl.StatementInvalidException sie) {
			return ResponseData.failure(CodeEnum.FIAL_STATEMENT_INVALID.getCodeInt(), CodeEnum.FIAL_STATEMENT_INVALID.getValueStr());
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		return ResponseData.success();

	}

	private String getFileName(String name,String ruleCode, String date) {
		return "容易网商户对账单-" + name.replaceAll(" ","").trim() + "-" + ruleCode.trim() + "-" + date + ".xlsx";
	}

	/**
	 * return
	 * Description: 对账单明细
	 * Author: xgq
	 **/
	@RequestMapping("/info")
	@ResponseBody
	public ResponseData info(String systemType, Integer id, HttpServletRequest request, HttpServletResponse response) {
		LOGGER.info("info systemType={},id={}", systemType, id);
		try {
			boolean isMerchant = systemType != null && systemType.equals("merchant");
			ResponseData responseData;
			if (isMerchant) {
				responseData = accessService.checkMerchant(request, "FUND_CHECK_MGR");
			} else {
				responseData = accessService.check(request, "FNC_STLBILL_DETAIL");
			}
			if (responseData.getMeta().getErrno() != 0) {
				return responseData;
			}
			PaymentStatement paymentStatement = paymentStatementService.get(id);
			StatementConfig statementConfig = statementConfigService.selectById(paymentStatement.getConfigId());
			BussinessInfo bussinessInfo = bussinessInfoService.selectByConfigId(paymentStatement.getConfigId());
			if (isMerchant && !getUserName(request).equals(bussinessInfo.getBussinessAccount())) {
				LOGGER.error("商家账号只能访问对应的对账单。账号=" + getUserName(request) + " paymentStatementId=" + paymentStatement.getId());
				return ResponseData.failure(CodeEnum.FIAL_NO_AUTHORITY_PAYMENT.getCodeInt(), CodeEnum.FIAL_NO_AUTHORITY_PAYMENT.getValueStr());
			}
			String fileName = getFileName(statementConfig.getBussinessName(),statementConfig.getRuleCode(), DateUtils.getDateStr(paymentStatement.getCycleStartTime()));
			File f = new File(propertyConfigurer.getProperty("settle.file.path") + statementConfig.getBussinessId() + "/" + fileName);
			BufferedInputStream br = new BufferedInputStream(new FileInputStream(f));
			byte[] buf = new byte[2048];
			int len;
			response.reset();
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment; filename=" + toUTF8(f.getName()));
			OutputStream out = response.getOutputStream();
			while ((len = br.read(buf)) > 0)
				out.write(buf, 0, len);
			out.flush();
			br.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		return ResponseData.success();
	}

	public String toUTF8(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c > 0 && c <= 255) {
				sb.append(c);
			} else {
				byte[] b;
				try {
					b = Character.toString(c).getBytes("utf-8");
				} catch (Exception ex) {
					LOGGER.error(ex.getMessage());
					b = new byte[0];
				}
				for (int j = 0; j < b.length; j++) {
					int k = b[j];
					if (k < 0)
						k += 256;
					sb.append("%" + Integer.toHexString(k).toUpperCase());
				}
			}
		}
		return sb.toString();
	}
}
