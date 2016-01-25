package com.rongyi.easy.rmmm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserSuggestionEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSuggestionEntityExample() {
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

        public Criteria andSubmitByIsNull() {
            addCriterion("submit_by is null");
            return (Criteria) this;
        }

        public Criteria andSubmitByIsNotNull() {
            addCriterion("submit_by is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitByEqualTo(String value) {
            addCriterion("submit_by =", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByNotEqualTo(String value) {
            addCriterion("submit_by <>", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByGreaterThan(String value) {
            addCriterion("submit_by >", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByGreaterThanOrEqualTo(String value) {
            addCriterion("submit_by >=", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByLessThan(String value) {
            addCriterion("submit_by <", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByLessThanOrEqualTo(String value) {
            addCriterion("submit_by <=", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByLike(String value) {
            addCriterion("submit_by like", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByNotLike(String value) {
            addCriterion("submit_by not like", value, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByIn(List<String> values) {
            addCriterion("submit_by in", values, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByNotIn(List<String> values) {
            addCriterion("submit_by not in", values, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByBetween(String value1, String value2) {
            addCriterion("submit_by between", value1, value2, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSubmitByNotBetween(String value1, String value2) {
            addCriterion("submit_by not between", value1, value2, "submitBy");
            return (Criteria) this;
        }

        public Criteria andSugSourceIsNull() {
            addCriterion("sug_source is null");
            return (Criteria) this;
        }

        public Criteria andSugSourceIsNotNull() {
            addCriterion("sug_source is not null");
            return (Criteria) this;
        }

        public Criteria andSugSourceEqualTo(Integer value) {
            addCriterion("sug_source =", value, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugSourceNotEqualTo(Integer value) {
            addCriterion("sug_source <>", value, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugSourceGreaterThan(Integer value) {
            addCriterion("sug_source >", value, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sug_source >=", value, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugSourceLessThan(Integer value) {
            addCriterion("sug_source <", value, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugSourceLessThanOrEqualTo(Integer value) {
            addCriterion("sug_source <=", value, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugSourceIn(List<Integer> values) {
            addCriterion("sug_source in", values, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugSourceNotIn(List<Integer> values) {
            addCriterion("sug_source not in", values, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugSourceBetween(Integer value1, Integer value2) {
            addCriterion("sug_source between", value1, value2, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("sug_source not between", value1, value2, "sugSource");
            return (Criteria) this;
        }

        public Criteria andSugPhoneIsNull() {
            addCriterion("sug_phone is null");
            return (Criteria) this;
        }

        public Criteria andSugPhoneIsNotNull() {
            addCriterion("sug_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSugPhoneEqualTo(String value) {
            addCriterion("sug_phone =", value, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneNotEqualTo(String value) {
            addCriterion("sug_phone <>", value, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneGreaterThan(String value) {
            addCriterion("sug_phone >", value, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sug_phone >=", value, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneLessThan(String value) {
            addCriterion("sug_phone <", value, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneLessThanOrEqualTo(String value) {
            addCriterion("sug_phone <=", value, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneLike(String value) {
            addCriterion("sug_phone like", value, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneNotLike(String value) {
            addCriterion("sug_phone not like", value, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneIn(List<String> values) {
            addCriterion("sug_phone in", values, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneNotIn(List<String> values) {
            addCriterion("sug_phone not in", values, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneBetween(String value1, String value2) {
            addCriterion("sug_phone between", value1, value2, "sugPhone");
            return (Criteria) this;
        }

        public Criteria andSugPhoneNotBetween(String value1, String value2) {
            addCriterion("sug_phone not between", value1, value2, "sugPhone");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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