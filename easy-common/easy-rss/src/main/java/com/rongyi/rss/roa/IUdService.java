package com.rongyi.rss.roa;


public interface IUdService {
    
    /**
     * 推送修改的id信息
     * @param push
     * @return
     * @throws Exception
     */
    public boolean push(String mallMid,String field,String valueId,String sourceSystem) throws Exception;
   
}
