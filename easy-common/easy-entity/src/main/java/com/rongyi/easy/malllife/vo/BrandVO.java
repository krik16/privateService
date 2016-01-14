package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

public class BrandVO implements Serializable{
        private String icon;
        private String ename;
        private String name;
        
        private String keyTags;   //关键标签，shop需要.   
		
        public String getKeyTags() {
			return keyTags;
		}
		public void setKeyTags(String keyTags) {
			this.keyTags = keyTags;
		}
		public String getIcon() {
			return icon;
		}
		public String getEname() {
			return ename;
		}
		public String getName() {
			return name;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public void setName(String name) {
			this.name = name;
		}
        
}
