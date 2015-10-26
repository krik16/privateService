package com.rongyi.easy.content_v2.vo;

import com.rongyi.easy.mcmc.vo.LiveVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lijing on 2015/10/26.
 */
public class AppBuyerLiveVO implements Serializable{
    private List<LiveDetailVO> buyerLive;

    public List<LiveDetailVO> getBuyerLive() {
        return buyerLive;
    }

    public void setBuyerLive(List<LiveDetailVO> buyerLive) {
        this.buyerLive = buyerLive;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("buyerLive", buyerLive)
                .toString();
    }
}
