package com.rongyi.tms.util;

/**
 * @author chenjun
 * @date 2017/2/19 16:13
 */
public class Num {

    private int num;

    public Num(int num) {
        this.num = num;
    }

    public synchronized int getNum(){
        return num++;
    }

}
