package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.List;

public class ForumVO implements Serializable{
    //这里要加上位置这个字段为以后准备
	
	    private Integer id;
		/**模块的名字*/
		public String title;
		/**模块的顺序*/
		private Integer sortIdx;
		/**省份id*/
		private String provId;
		/**城市id*/
		private String cityId;
		/**位置的内容*/
		private List<PositionVO> positionList;
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Integer getSortIdx() {
			return sortIdx;
		}
		public void setSortIdx(Integer sortIdx) {
			this.sortIdx = sortIdx;
		}
		public String getProvId() {
			return provId;
		}
		public void setProvId(String provId) {
			this.provId = provId;
		}
		public String getCityId() {
			return cityId;
		}
		public void setCityId(String cityId) {
			this.cityId = cityId;
		}
		public List<PositionVO> getPositionList() {
			return positionList;
		}
		public void setPositionList(List<PositionVO> positionList) {
			this.positionList = positionList;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		
		
		 
}
