package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by WUH on 2017/1/4.
 * 首页断码好货VO
 */
public class ShortSizeHomeVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<ShortSizeVO> shortSizeVOList = new ArrayList<>();  //断码好货list
    private String title;                  //首页标题
    private String picUrls;                //首页图片地址

    public List<ShortSizeVO> getShortSizeVOList() {
        return Collections.unmodifiableList(shortSizeVOList);
    }

    public void addShortSizeVO(ShortSizeVO shortSizeVO) {
       shortSizeVOList.add(shortSizeVO);
    }

    public boolean removeShortSize(ShortSizeVO shortSizeVO){
        return shortSizeVOList.remove(shortSizeVO);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }
}
