package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 潮人攻略首页VO
 * @author sj
 *
 */
public class RaidersHomeVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<RaidersAppVo> raidersList; //潮人攻略List
	private ActivityModuleVO moduleVo;   //版块VO
	
	public List<RaidersAppVo> getRaidersList() {
		return raidersList;
	}
	public void setRaidersList(List<RaidersAppVo> raidersList) {
		this.raidersList = raidersList;
	}
	public ActivityModuleVO getModuleVo() {
		return moduleVo;
	}
	public void setModuleVo(ActivityModuleVO moduleVo) {
		this.moduleVo = moduleVo;
	}
}
