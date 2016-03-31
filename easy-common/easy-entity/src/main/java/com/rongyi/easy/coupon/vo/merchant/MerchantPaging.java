package com.rongyi.easy.coupon.vo.merchant;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.vo.merchant.StatisticsCountVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/9/11 14:10.
 */
public class MerchantPaging<T> implements Serializable {
    private StatisticsCountVO statisticsCountVO;//统计数据
    private PagingVO<T> pagingVO;//分页数据

    public PagingVO<T> getPagingVO() {
        return pagingVO;
    }

    public void setPagingVO(PagingVO<T> pagingVO) {
        this.pagingVO = pagingVO;
    }

    public StatisticsCountVO getStatisticsCountVO() {
        return statisticsCountVO;
    }

    public void setStatisticsCountVO(StatisticsCountVO statisticsCountVO) {
        this.statisticsCountVO = statisticsCountVO;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statisticsCountVO", statisticsCountVO).append("pagingVO", pagingVO).toString();
    }

    public MerchantPaging(StatisticsCountVO statisticsCountVO, PagingVO<T> pagingVO) {
        this.statisticsCountVO = statisticsCountVO;
        this.pagingVO = pagingVO;
    }

    public MerchantPaging() {
    }
}
