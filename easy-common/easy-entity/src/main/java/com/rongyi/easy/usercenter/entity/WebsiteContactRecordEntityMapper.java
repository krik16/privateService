package com.rongyi.easy.usercenter.entity;

import com.rongyi.easy.usercenter.entity.WebsiteContactRecordEntity;

public interface WebsiteContactRecordEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebsiteContactRecordEntity record);

    int insertSelective(WebsiteContactRecordEntity record);

    WebsiteContactRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebsiteContactRecordEntity record);

    int updateByPrimaryKey(WebsiteContactRecordEntity record);
}