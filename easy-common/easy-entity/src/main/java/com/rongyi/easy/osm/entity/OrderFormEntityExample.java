package com.rongyi.easy.osm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderFormEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderFormEntityExample() {
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

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNull() {
            addCriterion("express_fee is null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNotNull() {
            addCriterion("express_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeEqualTo(BigDecimal value) {
            addCriterion("express_fee =", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotEqualTo(BigDecimal value) {
            addCriterion("express_fee <>", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThan(BigDecimal value) {
            addCriterion("express_fee >", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("express_fee >=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThan(BigDecimal value) {
            addCriterion("express_fee <", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("express_fee <=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIn(List<BigDecimal> values) {
            addCriterion("express_fee in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotIn(List<BigDecimal> values) {
            addCriterion("express_fee not in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("express_fee between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("express_fee not between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeIsNull() {
            addCriterion("disconnt_fee is null");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeIsNotNull() {
            addCriterion("disconnt_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeEqualTo(BigDecimal value) {
            addCriterion("disconnt_fee =", value, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeNotEqualTo(BigDecimal value) {
            addCriterion("disconnt_fee <>", value, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeGreaterThan(BigDecimal value) {
            addCriterion("disconnt_fee >", value, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("disconnt_fee >=", value, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeLessThan(BigDecimal value) {
            addCriterion("disconnt_fee <", value, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("disconnt_fee <=", value, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeIn(List<BigDecimal> values) {
            addCriterion("disconnt_fee in", values, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeNotIn(List<BigDecimal> values) {
            addCriterion("disconnt_fee not in", values, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("disconnt_fee between", value1, value2, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andDisconntFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("disconnt_fee not between", value1, value2, "disconntFee");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIsNull() {
            addCriterion("express_info_id is null");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIsNotNull() {
            addCriterion("express_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdEqualTo(String value) {
            addCriterion("express_info_id =", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotEqualTo(String value) {
            addCriterion("express_info_id <>", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdGreaterThan(String value) {
            addCriterion("express_info_id >", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("express_info_id >=", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLessThan(String value) {
            addCriterion("express_info_id <", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLessThanOrEqualTo(String value) {
            addCriterion("express_info_id <=", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLike(String value) {
            addCriterion("express_info_id like", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotLike(String value) {
            addCriterion("express_info_id not like", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIn(List<String> values) {
            addCriterion("express_info_id in", values, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotIn(List<String> values) {
            addCriterion("express_info_id not in", values, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdBetween(String value1, String value2) {
            addCriterion("express_info_id between", value1, value2, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotBetween(String value1, String value2) {
            addCriterion("express_info_id not between", value1, value2, "expressInfoId");
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

        public Criteria andStatusRouteIsNull() {
            addCriterion("status_route is null");
            return (Criteria) this;
        }

        public Criteria andStatusRouteIsNotNull() {
            addCriterion("status_route is not null");
            return (Criteria) this;
        }

        public Criteria andStatusRouteEqualTo(String value) {
            addCriterion("status_route =", value, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteNotEqualTo(String value) {
            addCriterion("status_route <>", value, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteGreaterThan(String value) {
            addCriterion("status_route >", value, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteGreaterThanOrEqualTo(String value) {
            addCriterion("status_route >=", value, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteLessThan(String value) {
            addCriterion("status_route <", value, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteLessThanOrEqualTo(String value) {
            addCriterion("status_route <=", value, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteLike(String value) {
            addCriterion("status_route like", value, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteNotLike(String value) {
            addCriterion("status_route not like", value, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteIn(List<String> values) {
            addCriterion("status_route in", values, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteNotIn(List<String> values) {
            addCriterion("status_route not in", values, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteBetween(String value1, String value2) {
            addCriterion("status_route between", value1, value2, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andStatusRouteNotBetween(String value1, String value2) {
            addCriterion("status_route not between", value1, value2, "statusRoute");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsIsNull() {
            addCriterion("status_hold_ms is null");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsIsNotNull() {
            addCriterion("status_hold_ms is not null");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsEqualTo(Long value) {
            addCriterion("status_hold_ms =", value, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsNotEqualTo(Long value) {
            addCriterion("status_hold_ms <>", value, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsGreaterThan(Long value) {
            addCriterion("status_hold_ms >", value, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsGreaterThanOrEqualTo(Long value) {
            addCriterion("status_hold_ms >=", value, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsLessThan(Long value) {
            addCriterion("status_hold_ms <", value, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsLessThanOrEqualTo(Long value) {
            addCriterion("status_hold_ms <=", value, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsIn(List<Long> values) {
            addCriterion("status_hold_ms in", values, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsNotIn(List<Long> values) {
            addCriterion("status_hold_ms not in", values, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsBetween(Long value1, Long value2) {
            addCriterion("status_hold_ms between", value1, value2, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andStatusHoldMsNotBetween(Long value1, Long value2) {
            addCriterion("status_hold_ms not between", value1, value2, "statusHoldMs");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeIsNull() {
            addCriterion("next_status_time is null");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeIsNotNull() {
            addCriterion("next_status_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeEqualTo(Date value) {
            addCriterion("next_status_time =", value, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeNotEqualTo(Date value) {
            addCriterion("next_status_time <>", value, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeGreaterThan(Date value) {
            addCriterion("next_status_time >", value, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("next_status_time >=", value, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeLessThan(Date value) {
            addCriterion("next_status_time <", value, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeLessThanOrEqualTo(Date value) {
            addCriterion("next_status_time <=", value, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeIn(List<Date> values) {
            addCriterion("next_status_time in", values, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeNotIn(List<Date> values) {
            addCriterion("next_status_time not in", values, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeBetween(Date value1, Date value2) {
            addCriterion("next_status_time between", value1, value2, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andNextStatusTimeNotBetween(Date value1, Date value2) {
            addCriterion("next_status_time not between", value1, value2, "nextStatusTime");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(String value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(String value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(String value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(String value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(String value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLike(String value) {
            addCriterion("buyer_id like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotLike(String value) {
            addCriterion("buyer_id not like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<String> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<String> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(String value1, String value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(String value1, String value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdIsNull() {
            addCriterion("weidian_id is null");
            return (Criteria) this;
        }

        public Criteria andWeidianIdIsNotNull() {
            addCriterion("weidian_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeidianIdEqualTo(String value) {
            addCriterion("weidian_id =", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdNotEqualTo(String value) {
            addCriterion("weidian_id <>", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdGreaterThan(String value) {
            addCriterion("weidian_id >", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdGreaterThanOrEqualTo(String value) {
            addCriterion("weidian_id >=", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdLessThan(String value) {
            addCriterion("weidian_id <", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdLessThanOrEqualTo(String value) {
            addCriterion("weidian_id <=", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdLike(String value) {
            addCriterion("weidian_id like", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdNotLike(String value) {
            addCriterion("weidian_id not like", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdIn(List<String> values) {
            addCriterion("weidian_id in", values, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdNotIn(List<String> values) {
            addCriterion("weidian_id not in", values, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdBetween(String value1, String value2) {
            addCriterion("weidian_id between", value1, value2, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdNotBetween(String value1, String value2) {
            addCriterion("weidian_id not between", value1, value2, "weidianId");
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

        public Criteria andIsCommentIsNull() {
            addCriterion("is_comment is null");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNotNull() {
            addCriterion("is_comment is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommentEqualTo(Byte value) {
            addCriterion("is_comment =", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotEqualTo(Byte value) {
            addCriterion("is_comment <>", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThan(Byte value) {
            addCriterion("is_comment >", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_comment >=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThan(Byte value) {
            addCriterion("is_comment <", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThanOrEqualTo(Byte value) {
            addCriterion("is_comment <=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentIn(List<Byte> values) {
            addCriterion("is_comment in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotIn(List<Byte> values) {
            addCriterion("is_comment not in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentBetween(Byte value1, Byte value2) {
            addCriterion("is_comment between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotBetween(Byte value1, Byte value2) {
            addCriterion("is_comment not between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(String value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(String value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(String value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(String value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(String value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLike(String value) {
            addCriterion("address_id like", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotLike(String value) {
            addCriterion("address_id not like", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<String> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<String> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(String value1, String value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(String value1, String value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(Integer value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(Integer value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(Integer value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(Integer value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(Integer value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<Integer> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<Integer> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(Integer value1, Integer value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
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

        public Criteria andInternalCouponIdIsNull() {
            addCriterion("internal_coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdIsNotNull() {
            addCriterion("internal_coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdEqualTo(String value) {
            addCriterion("internal_coupon_id =", value, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdNotEqualTo(String value) {
            addCriterion("internal_coupon_id <>", value, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdGreaterThan(String value) {
            addCriterion("internal_coupon_id >", value, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("internal_coupon_id >=", value, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdLessThan(String value) {
            addCriterion("internal_coupon_id <", value, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdLessThanOrEqualTo(String value) {
            addCriterion("internal_coupon_id <=", value, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdLike(String value) {
            addCriterion("internal_coupon_id like", value, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdNotLike(String value) {
            addCriterion("internal_coupon_id not like", value, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdIn(List<String> values) {
            addCriterion("internal_coupon_id in", values, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdNotIn(List<String> values) {
            addCriterion("internal_coupon_id not in", values, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdBetween(String value1, String value2) {
            addCriterion("internal_coupon_id between", value1, value2, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andInternalCouponIdNotBetween(String value1, String value2) {
            addCriterion("internal_coupon_id not between", value1, value2, "internalCouponId");
            return (Criteria) this;
        }

        public Criteria andGuideIdIsNull() {
            addCriterion("guide_id is null");
            return (Criteria) this;
        }

        public Criteria andGuideIdIsNotNull() {
            addCriterion("guide_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuideIdEqualTo(String value) {
            addCriterion("guide_id =", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotEqualTo(String value) {
            addCriterion("guide_id <>", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThan(String value) {
            addCriterion("guide_id >", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThanOrEqualTo(String value) {
            addCriterion("guide_id >=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThan(String value) {
            addCriterion("guide_id <", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThanOrEqualTo(String value) {
            addCriterion("guide_id <=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLike(String value) {
            addCriterion("guide_id like", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotLike(String value) {
            addCriterion("guide_id not like", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdIn(List<String> values) {
            addCriterion("guide_id in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotIn(List<String> values) {
            addCriterion("guide_id not in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdBetween(String value1, String value2) {
            addCriterion("guide_id between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotBetween(String value1, String value2) {
            addCriterion("guide_id not between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoIsNull() {
            addCriterion("discount_info is null");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoIsNotNull() {
            addCriterion("discount_info is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoEqualTo(String value) {
            addCriterion("discount_info =", value, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoNotEqualTo(String value) {
            addCriterion("discount_info <>", value, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoGreaterThan(String value) {
            addCriterion("discount_info >", value, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoGreaterThanOrEqualTo(String value) {
            addCriterion("discount_info >=", value, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoLessThan(String value) {
            addCriterion("discount_info <", value, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoLessThanOrEqualTo(String value) {
            addCriterion("discount_info <=", value, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoLike(String value) {
            addCriterion("discount_info like", value, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoNotLike(String value) {
            addCriterion("discount_info not like", value, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoIn(List<String> values) {
            addCriterion("discount_info in", values, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoNotIn(List<String> values) {
            addCriterion("discount_info not in", values, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoBetween(String value1, String value2) {
            addCriterion("discount_info between", value1, value2, "discountInfo");
            return (Criteria) this;
        }

        public Criteria andDiscountInfoNotBetween(String value1, String value2) {
            addCriterion("discount_info not between", value1, value2, "discountInfo");
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