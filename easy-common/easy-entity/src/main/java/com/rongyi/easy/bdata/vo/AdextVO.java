package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Desc: ad ext
 * User: chris
 * Date: 2015/10/27 2:15
 */
public class AdextVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer    ryAdNum;
    private Integer    mallAdNum;
    private Integer    ryBannerNum;
    private Integer    mallBannerNum;
    private List<AdVO> ads;

    public Integer getRyAdNum() {
        return ryAdNum;
    }

    public void setRyAdNum(Integer ryAdNum) {
        this.ryAdNum = ryAdNum;
    }

    public Integer getMallAdNum() {
        return mallAdNum;
    }

    public void setMallAdNum(Integer mallAdNum) {
        this.mallAdNum = mallAdNum;
    }

    public Integer getRyBannerNum() {
        return ryBannerNum;
    }

    public void setRyBannerNum(Integer ryBannerNum) {
        this.ryBannerNum = ryBannerNum;
    }

    public Integer getMallBannerNum() {
        return mallBannerNum;
    }

    public void setMallBannerNum(Integer mallBannerNum) {
        this.mallBannerNum = mallBannerNum;
    }

    public List<AdVO> getAds() {
        return ads;
    }

    public void setAds(List<AdVO> ads) {
        this.ads = ads;
    }
}
