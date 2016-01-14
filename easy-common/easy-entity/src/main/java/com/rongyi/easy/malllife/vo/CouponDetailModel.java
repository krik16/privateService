package com.rongyi.easy.malllife.vo;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2014/7/16  11:32.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2014/7/16        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class CouponDetailModel implements Serializable{
    protected Coupon result;
    @SerializedName("other_activities")
    protected ArrayList<Coupon> otherActivities;
    @SerializedName("apply_shops")
    protected ArrayList<ShopMall> applyShops;
	public String toJson() {
        return new Gson().toJson(this);
    }

    public Coupon getResult() {
        return result;
    }

    public void setResult(Coupon result) {
        this.result = result;
    }

    public ArrayList<Coupon> getOtherActivities() {
        return otherActivities;
    }

    public void setOtherActivities(ArrayList<Coupon> otherActivities) {
        this.otherActivities = otherActivities;
    }

    public ArrayList<ShopMall> getApplyShops() {
        return applyShops;
    }

    public void setApplyShops(ArrayList<ShopMall> applyShops) {
        this.applyShops = applyShops;
    }

    public CouponDetailModel() {
    }
}
