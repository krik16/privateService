package com.rongyi.easy.ryoms.advert.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 素材VO类
 * @author wangjh
 * @date 2016年2月15日 下午4:37:33
 */
public class AdDefaultVO implements Serializable {
	
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 7137641354880412797L;
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年3月1日 上午11:47:38
	* @throws 
	*/
	@Override
	public String toString() {
		return "AdDefaultVO [defaultId=" + defaultId + ", materialId=" + materialId + ", name=" + name + ", positionId="
				+ positionId + ", positionName=" + positionName + ", moduleId=" + moduleId + ", moduleName="
				+ moduleName + ", content=" + content + ", contentTypeId=" + contentTypeId + ", contentTypeName="
				+ contentTypeName + ", seq=" + seq + ", create_by=" + create_by + ", create_at=" + create_at
				+ ", update_by=" + update_by + ", update_at=" + update_at + ", create_int=" + create_int
				+ ", update_int=" + update_int + ", create_date=" + create_date + ", update_date=" + update_date
				+ ", material_id=" + material_id + "]";
	}

	/**
	 * @return the create_by
	 */
	public String getCreate_by() {
		return create_by;
	}

	/**
	 * @param create_by the create_by to set
	 */
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	/**
	 * @return the create_at
	 */
	public Long getCreate_at() {
		return create_at;
	}

	/**
	 * @param create_at the create_at to set
	 */
	public void setCreate_at(Long create_at) {
		this.create_at = create_at;
	}

	/**
	 * @return the update_by
	 */
	public String getUpdate_by() {
		return update_by;
	}

	/**
	 * @param update_by the update_by to set
	 */
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}

	/**
	 * @return the update_at
	 */
	public Long getUpdate_at() {
		return update_at;
	}

	/**
	 * @param update_at the update_at to set
	 */
	public void setUpdate_at(Long update_at) {
		this.update_at = update_at;
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

	/**
	 * @return the update_int
	 */
	public Integer getUpdate_int() {
		return update_int;
	}

	/**
	 * @param update_int the update_int to set
	 */
	public void setUpdate_int(Integer update_int) {
		this.update_int = update_int;
	}

	/**
	 * @return the create_date
	 */
	public Date getCreate_date() {
		return create_date;
	}

	/**
	 * @param create_date the create_date to set
	 */
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	/**
	 * @return the update_date
	 */
	public Date getUpdate_date() {
		return update_date;
	}

	/**
	 * @param update_date the update_date to set
	 */
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public int getContentTypeId() {
		return contentTypeId;
	}

	public void setContentTypeId(int contentTypeId) {
		this.contentTypeId = contentTypeId;
	}

	public String getContentTypeName() {
		return contentTypeName;
	}

	public void setContentTypeName(String contentTypeName) {
		this.contentTypeName = contentTypeName;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDefaultId() {
		return defaultId;
	}

	public void setDefaultId(int defaultId) {
		this.defaultId = defaultId;
	}
	/**
	 * @return the material_id
	 */
	public Integer getMaterial_id() {
		return material_id;
	}

	/**
	 * @param material_id the material_id to set
	 */
	public void setMaterial_id(Integer material_id) {
		this.material_id = material_id;
	}


	// 默认素材Id
	private int defaultId = 0;
	// 素材ID
	private int materialId = 0;
	// 素材名称
	private String name = "";
	// 广告位置ID
	private int positionId = 0;
	// 广告位置名称
	private String positionName = "";
	// 模板ID
	private int moduleId = 0;
	// 模板名称
	private String moduleName = "";
	// 模板内容
	private String content = "";
	// 素材的类型
	private int contentTypeId = 0;
	// 素材的类型
	private String contentTypeName = "";
	// 排序
	private int seq = 0;
	private String create_by;//记录创建人名称
	private Long create_at;//记录创建时间long
	private String update_by;//更新人名称
	private Long update_at;//记录更新时间long
	private Integer create_int;//记录创建人id
	private Integer update_int;//更新人id
	private Date create_date;//创建时间date
	private Date update_date;//更新时间date
	private Integer material_id;
}
