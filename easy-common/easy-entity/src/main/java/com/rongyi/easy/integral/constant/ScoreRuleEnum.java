package com.rongyi.easy.integral.constant;
/**
 * 
* @Title: ScoreRuleEnum.java 
* @Package com.rongyi.easy.integral.constant 
* @Description:积分类型 
* @author zzq 
* @date 2015-7-17 下午4:45:55
 */
public enum ScoreRuleEnum { 
	    SCORE_UPLOAD_HEAD(1,"上传头像"),
	    SCORE_MALL_COMMENT(2,"评论店铺或商场"),
	    SCORE_ORDER_COMMENT(3,"订单评论"),
	    SCORE_SIGN_IN(4,".每日签到"),
	    SCORE_ORDER_SUB(5,"下单扣减"),
	    SCORE_PAY_TIMEOUT_ROLLBACK(6,"支付超时恢复积分"),
 	    SCORE_COUPON_ADD(8,"验券成功加积分"),
	    SCORE_PAY_SUCCESS_ADD(9,"交易成功加积分");
 
	ScoreRuleEnum(Integer code,String value){
	        this.code = code;
	        this.value = value;
	    }

	    
	    private Integer code;
	    
	    private String value;
	    
	    public Integer getCode() {
	        return code;
	    }



	    public String getValue() {
	        return value;
	    }
}

