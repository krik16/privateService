package com.rongyi.easy.shop.param;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;
import com.rongyi.easy.shop.mvc.DateJson.JsonListObjectIdSerializer;
import com.rongyi.easy.shop.mvc.DateJson.JsonObjectIdSerializer;

/**
 * 商家后台添加店铺参数类
 * 
 * @author wzh
 *
 */
public class ShopParam {

	private String name;// 店铺名称
	private Integer shop_nature;// 店铺性质 0商场店铺 1商场专柜 2街边店
	private String shop_type;// 店铺类型 0普通店 1免税店 2专柜 3折扣店 4旗舰店
	private String number;// 店铺编号

	private ObjectId brand_id;// 主品牌

	private List<ObjectId> brand_ids;// 兼营品牌
	private String icon;// logo

	private List<ObjectId> category_ids;// 店铺所属分类

	private List<ObjectId> exclusive_category_ids;// 店铺所属专属分类
	private String tags;// 标签 自定义分类

	private ObjectId zone_id;// 所在商场id

	private List<ObjectId> zone_ids;// 所在商场

	private String address;// 详细地址

	private int moreFloors;// 0不跨楼，1跨楼

	private String shop_number;// 铺位号
	private String business_status;// 营业状态0正常营业 1即将营业 2暂停营业 3停止营业
	private String business_hours;// 营业时间

	private Date opened_time;// 开业时间
	private String telephone;// 店铺电话
	private String head_name;// 店铺负责人名字
	private String head_telephone;// 店铺负责人电话
	private String description;// 店铺描述
	private Date created_at;
	private Date updated_at;
	private Integer created_by;
	private Integer updated_by;
	private Integer valid;// 0正常显示1已隐藏2删除
}
