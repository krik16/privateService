package com.rongyi.easy.flopgo.vo;

import com.rongyi.easy.coupon.entity.CouponCommodity;
import com.rongyi.easy.coupon.vo.CouponVO;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 返回所有牌面显示的奖品的对象 上级为FlopgoLookPrizesListVO
 *
 * @author user
 */

public class FlopgoLookPrizesVO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String _id;//奖品id
    private Date created_at; //奖品创建时间
    private Date updated_at;//奖品修改时间
    private String type;//奖品的类型 02优惠卷03现金卷
    private String title;//奖品名字
    private String deadlines;//有效时间
    private String restrictions;//使用限制
    private double actual_price;//实际价格
    private double discount_price;//折扣价格

    private List<String> thumb_img;//缩略图
    private List<String> detail_img;//详情图
    private List<CouponVO.CouponProduct> scope;//现金卷的使用范围
    private String recommendation;//推荐文案
    private String isRebate;// 0不是抵扣券 1是抵扣券

    public FlopgoLookPrizesVO() {

    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public FlopgoLookPrizesVO(FlopPrizeVO flopprize) {

        this._id = flopprize.getId();
        this.created_at = flopprize.getCreateDate();
        this.updated_at = flopprize.getUpdateDate();
        this.type = flopprize.getTicketType();
        this.title = flopprize.getTitle();
        this.restrictions = flopprize.getUseRestriction();
        this.isRebate = flopprize.getIsRebate();
        this.detail_img = flopprize.getDetailPicUrls();
        if ("02".equals(flopprize.getTicketType())) {
            this.actual_price = flopprize.getOriginalPrice();
            this.discount_price = flopprize.getNowPrice();
            this.scope = null;
            this.recommendation = flopprize.getUseDescription();
        }
        if ("03".equals(flopprize.getTicketType())) {
            this.discount_price = flopprize.getDiscount();
            if(StringUtils.isNotBlank(flopprize.getRecommend())){
                this.recommendation = flopprize.getRecommend();
            }else if(StringUtils.isNotBlank(flopprize.getUseRestriction())){
                this.recommendation= flopprize.getUseRestriction();
            }else if(StringUtils.isNotBlank(flopprize.getUseDescription())){
                this.recommendation = flopprize.getUseDescription();
            }


        }
    }

    public List<CouponVO.CouponProduct> getScope() {
        return scope;
    }

    public void setScope(List<CouponVO.CouponProduct> scope) {
        this.scope = scope;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeadlines() {
        return deadlines;
    }

    public void setDeadlines(String deadlines) {
        this.deadlines = deadlines;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public double getActual_price() {
        return actual_price;
    }

    public void setActual_price(double actual_price) {
        this.actual_price = actual_price;
    }

    public double getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(double discount_price) {
        this.discount_price = discount_price;
    }

    public List<String> getThumb_img() {
        return thumb_img;
    }

    public void setThumb_img(List<String> thumb_img) {
        this.thumb_img = thumb_img;
    }

    public List<String> getDetail_img() {
        return detail_img;
    }

    public void setDetail_img(List<String> detail_img) {
        this.detail_img = detail_img;
    }

    public String getIsRebate() {
        return isRebate;
    }

    public void setIsRebate(String isRebate) {
        this.isRebate = isRebate;
    }
}
