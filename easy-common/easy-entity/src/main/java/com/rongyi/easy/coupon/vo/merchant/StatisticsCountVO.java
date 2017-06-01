package com.rongyi.easy.coupon.vo.merchant;

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
    private Integer overed;

    private Integer stopped;

    private Integer uncheck;

    private Integer checkFailed;

    public Integer getStopped() {
        return stopped;
    }

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    public Integer getUncheck() {
        return uncheck;
    }

    public void setUncheck(Integer uncheck) {
        this.uncheck = uncheck;
    }

    public Integer getCheckFailed() {
        return checkFailed;
    }

    public void setCheckFailed(Integer checkFailed) {
        this.checkFailed = checkFailed;
    }

    public Integer getOvered() {
        return overed;
    }

    public void setOvered(Integer overed) {
        this.overed = overed;
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

    public StatisticsCountVO(Integer total, Integer done, Integer wait, Integer overed) {
        this.total = total;
        this.done = done;
        this.wait = wait;
        this.overed = overed;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StatisticsCountVO{");
        sb.append("total=").append(total);
        sb.append(", done=").append(done);
        sb.append(", wait=").append(wait);
        sb.append(", overed=").append(overed);
        sb.append(", stopped=").append(stopped);
        sb.append(", uncheck=").append(uncheck);
        sb.append(", checkFailed=").append(checkFailed);
        sb.append('}');
        return sb.toString();
    }

    public StatisticsCountVO() {
    }
}
