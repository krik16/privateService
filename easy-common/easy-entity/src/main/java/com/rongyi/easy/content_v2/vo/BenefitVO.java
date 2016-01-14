package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lijing on 2015/12/26 15:54
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class BenefitVO implements Serializable {
    private Integer id;

    private String title;

    private String subTitle;

    private Integer type;

    private String typeVal;

    private Integer width;

    private Integer columnCount;

   private List<BenefitListVO> benefitList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    public List<BenefitListVO> getBenefitList() {
        return benefitList;
    }

    public void setBenefitList(List<BenefitListVO> benefitList) {
        this.benefitList = benefitList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("subTitle", subTitle)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("width", width)
                .append("columnCount", columnCount)
                .append("benefitList", benefitList)
                .toString();
    }
}
