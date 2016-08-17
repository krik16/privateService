package com.rongyi.easy.ryoms.advert.vo;

import com.rongyi.easy.ryoms.advert.entity.AdMaterialEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
	// 默认素材Id
	private int defaultId = 0;
	// 素材ID
	//private int materialId = 0;
	// 素材名称
	private String name = "";
	// 广告位置ID
	private int positionId = 0;
	// 广告位置名称
	private String positionName = "";
	// 模板类型
	private int moduleId = 0;
	// 模板名称
	private String moduleName = "";
	// 模板内容
	//private String content = "";
	// 素材的类型
	//private int contentTypeId = 0;
	// 素材的类型
	//private String contentTypeName = "";
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
	//private Integer material_id;
	private List<MaterialVo> materialVos;

	public int getDefaultId() {
		return defaultId;
	}

	public void setDefaultId(int defaultId) {
		this.defaultId = defaultId;
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

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public Long getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Long create_at) {
		this.create_at = create_at;
	}

	public String getUpdate_by() {
		return update_by;
	}

	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}

	public Long getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Long update_at) {
		this.update_at = update_at;
	}

	public Integer getCreate_int() {
		return create_int;
	}

	public void setCreate_int(Integer create_int) {
		this.create_int = create_int;
	}

	public Integer getUpdate_int() {
		return update_int;
	}

	public void setUpdate_int(Integer update_int) {
		this.update_int = update_int;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
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

	public List<MaterialVo> getMaterialVos() {
		return materialVos;
	}

	public void setMaterialVos(List<MaterialVo> materialVos) {
		this.materialVos = materialVos;
	}

	@Override
	public String toString() {
		return "AdDefaultVO{" +
				"defaultId=" + defaultId +
				", name='" + name + '\'' +
				", positionId=" + positionId +
				", positionName='" + positionName + '\'' +
				", moduleId=" + moduleId +
				", moduleName='" + moduleName + '\'' +
				", seq=" + seq +
				", create_by='" + create_by + '\'' +
				", create_at=" + create_at +
				", update_by='" + update_by + '\'' +
				", update_at=" + update_at +
				", create_int=" + create_int +
				", update_int=" + update_int +
				", create_date=" + create_date +
				", update_date=" + update_date +
				", materialVos=" + materialVos +
				'}';
	}
}
