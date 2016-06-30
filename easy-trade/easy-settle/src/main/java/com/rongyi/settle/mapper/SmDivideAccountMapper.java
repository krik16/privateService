package com.rongyi.settle.mapper;

import java.util.List;

import com.rongyi.easy.rpb.dto.DivideAccountDto;
import com.rongyi.easy.settle.entity.SmDivideAccount;
import com.rongyi.settle.vo.DivideAccountVo;

public interface SmDivideAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmDivideAccount record);

    int insertSelective(SmDivideAccount record);

    SmDivideAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmDivideAccount record);

    int updateByPrimaryKey(SmDivideAccount record);
    
    /**
     * @Description 分页查询分账列表
     * @param divideAccountDto
     * @return 分页列表
     */
    public List<DivideAccountVo> findPageList(DivideAccountDto divideAccountDto);
    
    /**
     * @Description 查询分账商品订单
     * @param divideAccountDto
     * @return List<DivideAccountVo> 
     */
    public List<DivideAccountVo> findProductOrderList(DivideAccountDto divideAccountDto);
    
    /**
     * @Description 查询分账卡券订单
     * @param divideAccountDto
     * @return List<DivideAccountVo>
     */
    public List<DivideAccountVo> findTradeOrderList(DivideAccountDto divideAccountDto);
    
    public DivideAccountVo findDivideAccount(DivideAccountDto divideAccountDto);
}