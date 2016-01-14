package com.rongyi.easy.osm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailFormEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailFormEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoIsNull() {
            addCriterion("order_item_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoIsNotNull() {
            addCriterion("order_item_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoEqualTo(String value) {
            addCriterion("order_item_no =", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoNotEqualTo(String value) {
            addCriterion("order_item_no <>", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoGreaterThan(String value) {
            addCriterion("order_item_no >", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_item_no >=", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoLessThan(String value) {
            addCriterion("order_item_no <", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoLessThanOrEqualTo(String value) {
            addCriterion("order_item_no <=", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoLike(String value) {
            addCriterion("order_item_no like", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoNotLike(String value) {
            addCriterion("order_item_no not like", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoIn(List<String> values) {
            addCriterion("order_item_no in", values, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoNotIn(List<String> values) {
            addCriterion("order_item_no not in", values, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoBetween(String value1, String value2) {
            addCriterion("order_item_no between", value1, value2, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoNotBetween(String value1, String value2) {
            addCriterion("order_item_no not between", value1, value2, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCommodityMidIsNull() {
            addCriterion("commodity_mid is null");
            return (Criteria) this;
        }

        public Criteria andCommodityMidIsNotNull() {
            addCriterion("commodity_mid is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityMidEqualTo(String value) {
            addCriterion("commodity_mid =", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidNotEqualTo(String value) {
            addCriterion("commodity_mid <>", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidGreaterThan(String value) {
            addCriterion("commodity_mid >", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_mid >=", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidLessThan(String value) {
            addCriterion("commodity_mid <", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidLessThanOrEqualTo(String value) {
            addCriterion("commodity_mid <=", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidLike(String value) {
            addCriterion("commodity_mid like", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidNotLike(String value) {
            addCriterion("commodity_mid not like", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidIn(List<String> values) {
            addCriterion("commodity_mid in", values, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidNotIn(List<String> values) {
            addCriterion("commodity_mid not in", values, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidBetween(String value1, String value2) {
            addCriterion("commodity_mid between", value1, value2, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidNotBetween(String value1, String value2) {
            addCriterion("commodity_mid not between", value1, value2, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(BigDecimal value) {
            addCriterion("real_amount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_amount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(BigDecimal value) {
            addCriterion("real_amount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(BigDecimal value) {
            addCriterion("real_amount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<BigDecimal> values) {
            addCriterion("real_amount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_amount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAppealTimesIsNull() {
            addCriterion("appeal_times is null");
            return (Criteria) this;
        }

        public Criteria andAppealTimesIsNotNull() {
            addCriterion("appeal_times is not null");
            return (Criteria) this;
        }

        public Criteria andAppealTimesEqualTo(Integer value) {
            addCriterion("appeal_times =", value, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andAppealTimesNotEqualTo(Integer value) {
            addCriterion("appeal_times <>", value, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andAppealTimesGreaterThan(Integer value) {
            addCriterion("appeal_times >", value, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andAppealTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("appeal_times >=", value, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andAppealTimesLessThan(Integer value) {
            addCriterion("appeal_times <", value, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andAppealTimesLessThanOrEqualTo(Integer value) {
            addCriterion("appeal_times <=", value, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andAppealTimesIn(List<Integer> values) {
            addCriterion("appeal_times in", values, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andAppealTimesNotIn(List<Integer> values) {
            addCriterion("appeal_times not in", values, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andAppealTimesBetween(Integer value1, Integer value2) {
            addCriterion("appeal_times between", value1, value2, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andAppealTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("appeal_times not between", value1, value2, "appealTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesIsNull() {
            addCriterion("refund_times is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimesIsNotNull() {
            addCriterion("refund_times is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimesEqualTo(Integer value) {
            addCriterion("refund_times =", value, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesNotEqualTo(Integer value) {
            addCriterion("refund_times <>", value, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesGreaterThan(Integer value) {
            addCriterion("refund_times >", value, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_times >=", value, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesLessThan(Integer value) {
            addCriterion("refund_times <", value, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesLessThanOrEqualTo(Integer value) {
            addCriterion("refund_times <=", value, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesIn(List<Integer> values) {
            addCriterion("refund_times in", values, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesNotIn(List<Integer> values) {
            addCriterion("refund_times not in", values, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesBetween(Integer value1, Integer value2) {
            addCriterion("refund_times between", value1, value2, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_times not between", value1, value2, "refundTimes");
            return (Criteria) this;
        }

        public Criteria andIsRefundedIsNull() {
            addCriterion("is_refunded is null");
            return (Criteria) this;
        }

        public Criteria andIsRefundedIsNotNull() {
            addCriterion("is_refunded is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefundedEqualTo(Integer value) {
            addCriterion("is_refunded =", value, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsRefundedNotEqualTo(Integer value) {
            addCriterion("is_refunded <>", value, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsRefundedGreaterThan(Integer value) {
            addCriterion("is_refunded >", value, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsRefundedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_refunded >=", value, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsRefundedLessThan(Integer value) {
            addCriterion("is_refunded <", value, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsRefundedLessThanOrEqualTo(Integer value) {
            addCriterion("is_refunded <=", value, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsRefundedIn(List<Integer> values) {
            addCriterion("is_refunded in", values, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsRefundedNotIn(List<Integer> values) {
            addCriterion("is_refunded not in", values, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsRefundedBetween(Integer value1, Integer value2) {
            addCriterion("is_refunded between", value1, value2, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsRefundedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_refunded not between", value1, value2, "isRefunded");
            return (Criteria) this;
        }

        public Criteria andIsJudgedIsNull() {
            addCriterion("is_judged is null");
            return (Criteria) this;
        }

        public Criteria andIsJudgedIsNotNull() {
            addCriterion("is_judged is not null");
            return (Criteria) this;
        }

        public Criteria andIsJudgedEqualTo(Integer value) {
            addCriterion("is_judged =", value, "isJudged");
            return (Criteria) this;
        }

        public Criteria andIsJudgedNotEqualTo(Integer value) {
            addCriterion("is_judged <>", value, "isJudged");
            return (Criteria) this;
        }

        public Criteria andIsJudgedGreaterThan(Integer value) {
            addCriterion("is_judged >", value, "isJudged");
            return (Criteria) this;
        }

        public Criteria andIsJudgedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_judged >=", value, "isJudged");
            return (Criteria) this;
        }

        public Criteria andIsJudgedLessThan(Integer value) {
            addCriterion("is_judged <", value, "isJudged");
            return (Criteria) this;
        }

        public Criteria andIsJudgedLessThanOrEqualTo(Integer value) {
            addCriterion("is_judged <=", value, "isJudged");
            return (Criteria) this;
        }

        public Criteria andIsJudgedIn(List<Integer> values) {
            addCriterion("is_judged in", values, "isJudged");
            return (Criteria) this;
        }

        public Criteria andIsJudgedNotIn(List<Integer> values) {
            addCriterion("is_judged not in", values, "isJudged");
            return (Criteria) this;
        }

        public Criteria andIsJudgedBetween(Integer value1, Integer value2) {
            addCriterion("is_judged between", value1, value2, "isJudged");
            return (Criteria) this;
        }

        public Criteria andIsJudgedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_judged not between", value1, value2, "isJudged");
            return (Criteria) this;
        }

        public Criteria andAppealIdIsNull() {
            addCriterion("appeal_id is null");
            return (Criteria) this;
        }

        public Criteria andAppealIdIsNotNull() {
            addCriterion("appeal_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppealIdEqualTo(Integer value) {
            addCriterion("appeal_id =", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotEqualTo(Integer value) {
            addCriterion("appeal_id <>", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThan(Integer value) {
            addCriterion("appeal_id >", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appeal_id >=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThan(Integer value) {
            addCriterion("appeal_id <", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThanOrEqualTo(Integer value) {
            addCriterion("appeal_id <=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdIn(List<Integer> values) {
            addCriterion("appeal_id in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotIn(List<Integer> values) {
            addCriterion("appeal_id not in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdBetween(Integer value1, Integer value2) {
            addCriterion("appeal_id between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appeal_id not between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListIsNull() {
            addCriterion("payment_id_list is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListIsNotNull() {
            addCriterion("payment_id_list is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListEqualTo(String value) {
            addCriterion("payment_id_list =", value, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListNotEqualTo(String value) {
            addCriterion("payment_id_list <>", value, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListGreaterThan(String value) {
            addCriterion("payment_id_list >", value, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListGreaterThanOrEqualTo(String value) {
            addCriterion("payment_id_list >=", value, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListLessThan(String value) {
            addCriterion("payment_id_list <", value, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListLessThanOrEqualTo(String value) {
            addCriterion("payment_id_list <=", value, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListLike(String value) {
            addCriterion("payment_id_list like", value, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListNotLike(String value) {
            addCriterion("payment_id_list not like", value, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListIn(List<String> values) {
            addCriterion("payment_id_list in", values, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListNotIn(List<String> values) {
            addCriterion("payment_id_list not in", values, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListBetween(String value1, String value2) {
            addCriterion("payment_id_list between", value1, value2, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andPaymentIdListNotBetween(String value1, String value2) {
            addCriterion("payment_id_list not between", value1, value2, "paymentIdList");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidIsNull() {
            addCriterion("commodity_spec_mid is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidIsNotNull() {
            addCriterion("commodity_spec_mid is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidEqualTo(String value) {
            addCriterion("commodity_spec_mid =", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidNotEqualTo(String value) {
            addCriterion("commodity_spec_mid <>", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidGreaterThan(String value) {
            addCriterion("commodity_spec_mid >", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_spec_mid >=", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidLessThan(String value) {
            addCriterion("commodity_spec_mid <", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidLessThanOrEqualTo(String value) {
            addCriterion("commodity_spec_mid <=", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidLike(String value) {
            addCriterion("commodity_spec_mid like", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidNotLike(String value) {
            addCriterion("commodity_spec_mid not like", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidIn(List<String> values) {
            addCriterion("commodity_spec_mid in", values, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidNotIn(List<String> values) {
            addCriterion("commodity_spec_mid not in", values, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidBetween(String value1, String value2) {
            addCriterion("commodity_spec_mid between", value1, value2, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidNotBetween(String value1, String value2) {
            addCriterion("commodity_spec_mid not between", value1, value2, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(String value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(String value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(String value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(String value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(String value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLike(String value) {
            addCriterion("coupon_id like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotLike(String value) {
            addCriterion("coupon_id not like", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<String> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<String> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(String value1, String value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(String value1, String value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionIsNull() {
            addCriterion("commodity_commission is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionIsNotNull() {
            addCriterion("commodity_commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionEqualTo(BigDecimal value) {
            addCriterion("commodity_commission =", value, "commodityCommission");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionNotEqualTo(BigDecimal value) {
            addCriterion("commodity_commission <>", value, "commodityCommission");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionGreaterThan(BigDecimal value) {
            addCriterion("commodity_commission >", value, "commodityCommission");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_commission >=", value, "commodityCommission");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionLessThan(BigDecimal value) {
            addCriterion("commodity_commission <", value, "commodityCommission");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_commission <=", value, "commodityCommission");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionIn(List<BigDecimal> values) {
            addCriterion("commodity_commission in", values, "commodityCommission");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionNotIn(List<BigDecimal> values) {
            addCriterion("commodity_commission not in", values, "commodityCommission");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_commission between", value1, value2, "commodityCommission");
            return (Criteria) this;
        }

        public Criteria andCommodityCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_commission not between", value1, value2, "commodityCommission");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}