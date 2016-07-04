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
    public Integer findPageListCount(DivideAccountDto divideAccountDto);
    
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
    
    /**
     * @Description 查询分账信息
     * @param divideAccountDto
     * @return
     */
    public DivideAccountVo findDivideAccount(DivideAccountDto divideAccountDto);
    
    /**
     * @Description 根据mallMid查询mallId
     * @param mallMidList
     * @return
     */
    public List<Integer> findMallIdList(List<String> mallMidList);
    
    /**
     * @Description 查询账单集合 
     * @return
     */
    public List<DivideAccountVo> findDivideAccountList(DivideAccountDto divideAccountDto);
}