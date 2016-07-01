package com.rongyi.easy.solr.param;

import java.io.Serializable;

/**
 * 关联联想词搜素参数
 *
 * @author wangjh7
 * @date 2016-06-30
 */
public class KeywordHistorySearchParam implements Serializable{
    private static final long serialVersionUID = 578059263593575051L;

    // 返回记录数（默认：20）
    private int pageSize = 0;
    // 类型 1：商品 2：找店 3：优惠
    private int type = 0;
    // 关键字（不能为空）
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "KeywordHistorySearchParam{" +
                "keyword='" + keyword + '\'' +
                ", pageSize=" + pageSize +
                ", type=" + type +
                '}';
    }
}
