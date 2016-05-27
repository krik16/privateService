package com.rongyi.easy.usercenter.entity;

import com.rongyi.easy.usercenter.entity.ShareCouponRecordEntity;

public interface ShareCouponRecordEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareCouponRecordEntity record);

    int insertSelective(ShareCouponRecordEntity record);

    ShareCouponRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareCouponRecordEntity record);

    int updateByPrimaryKey(ShareCouponRecordEntity record);
}