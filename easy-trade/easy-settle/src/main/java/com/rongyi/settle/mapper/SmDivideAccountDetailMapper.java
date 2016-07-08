package com.rongyi.settle.mapper;

import java.util.List;

import com.rongyi.easy.rpb.dto.DivideAccountDto;
import com.rongyi.easy.settle.entity.SmDivideAccountDetail;
import com.rongyi.settle.vo.DivideAccountVo;

public interface SmDivideAccountDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmDivideAccountDetail record);

    int insertSelective(SmDivideAccountDetail record);

    SmDivideAccountDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmDivideAccountDetail record);

    int updateByPrimaryKey(SmDivideAccountDetail record);
    
    int batchInsertSelective(List<SmDivideAccountDetail> smDivideAccountDetailList);
    
    public List<DivideAccountVo> findDetailPageList(DivideAccountDto divideAccountDto);
    
    public List<DivideAccountVo> findDetailList(DivideAccountDto divideAccountDto);
    
    public Integer findDetailPageListCount(DivideAccountDto divideAccountDto);
}