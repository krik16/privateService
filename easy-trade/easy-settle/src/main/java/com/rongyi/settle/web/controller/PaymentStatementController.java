/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年9月21日上午11:15:53
 * @Description: TODO
 **/

package com.rongyi.settle.web.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.constants.ResponseData;
import com.rongyi.settle.excel.ExportDataToExcel;
import com.rongyi.settle.excel.ExportFinanceVerifyExcel;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.PaymentStatementService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.DateUtils;

/**
 * @Author: 柯军
 * @Description: 对账单列表
 * @datetime:2015年9月21日上午11:15:53
 **/
@Controller
@RequestMapping("/paymentStatement")
public class PaymentStatementController {

	Logger logger = LoggerFactory.getLogger(PaymentStatementController.class);

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
	private ROAShopService roaShopService;

	@Autowired
	ExportFinanceVerifyExcel exportFinanceVerifyExcel;

	/**
	 * @param map
	 * @return
	 * @Description: 对账单列表（包括所有列表，审核列表，商家对账单列表）
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午3:01:04
	 **/
	@RequestMapping("/list")
	@ResponseBody
	public ResponseData list(@RequestBody Map<String, Object> map) {
		try {
			Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
			setValdateMap(map);
			List<PaymentStatementDto> list = paymentStatementService.selectPageList(map, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt());
			Integer count = paymentStatementService.selectPageListCount(map);
			return ResponseData.success(list, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt(), count);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.FIAL_STATEMENT_LIST.getCodeInt(), CodeEnum.FIAL_STATEMENT_LIST.getValueStr());
		}
	}

	private void setValdateMap(Map<String, Object> map) {
		Integer searchType = Integer.valueOf(map.get("searchType").toString());
		Integer searchStatus = Integer.valueOf(map.get("searchStatus").toString());
		List<Byte> statusList = new ArrayList<Byte>();
		switch (searchType) {
		case 0:// 查询对账单列表
			if (searchStatus == 1)// 待确认列表
				statusList.add((byte) 5);
			break;
		case 1:// 查询对账单审核列表
			statusList.add((byte) 0);
		case 2:// 查询待付款审核列表
			statusList.add((byte) 4);
		case 3:// 查询付款清单列表
			statusList.add((byte) 6);
			List<Byte> payChannelList = new ArrayList<Byte>();
			payChannelList.add((byte)3);
			payChannelList.add((byte)4);
			map.put("payChannelList", payChannelList);
		default:
			break;
		}
		if (statusList != null)
			map.put("statusList", statusList);
		
	}

	/**
	 * @param request
	 * @param map
	 * @return
	 * @Description: 对账单审核（代付款）
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午3:03:17
	 **/
	@RequestMapping("/verify")
	@ResponseBody
	public ResponseData verify(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		ResponseData result = null;
		try {
			// 获取用户
			String userId = "1";

			logger.info("============ 对账/代付款批量审核 =============");
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
			if (paymentStatementService.updatePaymentStatusByIds(ids, status, desc, userId)) {
				result = ResponseData.success();
			} else {
				result = ResponseData.failure(CodeEnum.FIAL_UPDATE_PAYMENT.getCodeInt(), CodeEnum.FIAL_UPDATE_PAYMENT.getValueStr());
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		logger.info(result.toString());
		return result;
	}

	/**
	 * @param request
	 * @param map
	 * @return
	 * @Description: 导出对账单明细（财务操作）
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午3:03:26
	 **/
	@RequestMapping("/exportFinanceExcel")
	public void exportFinanceExcel(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
		if (map == null)
			map = new HashMap<String, Object>();
		exportFinanceVerifyExcel.exportExcel(request, response, map);
	}

	/**
	 * @return
	 * @Description: 导出付款清单（财务操作）
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午3:03:26
	 **/
	@RequestMapping("/exportPaymentExcel")
	public ResponseData exportPaymentSchedule(Map<String, Object> map, HttpServletResponse response, HttpServletRequest request) {
		logger.info("导出付款清单参数>>>>>>>>>>>:map={}" + map);
		String ids = map.get("ids") == null ? null : map.get("ids").toString();
		ResponseData result;
		if (StringUtils.isBlank(ids)) {
			return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
		}
		exportDataToExcel.exportPaymentScheduleExcel(request, response, ids);
		result = ResponseData.success();
		return result;
	}

	/**
	 * @param request
	 * @param map
	 * @return
	 * @Description: 作废
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午3:04:09
	 **/
	@RequestMapping("/invalid")
	public ResponseData invalid(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		return null;
	}

	/**
	 * @param request
	 * @param map
	 * @return
	 * @Description: 商品订单查询(商家操作)
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午3:04:23
	 **/
	@RequestMapping("/merchandiseList")
	public ResponseData merchandiseList(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		return null;
	}

	/**
	 * @param request
	 * @param map
	 * @return
	 * @Description: 导出商品订单明细(商家操作)
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午3:04:46
	 **/
	@RequestMapping("exportMerchandiseExcel")
	public ResponseData exportMerchandiseExcel(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		return null;
	}

	/**
	 * @param request
	 * @param map
	 * @return
	 * @Description: 优惠券订单查询(商家操作)
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午3:05:09
	 **/
	@RequestMapping("/couponList")
	public ResponseData couponList(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		return null;
	}

	/**
	 * @param request
	 * @param map
	 * @return
	 * @Description: 导出优惠券订单明细(商家操作)
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午3:05:30
	 **/
	@RequestMapping("exportCouponExcel")
	public ResponseData exportCouponExcel(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		return null;
	}

	/**
	 * @Description: 生成对账单
	 **/
	@RequestMapping("/generate")
	@ResponseBody
	public ResponseData generate(@RequestBody Map<String, Object> map) {
		try {
			Integer id = Integer.valueOf(map.get("id").toString());
			paymentStatementService.generate(id);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		return ResponseData.success();
	}

	private String getFileName(String name, String date) {
		return "容易网商户对账单-" + name + "-" + date + ".xlsx";
	}

	/**
	 * @param map
	 * @return
	 * @Description: 对账单明细
	 * @Author: xgq
	 **/
	@RequestMapping("/info")
	public void export(@RequestBody Map<String, Object> map, HttpServletResponse response) {
		try {
			Integer id = Integer.valueOf(map.get("id").toString());
			PaymentStatement paymentStatement = paymentStatementService.get(id);
			StatementConfig statementConfig = statementConfigService.selectById(paymentStatement.getConfigId());
			String fileName = getFileName(statementConfig.getBussinessName(), DateUtils.getDateStr(paymentStatement.getCycleStartTime()));
			File f = new File(propertyConfigurer.getProperty("settle.file.path") + fileName);
			BufferedInputStream br = new BufferedInputStream(new FileInputStream(f));
			byte[] buf = new byte[2048];
			int len = 0;
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
		}
	}

	public String toUTF8(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 0 && c <= 255) {
				sb.append(c);
			} else {
				byte[] b;
				try {
					b = Character.toString(c).getBytes("utf-8");
				} catch (Exception ex) {
					System.out.println(ex);
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
