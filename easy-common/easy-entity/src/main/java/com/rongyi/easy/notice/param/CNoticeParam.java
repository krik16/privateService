package com.rongyi.easy.notice.param;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * notice保存修改参数
 * @author lijing
 * @time 2015-09-10
 */
public class CNoticeParam implements Serializable{
	 private Integer id;
	    /**公告内容*/
	    private String content;
	    /**店铺名字*/
	    private String shopName;
	    /**店铺id*/
	    private String shopMid;
	    /**发布时间*/
	    private Date publishBeginAt;
	    /**结束时间*/
	    private Date publishEndAt;
	    /**创建人id*/
	    private String createOrupdateUserid;
	    /**
	     * 图片
	     */
	    private List<String> pics;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getShopName() {
			return shopName;
		}
		public void setShopName(String shopName) {
			this.shopName = shopName;
		}
		public String getShopMid() {
			return shopMid;
		}
		public void setShopMid(String shopMid) {
			this.shopMid = shopMid;
		}
		public Date getPublishBeginAt() {
			return publishBeginAt;
		}
		public void setPublishBeginAt(Date publishBeginAt) {
			this.publishBeginAt = publishBeginAt;
		}
		public Date getPublishEndAt() {
			return publishEndAt;
		}
		public void setPublishEndAt(Date publishEndAt) {
			this.publishEndAt = publishEndAt;
		}
		public String getCreateOrupdateUserid() {
			return createOrupdateUserid;
		}
		public void setCreateOrupdateUserid(String createOrupdateUserid) {
			this.createOrupdateUserid = createOrupdateUserid;
		}
		public List<String> getPics() {
			return pics;
		}
		public void setPics(List<String> pics) {
			this.pics = pics;
		}
	    
	    
}
