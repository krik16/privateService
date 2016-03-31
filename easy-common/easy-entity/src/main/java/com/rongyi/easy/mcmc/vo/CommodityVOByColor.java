/**   
* @Title: CommodityVOByColor.java 
* @Package com.rongyi.easy.mcmc.vo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wzh   
* @date 2015年9月19日 上午10:05:40 
* @version V1.0   
*/
package com.rongyi.easy.mcmc.vo;

import java.util.List;

/** 
 * @ClassName: CommodityVOByColor 
 * @Description: TODO
 * @author wzh
 * @date 2015年9月19日 上午10:05:40 
 *  
 */
public class CommodityVOByColor {
	
	private String columnName;//规格名字
	private String columnValue;//规格属性
	private String columnNote;//规格备注
	private List<CommoditySpecVO1> specList;//规格属性
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnValue() {
		return columnValue;
	}
	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}
	public String getColumnNote() {
		return columnNote;
	}
	public void setColumnNote(String columnNote) {
		this.columnNote = columnNote;
	}
	public List<CommoditySpecVO1> getSpecList() {
		return specList;
	}
	public void setSpecList(List<CommoditySpecVO1> specList) {
		this.specList = specList;
	}
}
