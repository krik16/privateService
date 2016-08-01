package com.rongyi.easy.ryoms.advert.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class AdvertVo implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -1309872971784984018L;
	private Long id;//'编号'
	private Integer position;//广告位置，参考ad_option中定义 1:全屏 2:首页banner
	private Integer adTime;//播放时长
	private Integer module_type;//素材模板 11 全屏模板-A 22 首页Banner-A
	private Integer status;//广告状态 1待审核, 2审核未通过, 3待发布,4进行中,5已结束,6已下线, 7已删除
	private String status_detail;//状态描述
	private Date publish_start;//发布开始时间
	private Date publish_end;//发布结束时间
	private Long group_id;//广告组id
	private String create_by;//创建人账号ID
	private Long create_at;//记录创建时间
	private String update_by;//更新人账号ID
	private Long update_at;//记录更新时间
	private List<Map<String,Object>> mall_List;//关联商场id集合
	private Integer relation_id;
	private String relation_name;
	private String relation_code;
	private String relation_url;
	private List<AdMaterialVo> adMaterialVos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getAdTime() {
		return adTime;
	}

	public void setAdTime(Integer adTime) {
		this.adTime = adTime;
	}

	public Integer getModule_type() {
		return module_type;
	}

	public void setModule_type(Integer module_type) {
		this.module_type = module_type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatus_detail() {
		return status_detail;
	}

	public void setStatus_detail(String status_detail) {
		this.status_detail = status_detail;
	}

	public Date getPublish_start() {
		return publish_start;
	}

	public void setPublish_start(Date publish_start) {
		this.publish_start = publish_start;
	}

	public Date getPublish_end() {
		return publish_end;
	}

	public void setPublish_end(Date publish_end) {
		this.publish_end = publish_end;
	}

	public Long getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
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

	public List<Map<String, Object>> getMall_List() {
		return mall_List;
	}

	public void setMall_List(List<Map<String, Object>> mall_List) {
		this.mall_List = mall_List;
	}

	public Integer getRelation_id() {
		return relation_id;
	}

	public void setRelation_id(Integer relation_id) {
		this.relation_id = relation_id;
	}

	public String getRelation_name() {
		return relation_name;
	}

	public void setRelation_name(String relation_name) {
		this.relation_name = relation_name;
	}

	public String getRelation_code() {
		return relation_code;
	}

	public void setRelation_code(String relation_code) {
		this.relation_code = relation_code;
	}

	public String getRelation_url() {
		return relation_url;
	}

	public void setRelation_url(String relation_url) {
		this.relation_url = relation_url;
	}

	public List<AdMaterialVo> getAdMaterialVos() {
		return adMaterialVos;
	}

	public void setAdMaterialVos(List<AdMaterialVo> adMaterialVos) {
		this.adMaterialVos = adMaterialVos;
	}

	@Override
	public String toString() {
		return "AdvertVo{" +
				"id=" + id +
				", position=" + position +
				", adTime=" + adTime +
				", module_type=" + module_type +
				", status=" + status +
				", status_detail='" + status_detail + '\'' +
				", publish_start=" + publish_start +
				", publish_end=" + publish_end +
				", group_id=" + group_id +
				", create_by='" + create_by + '\'' +
				", create_at=" + create_at +
				", update_by='" + update_by + '\'' +
				", update_at=" + update_at +
				", mall_List=" + mall_List +
				", relation_id=" + relation_id +
				", relation_name='" + relation_name + '\'' +
				", relation_code='" + relation_code + '\'' +
				", relation_url='" + relation_url + '\'' +
				", adMaterialVos=" + adMaterialVos +
				'}';
	}
}
