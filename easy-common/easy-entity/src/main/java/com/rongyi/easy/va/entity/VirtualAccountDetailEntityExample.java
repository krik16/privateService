package com.rongyi.easy.va.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VirtualAccountDetailEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VirtualAccountDetailEntityExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(Integer value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(Integer value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(Integer value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(Integer value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(Integer value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<Integer> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<Integer> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(Integer value1, Integer value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(Integer value1, Integer value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoIsNull() {
            addCriterion("settlement_account_no is null");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoIsNotNull() {
            addCriterion("settlement_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoEqualTo(String value) {
            addCriterion("settlement_account_no =", value, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoNotEqualTo(String value) {
            addCriterion("settlement_account_no <>", value, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoGreaterThan(String value) {
            addCriterion("settlement_account_no >", value, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_account_no >=", value, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoLessThan(String value) {
            addCriterion("settlement_account_no <", value, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoLessThanOrEqualTo(String value) {
            addCriterion("settlement_account_no <=", value, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoLike(String value) {
            addCriterion("settlement_account_no like", value, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoNotLike(String value) {
            addCriterion("settlement_account_no not like", value, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoIn(List<String> values) {
            addCriterion("settlement_account_no in", values, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoNotIn(List<String> values) {
            addCriterion("settlement_account_no not in", values, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoBetween(String value1, String value2) {
            addCriterion("settlement_account_no between", value1, value2, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNoNotBetween(String value1, String value2) {
            addCriterion("settlement_account_no not between", value1, value2, "settlementAccountNo");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameIsNull() {
            addCriterion("settlement_account_name is null");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameIsNotNull() {
            addCriterion("settlement_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameEqualTo(String value) {
            addCriterion("settlement_account_name =", value, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameNotEqualTo(String value) {
            addCriterion("settlement_account_name <>", value, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameGreaterThan(String value) {
            addCriterion("settlement_account_name >", value, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_account_name >=", value, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameLessThan(String value) {
            addCriterion("settlement_account_name <", value, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameLessThanOrEqualTo(String value) {
            addCriterion("settlement_account_name <=", value, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameLike(String value) {
            addCriterion("settlement_account_name like", value, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameNotLike(String value) {
            addCriterion("settlement_account_name not like", value, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameIn(List<String> values) {
            addCriterion("settlement_account_name in", values, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameNotIn(List<String> values) {
            addCriterion("settlement_account_name not in", values, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameBetween(String value1, String value2) {
            addCriterion("settlement_account_name between", value1, value2, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementAccountNameNotBetween(String value1, String value2) {
            addCriterion("settlement_account_name not between", value1, value2, "settlementAccountName");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIsNull() {
            addCriterion("application_no is null");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIsNotNull() {
            addCriterion("application_no is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationNoEqualTo(String value) {
            addCriterion("application_no =", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotEqualTo(String value) {
            addCriterion("application_no <>", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoGreaterThan(String value) {
            addCriterion("application_no >", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoGreaterThanOrEqualTo(String value) {
            addCriterion("application_no >=", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLessThan(String value) {
            addCriterion("application_no <", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLessThanOrEqualTo(String value) {
            addCriterion("application_no <=", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoLike(String value) {
            addCriterion("application_no like", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotLike(String value) {
            addCriterion("application_no not like", value, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoIn(List<String> values) {
            addCriterion("application_no in", values, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotIn(List<String> values) {
            addCriterion("application_no not in", values, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoBetween(String value1, String value2) {
            addCriterion("application_no between", value1, value2, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andApplicationNoNotBetween(String value1, String value2) {
            addCriterion("application_no not between", value1, value2, "applicationNo");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(String value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(String value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(String value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(String value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(String value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLike(String value) {
            addCriterion("payment_id like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotLike(String value) {
            addCriterion("payment_id not like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<String> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<String> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(String value1, String value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(String value1, String value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andCollectedAtIsNull() {
            addCriterion("collected_at is null");
            return (Criteria) this;
        }

        public Criteria andCollectedAtIsNotNull() {
            addCriterion("collected_at is not null");
            return (Criteria) this;
        }

        public Criteria andCollectedAtEqualTo(Date value) {
            addCriterion("collected_at =", value, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andCollectedAtNotEqualTo(Date value) {
            addCriterion("collected_at <>", value, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andCollectedAtGreaterThan(Date value) {
            addCriterion("collected_at >", value, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andCollectedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("collected_at >=", value, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andCollectedAtLessThan(Date value) {
            addCriterion("collected_at <", value, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andCollectedAtLessThanOrEqualTo(Date value) {
            addCriterion("collected_at <=", value, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andCollectedAtIn(List<Date> values) {
            addCriterion("collected_at in", values, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andCollectedAtNotIn(List<Date> values) {
            addCriterion("collected_at not in", values, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andCollectedAtBetween(Date value1, Date value2) {
            addCriterion("collected_at between", value1, value2, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andCollectedAtNotBetween(Date value1, Date value2) {
            addCriterion("collected_at not between", value1, value2, "collectedAt");
            return (Criteria) this;
        }

        public Criteria andIsCollectedIsNull() {
            addCriterion("is_collected is null");
            return (Criteria) this;
        }

        public Criteria andIsCollectedIsNotNull() {
            addCriterion("is_collected is not null");
            return (Criteria) this;
        }

        public Criteria andIsCollectedEqualTo(Boolean value) {
            addCriterion("is_collected =", value, "isCollected");
            return (Criteria) this;
        }

        public Criteria andIsCollectedNotEqualTo(Boolean value) {
            addCriterion("is_collected <>", value, "isCollected");
            return (Criteria) this;
        }

        public Criteria andIsCollectedGreaterThan(Boolean value) {
            addCriterion("is_collected >", value, "isCollected");
            return (Criteria) this;
        }

        public Criteria andIsCollectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_collected >=", value, "isCollected");
            return (Criteria) this;
        }

        public Criteria andIsCollectedLessThan(Boolean value) {
            addCriterion("is_collected <", value, "isCollected");
            return (Criteria) this;
        }

        public Criteria andIsCollectedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_collected <=", value, "isCollected");
            return (Criteria) this;
        }

        public Criteria andIsCollectedIn(List<Boolean> values) {
            addCriterion("is_collected in", values, "isCollected");
            return (Criteria) this;
        }

        public Criteria andIsCollectedNotIn(List<Boolean> values) {
            addCriterion("is_collected not in", values, "isCollected");
            return (Criteria) this;
        }

        public Criteria andIsCollectedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_collected between", value1, value2, "isCollected");
            return (Criteria) this;
        }

        public Criteria andIsCollectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_collected not between", value1, value2, "isCollected");
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