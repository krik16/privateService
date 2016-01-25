package com.rongyi.easy.huanxin;

import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;

import java.io.Serializable;
public class HuanxinParam implements Serializable {

	private static final long serialVersionUID = 1L;
	/** 修改密码时是原用户实体 */
	private UserInfoVO userVO;

	/** 修改密码时是原用户实体 */
	private RmmmUserInfoEntity user;
	/** 注册请求为1， 修改密码请求为2 */
	private Integer type;
	/** 注册环信的新账户名 */
	private String huanXinIMID;
	/** 修改密码时为新密码 */
	private String newpassword;
	/** 修改昵称时为新昵称 */
	private String newNickname;

	public RmmmUserInfoEntity getUser() {
		return user;
	}

	public void setUser(RmmmUserInfoEntity user) {
		this.user = user;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getHuanXinIMID() {
		return huanXinIMID;
	}

	public void setHuanXinIMID(String huanXinIMID) {
		this.huanXinIMID = huanXinIMID;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String getNewNickname() {
		return newNickname;
	}

	public void setNewNickname(String newNickname) {
		this.newNickname = newNickname;
	}

	public UserInfoVO getUserVO() {
		return userVO;
	}

	public void setUserVO(UserInfoVO userVO) {
		this.userVO = userVO;
	}


}
