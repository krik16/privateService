package com.rongyi.easy.msgcenter.merchant;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/6/13 14:51
 * Package:com.rongyi.easy.msgcenter.merchant
 * Project:easy-mobile
 */
public class StatisticsVO implements Serializable{
    public int total;
    public int read;
    public int unread;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getUnread() {
        return unread;
    }

    public void setUnread(int unread) {
        this.unread = unread;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StatisticsVO{");
        sb.append("total=").append(total);
        sb.append(", read=").append(read);
        sb.append(", unread=").append(unread);
        sb.append('}');
        return sb.toString();
    }
}
