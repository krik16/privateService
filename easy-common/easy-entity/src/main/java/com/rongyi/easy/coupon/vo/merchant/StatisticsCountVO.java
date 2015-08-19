package com.rongyi.easy.coupon.vo.merchant;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Descriptions:卡券统计类
 * Created by 袁波
 * Created at 2015/8/19 16:19.
 */
public class StatisticsCountVO implements Serializable{
    /**全部*/
    private Integer total;
    /**已发布/审核成功*/
    private Integer done;
    /**待发布/待审核*/
    private Integer wait;
    /**已结束/审核失败*/
    private Integer over;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("total", total).append("done", done).append("wait", wait).append("over", over).toString();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getDone() {
        return done;
    }

    public void setDone(Integer done) {
        this.done = done;
    }

    public Integer getWait() {
        return wait;
    }

    public void setWait(Integer wait) {
        this.wait = wait;
    }

    public Integer getOver() {
        return over;
    }

    public void setOver(Integer over) {
        this.over = over;
    }
}
