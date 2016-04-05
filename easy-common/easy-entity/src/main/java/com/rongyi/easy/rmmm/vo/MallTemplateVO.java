/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：商场邮费模板
 * time ：2016年3月3日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年3月3日               1.0              创建文件
 */
public class MallTemplateVO  implements Serializable {
	
	private String templateId;// 模板邮费id
	private double templatePostage;// 模板邮费
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public double getTemplatePostage() {
		return templatePostage;
	}
	public void setTemplatePostage(double templatePostage) {
		this.templatePostage = templatePostage;
	}
	@Override
	public String toString() {
		return "MallTemplateVO [templateId=" + templateId + ", templatePostage=" + templatePostage + "]";
	}

}
