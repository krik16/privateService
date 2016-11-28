package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rongyi.easy.mcmc.CommoditySpecColumn;
import com.rongyi.easy.mcmc.param.CommoditySpecParam;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;


public class CommoditySpecColumnVO implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 302492299841268843L;

	private String columnId;
	private String columnName;
	private String columnValue;
	private String columnNote;//规格备注
	private boolean isRequired;
	
	public CommoditySpecColumnVO(){
		
	}
	public CommoditySpecColumnVO(CommoditySpecColumn specColumn){
		this.columnId = specColumn.getId().toString();
		this.columnName = specColumn.getName();
		this.isRequired = specColumn.isRequired();
	}
	public String getColumnId() {
		return columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
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
	public boolean isRequired() {
		return isRequired;
	}
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("columnId", columnId)
				.append("columnName", columnName)
				.append("columnValue", columnValue)
				.append("columnNote", columnNote)
				.append("isRequired", isRequired)
				.toString();
	}

	public String getColumnNote() {
		return columnNote;
	}
	public void setColumnNote(String columnNote) {
		this.columnNote = columnNote;
	}

	public List<CommoditySpecColumnVO> getSpecColumnInfo(CommoditySpecParam param) {
		List<CommoditySpecColumnVO> list = new ArrayList<>();

		//设置商品规格
		for(int i=0; i< param.getColumnIds().size(); i++) {
			CommoditySpecColumnVO specColumnVO = new CommoditySpecColumnVO();

			specColumnVO.setColumnId(param.getColumnIds().get(i).toString());
			specColumnVO.setColumnValue(param.getColumnValues().get(i));

			if(CollectionUtils.isNotEmpty(param.getColumnNotes()) &&
					StringUtils.isNotBlank(param.getColumnNotes().get(i))) {
				specColumnVO.setColumnNote(param.getColumnNotes().get(i));
			} else {
				specColumnVO.setColumnNote("");
			}
			specColumnVO.setRequired(false);
			list.add(specColumnVO);
		}

		return list;
	}

}
