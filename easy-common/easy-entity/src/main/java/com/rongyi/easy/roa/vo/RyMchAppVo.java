package com.rongyi.easy.roa.vo;

/**
 * conan
 * 2017/2/21 10:59
 **/
public class RyMchAppVo {

    private String ryMchId;

    private String ryMchName;

    private String ryAppId;

    private String token;

    private String privateKey;

    private String publicKey;

    public String getRyMchId() {
        return ryMchId;
    }

    public void setRyMchId(String ryMchId) {
        this.ryMchId = ryMchId;
    }

    public String getRyMchName() {
        return ryMchName;
    }

    public void setRyMchName(String ryMchName) {
        this.ryMchName = ryMchName;
    }

    public String getRyAppId() {
        return ryAppId;
    }

    public void setRyAppId(String ryAppId) {
        this.ryAppId = ryAppId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
