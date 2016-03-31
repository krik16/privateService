package com.rongyi.easy.rmmm.entity;

import java.util.ArrayList;
import java.util.List;

public class BrandInfoEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoEntityExample() {
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

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandMidIsNull() {
            addCriterion("brand_mid is null");
            return (Criteria) this;
        }

        public Criteria andBrandMidIsNotNull() {
            addCriterion("brand_mid is not null");
            return (Criteria) this;
        }

        public Criteria andBrandMidEqualTo(String value) {
            addCriterion("brand_mid =", value, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidNotEqualTo(String value) {
            addCriterion("brand_mid <>", value, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidGreaterThan(String value) {
            addCriterion("brand_mid >", value, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidGreaterThanOrEqualTo(String value) {
            addCriterion("brand_mid >=", value, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidLessThan(String value) {
            addCriterion("brand_mid <", value, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidLessThanOrEqualTo(String value) {
            addCriterion("brand_mid <=", value, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidLike(String value) {
            addCriterion("brand_mid like", value, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidNotLike(String value) {
            addCriterion("brand_mid not like", value, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidIn(List<String> values) {
            addCriterion("brand_mid in", values, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidNotIn(List<String> values) {
            addCriterion("brand_mid not in", values, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidBetween(String value1, String value2) {
            addCriterion("brand_mid between", value1, value2, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandMidNotBetween(String value1, String value2) {
            addCriterion("brand_mid not between", value1, value2, "brandMid");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIsNull() {
            addCriterion("brand_status is null");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIsNotNull() {
            addCriterion("brand_status is not null");
            return (Criteria) this;
        }

        public Criteria andBrandStatusEqualTo(Integer value) {
            addCriterion("brand_status =", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotEqualTo(Integer value) {
            addCriterion("brand_status <>", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusGreaterThan(Integer value) {
            addCriterion("brand_status >", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_status >=", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusLessThan(Integer value) {
            addCriterion("brand_status <", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusLessThanOrEqualTo(Integer value) {
            addCriterion("brand_status <=", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIn(List<Integer> values) {
            addCriterion("brand_status in", values, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotIn(List<Integer> values) {
            addCriterion("brand_status not in", values, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusBetween(Integer value1, Integer value2) {
            addCriterion("brand_status between", value1, value2, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_status not between", value1, value2, "brandStatus");
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