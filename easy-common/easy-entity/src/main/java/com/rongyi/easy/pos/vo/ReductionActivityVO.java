package com.rongyi.easy.pos.vo;

import com.rongyi.easy.entity.PageEntity;
import com.rongyi.easy.pos.entity.ReductionActivityEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 满减活动查询结果VO
 *
 * @author wangjh7
 * @date 2017-02-04
 */
public class ReductionActivityVO implements Serializable {
    // 分页数据
    private PageEntity page;
    // 列表
    private List<ReductionActivityEntity> list;

    public List<ReductionActivityEntity> getList() {
        return list;
    }

    public void setList(List<ReductionActivityEntity> list) {
        this.list = list;
    }

    public PageEntity getPage() {
        return page;
    }

    public void setPage(PageEntity page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "ReductionActivityVO{" +
                "list=" + list +
                ", page=" + page +
                '}';
    }
}
