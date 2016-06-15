package com.rongyi.easy.coupon.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 核销佣金接口（新需求）
 *
 * @author Ventures
 */
public class ValidCommissionVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer totalPage;
    private Integer pageSize;
    private Integer currpage;
    private Integer number;
    private BigDecimal totalAmount;
    private List<ValidDate> myValidList;
    private List<ValidDate> myValidListMonth;

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrpage() {
        return currpage;
    }

    public void setCurrpage(Integer currpage) {
        this.currpage = currpage;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<ValidDate> getMyValidList() {
        return myValidList;
    }

    public void setMyValidList(List<ValidDate> myValidList) {
        this.myValidList = myValidList;
    }

    public static class ValidDate implements Serializable {
        private static final long serialVersionUID = 1L;
        private String date;
        private Integer count;
        private List<ValidCoupon> list;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public List<ValidCoupon> getList() {
            return list;
        }

        public void setList(List<ValidCoupon> list) {
            this.list = list;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("ValidDate{");
            sb.append("date='").append(date).append('\'');
            sb.append(", count=").append(count);
            sb.append(", list=").append(list);
            sb.append('}');
            return sb.toString();
        }

        public static class ValidCoupon implements Serializable {

            private static final long serialVersionUID = 1L;
            private String title;
            private String couponCode;
            private String phone;
            private String time;
            private BigDecimal currentPrice;
            private String buyerName;
            private Integer point;

            public String getBuyerName() {
                return buyerName;
            }

            public void setBuyerName(String buyerName) {
                this.buyerName = buyerName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCouponCode() {
                return couponCode;
            }

            public void setCouponCode(String couponCode) {
                this.couponCode = couponCode;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public BigDecimal getCurrentPrice() {
                return currentPrice;
            }

            public void setCurrentPrice(BigDecimal currentPrice) {
                this.currentPrice = currentPrice;
            }

            public Integer getPoint() {
                return point;
            }

            public void setPoint(Integer point) {
                this.point = point;
            }

            @Override
            public String toString() {
                final StringBuffer sb = new StringBuffer("ValidCoupon{");
                sb.append("title='").append(title).append('\'');
                sb.append(", couponCode='").append(couponCode).append('\'');
                sb.append(", phone='").append(phone).append('\'');
                sb.append(", time='").append(time).append('\'');
                sb.append(", currentPrice=").append(currentPrice);
                sb.append(", buyerName='").append(buyerName).append('\'');
                sb.append('}');
                return sb.toString();
            }

        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ValidCommissionVO{");
        sb.append("totalPage=").append(totalPage);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", currpage=").append(currpage);
        sb.append(", number=").append(number);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", myValidList=").append(myValidList);
        sb.append('}');
        return sb.toString();
    }

}
