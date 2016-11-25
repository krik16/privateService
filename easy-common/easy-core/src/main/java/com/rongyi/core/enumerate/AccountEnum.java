package com.rongyi.core.enumerate;

import java.util.HashMap;


/**
 * 账号相关错误码常量
 * @ClassName: AccountEnum 
 * @Description: 
 * @author Kenny
 * @date 2016年10月31日 下午2:49:06 
 *
 */
public enum AccountEnum {
    
    SUCCESS(0, "正常"),
    
    /** 系统性错误 */
    ERROR_SYSTEM(1090001, "系统错误"),
    ERROR_PARAM(1090002, "必要参数不合法或无效"),
    //ERROR_SYSTEM("-11", "网络正在打瞌睡，请稍后再试"),

    /** 业务错误**/
    ERROR_ACCOUNT_EMPTY(1090010, "账号不能为空"),
	ERROR_ACCOUNT_REGISTERED(1090011, "账号已被注册"),
	ERROR_NICKNAME_EMPTY(1090012, "昵称不能为空"),
	ERROR_NICKNAME_REGISTERED(1090013, "昵称已被注册"),
	ERROR_PHONE_INVALID(1090014, "请输入11位手机号码"),
	ERROR_PHONE_REGISTERED(1090015, "手机号已存在，不可创建账号"),
	ERROR_USERLOGO_EMPTY(1090016, "头像不能为空"),
	ERROR_INDUSTRY_EMPTY(1090017, "行业不能为空"),
	ERROR_INDUSTRY_VERSION_EMPTY(1090018, "行业版本不能为空"),
	ERROR_IDENTITY_EMPTY(1090019, "商户类型不能为空"),
	ERROR_IDENTITYNAME_EMPTY(1090020, "商户不能为空"),
	ERROR_CHILDACCOUNTNUM_INVALID(1090021, "子账号数量不正确"),
	ERROR_CONTRACTCODE_INVALID(1090022, "合同编码不可大于20个字符"),
	ERROR_ACCOUNT_REPEAT(1090023, "此商户已有账户关联，无法创建"),
	ERROR_PICTURE_ERROR(1090024, "图片上传失败"),
	ERROR_USERNAME_INVALID(1090025, "请输入4-10字符内姓名"),
	ERROR_MEMO_INVALID(1090026, "请输入200字符内备注信息"),
	ERROR_CARDID_INVALID(1090027, "请输入18位的身份证号码"),
	ERROR_HASCHIEF(1090028,"该商家已有主账号"),
    ERROR_CHILDACCOUNTNUM_MANY(1090029,"子账号数量已超出限制"),
    ERROR_VALIDDATE_INVALID(1090030,"有效期截止时间不能早于开始时间"),
    ERROR_ACCOUNT_NOTFOUND(1090031,"账号不存在"),
    ERROR_ACCOUNT_CHECKERROR(1090032,"此账号无法审核"),
    ERROR_ACCOUNT_MERCHANT_REL_ERROR(1090033,"关联商户信息已变更，请刷新重试"),	
    ERROR_ACCOUNT_MALL(1090034,"请选择所属商场"),
    ERROR_ACCOUNT_SHOP(1090035,"请选择所属店铺"),
    ERROR_FREEZE_FAILD(1090036,"冻结账号失败"),
    ERROR_UNFREEZE_FAILD(1090037,"解冻账号失败"),
    ERROR_ACCOUNT_CHECKED_ERROR(1090038,"该账号无法审核"),
    ERROR_NICKNAME_INVALID(1090039,"请输入长度在2-20字符内的昵称"),
    ERROR_CHILDACCOUNTNUM_TOOLOW(1090040, "子账户数量不可小于现有子账户数量")
    
    ;
   

    private Integer code;
    private String message; 
    private AccountEnum(Integer code, String message) {
        this.code = code; 
        this.message = message;
    }
    
    public Integer getCode(){
        return code; 
    }

    public String getMessage(){
        return message;
    }
    
    /**
     * Code枚举字典
     */
    private static HashMap<Integer, AccountEnum> codeEnumDic = new HashMap<Integer, AccountEnum>();
    static {
	    for (AccountEnum ce : AccountEnum.values()) {
	    	codeEnumDic.put(ce.getCode(), ce);
	    }
    }
    
    /**
     * 根据Code获取CodeEnum对象
     * @param code
     * @return
     */
    public static AccountEnum getCodeEnum(Integer code) {
    	return codeEnumDic.get(code);
    }
}
