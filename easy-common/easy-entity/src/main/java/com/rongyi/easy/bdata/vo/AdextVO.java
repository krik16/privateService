package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Desc: ad ext
 * User: chris
 * Date: 2015/10/27 2:15
 */
public class AdextVO implements Serializable {
    private int        fullNum;
    private int        bannerNum;
    private List<AdVO> ads;

    public int getFullNum() {
        return fullNum;
    }

    public void setFullNum(int fullNum) {
        this.fullNum = fullNum;
    }

    public int getBannerNum() {
        return bannerNum;
    }

    public void setBannerNum(int bannerNum) {
        this.bannerNum = bannerNum;
    }

    public List<AdVO> getAds() {
        return ads;
    }

    public void setAds(List<AdVO> ads) {
        this.ads = ads;
    }
}
