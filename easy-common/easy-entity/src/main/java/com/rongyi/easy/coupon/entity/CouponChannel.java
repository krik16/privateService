package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 代金券渠道/ 导入渠道和推广渠道
 * @author lqy
 */
public class CouponChannel implements Serializable {
   
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String name;

    private Integer type;

    private Date createAt;

    private Integer status;
    private String code;//渠道邀请码
    private Integer thirdChanel;//0店长 1导购 2买手 3第三方渠道 渠道类型
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CouponChannel [id=").append(id).append(", name=").append(name).append(", type=").append(type)
				.append(", createAt=").append(createAt).append(", status=").append(status).append("]");
		return builder.toString();
	}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getThirdChanel() {
        return thirdChanel;
    }

    public void setThirdChanel(Integer thirdChanel) {
        this.thirdChanel = thirdChanel;
    }
}