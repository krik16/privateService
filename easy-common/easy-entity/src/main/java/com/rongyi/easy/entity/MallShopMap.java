package com.rongyi.easy.entity;

import java.util.Date;

public class MallShopMap implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**  */
    private Long id;

    /**  容易网shop ID*/
    private String ryShopId;

    /**  容易网Mall ID*/
    private String ryMallId;

    /**  外部店铺私有ID对应容易网ID*/
    private String outShopId;

    /**  外部商场私有ID对应容易网ID*/
    private String outMallId;

    /**  */
    private Date createAt;

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return ryShopId
     */
    public String getRyShopId() {
        return ryShopId;
    }

    /**
     * 
     * @param ryShopId
     */
    public void setRyShopId(String ryShopId) {
        this.ryShopId = ryShopId;
    }

    /**
     * 
     * @return ryMallId
     */
    public String getRyMallId() {
        return ryMallId;
    }

    /**
     * 
     * @param ryMallId
     */
    public void setRyMallId(String ryMallId) {
        this.ryMallId = ryMallId;
    }

    /**
     * 
     * @return outShopId
     */
    public String getOutShopId() {
        return outShopId;
    }

    /**
     * 
     * @param outShopId
     */
    public void setOutShopId(String outShopId) {
        this.outShopId = outShopId;
    }

    /**
     * 
     * @return outMallId
     */
    public String getOutMallId() {
        return outMallId;
    }

    /**
     * 
     * @param outMallId
     */
    public void setOutMallId(String outMallId) {
        this.outMallId = outMallId;
    }

    /**
     * 
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}