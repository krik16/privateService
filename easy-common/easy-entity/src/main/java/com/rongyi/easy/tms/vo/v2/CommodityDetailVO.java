package com.rongyi.easy.tms.vo.v2;

import com.rongyi.easy.mcmc.vo.CommodityWebVO;

import java.io.Serializable;
import java.util.List;

/**
 * kejun
 * 2016/4/11 18:16
 **/
public class CommodityDetailVO extends CommodityWebVO implements Serializable{

    private static final long serialVersionUID = 1132112900027465830L;

    private List<String> picList;//图片地址列表

    private List<String[]> columnValues;//规格集合

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public List<String[]> getColumnValues() {
        return columnValues;
    }

    public void setColumnValues(List<String[]> columnValues) {
        this.columnValues = columnValues;
    }
}
