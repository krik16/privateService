package com.rongyi.pay.core.webank.model;

import com.rongyi.pay.core.util.BaseData;

import java.util.List;

/**
 * 微众获取用于支付宝请求签名所需tikect
 * Created by sujuan on 2017/3/6.
 */
public class WaTicketResData extends BaseData{
    //返回结果码
    private String code;

    //请求时间
    private String transactionTime ;

    //tikect对象数组
    private List<Ticket> tickets ;

    class Ticket{
        //ticket值
        private String value ;

        //ticket最大生存时间
        private String expire_in ;

        //失效的绝对时间戳
        private String expire_time ;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getExpire_in() {
            return expire_in;
        }

        public void setExpire_in(String expire_in) {
            this.expire_in = expire_in;
        }

        public String getExpire_time() {
            return expire_time;
        }

        public void setExpire_time(String expire_time) {
            this.expire_time = expire_time;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
