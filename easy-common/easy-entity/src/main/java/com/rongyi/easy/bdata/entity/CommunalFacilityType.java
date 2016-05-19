package com.rongyi.easy.bdata.entity;

import java.io.Serializable;

/**
 * Desc: CommunalFacilityType
 * User: chris
 * Date: 2015/10/31 2:59
 */
public class CommunalFacilityType implements Serializable{

	private static final long serialVersionUID = 6118559857223824933L;
	private Long      id;
    private String    title;
    private String    type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
