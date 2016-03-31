package com.rongyi.easy.merchant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplyRecordEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyRecordEntityExample() {
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

        public Criteria andInviteCodeNumIsNull() {
            addCriterion("invite_code_num is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumIsNotNull() {
            addCriterion("invite_code_num is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumEqualTo(Integer value) {
            addCriterion("invite_code_num =", value, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumNotEqualTo(Integer value) {
            addCriterion("invite_code_num <>", value, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumGreaterThan(Integer value) {
            addCriterion("invite_code_num >", value, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_code_num >=", value, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumLessThan(Integer value) {
            addCriterion("invite_code_num <", value, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumLessThanOrEqualTo(Integer value) {
            addCriterion("invite_code_num <=", value, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumIn(List<Integer> values) {
            addCriterion("invite_code_num in", values, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumNotIn(List<Integer> values) {
            addCriterion("invite_code_num not in", values, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumBetween(Integer value1, Integer value2) {
            addCriterion("invite_code_num between", value1, value2, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_code_num not between", value1, value2, "inviteCodeNum");
            return (Criteria) this;
        }

        public Criteria andProposerAccountIsNull() {
            addCriterion("proposer_account is null");
            return (Criteria) this;
        }

        public Criteria andProposerAccountIsNotNull() {
            addCriterion("proposer_account is not null");
            return (Criteria) this;
        }

        public Criteria andProposerAccountEqualTo(String value) {
            addCriterion("proposer_account =", value, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountNotEqualTo(String value) {
            addCriterion("proposer_account <>", value, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountGreaterThan(String value) {
            addCriterion("proposer_account >", value, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("proposer_account >=", value, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountLessThan(String value) {
            addCriterion("proposer_account <", value, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountLessThanOrEqualTo(String value) {
            addCriterion("proposer_account <=", value, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountLike(String value) {
            addCriterion("proposer_account like", value, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountNotLike(String value) {
            addCriterion("proposer_account not like", value, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountIn(List<String> values) {
            addCriterion("proposer_account in", values, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountNotIn(List<String> values) {
            addCriterion("proposer_account not in", values, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountBetween(String value1, String value2) {
            addCriterion("proposer_account between", value1, value2, "proposerAccount");
            return (Criteria) this;
        }

        public Criteria andProposerAccountNotBetween(String value1, String value2) {
            addCriterion("proposer_account not between", value1, value2, "proposerAccount");
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