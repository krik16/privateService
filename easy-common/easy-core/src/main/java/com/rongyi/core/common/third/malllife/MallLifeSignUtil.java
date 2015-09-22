package com.rongyi.core.common.third.malllife;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  签名验证
 * time:  2015/9/22
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/22              1.0            创建文件
 *
 */

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.third.exception.ThirdException;
import com.rongyi.core.common.third.md5.Md5Util;
import com.rongyi.core.common.third.param.user.UserThirdParam;

public class MallLifeSignUtil {

    public static Boolean verificationSign(UserThirdParam userThirdParam)throws ThirdException{
        Boolean istrue=false;
        try{
            String str="data="+userThirdParam.getData()+"&timeStamp="+userThirdParam.getTimeStamp()+"&channel="+userThirdParam.getChannel()+"&token="+MallLifeThirdConfig.QMCAIFU_CHANNEL.TOKEN;
            String md5Sign= Md5Util.GetMD5Code(str);
            if(md5Sign.equals(userThirdParam.getSign())){
                istrue=true;
            }
        }catch (Exception e){
             throw new ThirdException("验证签名发生异常");
        }

        return istrue;

    }



}
