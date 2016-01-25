package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.content.entity.SysDocPic;
/**
 * 网页推荐版块内容返回数据
 * @author WZH
 *
 */
public class ContentInfoVO implements Serializable{
	
	public static final long serialVersionUID = 1L;
    /** ���� */
    private Integer id;

    /** ������ */
    private Integer createBy;

    /** ����ʱ�� */
    private String createAt;

    /** �޸��� */
    private Integer updateBy;

    /** �޸�ʱ�� */
    private String updateAt;

    /** �汾 */
    private Integer version;

    /** �Ƿ����0�� 1���� */
    private Integer isDisabled;

    /** ���id */
    private Integer forumId;

    /** ���� 0���� 1��Ʒ 2Ʒ��3���� */
    private Integer contentType;

    /** ���Ͷ�ӦID */
    private String contentTypeid;

    /** ������ʼ���� */
    private String contentStarttime;

    /** ������ֹ���� */
    private String contentEndtime;

    /** ���� ���� */
    private Integer contentSort;

    /** ���� */
    private String contentLink;
    
    private Date starttime;
    
    private Date endtime;
    
    /** 显示平台 */
    private Integer channel;
    
    public List<SysDocPic> getPhotosList() {
		return photosList;
	}

	public void setPhotosList(List<SysDocPic> photosList) {
		this.photosList = photosList;
	}

	private List<SysDocPic> photosList;
    
    /**
     * ����
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * ����
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ������
     * @return createBy
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * ������
     * @param createBy
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

  
    
    public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	/**
     * �޸���
     * @return updateBy
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * �޸���
     * @param updateBy
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

   
    /**
     * �汾
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * �汾
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * �Ƿ����0�� 1����
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    /**
     * �Ƿ����0�� 1����
     * @param isDisabled
     */
    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * ���id
     * @return forumId
     */
    public Integer getForumId() {
        return forumId;
    }

    /**
     * ���id
     * @param forumId
     */
    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    /**
     * ���� 0���� 1��Ʒ 2Ʒ��3����
     * @return contentType
     */
    public Integer getContentType() {
        return contentType;
    }

    /**
     * ���� 0���� 1��Ʒ 2Ʒ��3����
     * @param contentType
     */
    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    /**
     * ���Ͷ�ӦID
     * @return contentTypeid
     */
    public String getContentTypeid() {
        return contentTypeid;
    }

    /**
     * ���Ͷ�ӦID
     * @param contentTypeid
     */
    public void setContentTypeid(String contentTypeid) {
        this.contentTypeid = contentTypeid;
    }

    

    public String getContentStarttime() {
		return contentStarttime;
	}

	public void setContentStarttime(String contentStarttime) {
		this.contentStarttime = contentStarttime;
	}

	public String getContentEndtime() {
		return contentEndtime;
	}

	public void setContentEndtime(String contentEndtime) {
		this.contentEndtime = contentEndtime;
	}

    /**
     * ���� ����
     * @return contentSort
     */
    public Integer getContentSort() {
        return contentSort;
    }
    
    /**
     * ���� ����
     * @param contentSort
     */
    public void setContentSort(Integer contentSort) {
        this.contentSort = contentSort;
    }
    
    /**
     * ����
     * @return contentLink
     */
    public String getContentLink() {
        return contentLink;
    }

    /**
     * ����
     * @param contentLink
     */
    public void setContentLink(String contentLink) {
        this.contentLink = contentLink;
    }

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}
	
}
