package com.rongyi.settle.mapper;


import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.PaymentStatement;

import java.util.List;
import java.util.Map;

public interface PaymentStatementMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(PaymentStatement record);

	int insertSelective(PaymentStatement record);

	PaymentStatement selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(PaymentStatement record);

	int updateByPrimaryKey(PaymentStatement record);

	/**
	 * 根据id集合批量修改对账单状态
	 * @param paramsMap
	 */
	void updateStatusByIds(Map<String, Object> paramsMap);

	List<PaymentStatementDto> selectPageList(Map<String, Object> paramsMap);
	Integer selectPageListCount(Map<String, Object> paramsMap);

	/**
	 * 通过对账单id查询对账单信息
	 * @param id
	 * @return
	 */
	PaymentStatementDto searchDtoById(Integer id);
}
