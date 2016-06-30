package com.rongyi.settle.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rongyi.easy.rpb.dto.DivideAccountDto;
import com.rongyi.settle.vo.DivideAccountVo;

public interface SmDivideAccountService {

	/**
	 * 分页查询分账列表
	 * @param divideAccountDto
	 * @return
	 */
	public List<DivideAccountVo> findPageList(DivideAccountDto divideAccountDto);
	public Integer findPageListCount(DivideAccountDto divideAccountDto);

	/**
	 * 分页查询分账详情列表
	 * @param divideAccountDto
	 * @return
	 */
	public List<DivideAccountVo> findDetailPageList(DivideAccountDto divideAccountDto);
	
	public Integer findDetailPageListCount(DivideAccountDto divideAccountDto);

	public DivideAccountVo findDivideAccount(DivideAccountDto divideAccountDto);

	/**
	 * @Description 每日生成分账单
	 */
	public void batchGenerateDivideAccount();

	public void export(HttpServletRequest request, HttpServletResponse response, Integer id);
	
	public void exportAll(HttpServletRequest request, HttpServletResponse response, Integer divideAccountId);
}
