package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/**
 * 搜索关联联想词参数
 * @author user
 *
 */
public class KeywordSearchParam extends MalllifeBaseParam implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;//商品或店铺或者商场或代金券名称
	private Integer type;//1商品 2找店 3优惠
	// 0：全部 1：品牌 2：商城 3：店铺 4：特卖列表 5：直播列表 6：买手列表
	private int src_type;
	// 对应ID 【0：全部（空） 1：品牌（品牌id） 2：商场（商场id） 3：店铺（店铺id） 4：特卖列表（空） 5：直播列表（空） 6：买手列表（空）】
	private String src_id;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

	public String getSrc_id() {
		return src_id;
	}

	public void setSrc_id(String src_id) {
		this.src_id = src_id;
	}

	/**
	 * 0：全部 1：品牌 2：商城 3：店铺 4：特卖列表 5：直播列表 6：买手列表
	 * @return
     */
	public int getSrc_type() {
		return src_type;
	}

	/**
	 * 0：全部 1：品牌 2：商城 3：店铺 4：特卖列表 5：直播列表 6：买手列表
	 * @param src_type
     */
	public void setSrc_type(int src_type) {
		this.src_type = src_type;
	}

	@Override
	public String toString() {
		return "KeywordSearchParam [name=" + name + ", type=" + type + "]";
	}
	
	
}
