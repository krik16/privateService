package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.coupon.entity.UserRedenvelope;

import java.io.Serializable;
import java.util.List;

/**
 * Description:大运营后台券码明细 vo
 * Author: 袁波
 * DATE: 2015/11/20 14:33
 * Package:com.rongyi.coupon.web.vo
 * Project:easy-common
 */
public class RedenvelopeCodeUseDetailVO implements Serializable{
    /**
     * 数据列表
     */
    private List<UserRedenvelope> userRedenvelopes;
    /**
     * 总数
     */
    private Integer totalCount;
    /**
     * 未领用
     */
    private Integer unReceiveCount;
    /**
     * 未使用
     */
    private Integer unUsedCount;
    /**
     * 已使用
     */
    private Integer usedCount;
    /**
     * 已过期
     */
    private Integer overdueCount;

    private Integer currentPage;

    private Integer pageSize;

    public List<UserRedenvelope> getUserRedenvelopes() {
        return userRedenvelopes;
    }

    public void setUserRedenvelopes(List<UserRedenvelope> userRedenvelopes) {
        this.userRedenvelopes = userRedenvelopes;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUnReceiveCount() {
        return unReceiveCount;
    }

    public void setUnReceiveCount(Integer unReceiveCount) {
        this.unReceiveCount = unReceiveCount;
    }

    public Integer getUnUsedCount() {
        return unUsedCount;
    }

    public void setUnUsedCount(Integer unUsedCount) {
        this.unUsedCount = unUsedCount;
    }

    public Integer getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    public Integer getOverdueCount() {
        return overdueCount;
    }

    public void setOverdueCount(Integer overdueCount) {
        this.overdueCount = overdueCount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RedenvelopeCodeUseDetailVO{");
        sb.append("userRedenvelopes=").append(userRedenvelopes);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", unReceiveCount=").append(unReceiveCount);
        sb.append(", unUsedCount=").append(unUsedCount);
        sb.append(", usedCount=").append(usedCount);
        sb.append(", overdueCount=").append(overdueCount);
        sb.append(", currentPage=").append(currentPage);
        sb.append(", pageSize=").append(pageSize);
        sb.append('}');
        return sb.toString();
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public RedenvelopeCodeUseDetailVO() {
    }

    public RedenvelopeCodeUseDetailVO(List<UserRedenvelope> userRedenvelopes, Integer totalCount, Integer unReceiveCount, Integer unUsedCount, Integer usedCount, Integer overdueCount) {
        this.userRedenvelopes = userRedenvelopes;
        this.totalCount = totalCount;
        this.unReceiveCount = unReceiveCount;
        this.unUsedCount = unUsedCount;
        this.usedCount = usedCount;
        this.overdueCount = overdueCount;
    }
}
