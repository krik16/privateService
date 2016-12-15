package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/3/18.
 */
public class ResultVoToWechat implements Serializable{

    private Integer totalNun;
    private Integer showNum;
    private Integer hideNum;
    private boolean haveWechatService;//是否有微信服务号，true表示有，false表示没有
    private List<CommodityVOToWechat> volist;

    public Integer getTotalNun() {
        return totalNun;
    }

    public void setTotalNun(Integer totalNun) {
        this.totalNun = totalNun;
    }

    public Integer getShowNum() {
        return showNum;
    }

    public void setShowNum(Integer showNum) {
        this.showNum = showNum;
    }

    public Integer getHideNum() {
        return hideNum;
    }

    public void setHideNum(Integer hideNum) {
        this.hideNum = hideNum;
    }

    public List<CommodityVOToWechat> getVolist() {
        return volist;
    }

    public void setVolist(List<CommodityVOToWechat> volist) {
        this.volist = volist;
    }

    public boolean isHaveWechatService() {
        return haveWechatService;
    }

    public void setHaveWechatService(boolean haveWechatService) {
        this.haveWechatService = haveWechatService;
    }
}
