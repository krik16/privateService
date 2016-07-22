package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/7/4.
 */
public class HannelsCheckLogParam implements Serializable {
    private String hannelsId;
    private String type;// 1未通过 2作废
    private String reason;//理由
    private String create_by;//创建人

    public String getHannelsId() {
        return hannelsId;
    }

    public void setHannelsId(String hannelsId) {
        this.hannelsId = hannelsId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    @Override
    public String toString() {
        return "HannelsCheckLogParam{" +
                "hannelsId='" + hannelsId + '\'' +
                ", type='" + type + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
