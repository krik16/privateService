package com.rongyi.easy.osm.entity;

import java.io.Serializable;

/**
 * Created by yangyang on 2017/3/10.
 */
public class PluData implements Serializable {

    private String billNo;
    private String serialNo;
    private String pluCode;
    private String pluName;
    private String pfCount;
    private String pfpRice;
    private String barCode;

    public String getBillNo() {
        return billNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getPluCode() {
        return pluCode;
    }

    public void setPluCode(String pluCode) {
        this.pluCode = pluCode;
    }

    public String getPluName() {
        return pluName;
    }

    public void setPluName(String pluName) {
        this.pluName = pluName;
    }

    public String getPfCount() {
        return pfCount;
    }

    public void setPfCount(String pfCount) {
        this.pfCount = pfCount;
    }

    public String getPfpRice() {
        return pfpRice;
    }

    public void setPfpRice(String pfpRice) {
        this.pfpRice = pfpRice;
    }
}
