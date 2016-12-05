package com.rongyi.core.bean;

import com.rongyi.core.constant.Constants;

import java.io.Serializable;

/**
 * Dubbo输出VO类（泛型显现返回对象类型）
 *
 * @author wangjh7
 * @date 2016-10-26
 */
public class DubboVO<T> implements Serializable {

    /**
     * 成功
     *
     * @return
     */
    public static <T> DubboVO<T> success() {
        return success(null);
    }

    /**
     * 成功-带返回值
     *
     * @return
     */
    public static <T> DubboVO<T> success(T object) {
        DubboVO<T> vo = new DubboVO<T>();
        vo.setObject(object);
        return vo;
    }

    /**
     * 失败
     *
     * @return
     */
    public static <T> DubboVO<T> error() {
        return error(Constants.ErrorCode.ERROR);
    }

    /**
     * 失败-枚举值
     *
     * @return
     */
    public static <T> DubboVO<T> error(Constants.ErrorCode errorCode) {
        return error(errorCode.getCode(), errorCode.getMessage());
    }

    /**
     * 失败-异常值
     *
     * @return
     */
    public static <T> DubboVO<T> error(Exception exception) {
        return error(Constants.ErrorCode.ERROR.getCode(), exception.getMessage());
    }

    /**
     * 失败-自定义值
     *
     * @return
     */
    public static <T> DubboVO<T> error(int code, String msg) {
        DubboVO<T> vo = new DubboVO<T>();
        vo.setCode(code);
        vo.setMessage(msg);
        return vo;
    }

    /**
     * 是否成功
     *
     * @return
     */
    public boolean isSuccess() {
        return Constants.ErrorCode.SUCCESS.getCode() == code;
    }

    /**
     * 是否含有数据
     *
     * @return
     */
    public boolean hasObject() {
        return Constants.ErrorCode.SUCCESS.getCode() == code && null != object;
    }


    // 状态 0：成功 >0：失败
    private int code;
    // 文字提示
    private String message;
    // 通用对象
    private T object;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "DubboVO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", object=" + object +
                '}';
    }
}