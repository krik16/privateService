package com.rongyi.easy.activitymanage.entity;

import com.google.inject.internal.Lists;
import com.rongyi.easy.malllife.vo.CommoditySaleVO;
import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/5/17.
 */
public class SpeSale implements Serializable {
    private Integer id;
    private String name;
    private String urlPics;
    private String shareTitle;
    private String sharePic;
    private String shareDesc;
    private String replacePic;
    private List<CommoditySaleVO> commoditySaleVOList = Lists.newArrayList();

    public List<CommoditySaleVO> getCommoditySaleVOList() {
        return commoditySaleVOList;
    }

    public void setCommoditySaleVOList(List<CommoditySaleVO> commoditySaleVOList) {
        this.commoditySaleVOList = commoditySaleVOList;
    }

    public String getReplacePic() {
        return replacePic;
    }

    public void setReplacePic(String replacePic) {
        this.replacePic = replacePic;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlPics() {
        return urlPics;
    }

    public void setUrlPics(String urlPics) {
        this.urlPics = urlPics;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("urlPics", urlPics)
                .append("shareDesc", shareDesc)
                .append("shareTitle", shareTitle)
                .append("sharePic", sharePic)
                .append("replacePic", replacePic)
                .append("commoditySaleVOList", commoditySaleVOList)
                .toString();
    }
}
