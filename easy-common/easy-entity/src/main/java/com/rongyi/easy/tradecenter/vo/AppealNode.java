package com.rongyi.easy.tradecenter.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author chenjun
 * @date 2017/4/10 19:19
 */
public class AppealNode implements Serializable{
    private static final long serialVersionUID = -766723992467732792L;

    private long createAt;//申请时间
    private String nodeMessage;//节点描述

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public String getNodeMessage() {
        return nodeMessage;
    }

    public void setNodeMessage(String nodeMessage) {
        this.nodeMessage = nodeMessage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
