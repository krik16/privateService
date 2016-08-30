package com.rongyi.easy.malllife.vo.wish;

import com.google.inject.internal.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/8/30.
 */
public class WishListRes implements Serializable {
    private Integer responseNum;
    private Integer unResponseNum;
    private List<WishListVO> wishListVOs = Lists.newArrayList();

    public List<WishListVO> getWishListVOs() {
        return wishListVOs;
    }

    public void setWishListVOs(List<WishListVO> wishListVOs) {
        this.wishListVOs = wishListVOs;
    }


    public Integer getResponseNum() {
        return responseNum;
    }

    public void setResponseNum(Integer responseNum) {
        this.responseNum = responseNum;
    }

    public Integer getUnResponseNum() {
        return unResponseNum;
    }

    public void setUnResponseNum(Integer unResponseNum) {
        this.unResponseNum = unResponseNum;
    }

}
