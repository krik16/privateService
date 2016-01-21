//package com.rongyi.easy.rmmm.entity;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class ShoppingCartEntityExample {
//    protected String orderByClause;
//
//    protected boolean distinct;
//
//    protected List<Criteria> oredCriteria;
//
//    public ShoppingCartEntityExample() {
//        oredCriteria = new ArrayList<Criteria>();
//    }
//
//    public void setOrderByClause(String orderByClause) {
//        this.orderByClause = orderByClause;
//    }
//
//    public String getOrderByClause() {
//        return orderByClause;
//    }
//
//    public void setDistinct(boolean distinct) {
//        this.distinct = distinct;
//    }
//
//    public boolean isDistinct() {
//        return distinct;
//    }
//
//    public List<Criteria> getOredCriteria() {
//        return oredCriteria;
//    }
//
//    public void or(Criteria criteria) {
//        oredCriteria.add(criteria);
//    }
//
//    public Criteria or() {
//        Criteria criteria = createCriteriaInternal();
//        oredCriteria.add(criteria);
//        return criteria;
//    }
//
//    public Criteria createCriteria() {
//        Criteria criteria = createCriteriaInternal();
//        if (oredCriteria.size() == 0) {
//            oredCriteria.add(criteria);
//        }
//        return criteria;
//    }
//
//    protected Criteria createCriteriaInternal() {
//        Criteria criteria = new Criteria();
//        return criteria;
//    }
//
//    public void clear() {
//        oredCriteria.clear();
//        orderByClause = null;
//        distinct = false;
//    }
//
//    protected abstract static class GeneratedCriteria {
//        protected List<Criterion> criteria;
//
//        protected GeneratedCriteria() {
//            super();
//            criteria = new ArrayList<Criterion>();
//        }
//
//        public boolean isValid() {
//            return criteria.size() > 0;
//        }
//
//        public List<Criterion> getAllCriteria() {
//            return criteria;
//        }
//
//        public List<Criterion> getCriteria() {
//            return criteria;
//        }
//
//        protected void addCriterion(String condition) {
//            if (condition == null) {
//                throw new RuntimeException("Value for condition cannot be null");
//            }
//            criteria.add(new Criterion(condition));
//        }
//
//        protected void addCriterion(String condition, Object value, String property) {
//            if (value == null) {
//                throw new RuntimeException("Value for " + property + " cannot be null");
//            }
//            criteria.add(new Criterion(condition, value));
//        }
//
//        protected void addCriterion(String condition, Object value1, Object value2, String property) {
//            if (value1 == null || value2 == null) {
//                throw new RuntimeException("Between values for " + property + " cannot be null");
//            }
//            criteria.add(new Criterion(condition, value1, value2));
//        }
//
//        public Criteria andIdIsNull() {
//            addCriterion("id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdIsNotNull() {
//            addCriterion("id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdEqualTo(Integer value) {
//            addCriterion("id =", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotEqualTo(Integer value) {
//            addCriterion("id <>", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdGreaterThan(Integer value) {
//            addCriterion("id >", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("id >=", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdLessThan(Integer value) {
//            addCriterion("id <", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdLessThanOrEqualTo(Integer value) {
//            addCriterion("id <=", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdIn(List<Integer> values) {
//            addCriterion("id in", values, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotIn(List<Integer> values) {
//            addCriterion("id not in", values, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdBetween(Integer value1, Integer value2) {
//            addCriterion("id between", value1, value2, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("id not between", value1, value2, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidIsNull() {
//            addCriterion("buyer_mid is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidIsNotNull() {
//            addCriterion("buyer_mid is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidEqualTo(String value) {
//            addCriterion("buyer_mid =", value, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidNotEqualTo(String value) {
//            addCriterion("buyer_mid <>", value, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidGreaterThan(String value) {
//            addCriterion("buyer_mid >", value, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidGreaterThanOrEqualTo(String value) {
//            addCriterion("buyer_mid >=", value, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidLessThan(String value) {
//            addCriterion("buyer_mid <", value, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidLessThanOrEqualTo(String value) {
//            addCriterion("buyer_mid <=", value, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidLike(String value) {
//            addCriterion("buyer_mid like", value, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidNotLike(String value) {
//            addCriterion("buyer_mid not like", value, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidIn(List<String> values) {
//            addCriterion("buyer_mid in", values, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidNotIn(List<String> values) {
//            addCriterion("buyer_mid not in", values, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidBetween(String value1, String value2) {
//            addCriterion("buyer_mid between", value1, value2, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andBuyerMidNotBetween(String value1, String value2) {
//            addCriterion("buyer_mid not between", value1, value2, "buyerMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidIsNull() {
//            addCriterion("commodity_mid is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidIsNotNull() {
//            addCriterion("commodity_mid is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidEqualTo(String value) {
//            addCriterion("commodity_mid =", value, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidNotEqualTo(String value) {
//            addCriterion("commodity_mid <>", value, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidGreaterThan(String value) {
//            addCriterion("commodity_mid >", value, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidGreaterThanOrEqualTo(String value) {
//            addCriterion("commodity_mid >=", value, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidLessThan(String value) {
//            addCriterion("commodity_mid <", value, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidLessThanOrEqualTo(String value) {
//            addCriterion("commodity_mid <=", value, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidLike(String value) {
//            addCriterion("commodity_mid like", value, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidNotLike(String value) {
//            addCriterion("commodity_mid not like", value, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidIn(List<String> values) {
//            addCriterion("commodity_mid in", values, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidNotIn(List<String> values) {
//            addCriterion("commodity_mid not in", values, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidBetween(String value1, String value2) {
//            addCriterion("commodity_mid between", value1, value2, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityMidNotBetween(String value1, String value2) {
//            addCriterion("commodity_mid not between", value1, value2, "commodityMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidIsNull() {
//            addCriterion("spec_mid is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidIsNotNull() {
//            addCriterion("spec_mid is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidEqualTo(String value) {
//            addCriterion("spec_mid =", value, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidNotEqualTo(String value) {
//            addCriterion("spec_mid <>", value, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidGreaterThan(String value) {
//            addCriterion("spec_mid >", value, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidGreaterThanOrEqualTo(String value) {
//            addCriterion("spec_mid >=", value, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidLessThan(String value) {
//            addCriterion("spec_mid <", value, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidLessThanOrEqualTo(String value) {
//            addCriterion("spec_mid <=", value, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidLike(String value) {
//            addCriterion("spec_mid like", value, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidNotLike(String value) {
//            addCriterion("spec_mid not like", value, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidIn(List<String> values) {
//            addCriterion("spec_mid in", values, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidNotIn(List<String> values) {
//            addCriterion("spec_mid not in", values, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidBetween(String value1, String value2) {
//            addCriterion("spec_mid between", value1, value2, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andSpecMidNotBetween(String value1, String value2) {
//            addCriterion("spec_mid not between", value1, value2, "specMid");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountIsNull() {
//            addCriterion("commodity_count is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountIsNotNull() {
//            addCriterion("commodity_count is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountEqualTo(Integer value) {
//            addCriterion("commodity_count =", value, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountNotEqualTo(Integer value) {
//            addCriterion("commodity_count <>", value, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountGreaterThan(Integer value) {
//            addCriterion("commodity_count >", value, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountGreaterThanOrEqualTo(Integer value) {
//            addCriterion("commodity_count >=", value, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountLessThan(Integer value) {
//            addCriterion("commodity_count <", value, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountLessThanOrEqualTo(Integer value) {
//            addCriterion("commodity_count <=", value, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountIn(List<Integer> values) {
//            addCriterion("commodity_count in", values, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountNotIn(List<Integer> values) {
//            addCriterion("commodity_count not in", values, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountBetween(Integer value1, Integer value2) {
//            addCriterion("commodity_count between", value1, value2, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andCommodityCountNotBetween(Integer value1, Integer value2) {
//            addCriterion("commodity_count not between", value1, value2, "commodityCount");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdIsNull() {
//            addCriterion("shop_id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdIsNotNull() {
//            addCriterion("shop_id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdEqualTo(Integer value) {
//            addCriterion("shop_id =", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdNotEqualTo(Integer value) {
//            addCriterion("shop_id <>", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdGreaterThan(Integer value) {
//            addCriterion("shop_id >", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("shop_id >=", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdLessThan(Integer value) {
//            addCriterion("shop_id <", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
//            addCriterion("shop_id <=", value, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdIn(List<Integer> values) {
//            addCriterion("shop_id in", values, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdNotIn(List<Integer> values) {
//            addCriterion("shop_id not in", values, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdBetween(Integer value1, Integer value2) {
//            addCriterion("shop_id between", value1, value2, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("shop_id not between", value1, value2, "shopId");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByIsNull() {
//            addCriterion("create_by is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByIsNotNull() {
//            addCriterion("create_by is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByEqualTo(Integer value) {
//            addCriterion("create_by =", value, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByNotEqualTo(Integer value) {
//            addCriterion("create_by <>", value, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByGreaterThan(Integer value) {
//            addCriterion("create_by >", value, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByGreaterThanOrEqualTo(Integer value) {
//            addCriterion("create_by >=", value, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByLessThan(Integer value) {
//            addCriterion("create_by <", value, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByLessThanOrEqualTo(Integer value) {
//            addCriterion("create_by <=", value, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByIn(List<Integer> values) {
//            addCriterion("create_by in", values, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByNotIn(List<Integer> values) {
//            addCriterion("create_by not in", values, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByBetween(Integer value1, Integer value2) {
//            addCriterion("create_by between", value1, value2, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateByNotBetween(Integer value1, Integer value2) {
//            addCriterion("create_by not between", value1, value2, "createBy");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtIsNull() {
//            addCriterion("create_at is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtIsNotNull() {
//            addCriterion("create_at is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtEqualTo(Date value) {
//            addCriterion("create_at =", value, "createAt");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtNotEqualTo(Date value) {
//            addCriterion("create_at <>", value, "createAt");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtGreaterThan(Date value) {
//            addCriterion("create_at >", value, "createAt");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
//            addCriterion("create_at >=", value, "createAt");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtLessThan(Date value) {
//            addCriterion("create_at <", value, "createAt");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
//            addCriterion("create_at <=", value, "createAt");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtIn(List<Date> values) {
//            addCriterion("create_at in", values, "createAt");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtNotIn(List<Date> values) {
//            addCriterion("create_at not in", values, "createAt");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtBetween(Date value1, Date value2) {
//            addCriterion("create_at between", value1, value2, "createAt");
//            return (Criteria) this;
//        }
//
//        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
//            addCriterion("create_at not between", value1, value2, "createAt");
//            return (Criteria) this;
//        }
//    }
//
//    public static class Criteria extends GeneratedCriteria {
//
//        protected Criteria() {
//            super();
//        }
//    }
//
//    public static class Criterion {
//        private String condition;
//
//        private Object value;
//
//        private Object secondValue;
//
//        private boolean noValue;
//
//        private boolean singleValue;
//
//        private boolean betweenValue;
//
//        private boolean listValue;
//
//        private String typeHandler;
//
//        public String getCondition() {
//            return condition;
//        }
//
//        public Object getValue() {
//            return value;
//        }
//
//        public Object getSecondValue() {
//            return secondValue;
//        }
//
//        public boolean isNoValue() {
//            return noValue;
//        }
//
//        public boolean isSingleValue() {
//            return singleValue;
//        }
//
//        public boolean isBetweenValue() {
//            return betweenValue;
//        }
//
//        public boolean isListValue() {
//            return listValue;
//        }
//
//        public String getTypeHandler() {
//            return typeHandler;
//        }
//
//        protected Criterion(String condition) {
//            super();
//            this.condition = condition;
//            this.typeHandler = null;
//            this.noValue = true;
//        }
//
//        protected Criterion(String condition, Object value, String typeHandler) {
//            super();
//            this.condition = condition;
//            this.value = value;
//            this.typeHandler = typeHandler;
//            if (value instanceof List<?>) {
//                this.listValue = true;
//            } else {
//                this.singleValue = true;
//            }
//        }
//
//        protected Criterion(String condition, Object value) {
//            this(condition, value, null);
//        }
//
//        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
//            super();
//            this.condition = condition;
//            this.value = value;
//            this.secondValue = secondValue;
//            this.typeHandler = typeHandler;
//            this.betweenValue = true;
//        }
//
//        protected Criterion(String condition, Object value, Object secondValue) {
//            this(condition, value, secondValue, null);
//        }
//    }
//}