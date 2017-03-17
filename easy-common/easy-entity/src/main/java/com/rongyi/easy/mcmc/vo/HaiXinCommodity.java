package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.constant.CommodityTerminalType;
import com.rongyi.easy.mcmc.param.CommodityParam;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by xuying on 2017/3/14.
 */
public class HaiXinCommodity implements Serializable{
    private String PluCode;//商品编码
    private String PluName;//商品名称
    private String BarCode;//商品条码
    private String OrgCode;//组织编码
    private String VendorCode;//供应商编码
    private String VendorName;//供应商名称
    private String Spec;//规格
    private String Unit;//计量单位
    private String ProdArea;//产地
    private Double JPrice;//含税进价
    private Double OJPrice;//最后一批进价
    private Double Price;//售价
    private Double PsPrice;//配送价
    private Double PfPrice;//批发价
    private Double GCount; //卖场库存数量
    private Double CCount;//仓库库存数量
    private Double Counts;//库存数量
    private Double DMS;//日均销量
    private Integer TopStock;//最高库存
    private Integer LowStock;//最低库存
    private Integer JhCycle;//进货周期
    private Integer PsCycle;//配送周期
    private Double  ItemCnt;//多包装数量
    private String PluType;//商品类型
    private String MngStock;//是否管理库存
    private String IsWeight;//称重类型
    private Integer KeepDays;//保质期天数
    private  String ClsCode;//品类编码
    private String Remark;//备注
    private Integer IsRight;
    private String PluStatus; // 商品状态（null：新品，0：正常，1：残损···2：淘汰，9：未审核）
    
    public String getPluCode() {
        return PluCode;
    }

    public void setPluCode(String pluCode) {
        PluCode = pluCode;
    }

    public String getPluName() {
        return PluName;
    }

    public void setPluName(String pluName) {
        PluName = pluName;
    }

    public String getBarCode() {
        return BarCode;
    }

    public void setBarCode(String barCode) {
        BarCode = barCode;
    }

    public String getOrgCode() {
        return OrgCode;
    }

    public void setOrgCode(String orgCode) {
        OrgCode = orgCode;
    }

    public String getVendorCode() {
        return VendorCode;
    }

    public void setVendorCode(String vendorCode) {
        VendorCode = vendorCode;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getSpec() {
        return Spec;
    }

    public void setSpec(String spec) {
        Spec = spec;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getProdArea() {
        return ProdArea;
    }

    public void setProdArea(String prodArea) {
        ProdArea = prodArea;
    }

    public Double getJPrice() {
        return JPrice;
    }

    public void setJPrice(Double JPrice) {
        this.JPrice = JPrice;
    }

    public Double getOJPrice() {
        return OJPrice;
    }

    public void setOJPrice(Double OJPrice) {
        this.OJPrice = OJPrice;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getPsPrice() {
        return PsPrice;
    }

    public void setPsPrice(Double psPrice) {
        PsPrice = psPrice;
    }

    public Double getPfPrice() {
        return PfPrice;
    }

    public void setPfPrice(Double pfPrice) {
        PfPrice = pfPrice;
    }

    public Double getGCount() {
        return GCount;
    }

    public void setGCount(Double GCount) {
        this.GCount = GCount;
    }

    public Double getCCount() {
        return CCount;
    }

    public void setCCount(Double CCount) {
        this.CCount = CCount;
    }

    public Double getCounts() {
        return Counts;
    }

    public void setCounts(Double counts) {
        Counts = counts;
    }

    public Double getDMS() {
        return DMS;
    }

    public void setDMS(Double DMS) {
        this.DMS = DMS;
    }

    public Integer getTopStock() {
        return TopStock;
    }

    public void setTopStock(Integer topStock) {
        TopStock = topStock;
    }

    public Integer getLowStock() {
        return LowStock;
    }

    public void setLowStock(Integer lowStock) {
        LowStock = lowStock;
    }

    public Integer getJhCycle() {
        return JhCycle;
    }

    public void setJhCycle(Integer jhCycle) {
        JhCycle = jhCycle;
    }

    public Integer getPsCycle() {
        return PsCycle;
    }

    public void setPsCycle(Integer psCycle) {
        PsCycle = psCycle;
    }

    public Double getItemCnt() {
        return ItemCnt;
    }

    public void setItemCnt(Double itemCnt) {
        ItemCnt = itemCnt;
    }

    public String getPluType() {
        return PluType;
    }

    public void setPluType(String pluType) {
        PluType = pluType;
    }

    public String getMngStock() {
        return MngStock;
    }

    public void setMngStock(String mngStock) {
        MngStock = mngStock;
    }

    public String getIsWeight() {
        return IsWeight;
    }

    public void setIsWeight(String isWeight) {
        IsWeight = isWeight;
    }

    public Integer getKeepDays() {
        return KeepDays;
    }

    public void setKeepDays(Integer keepDays) {
        KeepDays = keepDays;
    }

    public String getClsCode() {
        return ClsCode;
    }

    public void setClsCode(String clsCode) {
        ClsCode = clsCode;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Integer getIsRight() {
		return IsRight;
	}

	public void setIsRight(Integer isRight) {
		IsRight = isRight;
	}

	public String getPluStatus() {
        return PluStatus;
    }

    public void setPluStatus(String pluStatus) {
        PluStatus = pluStatus;
    }

    @Override
    public String toString() {
        return "HaiXinCommodity{" +
                "PluCode='" + PluCode + '\'' +
                ", PluName='" + PluName + '\'' +
                ", BarCode='" + BarCode + '\'' +
                ", OrgCode='" + OrgCode + '\'' +
                ", VendorCode='" + VendorCode + '\'' +
                ", VendorName='" + VendorName + '\'' +
                ", Spec='" + Spec + '\'' +
                ", Unit='" + Unit + '\'' +
                ", ProdArea='" + ProdArea + '\'' +
                ", JPrice=" + JPrice +
                ", OJPrice=" + OJPrice +
                ", Price=" + Price +
                ", PsPrice=" + PsPrice +
                ", PfPrice=" + PfPrice +
                ", GCount=" + GCount +
                ", CCount=" + CCount +
                ", Counts=" + Counts +
                ", DMS=" + DMS +
                ", TopStock=" + TopStock +
                ", LowStock=" + LowStock +
                ", JhCycle=" + JhCycle +
                ", PsCycle=" + PsCycle +
                ", ItemCnt=" + ItemCnt +
                ", PluType='" + PluType + '\'' +
                ", MngStock='" + MngStock + '\'' +
                ", IsWeight='" + IsWeight + '\'' +
                ", KeepDays=" + KeepDays +
                ", ClsCode='" + ClsCode + '\'' +
                ", Remark='" + Remark + '\'' +
                ", IsRight=" + IsRight +
                ", PluStatus='" + PluStatus + '\'' +
                '}';
    }

    /**
     * 判断海信导入的数据是否可用
     * @param PluStatus
     * @return
     */
    public boolean isOKAboutPluStatus (String PluStatus) {
        if (StringUtils.isBlank(PluStatus)) {
            return true;
        }
        if ("0".equals(PluStatus) || "1".equals(PluStatus)) {
            return true;
        }
        return false;
    }
}
