package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijing on 2016/1/12 20:19
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class ContentListAppVO implements Serializable {
    private String  title;
    private Integer listType;//列表的类型  1代表特卖列表  2 闪购列表 3 商场尖货  4，买手id列表
    private List<ContentListDetailVO> contentListDetailVOList= new ArrayList<>();

    public Integer getListType() {
        return listType;
    }

    public void setListType(Integer listType) {
        this.listType = listType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ContentListDetailVO> getContentListDetailVOList() {
        return contentListDetailVOList;
    }

    public void setContentListDetailVOList(List<ContentListDetailVO> contentListDetailVOList) {
        this.contentListDetailVOList = contentListDetailVOList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("title", title)
                .append("listType", listType)
                .append("contentListDetailVOList", contentListDetailVOList)
                .toString();
    }
}
