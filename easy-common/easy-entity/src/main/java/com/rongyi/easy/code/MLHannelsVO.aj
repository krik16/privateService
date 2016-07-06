package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波 
 * DATE: 2016/7/6 17:04
 * Package:com.rongyi.easy.code
 * Project:easy-market
 */
public aspect MLHannelsVO implements Serializable {
    /**
     * 错误状态 0：领取成功；1：推广码已经使用；2：无效的推广码；3：过期；4：超过领取限制;5:领取失败;6:系统异常
     */
    private Integer errorStatus;

    /**
     * 是否领取到了抵扣券 true 领取到；false 未领取到
     */
    private boolean hasReceiveDikou;

    /**
     * 领取结果 true 成功；false 失败
     */
    private boolean receiveResult;

    public Integer getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(Integer errorStatus) {
        this.errorStatus = errorStatus;
    }

    public boolean isHasReceiveDikou() {
        return hasReceiveDikou;
    }

    public void setHasReceiveDikou(boolean hasReceiveDikou) {
        this.hasReceiveDikou = hasReceiveDikou;
    }

    public boolean isReceiveResult() {
        return receiveResult;
    }

    public void setReceiveResult(boolean receiveResult) {
        this.receiveResult = receiveResult;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MLHannelsVO{");
        sb.append("errorStatus=").append(errorStatus);
        sb.append(", hasReceiveDikou=").append(hasReceiveDikou);
        sb.append(", receiveResult=").append(receiveResult);
        sb.append('}');
        return sb.toString();
    }
}
