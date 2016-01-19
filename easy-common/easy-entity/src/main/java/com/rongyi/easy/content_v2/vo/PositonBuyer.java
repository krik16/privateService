package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 位置和买手的集合
 * Created by lijing
 * on 2015/10/26.
 */
public class PositonBuyer implements Serializable{
    private Integer id;
    private List<BuyerLiveVO> buyers;
    public PositonBuyer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<BuyerLiveVO> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<BuyerLiveVO> buyers) {
        this.buyers = buyers;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("buyers", buyers)
                .toString();
    }
}
