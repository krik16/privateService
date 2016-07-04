package com.rongyi.core.common.third.malllife;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  签名验证
 * time:  2015/9/22
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/22              1.0            创建文件
 *
 */

import com.rongyi.core.common.third.exception.ThirdException;
import com.rongyi.core.common.third.md5.Md5Util;
import com.rongyi.core.common.third.param.ThirdBaseParam;
import com.rongyi.core.common.third.param.user.UserThirdParam;

public class MallLifeSignUtil {


    /**
     * 验证签名是否正确
     * @param userThirdParam 请求参数
     * @param token 约定token
     * @return 错误 false; 正确 true
     * @throws ThirdException
     */
    public static Boolean verificationSign(UserThirdParam userThirdParam,String token)throws ThirdException{
        Boolean istrue=false;
        try{
            String str="data="+userThirdParam.getData()+"&timeStamp="+userThirdParam.getTimeStamp()+"&channel="+userThirdParam.getChannel()+"&token="+token;
            String md5Sign= Md5Util.GetMD5Code(str);
            if(md5Sign.equals(userThirdParam.getSign())){
                istrue=true;
            }
        }catch (Exception e){
             throw new ThirdException("验证签名发生异常");
        }

        return istrue;

    }

    /**
     * 验证签名是否正确
     * @param thirdBaseParam 请求参数
     * @param token 约定token
     * @return 错误 false; 正确 true
     * @throws ThirdException
     */
    public static Boolean BaseverificationSign(ThirdBaseParam thirdBaseParam,String token)throws ThirdException{
        Boolean istrue=false;
        try{
            String str="data="+thirdBaseParam.getData()+"&timeStamp="+thirdBaseParam.getTimeStamp()+"&channel="+thirdBaseParam.getChannel()+"&token="+token;
            String md5Sign= Md5Util.GetMD5Code(str);
            if(md5Sign.equals(thirdBaseParam.getSign())){
                istrue=true;
            }
        }catch (Exception e){
            throw new ThirdException("验证签名发生异常");
        }

        return istrue;

    }

    /**
     * 验证签名是否正确(按首字符排序后再验签)
     * @param userThirdParam 请求参数
     * @param token 约定token
     * @return 错误 false; 正确 true
     * @throws ThirdException
     */
    public static Boolean verificationSignSort(UserThirdParam userThirdParam,String token)throws ThirdException{
        Boolean istrue=false;
        try{
            String str="channel="+userThirdParam.getChannel()+"&data="+userThirdParam.getData()+"&timeStamp="+userThirdParam.getTimeStamp()+"&token="+token;
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
