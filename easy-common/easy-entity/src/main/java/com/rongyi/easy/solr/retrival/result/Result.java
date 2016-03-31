package com.rongyi.easy.solr.retrival.result;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.solr.retrival.DBData;


public abstract class Result implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7608586093715127823L;
	private Info meta;
	public Info getMeta() {
		return meta;
	}

	public void setMeta(Info meta) {
		this.meta =  meta;
	}

	public abstract void setResults(List<DBData> res, boolean detail); 
}
