package com.rongyi.easy.roa.entity;

import java.io.Serializable;
import java.util.Date;

public class UdPublishLog  implements Serializable{
	private static final long serialVersionUID = 1649193348931406951L;

	private Integer id;

    private String mallMid;

    private Date createAt;

    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid == null ? null : mallMid.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}