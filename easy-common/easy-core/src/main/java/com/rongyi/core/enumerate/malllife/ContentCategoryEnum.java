package com.rongyi.core.enumerate.malllife;

/**
 * @author jiejie 2014年6月30日 上午10:37:20
 */
public enum ContentCategoryEnum {
    BENIFIT("benifit", "Mall·福利"), SPECIAL("special", "Mall·专题"), CHILD("child", "亲子乐"), ACTIVITY("activity", "爱娱乐"),
    MODEL("model", "专柜货"), EAT("eat", "吃货街"), ART("art", "Mall·艺术"),STRATEGY("strategy","Mall·攻略");

    private String value;
    private String category;
    
    public String getCategory() {
		return category;
	}

	private ContentCategoryEnum(String value, String category) {
		this.value = value;
		this.category = category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static ContentCategoryEnum getEnum(String value) {
        for (ContentCategoryEnum ce : values()) {
            if (ce.getValue().equals(value)) {
                return ce;
            }
        }
        return null;
    }
    
    //亲子乐
    public static boolean isChild(String value) {
        return CHILD.getValue().equals(value);
    }
    
    //爱娱乐
    public static boolean isActivity(String value) {
        return ACTIVITY.getValue().equals(value);
    }
    
    //吃货街
    public static boolean isEAT(String value) {
        return EAT.getValue().equals(value);
    }
}
