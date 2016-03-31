package com.rongyi.easy.coupon.vo;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.entity.CouponMall;
import com.rongyi.easy.coupon.entity.CouponShop;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lqy on 2015/11/28.
 */
public class VoucherRelatedObjectVO implements Serializable {

    public final static Integer MALL = 0;// 商场VO
    public final static Integer SHOP = 1;// 店铺VO

    /**
     * 店铺VO
     */
    private PagingVO<CouponShop> shopPagingVO;

    /**
     * 商场VO
     */
    private PagingVO<CouponMall> mallPagingVO;

    /**
     * 返回  商场[0] 店铺[1]
     */
    private Integer type;

    public PagingVO<CouponShop> getShopPagingVO() {
        return shopPagingVO;
    }

    public void setShopPagingVO(PagingVO<CouponShop> shopPagingVO) {
        this.shopPagingVO = shopPagingVO;
    }

    public PagingVO<CouponMall> getMallPagingVO() {
        return mallPagingVO;
    }

    public void setMallPagingVO(PagingVO<CouponMall> mallPagingVO) {
        this.mallPagingVO = mallPagingVO;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("shopPagingVO", shopPagingVO)
                .append("mallPagingVO", mallPagingVO)
                .append("type", type)
                .toString();
    }
}
