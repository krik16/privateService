package com.rongyi.easy.tradecenter.vo;

import java.io.Serializable;

/**
 * @author chenjun
 * @date 2017/4/6 10:20
 */
public class RefundVO  implements Serializable {

    private static final long serialVersionUID = 1239546075225086027L;

    private String shopName;// 店铺名称
    private String shopId;// 店铺mysqlId
    private String shopMid;// 店铺monogId
    private String shopLogo;// 店铺logo
    private Integer refundStatus;// 退款状态 0：申请退款 1：退款中 2：拒绝退款 3：已退款 4：待买家发货 5：带卖家收货 6：退款关闭
}
