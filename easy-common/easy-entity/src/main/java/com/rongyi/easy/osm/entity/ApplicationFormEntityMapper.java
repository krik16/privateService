package com.rongyi.easy.osm.entity;

import com.rongyi.easy.osm.entity.ApplicationFormEntity;
import com.rongyi.easy.osm.entity.ApplicationFormEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationFormEntityMapper {
    int countByExample(ApplicationFormEntityExample example);

    int deleteByExample(ApplicationFormEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApplicationFormEntity record);

    int insertSelective(ApplicationFormEntity record);

    List<ApplicationFormEntity> selectByExampleWithBLOBs(ApplicationFormEntityExample example);

    List<ApplicationFormEntity> selectByExample(ApplicationFormEntityExample example);

    ApplicationFormEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApplicationFormEntity record, @Param("example") ApplicationFormEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") ApplicationFormEntity record, @Param("example") ApplicationFormEntityExample example);

    int updateByExample(@Param("record") ApplicationFormEntity record, @Param("example") ApplicationFormEntityExample example);

    int updateByPrimaryKeySelective(ApplicationFormEntity record);

    int updateByPrimaryKeyWithBLOBs(ApplicationFormEntity record);

    int updateByPrimaryKey(ApplicationFormEntity record);
}