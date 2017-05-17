package com.rongyi.easy.mcmc.util;

import com.rongyi.easy.entity.ShopEntity;
import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.mcmc.CommodityCategory;
import com.rongyi.easy.solr.McmcCommodityDocument;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

/*
 * Description:商品for工具类
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian       2017/4/18    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class CommodityForSolrUtil {

 public static final String COMMODITY_INDEX_KEY="_AddCommoditAddIndex"; //mcmc 更新index KEY
 public static final int COMMODITY_INDEX_KEY_LEFT_TIME =259200;// 60 * 60 * 24 * 3_秒_ 3天时间 未有最新更新自动消失


 /**
  * 判断商品ID是否合法
  * @param id
  * @return
     */
 public static boolean isEffectiveMongoId(String id) {
  return StringUtils.isNotBlank(id) && id.matches("[\\da-zA-Z]{24}");
 }



 /**
  *
  */
 public interface CommodityTypeService {
  String COMMODITY = "commodityService";
  String GIFT = "giftService";
  String HAIXIN = "haixinService";
  /*int COUPON = 2;
  int COUPON_PARKING = 3;*/

 }




}
