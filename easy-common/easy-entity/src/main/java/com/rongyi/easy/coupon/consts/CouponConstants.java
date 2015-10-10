package com.rongyi.easy.coupon.consts;

import java.util.Arrays;
import java.util.List;

/**
 * 卡券状态常量
 * Created by Breggor on 2015/6/24.
 */
public interface CouponConstants {

    /**
     * 使用状态: 未使用[1],已使用[2],已过期[3],退款中[4],已退款:[5] 最后2项冗余优惠券订单状态
     */
    interface UserCouponStatus {
        int NO_USE = 1;
        int USED = 2;
        int EXPIRED = 3;
        int REFUNDING = 4;
        int REFUNDED = 5;
    }


    /**
     * 交易状态:待付款[0], 已付款[1], 已取消[2], 已删除[3], 退款中[4], 已退款[5]
     */
    interface CouponOrderStatus {
        int NO_PAY = 0;
        int PAYED = 1;
        int CANCELED = 2;
        int DELETED = 3;
        int REFUNDING = 4;
        int REFUNDED = 5;
    }

    /**
     * 退款状态：未退款[0], 已退款[1]，退款中[2]
     */
    interface CouponOrderItemStatus {
        int NO_REFUND = 0;
        int REFUNDED = 1;
        int REFUNDING = 2;
    }

    /**
     * 订单OldOrderVO页面展示状态 status 0:待付款 , 2:已取消, 3:已删除, 4退款中, 5未消费, 6已退款, 7已过期, 8已使用
     */
    interface CouponOrderDisplayStatus {
        int NO_PAY = 0;
        int CANCELED = 2;
        int DELETED = 3;
        int REFUNDING = 4;
        int NO_USE = 5;
        int REFUNDED = 6;
        int EXPIRED = 7;
        int USED = 8;
    }


    /**
     * 随时退/过期退/免预约
     * [1,1,1] 1为支持，0为不支持。第一位：随时退、第二位：过期退 第三位： 免预约、第四位：不可退
     */
    List<Integer> AFTER_SALE_SERVICE = Arrays.asList(1, 0, 0, 0);


    /**
     * 卡券类型:代金券[0], 抵扣券[1], 红包[2]
     */
    interface COUPON_TYPE {
        //        String COUPON = "02";//代金券
//        String CASHCOUPON = "03";//红包
        int VOUCHER = 0;
        int REBATE = 1;
        int REDENVELOPE = 2;
    }


    /**
     * 状态: 待审核[0], 审核未通过[1], 审核通过[2]
     */
    interface CouponStatus {
        int NO_CHECK = 0;
        int CHECK_FAILURE = 1;
        int CHECK_SUCCESS = 2;
    }

}
