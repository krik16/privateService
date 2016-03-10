package com.rongyi.easy.activitymanage.vo;

import java.util.Date;

/**
 * 类说明
 * 
 * @author wangjh
 * @date 2016年3月10日
 */
public class RegisterGoodsVO {

	private int activityGoodsId = 0;
	private String goodsId = "";
	private int activityId = 0;
	private RegisterStauts status;
	private String picUrl = "";
	private String title = "";
	private String reason = "";

	enum RegisterStauts {
		Pending("审核中", 0), Online("已上线", 1), Used("已使用", 2), Expired("已过期", 3), Offline("已下线", 4);

		// 成员变量
		private String name;
		private int index;

		// 构造方法
		private RegisterStauts(String name, int index) {
			this.name = name;
			this.index = index;
		}

		// 覆盖方法
		@Override
		public String toString() {
			return this.index + "_" + this.name;
		}
	}
}
