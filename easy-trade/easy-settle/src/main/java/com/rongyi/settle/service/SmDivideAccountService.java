package com.rongyi.settle.service;

import java.util.List;

import com.rongyi.easy.rpb.dto.DivideAccountDto;
import com.rongyi.settle.vo.DivideAccountVo;

public interface SmDivideAccountService {

	/**
	 * 分页查询分账列表
	 * @param divideAccountDto
	 * @return
	 */
	public List<DivideAccountVo> findPageList(DivideAccountDto divideAccountDto);
	
	/**
	 * 分页查询分账详情列表
	 * @param divideAccountDto
	 * @return
	 */
	public List<DivideAccountVo> findDetailPageList(DivideAccountDto divideAccountDto);
	
	/**
	 * 每日生成分账单
	 * @Description
	 */
	public void generateDivideAccount();
}
