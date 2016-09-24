package com.rongyi.easy.activitymanage.vo;

import java.io.Serializable;
import java.util.Date;

public class ActivityInfoSimple implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4898214819991104424L;

	/**
     * PK
     */
    private Integer id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动开始时间
     */
    private Date startAt;

    /**
     * 活动结束时间
     */
    private Date endAt;

    
    /**
     * 活动报名开始时间
     */
    private Date enrollStartAt;
    /**
     * 活动报名结束时间
     */
    private Date enrollEndAt;
    /**
     * 描述
     */
    private String description;//描述
	
    /**当前是否已报名*/
	private boolean isJoined;
	
	
	
}
