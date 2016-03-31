package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lijing on 2015/12/22 10:25
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class QuickNewListVO implements Serializable {
    private Integer positionId;
    private List<ForumContentLVO> list;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public List<ForumContentLVO> getList() {
        return list;
    }

    public void setList(List<ForumContentLVO> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("positionId", positionId)
                .append("list", list)
                .toString();
    }
}
