package com.rongyi.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解 (需要比较的方法上标注)
 *
 * @author  yaoyiwei
 * @date 2016-05-05
 * @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NeedCheck {
    String getFieldName();
}
