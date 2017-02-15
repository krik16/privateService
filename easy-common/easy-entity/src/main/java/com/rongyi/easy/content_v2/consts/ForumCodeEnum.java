package com.rongyi.easy.content_v2.consts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WUH on 2017/1/3.
 * 首页板块码
 */
public enum ForumCodeEnum {
    BANNER("BANNER", "banner"),
    QUICK_ENTRY("QUICK_ENTRY", "快捷入口(老版本)"),
    HOT_HEADLINE("HOT_HEADLINE", "热点头条"),
    COUPON_RECOMMEND("COUPON_RECOMMEND", "特惠好券"),
    ACTIVITY_RECOMMEND("ACTIVITY_RECOMMEND", "活动推荐(老版本)"),
    STAR_SHOP("STAR_SHOP", "明星店铺(老版本)"),
    FLOAT_AD("FLOAT_AD", "浮标广告"),
    BUYER_LIVE("BUYER_LIVE", "买手直播(老版本)"),
    SPECIALBANNER("SPECIALBANNER", "banner"),
    SPECIALSALE("SPECIALSALE", "特卖推荐"),
    FLASHBANNER("FLASHBANNER", "banner"),
    FLASHPURCHASE("FLASHPURCHASE", "闪购推荐"),
    QUICK_ENTRY_NEW("QUICK_ENTRY_NEW", "快捷入口"),
    DAILY_SALE("DAILY_SALE", "每日秒杀"),
    SNAPPING_BENEFIT("SNAPPING_BENEFIT", "爆抢福利"),
    COMMODITY_LIST("COMMODITY_LIST",  "商场尖货"),
    BUYER_LIST("BUYER_LIST", "买手尖货"),
    POWERON_ADV("POWERON_ADV", "开机广告"),
    ACTIVITY_RECOMEND_NEW("ACTIVITY_RECOMEND_NEW", "活动推荐"),
    TRENDSETTER("TRENDSETTER", "潮人攻略"),
    REC_MALL("REC_MALL", "商场"),
    REC_BRAND("REC_BRAND", "品牌"),
    REC_CATEGORY("REC_CATEGORY", "商品分类"),
    LOVE_BRAND("LOVE_BRAND", "爱品牌"),
    ADVER_BANNER("ADVER_BANNER", "广告banner"),
    SHORT_SIZE("SHORT_SIZE", "断码好货");

    private final String code;     //板块码
    private final String title;    //标题
    ForumCodeEnum(String code, String title){
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public static List<String> getForumCodeList(){
        List<String> codeList = new ArrayList<>();
        for(ForumCodeEnum forumCodeEnum: ForumCodeEnum.values()){
            codeList.add(forumCodeEnum.getCode());
        }
        return codeList;
    }
}
