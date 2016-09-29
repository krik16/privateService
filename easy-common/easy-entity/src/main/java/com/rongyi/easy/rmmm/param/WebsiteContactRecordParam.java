/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：官网联系我们
 * time ：2016年9月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年9月13日               1.0              创建文件
 */
public class WebsiteContactRecordParam  implements Serializable{
	
	private String name;// 姓名

	private int sex;// 性别	0:先生 1:女士

	private String phone;// 手机号或座机号
	
	private String email;//邮箱

	private String content;//咨询内容

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "WebsiteContactRecordParam [name=" + name + ", sex=" + sex + ", phone=" + phone + ", email=" + email
				+ ", content=" + content + "]";
	}

}
