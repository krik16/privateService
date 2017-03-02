package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

public class commodityCategoryToExcelVo implements Serializable {
    private static final long serialVersionUID = -4155086822646239257L;

    private String categoryName;

    private List<String> columnSpecAndClassification;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<String> getColumnSpecAndClassification() {
        return columnSpecAndClassification;
    }

    public void setColumnSpecAndClassification(List<String> columnSpecAndClassification) {
        this.columnSpecAndClassification = columnSpecAndClassification;
    }
}
