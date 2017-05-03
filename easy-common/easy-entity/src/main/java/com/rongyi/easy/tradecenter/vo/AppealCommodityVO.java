package com.rongyi.easy.tradecenter.vo;

import com.rongyi.easy.mcmc.vo.CommoditySpecColumnVO;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * @author chenjun
 * @date 2017/4/10 19:10
 */
public class AppealCommodityVO implements Serializable{
    private static final long serialVersionUID = -6425366234347735845L;

    private List<CommoditySpecColumnVO> specColumnValues;// 规格参数
    private String commodityPic;// 商品图片
    private String num;// 下单数量
    private String commodityName;// 商品名称
    private String commodityId;// 商品id
    private String commodityCurrentPrice = "0";// 商品现价
    private String commodityOriginalPrice = "0";// 商品原价
    private String sonOrderNo;// 子订单号

    public List<CommoditySpecColumnVO> getSpecColumnValues() {
        return specColumnValues;
    }

    public void setSpecColumnValues(List<CommoditySpecColumnVO> specColumnValues) {
        this.specColumnValues = specColumnValues;
    }

    public String getCommodityPic() {
        return commodityPic;
    }

    public void setCommodityPic(String commodityPic) {
        this.commodityPic = commodityPic;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityCurrentPrice() {
        return commodityCurrentPrice;
    }

    public void setCommodityCurrentPrice(String commodityCurrentPrice) {
        this.commodityCurrentPrice = commodityCurrentPrice;
    }

    public String getCommodityOriginalPrice() {
        return commodityOriginalPrice;
    }

    public void setCommodityOriginalPrice(String commodityOriginalPrice) {
        this.commodityOriginalPrice = commodityOriginalPrice;
    }

    public String getSonOrderNo() {
        return sonOrderNo;
    }

    public void setSonOrderNo(String sonOrderNo) {
        this.sonOrderNo = sonOrderNo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
