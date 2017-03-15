package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.constant.CommodityTerminalType;
import com.rongyi.easy.mcmc.param.CommodityParam;
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
    private Integer GCount; //卖场库存数量
    private Integer CCount;//仓库库存数量
    private Integer Counts;//库存数量
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

    public Integer getGCount() {
        return GCount;
    }

    public void setGCount(Integer GCount) {
        this.GCount = GCount;
    }

    public Integer getCCount() {
        return CCount;
    }

    public void setCCount(Integer CCount) {
        this.CCount = CCount;
    }

    public Integer getCounts() {
        return Counts;
    }

    public void setCounts(Integer counts) {
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
    //source 为1表示导入转化
    public static CommodityParam haiXinCommodityToCommodityParam(HaiXinCommodity haiXinCommodity,Integer source){
        CommodityParam commodityParam=new CommodityParam();
        commodityParam.setSource(1); // 源：海信导入
        commodityParam.setStatus(CommodityDataStatus.STATUS_COMMODITY_PENDING); // 待处理
        commodityParam.setTerminalType(CommodityTerminalType.TERMINAL_TYPE_4); // 终端：微信
        commodityParam.setType(1); //TODO
        commodityParam.setName(haiXinCommodity.getPluName());
        commodityParam.setCode(haiXinCommodity.getPluCode()); // 商品编码
        commodityParam.setBarCode(haiXinCommodity.getBarCode()); // 商品条形码
        commodityParam.setCategory(haiXinCommodity.getClsCode());
        commodityParam.setCategoryIds(new ArrayList<ObjectId>());
        commodityParam.setOriginalPrice(String.valueOf(haiXinCommodity.getPrice()));
        commodityParam.setCurrentPrice(String.valueOf(haiXinCommodity.getPrice()));
        //TODO: referencePrice picList "distribution":  "description": "commodityDetails":

        commodityParam.setDescription(haiXinCommodity.getRemark());
        /*commodityParam.setPostage(); // 商品邮费
        commodityParam.setPicList(); // 商品图片
        commodityParam.setDistribution(); // 配送方式 1表示到店自提2快递3表示支持两种方式
        commodityParam.setFreight(); // 1表示商家承担运费,0表示买家承担运费
        commodityParam.setStock(); // 此为新增，则：当前库存=全部库存
        commodityParam.setStockStatus(); // 0表示统一库存1表示分管库存
        commodityParam.setPurchaseCount(); // 限购数量，0表示不限购
        commodityParam.setTemplateId(); // 商城运费模版id
        commodityParam.setCommodityDetails(); // 商品详情
        commodityParam.setBrandMid(); // 品牌mongoID
        commodityParam.setBrandName(); // 品牌名称
        commodityParam.setServiceIds(); // 服务号（公众号）

        // TODO 规格详情
        commodityParam.setCommoditySpeceParams();*/
        return  commodityParam;
    }
}
