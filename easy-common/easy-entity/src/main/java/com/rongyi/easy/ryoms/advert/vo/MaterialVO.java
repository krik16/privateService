package com.rongyi.easy.ryoms.advert.vo;

/**
 * @ClassName: MaterialVO
 * @Description: 素材VO类
 * @author wangjh
 * @date 2016年2月15日 下午4:37:33
 */
public class MaterialVO {
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
}
