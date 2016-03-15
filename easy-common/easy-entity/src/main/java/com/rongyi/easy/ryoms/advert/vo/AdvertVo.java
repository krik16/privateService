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
	private String content;//素材内容
	private Integer module_type;//素材模板 11 全屏模板-A 22 首页Banner-A
	private Integer material_id;//素材id
	private Integer content_type;//素材类型 1:图片,2:视频
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
	//private List<String> mall_names;//关联商场name集合
	private Integer relation_id;
	private String relation_name;
	private String relation_code;
	private String relation_url;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the position
	 */
	public Integer getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(Integer position) {
		this.position = position;
	}
	/**
	 * @return the adTime
	 */
	public Integer getAdTime() {
		return adTime;
	}
	/**
	 * @param adTime the adTime to set
	 */
	public void setAdTime(Integer adTime) {
		this.adTime = adTime;
	}
	/**
	 * @return the module_type
	 */
	public Integer getModule_type() {
		return module_type;
	}
	/**
	 * @param module_type the module_type to set
	 */
	public void setModule_type(Integer module_type) {
		this.module_type = module_type;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the content_type
	 */
	public Integer getContent_type() {
		return content_type;
	}
	/**
	 * @param content_type the content_type to set
	 */
	public void setContent_type(Integer content_type) {
		this.content_type = content_type;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the publish_start
	 */
	public Date getPublish_start() {
		return publish_start;
	}
	/**
	 * @param publish_start the publish_start to set
	 */
	public void setPublish_start(Date publish_start) {
		this.publish_start = publish_start;
	}
	/**
	 * @return the publish_end
	 */
	public Date getPublish_end() {
		return publish_end;
	}
	/**
	 * @param publish_end the publish_end to set
	 */
	public void setPublish_end(Date publish_end) {
		this.publish_end = publish_end;
	}
	/**
	 * @return the group_id
	 */
	public Long getGroup_id() {
		return group_id;
	}
	/**
	 * @param group_id the group_id to set
	 */
	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
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
	 * @return the status_detail
	 */
	public String getStatus_detail() {
		return status_detail;
	}
	/**
	 * @param status_detail the status_detail to set
	 */
	public void setStatus_detail(String status_detail) {
		this.status_detail = status_detail;
	}
	/**
	 * @return the mall_List
	 */
	public List<Map<String, Object>> getMall_List() {
		return mall_List;
	}
	/**
	 * @param mall_List the mall_List to set
	 */
	public void setMall_List(List<Map<String, Object>> mall_List) {
		this.mall_List = mall_List;
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
	 * @return the relation_id
	 */
	public Integer getRelation_id() {
		return relation_id;
	}
	/**
	 * @param relation_id the relation_id to set
	 */
	public void setRelation_id(Integer relation_id) {
		this.relation_id = relation_id;
	}
	/**
	 * @return the relation_name
	 */
	public String getRelation_name() {
		return relation_name;
	}
	/**
	 * @param relation_name the relation_name to set
	 */
	public void setRelation_name(String relation_name) {
		this.relation_name = relation_name;
	}
	/**
	 * @return the relation_code
	 */
	public String getRelation_code() {
		return relation_code;
	}
	/**
	 * @param relation_code the relation_code to set
	 */
	public void setRelation_code(String relation_code) {
		this.relation_code = relation_code;
	}
	/**
	 * @return the relation_url
	 */
	public String getRelation_url() {
		return relation_url;
	}
	/**
	 * @param relation_url the relation_url to set
	 */
	public void setRelation_url(String relation_url) {
		this.relation_url = relation_url;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年3月15日 上午10:24:01
	* @throws 
	*/
	@Override
	public String toString() {
		return "AdvertVo [id=" + id + ", position=" + position + ", adTime=" + adTime + ", content=" + content
				+ ", module_type=" + module_type + ", material_id=" + material_id + ", content_type=" + content_type
				+ ", status=" + status + ", status_detail=" + status_detail + ", publish_start=" + publish_start
				+ ", publish_end=" + publish_end + ", group_id=" + group_id + ", create_by=" + create_by
				+ ", create_at=" + create_at + ", update_by=" + update_by + ", update_at=" + update_at + ", mall_List="
				+ mall_List + ", relation_id=" + relation_id + ", relation_name=" + relation_name + ", relation_code="
				+ relation_code + ", relation_url=" + relation_url + "]";
	}
}
