package com.rongyi.easy.activitymanage.param;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Created by Leon on 2016/1/27.
 */
public class ActivityGoodsImportParam extends PagingParam {
    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 版本号
     */
    private String version;

    /**
     * 是否有效，无效[false] 有效[true]
     */
    private Boolean valid;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("version", version)
                .append("valid", valid)
                .toString();
    }
}
