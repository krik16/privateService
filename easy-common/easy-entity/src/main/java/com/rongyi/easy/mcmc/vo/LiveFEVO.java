package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * EF端直播vo
 * 
 * @author xiaobo
 *
 */
public class LiveFEVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 直播id
	 */
	private String liveId;

	/**
	 * 直播名
	 */
	private String liveName;

	/**
	 * 买手id
	 */
	private String bullId;

	/**
	 * 买手昵称
	 */
	private String bullNickName;

	/**
	 * 直播开始时间
	 */
	private long beginTime;

	/**
	 * 直播结束时间
	 */
	private long endTime;

	/**
	 * 创建时间
	 */
	private long createTime;

	/**
	 * 直播状态 [0:发布/预热中，1:上线/进行中，2:下线(已过期)]
	 */
	private int status;

	private List<String> urlList;

	public List<String> getUrlList() {
		return urlList;
	}

	public void setUrlList(List<String> urlList) {
		this.urlList = urlList;
	}

	/**
	 * 买手手机号
	 */
	private String bullPhone;
	
	public String getLiveId() {
		return liveId;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

	public String getLiveName() {
		return liveName;
	}

	public void setLiveName(String liveName) {
		this.liveName = liveName;
	}

	public String getBullId() {
		return bullId;
	}

	public void setBullId(String bullId) {
		this.bullId = bullId;
	}

	public String getBullNickName() {
		return bullNickName;
	}

	public void setBullNickName(String bullNickName) {
		this.bullNickName = bullNickName;
	}

	public long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getBullPhone() {
		return bullPhone;
	}

	public void setBullPhone(String bullPhone) {
		this.bullPhone = bullPhone;
	}
}
