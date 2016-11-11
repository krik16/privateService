package com.rongyi.easy.ryoms.advert.vo;

import com.rongyi.easy.bdata.vo.MallAddressVO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by caohongjiang on 2016/11/9.
 */
public class AdPoolDetail implements Serializable {
    private static final long serialVersionUID = -5289527122292128733L;

    private Integer configId;
    private String mallName;
    private String cityName;
    private String openTime;
    private String mallLevel;
    private  Integer dailyPeople;
    private List<String> cinemas;
    private Integer packingNum;
    private  Long shopNum;
    private Integer terminalNum;
    private Long terminaklFee;
    private Integer rongyiAdCountTotal;
    private Integer isAllowPlay;//1 允许  ,0 不允许
    private Integer isAllowPack;//1 允许  ,0 不允许
    private Integer rongyiAdCountRemain;
    private String updateBy;
    private Long updateAt;
    private Boolean isAllowDelivery;//1 允许  ,0 不允许

    private MallAddressVO mallAddressVO ;

    private String mallId;


    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public MallAddressVO getMallAddressVO() {
        return mallAddressVO;
    }

    public void setMallAddressVO(MallAddressVO mallAddressVO) {
        this.mallAddressVO = mallAddressVO;
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public void setIsAllowDelivery(Boolean isAllowDelivery) {
        this.isAllowDelivery = isAllowDelivery;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getMallLevel() {
        return mallLevel;
    }

    public void setMallLevel(String mallLevel) {
        this.mallLevel = mallLevel;
    }

    public Integer getDailyPeople() {
        return dailyPeople;
    }

    public void setDailyPeople(Integer dailyPeople) {
        this.dailyPeople = dailyPeople;
    }

    public List<String> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<String> cinemas) {
        this.cinemas = cinemas;
    }

    public Integer getPackingNum() {
        return packingNum;
    }

    public void setPackingNum(Integer packingNum) {
        this.packingNum = packingNum;
    }


    public Long getShopNum() {
        return shopNum;
    }

    public void setShopNum(Long shopNum) {
        this.shopNum = shopNum;
    }

    public Integer getTerminalNum() {
        return terminalNum;
    }

    public void setTerminalNum(Integer terminalNum) {
        this.terminalNum = terminalNum;
    }

    public Long getTerminaklFee() {
        return terminaklFee;
    }

    public void setTerminaklFee(Long terminaklFee) {
        this.terminaklFee = terminaklFee;
    }

    public Integer getRongyiAdCountTotal() {
        return rongyiAdCountTotal;
    }

    public void setRongyiAdCountTotal(Integer rongyiAdCountTotal) {
        this.rongyiAdCountTotal = rongyiAdCountTotal;
    }

    public Integer getIsAllowPlay() {
        return isAllowPlay;
    }

    public void setIsAllowPlay(Integer isAllowPlay) {
        this.isAllowPlay = isAllowPlay;
    }

    public Integer getIsAllowPack() {
        return isAllowPack;
    }

    public void setIsAllowPack(Integer isAllowPack) {
        this.isAllowPack = isAllowPack;
    }

    public Integer getRongyiAdCountRemain() {
        return rongyiAdCountRemain;
    }

    public void setRongyiAdCountRemain(Integer rongyiAdCountRemain) {
        this.rongyiAdCountRemain = rongyiAdCountRemain;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getIsAllowDelivery() {
        return  isAllowPlay==1 &&rongyiAdCountRemain>0 ;
    }


    @Override
    public String toString() {
        return "AdPoolDetail{" +
                "configId=" + configId +
                ", mallName='" + mallName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", openTime='" + openTime + '\'' +
                ", mallLevel='" + mallLevel + '\'' +
                ", dailyPeople=" + dailyPeople +
                ", cinemas=" + cinemas +
                ", packingNum=" + packingNum +
                ", shopNum=" + shopNum +
                ", terminalNum=" + terminalNum +
                ", terminaklFee=" + terminaklFee +
                ", rongyiAdCountTotal=" + rongyiAdCountTotal +
                ", isAllowPlay=" + isAllowPlay +
                ", isAllowPack=" + isAllowPack +
                ", rongyiAdCountRemain=" + rongyiAdCountRemain +
                ", updateBy='" + updateBy + '\'' +
                ", updateAt=" + updateAt +
                ", isAllowDelivery=" + isAllowDelivery +
                ", mallAddressVO=" + mallAddressVO +
                ", mallId='" + mallId + '\'' +

                '}';
    }
}
