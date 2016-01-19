package com.rongyi.easy.solr.retrival.result;

/**
 *商场数据
 */
import java.io.Serializable;
import java.util.List;



import com.rongyi.easy.solr.retrival.DBData;

public class NoteMallInfo extends Result  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9062153961464821893L;
	private List<PoiData> result;

	@Override
	public void setResults(List<DBData> res, boolean detail) {
		
	}

	public List<PoiData> getResult() {
		return result;
	}

	public void setResult(List<PoiData> result) {
		this.result = result;
	}

	
}
