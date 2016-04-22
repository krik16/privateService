package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.List;

public class AdvertNewVo implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -1309872971784984018L;
	private Long id;//'编号'
	private Integer position;//广告位置，参考ad_option中定义 1:全屏 2:首页banner
	private Integer adtime;//播放时长
	private Integer module_type;//素材模板 11 全屏模板-A 22 首页Banner-A
	private String content;//素材内容
	private Integer content_type;//素材类型 1:图片,2:视频
	private Integer status;//广告状态 1待审核, 2审核未通过, 3待发布,4进行中,5已结束,6已下线, 7已删除
	private String status_detail;//状态描述
	private Long publish_start;//发布开始时间
	private Long publish_end;//发布结束时间
	private Long group_id;//广告组id
	private String create_by;//创建人账号ID
	private Long create_at;//记录创建时间
	private String update_by;//更新人账号ID
	private Long update_at;//记录更新时间
	private Integer adOrder =0;//广告排序
	private Integer holder =0;//所属 0 容易网 1 商家
	private String mall_id;//商场id
	private Integer relation_id;
	private String relation_name;
	private String relation_code;
	private String relation_url;
	private Integer relation_status;
	private List<String> mall_ids;
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
	 * @return the adtime
	 */
	public Integer getAdtime() {
		return adtime;
	}
	/**
	 * @param adtime the adtime to set
	 */
	public void setAdtime(Integer adtime) {
		this.adtime = adtime;
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
	 * @return the publish_start
	 */
	public Long getPublish_start() {
		return publish_start;
	}
	/**
	 * @param publish_start the publish_start to set
	 */
	public void setPublish_start(Long publish_start) {
		this.publish_start = publish_start;
	}
	/**
	 * @return the publish_end
	 */
	public Long getPublish_end() {
		return publish_end;
	}
	/**
	 * @param publish_end the publish_end to set
	 */
	public void setPublish_end(Long publish_end) {
		this.publish_end = publish_end;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
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
	 * @return the adOrder
	 */
	public Integer getAdOrder() {
		return adOrder;
	}
	/**
	 * @param adOrder the adOrder to set
	 */
	public void setAdOrder(Integer adOrder) {
		this.adOrder = adOrder;
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
	 * @return the holder
	 */
	public Integer getHolder() {
		return holder;
	}
	/**
	 * @param holder the holder to set
	 */
	public void setHolder(Integer holder) {
		this.holder = holder;
	}
	/**
	 * @return the mall_id
	 */
	public String getMall_id() {
		return mall_id;
	}
	/**
	 * @param mall_id the mall_id to set
	 */
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
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
	 * @return the mall_ids
	 */
	public List<String> getMall_ids() {
		return mall_ids;
	}
	/**
	 * @param mall_ids the mall_ids to set
	 */
	public void setMall_ids(List<String> mall_ids) {
		this.mall_ids = mall_ids;
	}
	/**
	 * @return the relation_status
	 */
	public Integer getRelation_status() {
		return relation_status;
	}
	/**
	 * @param relation_status the relation_status to set
	 */
	public void setRelation_status(Integer relation_status) {
		this.relation_status = relation_status;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年3月23日 下午5:17:38
	* @throws 
	*/
	@Override
	public String toString() {
		return "AdvertNewVo [id=" + id + ", position=" + position + ", adtime=" + adtime + ", module_type="
				+ module_type + ", content=" + content + ", content_type=" + content_type + ", status=" + status
				+ ", status_detail=" + status_detail + ", publish_start=" + publish_start + ", publish_end="
				+ publish_end + ", group_id=" + group_id + ", create_by=" + create_by + ", create_at=" + create_at
				+ ", update_by=" + update_by + ", update_at=" + update_at + ", adOrder=" + adOrder + ", holder="
				+ holder + ", mall_id=" + mall_id + ", relation_id=" + relation_id + ", relation_name=" + relation_name
				+ ", relation_code=" + relation_code + ", relation_url=" + relation_url + ", relation_status="
				+ relation_status + ", mall_ids=" + mall_ids + "]";
	}
}
