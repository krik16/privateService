package com.rongyi.easy.msgcenter.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/8/25.
 */
public class MLOldPushNewVo implements Serializable {
    /**
     * 错误状态 0：领取成功；1：当前不存在；2：无效的推广码；3：过期；4：超过领取限制;5:领取失败;6:系统异常
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

    /**
     * 是否获取到红包。true 获取到红包，false 没有获取到红包
     */
    private boolean hasReceiveRedenvolop;

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

    public boolean isHasReceiveRedenvolop() {
        return hasReceiveRedenvolop;
    }

    public void setHasReceiveRedenvolop(boolean hasReceiveRedenvolop) {
        this.hasReceiveRedenvolop = hasReceiveRedenvolop;
    }

    @Override
    public String toString() {
        return "MLOldPushNewVo{" +
                "errorStatus=" + errorStatus +
                ", hasReceiveDikou=" + hasReceiveDikou +
                ", receiveResult=" + receiveResult +
                ", hasReceiveRedenvolop=" + hasReceiveRedenvolop +
                '}';
    }
}
