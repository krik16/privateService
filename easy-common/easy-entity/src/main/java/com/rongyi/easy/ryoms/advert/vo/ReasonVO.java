package com.rongyi.easy.ryoms.advert.vo;

import java.io.Serializable;

/**
 * @Description: 理由VO类
 * @author wangjh
 * @date 2016年2月18
 */
public class ReasonVO implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 1726630162350515276L;
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年3月1日 下午2:55:59
	* @throws 
	*/
	@Override
	public String toString() {
		return "ReasonVO [createBy=" + createBy + ", create_int=" + create_int + ", createAt=" + createAt + ", content="
				+ content + "]";
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the create_int
	 */
	public Integer getCreate_int() {
		return create_int;
	}

	/**
	 * @param create_int the create_int to set
	 */
	public void setCreate_int(Integer create_int) {
		this.create_int = create_int;
	}

	// 创建人
	private String createBy = "";
	//创建人id
	private Integer create_int;
	// 创建时间
	private String createAt = "";
	// 理由
	private String content = "";
}
