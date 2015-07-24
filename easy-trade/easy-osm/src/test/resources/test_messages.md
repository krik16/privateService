# 本文档用于保存测试时使用的各种事件消息

## 1. 买家下单
    {"timestamp":1427289204698,"body":{"order":{"addressId":"551271e0e4b01f10793edda1","buyerNum":"51f9eb5c31d65584ab00f563","comment":"陈军测试1","createTime":null,"discount":0,"estimateNextStatusTime":null,"id":0,"isComment":0,"logisticsBillId":"","orderNum":"1000000525168737","orderSource":0,"orderType":0,"paymentId":"","postage":14,"stateHoldLeftTime":0,"status":"","statusRoute":"","totalPrice":1500,"weidianId":"123"},"orderDetailNum":"","orderDetailList":[{"adultApplyTimes":0,"applicationFormId":0,"id":0,"itemNum":"550b8b99e4b0f4e962b0e2b1","judge":0,"orderNum":"1000000525168737s1","parentNum":"1000000525168737","paymentId":"","quantity":12,"realPrice":1500,"rebateId":0,"refundApplyTimes":0,"refundMoney":0,"specNum":"550b8b99e4b0f4e962b0e2b0","status":"","successRefund":0,"unitPrice":125}],"orderNum":"1000000525168737"},"source":"0001","type":"1"}
    
## 2. 买家付款

     {"timestamp":1427426998012,"body":{"orderDetailNum":"","paymentId":1126,"orderNum":"11591"},"source":"rpb","type":"4"}
     
    
## 12. 买家申请维权
    {"timestamp":1427290903832,"body":{"orderDetailNum":"201803243s2","orderNum":"201803243","comment":"质量问题"},"source":"0001","type":"12"}
    
## Debug.Reload 重新加载订单数据-调试
    {"timestamp":0,"body":{"orderDetailNum":null,"orderNum":"201803243"},"source":"debug","type":"Debug.Reload"}