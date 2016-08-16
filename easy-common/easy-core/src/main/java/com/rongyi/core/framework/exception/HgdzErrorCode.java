package com.rongyi.core.framework.exception;

/**
 * 异常定义
 *
 * @author wangjh7
 * @date 2016-08-04
 */
public enum HgdzErrorCode implements IErrorCode {

    // 错误类型
    PARAM_ERROR("00001", "参数错误"),
    REQUEST_ERROR("00002", "请求数据错误"),
    SYSTEM_ERROR("00099", "系统错误"),
    HGDZ_10000("10000", "成功"),
    HGDZ_20001("20001", "渠道 id 不存在"),
    HGDZ_20002("20002", "验签失败"),
    HGDZ_20003("20003", "订单 id 不能为空"),
    HGDZ_20005("20005", "券品种不存在"),
    HGDZ_20006("20006", "未找到合适的券码"),
    HGDZ_20008("20008", "城市编码不存在"),
    HGDZ_20010("20010", "城市不在券品种的可兑换城市之中"),
    HGDZ_30001("30001", "当前条件下未找到退码信息"),
    HGDZ_40001("40001", "批量请码数量不能超过 100"),
    HGDZ_90000("90000", "系统错误");

    private String errorCode;
    private String errorMsg;

    private HgdzErrorCode(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public static HgdzErrorCode getHgdzErrorCode(String errorCode) {
        switch (errorCode) {
            case "20001":
                return HGDZ_20001;
            case "20002":
                return HGDZ_20002;
            case "20003":
                return HGDZ_20003;
            case "20005":
                return HGDZ_20005;
            case "20006":
                return HGDZ_20006;
            case "20008":
                return HGDZ_20008;
            case "20010":
                return HGDZ_20010;
            case "30001":
                return HGDZ_30001;
            case "40001":
                return HGDZ_40001;
            default:
                return HGDZ_90000;
        }
    }

//        ,
//
}