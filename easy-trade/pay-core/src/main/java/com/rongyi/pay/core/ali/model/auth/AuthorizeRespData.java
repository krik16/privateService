package com.rongyi.pay.core.ali.model.auth;

import com.alipay.api.response.AlipayOpenAuthTokenAppResponse;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.rongyi.pay.core.util.BaseData;

import java.io.Serializable;

/**
 * conan
 * 2016/10/31 16:52
 **/
public class AuthorizeRespData extends BaseData implements Serializable {

    private static final long serialVersionUID = -3037723644026824940L;
    private String appAuthCode;

    private String appId;

    private String scope;

    private String storeId;//门店id

    private String authType;//授权类型，0:验证开发者公钥信息,1商户授权，2:用户授权

    private AlipayOpenAuthTokenAppResponse alipayOpenAuthTokenAppResponse;//商户授权token

    private AlipaySystemOauthTokenResponse alipaySystemOauthTokenResponse; //用户授权token

    public String getAppAuthCode() {
        return appAuthCode;
    }

    public void setAppAuthCode(String appAuthCode) {
        this.appAuthCode = appAuthCode;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public AlipayOpenAuthTokenAppResponse getAlipayOpenAuthTokenAppResponse() {
        return alipayOpenAuthTokenAppResponse;
    }

    public void setAlipayOpenAuthTokenAppResponse(AlipayOpenAuthTokenAppResponse alipayOpenAuthTokenAppResponse) {
        this.alipayOpenAuthTokenAppResponse = alipayOpenAuthTokenAppResponse;
    }

    public AlipaySystemOauthTokenResponse getAlipaySystemOauthTokenResponse() {
        return alipaySystemOauthTokenResponse;
    }

    public void setAlipaySystemOauthTokenResponse(AlipaySystemOauthTokenResponse alipaySystemOauthTokenResponse) {
        this.alipaySystemOauthTokenResponse = alipaySystemOauthTokenResponse;
    }
}
