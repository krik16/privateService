package com.rongyi.easy.osm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderModelEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderModelEntityExample() {
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

        public Criteria andGuideIdIsNull() {
            addCriterion("guide_id is null");
            return (Criteria) this;
        }

        public Criteria andGuideIdIsNotNull() {
            addCriterion("guide_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuideIdEqualTo(Integer value) {
            addCriterion("guide_id =", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotEqualTo(Integer value) {
            addCriterion("guide_id <>", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThan(Integer value) {
            addCriterion("guide_id >", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guide_id >=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThan(Integer value) {
            addCriterion("guide_id <", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThanOrEqualTo(Integer value) {
            addCriterion("guide_id <=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdIn(List<Integer> values) {
            addCriterion("guide_id in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotIn(List<Integer> values) {
            addCriterion("guide_id not in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdBetween(Integer value1, Integer value2) {
            addCriterion("guide_id between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guide_id not between", value1, value2, "guideId");
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

        public Criteria andIsDisabledIsNull() {
            addCriterion("is_disabled is null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNotNull() {
            addCriterion("is_disabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledEqualTo(Integer value) {
            addCriterion("is_disabled =", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotEqualTo(Integer value) {
            addCriterion("is_disabled <>", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThan(Integer value) {
            addCriterion("is_disabled >", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_disabled >=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThan(Integer value) {
            addCriterion("is_disabled <", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThanOrEqualTo(Integer value) {
            addCriterion("is_disabled <=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIn(List<Integer> values) {
            addCriterion("is_disabled in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotIn(List<Integer> values) {
            addCriterion("is_disabled not in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledBetween(Integer value1, Integer value2) {
            addCriterion("is_disabled between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotBetween(Integer value1, Integer value2) {
            addCriterion("is_disabled not between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
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