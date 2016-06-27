package com.rongyi.settle.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.rpb.dto.DivideAccountDto;
import com.rongyi.settle.constants.ConstantEnum;
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

	private Integer pageSize = ConstantEnum.PAGE_SIZE.getCodeInt();// 分页大小

	private Integer currentPage = ConstantEnum.CURRENT_PAGE.getCodeInt();// 当前页数

	@Resource
	private SmDivideAccountService smdivideAccountService;

	/**
	 * 查询分账列表
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public ResponseVO list(DivideAccountDto divideAccountDto) {
		if (null == divideAccountDto) {
			divideAccountDto = new DivideAccountDto();
		}
		this.fillPaginate(pageSize, currentPage, divideAccountDto);

		List<DivideAccountVo> resultList = smdivideAccountService.findPageList(divideAccountDto);
		return ResponseVO.success(resultList, currentPage, pageSize, resultList.size());
	}

	/**
	 * 查询分账详情
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ResponseVO detail(DivideAccountDto divideAccountDto) {
		ResponseVO responseVo = new ResponseVO();
		return responseVo;
	}

	/**
	 * 查询分账详情列表
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/detailList", method = RequestMethod.GET)
	@ResponseBody
	public ResponseVO detailList(DivideAccountDto divideAccountDto) {
		ResponseVO responseVo = new ResponseVO();
		return responseVo;
	}

	/**
	 * 导出店铺分账详情列表
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/export", method = RequestMethod.POST)
	@ResponseBody
	public ResponseVO export(DivideAccountDto divideAccountDto) {
		ResponseVO responseVo = new ResponseVO();
		return responseVo;
	}

	/**
	 * 导出商场所有店铺分账详情列表
	 * @param divideAccountDto
	 */
	@RequestMapping(value = "/exportAll", method = RequestMethod.POST)
	@ResponseBody
	public ResponseVO exportAll(DivideAccountDto divideAccountDto) {
		ResponseVO responseVo = new ResponseVO();
		return responseVo;
	}

	/**
	 * 填充分页参数
	 * @param pageSize
	 * @param currentPage
	 * @param divideAccountDto
	 */
	public void fillPaginate(Integer pageSize, Integer currentPage, DivideAccountDto divideAccountDto) {
		// if (null == pageSize) {
		divideAccountDto.setPageSize(pageSize);
		// }
		// if (null == currentPage) {
		divideAccountDto.setCurrentPage(currentPage);
		// }
	}
}
