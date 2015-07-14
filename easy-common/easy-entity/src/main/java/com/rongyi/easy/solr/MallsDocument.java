package com.rongyi.easy.solr;

import org.apache.solr.client.solrj.beans.Field;


/**
 * 商场索引文档
 * @author lim
 */
public class MallsDocument implements java.io.Serializable{
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Field
    private String id;
    
    /** 商场名称 */
    @Field
    private String name;
    
    @Field
    private String area1;
    
    @Field
    private String area2;
    
    @Field
    private String area3;
    
    @Field
    private String area4;

	public MallsDocument() {
		super();
	}

	public MallsDocument(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea1() {
		return area1;
	}

	public void setArea1(String area1) {
		this.area1 = area1;
	}

	public String getArea2() {
		return area2;
	}

	public void setArea2(String area2) {
		this.area2 = area2;
	}

	public String getArea3() {
		return area3;
	}

	public void setArea3(String area3) {
		this.area3 = area3;
	}

	public String getArea4() {
		return area4;
	}

	public void setArea4(String area4) {
		this.area4 = area4;
	}
    
    
}
