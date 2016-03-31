package com.rongyi.easy.smms.vo;

import java.io.Serializable;
import java.util.List;

public class CategoryVOList extends CategoryVO implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -3835490557078363142L;
    // 二级分类
    private List<?> secondLevel;

    public List<?> getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(List<?> secondLevel) {
        this.secondLevel = secondLevel;
    }

}
