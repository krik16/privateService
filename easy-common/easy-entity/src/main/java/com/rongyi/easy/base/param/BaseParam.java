package com.rongyi.easy.base.param;

/**
 * 接口参数基础类
 * @author baodk
 */
public class BaseParam {

    /** 接口版本号 */
    private String version;
    
    /**  */
    private String moduleId;
    
    /** 用户名 */
    private String userName;
    
    /** 密码 */
    private String password;
    
    public String getVersion() {
        return version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getModuleId() {
        return moduleId;
    }
    
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
