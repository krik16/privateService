package com.rongyi.easy.rmmm.entity;

import com.rongyi.easy.rmmm.entity.MalllifeUninstallRecordEntity;

public interface MalllifeUninstallRecordEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MalllifeUninstallRecordEntity record);

    int insertSelective(MalllifeUninstallRecordEntity record);

    MalllifeUninstallRecordEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MalllifeUninstallRecordEntity record);

    int updateByPrimaryKey(MalllifeUninstallRecordEntity record);
}