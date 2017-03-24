package com.rongyi.easy.bdata.entity;

import java.io.Serializable;

public class HaiXinShopData implements Serializable {

    private static final long serialVersionUID = 4048631628734527319L;

    private  String ORGCODE;//组织编码
    private  String ORGNAME;//组织名称
    private  String ORGTYPE;//组织类型/ 0-自营店 1-加盟店 2-配送中心  1 暂时不处理
    private  String ISCENTER;//否是企业组织/ ISCENTER >// 0 - 否  1 - 是
    private  String ADDRESS;//地址
    private  String LINKMAN;//联系人
    private  String TELEPHONE;//联系电话
    private  String REMARK;//备注

    @Override
    public String toString() {
        return "HaiXinShopData{" +
                "ORGCODE='" + ORGCODE + '\'' +
                ", ORGNAME='" + ORGNAME + '\'' +
                ", ORGTYPE='" + ORGTYPE + '\'' +
                ", ISCENTER='" + ISCENTER + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", LINKMAN='" + LINKMAN + '\'' +
                ", TELEPHONE='" + TELEPHONE + '\'' +
                ", REMARK='" + REMARK + '\'' +
                '}';
    }

    public String getORGCODE() {
        return ORGCODE;
    }

    public void setORGCODE(String ORGCODE) {
        this.ORGCODE = ORGCODE;
    }

    public String getORGNAME() {
        return ORGNAME;
    }

    public void setORGNAME(String ORGNAME) {
        this.ORGNAME = ORGNAME;
    }

    public String getORGTYPE() {
        return ORGTYPE;
    }

    public void setORGTYPE(String ORGTYPE) {
        this.ORGTYPE = ORGTYPE;
    }

    public String getISCENTER() {
        return ISCENTER;
    }

    public void setISCENTER(String ISCENTER) {
        this.ISCENTER = ISCENTER;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getLINKMAN() {
        return LINKMAN;
    }

    public void setLINKMAN(String LINKMAN) {
        this.LINKMAN = LINKMAN;
    }

    public String getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }
}
