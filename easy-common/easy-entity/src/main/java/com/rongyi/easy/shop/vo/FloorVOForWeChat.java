/**
 * 
 */
package com.rongyi.easy.shop.vo;

/**
 * @ClassName: FloorVOForWeChat
 * @Description: 微信端查询店铺时楼层铺位号列表返回类
 * @author wzh
 * @date 2015年10月29日 下午5:43:27
 * 
 */
public class FloorVOForWeChat {

	private String id;// 楼层id

	private String name;// 楼层名/ 铺位号

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
