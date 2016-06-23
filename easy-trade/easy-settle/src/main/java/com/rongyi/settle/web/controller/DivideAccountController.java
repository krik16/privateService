package com.rongyi.settle.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.dto.DivideAccountDto;

@Controller
@RequestMapping("/divide")
public class DivideAccountController extends BaseController {

	private Integer pageSize = ConstantEnum.PAGE_SIZE.getCodeInt();// 分页大小
	
	private Integer currentPage = ConstantEnum.CURRENT_PAGE.getCodeInt();// 当前页数
	
	/**
	 * 查询分账列表
	 * @param divideAccountDto
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public ResponseVO list(DivideAccountDto divideAccountDto) {
		ResponseVO responseVo = new ResponseVO();
		if (null == divideAccountDto) {
			divideAccountDto = new DivideAccountDto();
		}
		
		this.fillPaginate(pageSize, currentPage, divideAccountDto);
		return responseVo;
	}
	
	/**
	 * 查询分账详情列表
	 * @param divideAccountDto
	 * @return
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
	 * @return
	 */
	@RequestMapping(value = "/export", method = RequestMethod.POST)
	@ResponseBody
	public ResponseVO export(DivideAccountDto divideAccountDto) {
		ResponseVO responseVo = new ResponseVO();
		return responseVo;
	}
	
	/**
	 * 查询分账详情列表
	 * @param divideAccountDto
	 * @return
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
//		if (null == pageSize) {
			divideAccountDto.setPageSize(pageSize);
//		}
//		if (null == currentPage) {
			divideAccountDto.setCurrentPage(currentPage);
//		}
	}
}
