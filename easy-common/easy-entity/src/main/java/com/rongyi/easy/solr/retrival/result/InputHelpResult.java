package com.rongyi.easy.solr.retrival.result;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rongyi.easy.solr.retrival.DBData;


public class InputHelpResult extends Result  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7726618129093910562L;
	private List<InputData> datas;
	
	public List<InputData> getDatas() {
		return datas;
	}

	public void setDatas(List<InputData> datas) {
		this.datas = datas;
	}

	@Override
	public void setResults(List<DBData> res, boolean detail) {
		// TODO Auto-generated method stub
		if(null == datas)
			datas = new ArrayList<>();
		else
			datas.clear();
		for(int i = 0; i < res.size(); i ++) {
			InputData inputData = new InputData();
			inputData.setName(res.get(i).name);
			datas.add(inputData);
		}
	}

}
