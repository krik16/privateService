package com.rongyi.settle.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.rpb.dto.DivideAccountDto;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.exception.BizException;
import com.rongyi.settle.service.SmDivideAccountService;
import com.rongyi.settle.vo.DivideAccountVo;

/**
 * @Description 分账控制器
 * @author wudi
 * @date 2016年6月24日 上午11:22:29
 */
@Controller
@RequestMapping("/divide")
public class DivideAccountController extends BaseController {

	private static final Logger log = Logger.getLogger(DivideAccountController.class);

	@Resource
	private SmDivideAccountService smdivideAccountService;

	/**
	 * 查询分账列表
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public ResponseVO list(DivideAccountDto divideAccountDto) {
		this.fillPaginate(divideAccountDto);

		List<DivideAccountVo> resultList = smdivideAccountService.findPageList(divideAccountDto);
		return ResponseVO.success(resultList, divideAccountDto.getCurrentPage(), divideAccountDto.getPageSize(),
				resultList.size());
	}

	/**
	 * 查询分账详情
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ResponseVO detail(DivideAccountDto divideAccountDto) {
		DivideAccountVo divideAccountVo;
		try {
			this.validDetail(divideAccountDto);

			divideAccountVo = smdivideAccountService.findDivideAccount(divideAccountDto);
		} catch (BizException e) {
			return ResponseVO.failure(Integer.valueOf(e.getCode()), e.getErroMsg());
		}
		return ResponseVO.success(divideAccountVo);
	}

	/**
	 * 查询分账详情列表
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/detailList", method = RequestMethod.GET)
	@ResponseBody
	public ResponseVO detailList(DivideAccountDto divideAccountDto) {
		this.fillPaginate(divideAccountDto);

		List<DivideAccountVo> resultList = new ArrayList<>();
		if (null != divideAccountDto.getDivideAccountId()) {
			resultList = smdivideAccountService.findDetailPageList(divideAccountDto);
		}
		return ResponseVO.success(resultList, divideAccountDto.getCurrentPage(), divideAccountDto.getPageSize(),
				resultList.size());
	}

	/**
	 * @Description 导出店铺分账详情列表
	 * @param id
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/export", method = RequestMethod.GET)
	public void export(Integer id, HttpServletRequest request, HttpServletResponse response) {
		try {
			// 校验入参
			this.validExport(id);
			log.info("进入方法-DivideAccountController.export：" + id);

			// 导出邀请码
			smdivideAccountService.export(request, response, id);
		} catch (BizException e) {
			log.error("导出异常DivideAccountController.export, id：" + id + "\n" + e.getErroMsg());
		}
	}

	/**
	 * 导出商场所有店铺分账详情列表
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/exportAll", method = RequestMethod.GET)
	public void exportAll(Integer divideAccountId, HttpServletRequest request, HttpServletResponse response) {
		try {
			// 校验入参
			this.validExport(divideAccountId);
			log.info("进入方法-DivideAccountController.exportAll：" + divideAccountId);

			// 导出邀请码
			smdivideAccountService.exportAll(request, response, divideAccountId);
		} catch (BizException e) {
			log.error("导出异常DivideAccountController.exportAll, divideAccountId：" + divideAccountId + "\n"
					+ e.getErroMsg());
		}
	}

	/**
	 * 填充分页参数
	 * @param pageSize
	 * @param currentPage
	 * @param divideAccountDto
	 */
	public void fillPaginate(DivideAccountDto divideAccountDto) {
		if (null == divideAccountDto) {
			divideAccountDto = new DivideAccountDto();
		}
		if (null == divideAccountDto.getPageSize()) {
			divideAccountDto.setPageSize(PAGE_SIZE);
		}
		if (null == divideAccountDto.getCurrentPage()) {
			divideAccountDto.setCurrentPage(CURRENT_PAGE);
		}
	}

	private void validDetail(DivideAccountDto divideAccountDto) {
		if (null == divideAccountDto || null == divideAccountDto.getDivideAccountId()) {
			throw new BizException(CodeEnum.NO_PARAM);
		}
	}

	private void validExport(Integer id) {
		if (null == id) {
			throw new BizException(CodeEnum.NO_PARAM);
		}
	}

	/**
	 * 查询分账详情列表
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void test() {
		smdivideAccountService.batchGenerateDivideAccount();
	}
}
