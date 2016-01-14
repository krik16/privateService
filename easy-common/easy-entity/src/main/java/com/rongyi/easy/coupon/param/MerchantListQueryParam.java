package com.rongyi.easy.coupon.param;

import com.rongyi.core.constant.Constants;
import com.rongyi.easy.page.FilterType;
import com.rongyi.easy.page.QueryFilter;
import com.rongyi.easy.page.QueryParam;
import com.rongyi.easy.page.ValueType;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/28 14:41.
 */
public class MerchantListQueryParam {
    private Integer couponType;
    private Integer status;
    private Date publishStartTime;
    private Date publishEndTime;
    private Date validStartTime;
    private Date validEndTime;
    private String like;
    private Date createStartTime;
    private Date createEndTime;

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPublishStartTime() {
        return publishStartTime;
    }

    public void setPublishStartTime(Date publishStartTime) {
        this.publishStartTime = publishStartTime;
    }

    public Date getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    public Date getPublishEndTime() {
        return publishEndTime;
    }

    public void setPublishEndTime(Date publishEndTime) {
        this.publishEndTime = publishEndTime;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("couponType", couponType).append("status", status).append("publishStartTime", publishStartTime).append("publishEndTime", publishEndTime).append("like", like).toString();
    }

    public QueryParam paramsToQueryParam() {
        List<QueryFilter> paramList = new ArrayList<>();
        if (this.getCouponType() != null) {
            QueryFilter filter = new QueryFilter("coupon_type", FilterType.EQUALS, ValueType.TINYINT, this.getCouponType(), Constants.FilterRelation.AND);
            paramList.add(filter);
        }
        if (this.getStatus() != null) {
            if (this.getStatus() == 2) {
                //已审核通过
                QueryFilter filter = new QueryFilter("status", FilterType.EQUALS, ValueType.TINYINT, this.getStatus(), Constants.FilterRelation.AND);
                paramList.add(filter);
            }
            if (this.getStatus() == 1) {
                //已审核不通过
                QueryFilter filter = new QueryFilter("status", FilterType.EQUALS, ValueType.TINYINT, this.getStatus(), Constants.FilterRelation.AND);
                paramList.add(filter);
            }
            if (this.getStatus() == 0) {
                //已审核不通过
                QueryFilter filter = new QueryFilter("status", FilterType.EQUALS, ValueType.TINYINT, this.getStatus(), Constants.FilterRelation.AND);
                paramList.add(filter);
            }
            if (this.getStatus() == 3) {
                //待发布
                QueryFilter filter = new QueryFilter("status", FilterType.EQUALS, ValueType.TINYINT, 2, Constants.FilterRelation.AND);
                QueryFilter filter1 = new QueryFilter("publish_start_time", FilterType.LESSTHAN, ValueType.TIMESTAMP, new Date(), Constants.FilterRelation.AND);
                paramList.add(filter);
                paramList.add(filter1);
            }
            if (this.getStatus() == 4) {
                //进行中
                Date now = new Date();
                QueryFilter filter = new QueryFilter("status", FilterType.EQUALS, ValueType.TINYINT, 2, Constants.FilterRelation.AND);
                QueryFilter filter1 = new QueryFilter("publish_start_time", FilterType.GREATEEQUAL, ValueType.TIMESTAMP, now, Constants.FilterRelation.AND);
                QueryFilter filter2 = new QueryFilter("publish_end_time", FilterType.LESSEQUAL, ValueType.TIMESTAMP, now, Constants.FilterRelation.AND);
                paramList.add(filter);
                paramList.add(filter1);
                paramList.add(filter2);
            }
            if (this.getStatus() == 5) {
                //已结束
                Date now = new Date();
                QueryFilter filter = new QueryFilter("status", FilterType.EQUALS, ValueType.TINYINT, 2, Constants.FilterRelation.AND);
                QueryFilter filter1 = new QueryFilter("publish_end_time", FilterType.GREATETHAN, ValueType.TIMESTAMP, now, Constants.FilterRelation.AND);
                paramList.add(filter);
                paramList.add(filter1);
            }
            if (this.getStatus() == 6) {
                //已下架
                QueryFilter filter = new QueryFilter("status", FilterType.EQUALS, ValueType.TINYINT, 3, Constants.FilterRelation.AND);
                paramList.add(filter);
            }
        }
        if (this.getLike() != null) {
            QueryFilter filter1 = new QueryFilter("name", FilterType.LIKE, ValueType.VARCHAR, this.getLike(), Constants.FilterRelation.OR);
            QueryFilter filter2 = new QueryFilter("create_user", FilterType.LIKE, ValueType.VARCHAR, this.getLike(), Constants.FilterRelation.OR);
            paramList.add(filter1);
            paramList.add(filter2);
        }
        if (this.getPublishStartTime() != null) {
            QueryFilter filter1 = new QueryFilter("publish_start_time", FilterType.GREATEEQUAL, ValueType.VARCHAR, this.getPublishStartTime(), Constants.FilterRelation.AND);
            paramList.add(filter1);
        }
        if (this.getPublishEndTime() != null) {
            QueryFilter filter1 = new QueryFilter("publish_end_time", FilterType.LESSEQUAL, ValueType.VARCHAR, this.getPublishEndTime(), Constants.FilterRelation.AND);
            paramList.add(filter1);
        }
        if (this.getValidStartTime() != null) {
            QueryFilter filter1 = new QueryFilter("valid_begin_time", FilterType.GREATEEQUAL, ValueType.VARCHAR, this.getValidStartTime(), Constants.FilterRelation.AND);
            paramList.add(filter1);
        }
        if (this.getValidEndTime() != null) {
            QueryFilter filter1 = new QueryFilter("valid_end_time", FilterType.LESSEQUAL, ValueType.VARCHAR, this.getValidEndTime(), Constants.FilterRelation.AND);
            paramList.add(filter1);
        }
        return new QueryParam(paramList);
    }
}
