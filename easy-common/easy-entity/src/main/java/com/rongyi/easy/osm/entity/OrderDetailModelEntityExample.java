package com.rongyi.easy.osm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetailModelEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailModelEntityExample() {
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

        public Criteria andOrderModelIdIsNull() {
            addCriterion("order_model_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdIsNotNull() {
            addCriterion("order_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdEqualTo(Integer value) {
            addCriterion("order_model_id =", value, "orderModelId");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdNotEqualTo(Integer value) {
            addCriterion("order_model_id <>", value, "orderModelId");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdGreaterThan(Integer value) {
            addCriterion("order_model_id >", value, "orderModelId");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_model_id >=", value, "orderModelId");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdLessThan(Integer value) {
            addCriterion("order_model_id <", value, "orderModelId");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_model_id <=", value, "orderModelId");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdIn(List<Integer> values) {
            addCriterion("order_model_id in", values, "orderModelId");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdNotIn(List<Integer> values) {
            addCriterion("order_model_id not in", values, "orderModelId");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdBetween(Integer value1, Integer value2) {
            addCriterion("order_model_id between", value1, value2, "orderModelId");
            return (Criteria) this;
        }

        public Criteria andOrderModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_model_id not between", value1, value2, "orderModelId");
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