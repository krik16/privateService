package com.rongyi.easy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoaConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoaConfigExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andValueBigintIsNull() {
            addCriterion("value_bigint is null");
            return (Criteria) this;
        }

        public Criteria andValueBigintIsNotNull() {
            addCriterion("value_bigint is not null");
            return (Criteria) this;
        }

        public Criteria andValueBigintEqualTo(Long value) {
            addCriterion("value_bigint =", value, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueBigintNotEqualTo(Long value) {
            addCriterion("value_bigint <>", value, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueBigintGreaterThan(Long value) {
            addCriterion("value_bigint >", value, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueBigintGreaterThanOrEqualTo(Long value) {
            addCriterion("value_bigint >=", value, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueBigintLessThan(Long value) {
            addCriterion("value_bigint <", value, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueBigintLessThanOrEqualTo(Long value) {
            addCriterion("value_bigint <=", value, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueBigintIn(List<Long> values) {
            addCriterion("value_bigint in", values, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueBigintNotIn(List<Long> values) {
            addCriterion("value_bigint not in", values, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueBigintBetween(Long value1, Long value2) {
            addCriterion("value_bigint between", value1, value2, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueBigintNotBetween(Long value1, Long value2) {
            addCriterion("value_bigint not between", value1, value2, "valueBigint");
            return (Criteria) this;
        }

        public Criteria andValueVarcharIsNull() {
            addCriterion("value_varchar is null");
            return (Criteria) this;
        }

        public Criteria andValueVarcharIsNotNull() {
            addCriterion("value_varchar is not null");
            return (Criteria) this;
        }

        public Criteria andValueVarcharEqualTo(String value) {
            addCriterion("value_varchar =", value, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharNotEqualTo(String value) {
            addCriterion("value_varchar <>", value, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharGreaterThan(String value) {
            addCriterion("value_varchar >", value, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharGreaterThanOrEqualTo(String value) {
            addCriterion("value_varchar >=", value, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharLessThan(String value) {
            addCriterion("value_varchar <", value, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharLessThanOrEqualTo(String value) {
            addCriterion("value_varchar <=", value, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharLike(String value) {
            addCriterion("value_varchar like", value, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharNotLike(String value) {
            addCriterion("value_varchar not like", value, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharIn(List<String> values) {
            addCriterion("value_varchar in", values, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharNotIn(List<String> values) {
            addCriterion("value_varchar not in", values, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharBetween(String value1, String value2) {
            addCriterion("value_varchar between", value1, value2, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andValueVarcharNotBetween(String value1, String value2) {
            addCriterion("value_varchar not between", value1, value2, "valueVarchar");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andInsDtIsNull() {
            addCriterion("ins_dt is null");
            return (Criteria) this;
        }

        public Criteria andInsDtIsNotNull() {
            addCriterion("ins_dt is not null");
            return (Criteria) this;
        }

        public Criteria andInsDtEqualTo(Date value) {
            addCriterion("ins_dt =", value, "insDt");
            return (Criteria) this;
        }

        public Criteria andInsDtNotEqualTo(Date value) {
            addCriterion("ins_dt <>", value, "insDt");
            return (Criteria) this;
        }

        public Criteria andInsDtGreaterThan(Date value) {
            addCriterion("ins_dt >", value, "insDt");
            return (Criteria) this;
        }

        public Criteria andInsDtGreaterThanOrEqualTo(Date value) {
            addCriterion("ins_dt >=", value, "insDt");
            return (Criteria) this;
        }

        public Criteria andInsDtLessThan(Date value) {
            addCriterion("ins_dt <", value, "insDt");
            return (Criteria) this;
        }

        public Criteria andInsDtLessThanOrEqualTo(Date value) {
            addCriterion("ins_dt <=", value, "insDt");
            return (Criteria) this;
        }

        public Criteria andInsDtIn(List<Date> values) {
            addCriterion("ins_dt in", values, "insDt");
            return (Criteria) this;
        }

        public Criteria andInsDtNotIn(List<Date> values) {
            addCriterion("ins_dt not in", values, "insDt");
            return (Criteria) this;
        }

        public Criteria andInsDtBetween(Date value1, Date value2) {
            addCriterion("ins_dt between", value1, value2, "insDt");
            return (Criteria) this;
        }

        public Criteria andInsDtNotBetween(Date value1, Date value2) {
            addCriterion("ins_dt not between", value1, value2, "insDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtIsNull() {
            addCriterion("upd_dt is null");
            return (Criteria) this;
        }

        public Criteria andUpdDtIsNotNull() {
            addCriterion("upd_dt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdDtEqualTo(Date value) {
            addCriterion("upd_dt =", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtNotEqualTo(Date value) {
            addCriterion("upd_dt <>", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtGreaterThan(Date value) {
            addCriterion("upd_dt >", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_dt >=", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtLessThan(Date value) {
            addCriterion("upd_dt <", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtLessThanOrEqualTo(Date value) {
            addCriterion("upd_dt <=", value, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtIn(List<Date> values) {
            addCriterion("upd_dt in", values, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtNotIn(List<Date> values) {
            addCriterion("upd_dt not in", values, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtBetween(Date value1, Date value2) {
            addCriterion("upd_dt between", value1, value2, "updDt");
            return (Criteria) this;
        }

        public Criteria andUpdDtNotBetween(Date value1, Date value2) {
            addCriterion("upd_dt not between", value1, value2, "updDt");
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