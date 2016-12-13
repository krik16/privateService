package com.rongyi.tms.web.controller;

import base.util.excel.ExcelWriter;
import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.malllife.common.util.DateTool;
import com.rongyi.easy.malllife.vo.PagingVO;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.va.vo.VirtualAccountVO;
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.mallshop.user.ROAUserService;
import com.rongyi.rss.roa.ROAVirtualAccountGeneralService;
import com.rongyi.tms.constants.CodeEnum;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.*;
import com.rongyi.tms.service.BonusService;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.SalesCommissionService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * @Description 考核奖金 controller
 * @author 袁波
 * @date 2015年5月25日 下午9:57:57
 */
@Controller
@RequestMapping("/bonus")
public class BonusController extends BaseController {
	private static final Log LOGGER = LogFactory.getLog(BonusController.class);

	@Autowired
	private BonusService bonusService;

	@Autowired
	private ROAMalllifeUserService malllifeUserService;

	@Autowired
	private SalesCommissionAuditLogService commissionAuditLogService;

	@Autowired
	private SalesCommissionService commissionService;

	@Autowired
	private ROAVirtualAccountGeneralService vaService;

	@Autowired
	private ROAUserService userService;

	@Autowired
	private ROARedisService redisService;

	@RequestMapping("/search")
	public String searchIntegralComm(String module) {
		return "finance/bonus/bonus-search";
	}

