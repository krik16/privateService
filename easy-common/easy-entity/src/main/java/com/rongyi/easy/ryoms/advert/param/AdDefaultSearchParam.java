package com.rongyi.easy.ryoms.advert.param;

/**
 * @ClassName: MaterialSearchParam
 * @Description: 素材查询参数类
 * @author wangjh
 * @date 2016年2月15日 下午4:37:33
 */
public class AdDefaultSearchParam {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	// 素材名称
	private String name = "";
	// 广告位置ID
	private int position = 0;
}
