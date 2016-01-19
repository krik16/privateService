//package com.rongyi.easy.rmmm.entity;
//
//import com.rongyi.easy.rmmm.entity.ShoppingCartEntity;
//import com.rongyi.easy.rmmm.entity.ShoppingCartEntityExample;
//import java.util.List;
//import org.apache.ibatis.annotations.Param;
//
//public interface ShoppingCartEntityMapper {
//    int countByExample(ShoppingCartEntityExample example);
//
//    int deleteByExample(ShoppingCartEntityExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(ShoppingCartEntity record);
//
//    int insertSelective(ShoppingCartEntity record);
//
//    List<ShoppingCartEntity> selectByExample(ShoppingCartEntityExample example);
//
//    ShoppingCartEntity selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") ShoppingCartEntity record, @Param("example") ShoppingCartEntityExample example);
//
//    int updateByExample(@Param("record") ShoppingCartEntity record, @Param("example") ShoppingCartEntityExample example);
//
//    int updateByPrimaryKeySelective(ShoppingCartEntity record);
//
//    int updateByPrimaryKey(ShoppingCartEntity record);
//}