package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class MalllifeUninstallRecordEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    /**  */
    private Long id;

    /** 0卸载 1回心转意 */
    private Integer isAgain;

    /** 卸载原因 1 界面不美、2 商品太贵啦、3 太费流量啦、4 没想要的优惠信息、5 喜欢上别人啦 6 我要吐槽 */
    private Integer unType;

    /** 吐槽内容 */
    private String content;

    /** 卸载时间 */
    private Date createAt;

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 0卸载 1回心转意
     * @return isAgain
     */
    public Integer getIsAgain() {
        return isAgain;
    }

    /**
     * 0卸载 1回心转意
     * @param isAgain
     */
    public void setIsAgain(Integer isAgain) {
        this.isAgain = isAgain;
    }

    /**
     * 卸载原因 1 界面不美、2 商品太贵啦、3 太费流量啦、4 没想要的优惠信息、5 喜欢上别人啦 6 我要吐槽
     * @return unType
     */
    public Integer getUnType() {
        return unType;
    }

    /**
     * 卸载原因 1 界面不美、2 商品太贵啦、3 太费流量啦、4 没想要的优惠信息、5 喜欢上别人啦 6 我要吐槽
     * @param unType
     */
    public void setUnType(Integer unType) {
        this.unType = unType;
    }

    /**
     * 吐槽内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 吐槽内容
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 卸载时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 卸载时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

	@Override
	public String toString() {
		return "MalllifeUninstallRecordEntity [id=" + id + ", isAgain="
				+ isAgain + ", unType=" + unType + ", content=" + content
				+ ", createAt=" + createAt + "]";
	}
}