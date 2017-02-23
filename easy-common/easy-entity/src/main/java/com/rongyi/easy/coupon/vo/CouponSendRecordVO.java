package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.CouponBatchEntity;
import com.rongyi.easy.coupon.entity.CouponSendRecordEntity;

import java.util.List;

/**
 * Description:
 * Author: yb
 * DATE: 2017/2/9 10:20
 * Package:com.rongyi.easy.coupon.vo
 * Project:message-center
 */
public class CouponSendRecordVO extends CouponSendRecordEntity {
    private List<CouponBatchEntity> couponBatchEntities;

    public List<CouponBatchEntity> getCouponBatchEntities() {
        return couponBatchEntities;
    }

    public void setCouponBatchEntities(List<CouponBatchEntity> couponBatchEntities) {
        this.couponBatchEntities = couponBatchEntities;
    }

    public CouponSendRecordVO() {
        this.couponBatchEntities = couponBatchEntities;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CouponSendRecordVO{");
        sb.append("couponBatchEntities=").append(super.toString()).append(couponBatchEntities);
        sb.append('}');
        return sb.toString();
    }

    public static CouponSendRecordVO parese(CouponSendRecordEntity couponSendRecordEntity) {
        CouponSendRecordVO couponSendRecordVO = new CouponSendRecordVO();
        couponSendRecordVO.setPhone(couponSendRecordEntity.getPhone());
        couponSendRecordVO.setAcceptName(couponSendRecordEntity.getAcceptName());
        couponSendRecordVO.setEmail(couponSendRecordEntity.getEmail());
        couponSendRecordVO.setId(couponSendRecordEntity.getId());
        couponSendRecordVO.setBatchNo(couponSendRecordEntity.getBatchNo());
        couponSendRecordVO.setSendNum(couponSendRecordEntity.getSendNum());
        return couponSendRecordVO;
    }
}