	@RequestMapping(value = "/list")
	public String findByPage(BonusPageParam params, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {

		PagingVO<BonusVO> pagingvos = null;
		try {
			LOGGER.info("params:" + params);
			pagingvos = bonusService.findByPage(params);
		} catch (Exception e) {
			e.printStackTrace();
			modelMap.addAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
			modelMap.addAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
			pagingvos = new PagingVO<BonusVO>(15, 1, 0);
		}
		if (params.getStatus().equals("0")) {
			modelMap.addAttribute("checked", 1);
		} else {
			modelMap.addAttribute("checked", 2);
		}
		modelMap.addAttribute("list", pagingvos.getDataList());
		modelMap.addAttribute("currpage", pagingvos.getCurrentPage());
		modelMap.addAttribute("rowCont", pagingvos.getTotalPage());
		return "finance/bonus/bonus-search-list";
	}

	@RequestMapping(value = "update")
	@ResponseBody
	public ResponseResult updateBonus(BonusParam params, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		LOGGER.info("bonusParams:" + params);
		ResponseResult result = new ResponseResult();
		try {
			BonusVO vo = params.paramsToVO();
			UserInfo userInfo = this.getSessionUser(request, session);
			if (params.getId() != null && params.getSellerAccount() == null) {
				// 修改未填账号，不需要验证账号
				vo.setUpdateUser(userInfo.getUsername());
				int updateResult = bonusService.updateBonus(vo);
				if (updateResult > 0) {
					result.setSuccess(true);
				} else {
					result.setSuccess(false);
					result.setMessage(CodeEnum.ERROR_DATA.getMessage());
					result.setCode(CodeEnum.ERROR_DATA.getActionCode());
				}
			} else {
				Map<String, Object> verifyResultMap = this.verifyAccount(params.getSellerAccount(),params.getGuideType());
				if (verifyResultMap.get("code").equals("0")) {
					if (verifyResultMap.get("userId") != null) {
						vo.setSellerId(verifyResultMap.get("userId") + "");
						if (vo.getId() != 0) {
							vo.setUpdateUser(userInfo.getUsername());
						} else {
							vo.setCreateUser(userInfo.getUsername());
						}
						int updateResult = bonusService.updateBonus(vo);
						if (updateResult > 0) {
							result.setSuccess(true);
						} else {
							result.setSuccess(false);
							result.setMessage(CodeEnum.ERROR_DATA.getMessage());
							result.setCode(CodeEnum.ERROR_DATA.getActionCode());
						}
					} else {
						LOGGER.info("未取到userid!");
					}
				} else {
					result.setSuccess(false);
					result.setCode((String) verifyResultMap.get("code"));
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			LOGGER.info(exception);
			result.setSuccess(false);
			result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
			result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
		}
		return result;
	}

	@RequestMapping(value = "edit")
	public String edit(Integer id, ModelMap modelMap) {
		String returnViewString = "finance/bonus/bonus-edit";
		try {
			if (id != null) {
				BonusVO bonus = bonusService.getById(id);
				modelMap.addAttribute("bonus", bonus);
				LOGGER.info(bonus);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			LOGGER.info(exception);
			modelMap.addAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
			modelMap.addAttribute(Constant.VIEW_MSG.DETAIL, exception.getMessage());
			returnViewString = Constant.VIEW_MSG.ERROR;
		}
		return returnViewString;
	}

	@RequestMapping(value = "/check")
	@ResponseBody
	public ResponseResult checkCommission(CheckParam params, HttpSession session, HttpServletRequest request) {
		ResponseResult result = new ResponseResult();
		try {
			if (StringUtils.isBlank(params.getIds()) || params.getStatus() == null || (params.getStatus() == -1 && StringUtils.isBlank(params.getReason()))) {
				result.setCode(CodeEnum.ERROR_PARAM.getActionCode());
				result.setMessage(CodeEnum.ERROR_PARAM.getMessage());
				result.setSuccess(false);
			} else {
				UserInfo userInfo = this.getSessionUser(request, session);
				if (userInfo != null) {
					int updateResult = bonusService.batchUpdate(params, userInfo.getUsername());
					if (updateResult > 0) {
						result.setCode(CodeEnum.SUCCESS.getActionCode());
						result.setMessage(CodeEnum.SUCCESS.getMessage());
						result.setSuccess(true);
					} else {
						result.setCode(CodeEnum.ERROR_UPDATE.getActionCode());
						result.setMessage(CodeEnum.ERROR_UPDATE.getMessage());
						result.setSuccess(false);
					}
				} else {
					result.setCode(CodeEnum.ERROR_LOGIN.getActionCode());
					result.setMessage(CodeEnum.ERROR_LOGIN.getMessage());
					result.setSuccess(false);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.info(e);
			result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
			result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
			result.setSuccess(false);
		}
		return result;
	}

	@RequestMapping(value = "/upload")
	public String upload(HttpSession session, HttpServletRequest request) {
		return "finance/bonus/bonus-upload";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/uploadExcel")
	public String uploadExcel(@RequestParam(value = "file", required = false) MultipartFile file, HttpSession session, HttpServletRequest request, ModelMap model) {
		ResponseResult result = new ResponseResult();
		try {
			String path = request.getSession().getServletContext().getRealPath("upload");
			String fileName = file.getOriginalFilename();
			File targetFile = new File(path, fileName);
			if (!targetFile.exists()) {
				targetFile.mkdirs();
			}
			UserInfo info = this.getSessionUser(request, session);
			file.transferTo(targetFile);
			Map<String, Object> resultMap = this.addDataFromExcel(targetFile.getPath(), info.getUsername());
			if (!resultMap.isEmpty()) {
				List<BonusVO> bonusVOs = (List<BonusVO>) resultMap.get("success");
				List<BonusVO> readFailList = (List<BonusVO>) resultMap.get("fail");
				model.put("total", resultMap.get("total"));
				model.put("fail", readFailList.size());
				model.put("success", 0);
				int random = (int) (Math.random() * 10000);
				model.put("temp", random);
				redisService.setObject("uploadFailList-" + random, getJSONString(readFailList));
				LOGGER.info("总共" + resultMap.get("total") + "条记录，成功了:" + bonusVOs.size() + "条记录，失败了：" + readFailList.size());
				if (!bonusVOs.isEmpty()) {
					List<BonusVO> failList = this.batchInsertBonus(bonusVOs);
					failList.addAll(readFailList);
					// 把失败的记录存放在redis 缓存中
					redisService.setObject("uploadFailList-" + random, getJSONString(failList));
					model.put("fail", failList.size());
					model.put("success", (Integer) resultMap.get("total") - failList.size());
					result.setSuccess(true);
				}
			} else {
				result.setSuccess(false);
				result.setCode(CodeEnum.ERROR_EXCEL.getActionCode());
				result.setMessage(CodeEnum.ERROR_EXCEL.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
			result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
		}
		model.put("result", result);
		return "finance/bonus/bonus-upload";
	}

	@RequestMapping(value = "/detail")
	public String getBonusDetail(int id, HttpServletRequest request, ModelMap modelMap) {
		String returnView = "";
		try {
			LOGGER.info(id);
			if (id == 0) {
				request.setAttribute("msg", "参数传递有误！");
				returnView = Constant.VIEW_MSG.ERROR;
			} else {
				BonusVO bonus = bonusService.getById(id);
				SalesCommissionAuditLog auditLog = commissionAuditLogService.selectByCommissionId(id, 1);
				LOGGER.info(auditLog == null ? "没有审核记录" : (auditLog.getMemo() == null ? "审核通过，没有不通过理由" : auditLog.getMemo()));
				modelMap.addAttribute("bonus", bonus);
				modelMap.addAttribute("log", auditLog);
				returnView = "finance/bonus/bonus-detail";
			}
		} catch (Exception e) {
			LOGGER.error(e);
			request.setAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
			request.setAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
			returnView = Constant.VIEW_MSG.ERROR;
		}
		return returnView;
	}

	@RequestMapping(value = "downLoadFailList")
	public void downLoadFailList(Integer temp, HttpServletRequest request, HttpServletResponse response) {
		try {
			String jsonString = redisService.get("uploadFailList-" + temp);
			List<BonusVO> bonusVOs = new ArrayList<BonusVO>();
			JSONArray jsonArray = JSONArray.fromObject(jsonString.substring(1, jsonString.length() - 1).replaceAll("\\\\", ""));
			if (jsonArray != null && jsonArray.size() > 0) {
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObject = jsonArray.getJSONObject(i);
					BonusVO vo = new BonusVO();
					vo.setSellerAccount(jsonObject.getString("sellerAccount"));
					Object amountObject = jsonObject.get("amount");
					vo.setAmount(amountObject.equals("") ? null : new BigDecimal(amountObject.toString()));
					int typeint = jsonObject.getString("type").equals("奖励") ? 1 : (jsonObject.getString("type").equals("惩罚") ? 2 : 0);
					vo.setBonusType(typeint);
					vo.setMarks(jsonObject.getString("marks"));
					bonusVOs.add(vo);
					LOGGER.info(vo.toString());
				}
			}
			LOGGER.info("从缓存中取出的数据条数：" + bonusVOs.size());
			String fileName = new String("失败列表.xlsx".getBytes(), "ISO8859_1");
			// 设置response参数，可以打开下载页面
			response.reset();
			response.setContentType("application/vnd.ms-excel;charset=utf-8");
			response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
			OutputStream out = new BufferedOutputStream(response.getOutputStream());
			createRecordExcel(out, bonusVOs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "downLoadModel")
	public void downLoadModel(HttpServletRequest request, HttpServletResponse response) {
		try {
			String path = request.getSession().getServletContext().getRealPath("/") + "excel/model.xlsx";
			// 读到流中
			InputStream inStream = new FileInputStream(path);// 文件的存放路径
			// 设置输出的格式
			response.reset();
			response.setContentType("application/vnd.ms-excel;charset=utf-8");
			response.setHeader("Content-Disposition", "attachment;filename=model.xlsx");
			// 循环取出流中的数据
			byte[] b = new byte[1024];
			int len;

			while ((len = inStream.read(b)) > 0)
				response.getOutputStream().write(b, 0, len);
			inStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @Description 验证账号的正确性
	 * @author 袁波
	 * @param account
	 * @return map "code"=0 正常 code<0 不正常 正常的话"userId"存在且有值
	 */
	protected Map<String, Object> verifyAccount(String account, Integer guideType) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 验证账号的正确性
		try {
			if (StringUtils.isNotBlank(account)) {
				List<RmmmUserInfoEntity> userInfoVOList = userService.getUserListByPhone(account);
				if(CollectionUtils.isNotEmpty(userInfoVOList)){
					for (RmmmUserInfoEntity userInfoVO : userInfoVOList) {
						// 账号是否被停用
						if (userInfoVO.getIsDisabled() == 1) {
							// 账号被停用
							resultMap.put("code", CodeEnum.ERROR_ACCOUNT_TINGYONG.getActionCode());
						} else {
							// 验证账号是否冻结
							VirtualAccountVO vaVO = vaService.queryVirtualAccount(userInfoVO.getId() + "");
							if (vaVO == null) {
								// 账户不存在
								resultMap.put("code", CodeEnum.ERROR_VITURAL_ACCOUNT.getActionCode());
							} else if (vaVO.getIsSuspended()) {
								// 账号被冻结
								resultMap.put("code", CodeEnum.ERROR_ACCOUNT_DONGJIE.getActionCode());
							} else if (guideType.intValue() != userInfoVO.getType()){
								// 渠道不正确
								resultMap.put("code", CodeEnum.ERROR_ACCOUNT_DONGJIE.getActionCode());
							}else {
								resultMap.put("code", CodeEnum.SUCCESS.getActionCode());
								resultMap.put("userId", userInfoVO.getId());
								break;
							}
						}
					}
				}else {
					// 您输入的账号有误，请重新输入
					resultMap.put("code", CodeEnum.ERROR_ACCOUNT.getActionCode());
				}

			} else {
				// 参数传递有误
				resultMap.put("code", CodeEnum.ERROR_PARAM.getActionCode());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO TEST
		// resultMap.put("code", CodeEnum.SUCCESS.getActionCode());
		// resultMap.put("userId", "123");
		return resultMap;
	}

	/**
	 * 读取excel文件，然后把读出来的数据插入到数据库中
	 * 
	 * @Description
	 * @author 袁波
	 * @param url
	 *            excel地址
	 * @return map success 存放读取成功记录对象集合 error 存放失败行数
	 * @throws IOException
	 */
	protected Map<String, Object> addDataFromExcel(String url, String user) throws IOException {

		Map<String, Object> map = new HashMap<String, Object>();
		List<BonusVO> bonusVOs = new ArrayList<BonusVO>();
		List<BonusVO> errorList = new ArrayList<BonusVO>();
		try {
			InputStream is = new FileInputStream(url);
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
			XSSFSheet hssfSheet = xssfWorkbook.getSheetAt(0);
			if (hssfSheet == null) {
				return null;
			}
			// 循环行Row
			int totalRow = hssfSheet.getLastRowNum();
			LOGGER.info("excel 总共读到了:" + totalRow + "条记录");
			map.put("total", totalRow);
			if (totalRow < 5000) {
				LOGGER.info("开始循环读取excel表格数据！");
				for (int rowNum = 1; rowNum <= totalRow; rowNum++) {
					XSSFRow hssfRow = hssfSheet.getRow(rowNum);
					if (hssfRow == null) {
						continue;
					}
					// 循环列Cell
					// 0卖家账号 1类型 2金额 3备注
					BonusVO bonusVO = new BonusVO();
					String accountString = "";
					if (hssfRow.getCell(0).getCellType() == XSSFCell.CELL_TYPE_STRING) {
						accountString = hssfRow.getCell(0).getStringCellValue();
					} else if (hssfRow.getCell(0).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
						hssfRow.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
						accountString = hssfRow.getCell(0).getStringCellValue();
					}
					bonusVO.setSellerAccount(accountString);
					Integer guideType = 0;
					if ("商家".equals(hssfRow.getCell(4).getStringCellValue().trim())){
						guideType = 1;
					}else if ("买手".equals(hssfRow.getCell(4).getStringCellValue().trim())){
						guideType = 2;
					}
					Map<String, Object> verifuResultMap = this.verifyAccount(accountString,guideType);
					String code = (String) verifuResultMap.get("code");
					if (code.contains("-")) {
						// 账号验证不通过
						LOGGER.info("第" + rowNum + "行账号:" + accountString + "验证不通过");
						errorList.add(bonusVO);
						continue;
					}
					bonusVO.setSellerId(verifuResultMap.get("userId").toString());

					String styleString = hssfRow.getCell(1).getStringCellValue();
					if (StringUtils.isBlank(styleString) || (!styleString.equals("奖励") && !styleString.equals("惩罚"))) {
						LOGGER.info("第" + rowNum + "行考核方式传递错误");
						errorList.add(bonusVO);
						continue;
					}

					String operateType = hssfRow.getCell(2).getStringCellValue();
					if (StringUtils.isBlank(operateType) || (!operateType.equals("交易佣金") && !operateType.equals("验码佣金"))) {
						LOGGER.info("第" + rowNum + "行类型传递错误");
						errorList.add(bonusVO);
						continue;
					}

					int type = BonusParam.converterType(styleString, operateType);
					bonusVO.setBonusType(type);

					if (hssfRow.getCell(3).getCellType() != XSSFCell.CELL_TYPE_NUMERIC) {
						LOGGER.info("第" + rowNum + "行金额不是数字不正确");
						errorList.add(bonusVO);
						continue;
					}
					Double amount = hssfRow.getCell(3).getNumericCellValue();
					bonusVO.setAmount(new BigDecimal(amount));
					XSSFCell cell = hssfRow.getCell(5);
					if (cell != null) {
						String marksString = hssfRow.getCell(5).getStringCellValue();
						if (StringUtils.isNotBlank(marksString)) {
							bonusVO.setMarks(marksString);
						}
					}
					bonusVO.setCreateUser(user);
					LOGGER.info("第" + rowNum + "行数据对象bonus:" + bonusVO);
					bonusVO.setStatus(0);
					bonusVO.setGuideType(guideType);
					bonusVOs.add(bonusVO);
				}
			}
			map.put("success", bonusVOs);
			map.put("fail", errorList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 
	 * @Description
	 * @author 袁波
	 * @param vos
	 * @return 返回失败的记录
	 */
	protected List<BonusVO> batchInsertBonus(List<BonusVO> vos) {
		List<BonusVO> fail = new ArrayList<BonusVO>();
		int times = vos.size() % Constant.INSERTSIZE.SIZE == 0 ? vos.size() / Constant.INSERTSIZE.SIZE : (vos.size() / Constant.INSERTSIZE.SIZE + 1);
		for (int i = 0; i < times; i++) {
			List<BonusVO> newList = new ArrayList<BonusVO>();
			if ((vos.size() - i * Constant.INSERTSIZE.SIZE) > Constant.INSERTSIZE.SIZE) {
				newList = vos.subList(i * Constant.INSERTSIZE.SIZE, (i + 1) * Constant.INSERTSIZE.SIZE);
			} else {
				newList = vos.subList(i * Constant.INSERTSIZE.SIZE, vos.size());
			}
			int insertResult = bonusService.batchInsertBonus(newList);
			if (insertResult > 0) {
				// 插入成功！
			} else {
				// 插入失败！
				fail.addAll(newList);
			}
		}
		return fail;
	}

	/**
	 * 导出excel
	 * 
	 * @Description
	 * @author 袁波
	 * @param out
	 * @param vos
	 * @throws Exception
	 */
	protected void createRecordExcel(OutputStream out, List<BonusVO> vos) throws Exception {
		try {
			ExcelWriter excelWriter = new ExcelWriter(out, false);
			excelWriter.createSheet(DateTool.date2String(new Date(), DateTool.FORMAT_DATE_2));
			excelWriter.createRow(0);
			excelWriter.setCell(0, "卖家账号");
			excelWriter.setCell(1, "考核方式");
			excelWriter.setCell(2, "类型");
			excelWriter.setCell(3, "金额");
			excelWriter.setCell(4, "备注");
			int i = 1;
			for (BonusVO vo : vos) {
				excelWriter.createRow(i);
				excelWriter.setCell(0, vo.getSellerAccount() == null ? "" : vo.getSellerAccount());
				excelWriter.setCell(1, vo.getBonusType() == 0 ? "" : ((vo.getBonusType() == 1 || vo.getBonusType() == 3) ? "奖励" : "惩罚"));
				excelWriter.setCell(2, vo.getBonusType() == 0 ? "" : ((vo.getBonusType() == 1 || vo.getBonusType() == 2) ? "交易佣金" : "验码佣金"));
				excelWriter.setCell(3, vo.getAmount() == null ? "" : vo.getAmount().toString());
				excelWriter.setCell(4, vo.getMarks() == null ? "" : vo.getMarks());
				i++;
			}
			excelWriter.export();
		} catch (Exception e) {
			LOGGER.error("导出错误记录失败！", e);
		}

	}

	protected String getJSONString(List<BonusVO> vos) {
		JSONArray array = new JSONArray();
		for (BonusVO vo : vos) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sellerAccount", vo.getSellerAccount() == null ? "" : vo.getSellerAccount());
			map.put("type", vo.getBonusType() == 0 ? "" : (vo.getBonusType() == 1 ? "奖励" : "惩罚"));
			map.put("amount", vo.getAmount() == null ? "" : vo.getAmount());
			map.put("marks", vo.getMarks() == null ? "" : vo.getMarks());
			array.add(map);
		}
		return array.toString();
	}
}
