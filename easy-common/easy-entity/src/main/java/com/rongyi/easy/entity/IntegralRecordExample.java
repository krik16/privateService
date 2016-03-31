package com.rongyi.easy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntegralRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralRecordExample() {
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

        public Criteria andMemberNoIsNull() {
            addCriterion("member_no is null");
            return (Criteria) this;
        }

        public Criteria andMemberNoIsNotNull() {
            addCriterion("member_no is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNoEqualTo(String value) {
            addCriterion("member_no =", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotEqualTo(String value) {
            addCriterion("member_no <>", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThan(String value) {
            addCriterion("member_no >", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoGreaterThanOrEqualTo(String value) {
            addCriterion("member_no >=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThan(String value) {
            addCriterion("member_no <", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLessThanOrEqualTo(String value) {
            addCriterion("member_no <=", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoLike(String value) {
            addCriterion("member_no like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotLike(String value) {
            addCriterion("member_no not like", value, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoIn(List<String> values) {
            addCriterion("member_no in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotIn(List<String> values) {
            addCriterion("member_no not in", values, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoBetween(String value1, String value2) {
            addCriterion("member_no between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andMemberNoNotBetween(String value1, String value2) {
            addCriterion("member_no not between", value1, value2, "memberNo");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterion("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterion("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterion("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterion("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterion("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterion("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterion("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterion("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterion("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNull() {
            addCriterion("gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Integer value) {
            addCriterion("gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Integer value) {
            addCriterion("gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Integer value) {
            addCriterion("gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Integer value) {
            addCriterion("gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Integer> values) {
            addCriterion("gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Integer> values) {
            addCriterion("gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_id not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftNumIsNull() {
            addCriterion("gift_num is null");
            return (Criteria) this;
        }

        public Criteria andGiftNumIsNotNull() {
            addCriterion("gift_num is not null");
            return (Criteria) this;
        }

        public Criteria andGiftNumEqualTo(Integer value) {
            addCriterion("gift_num =", value, "giftNum");
            return (Criteria) this;
        }

        public Criteria andGiftNumNotEqualTo(Integer value) {
            addCriterion("gift_num <>", value, "giftNum");
            return (Criteria) this;
        }

        public Criteria andGiftNumGreaterThan(Integer value) {
            addCriterion("gift_num >", value, "giftNum");
            return (Criteria) this;
        }

        public Criteria andGiftNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_num >=", value, "giftNum");
            return (Criteria) this;
        }

        public Criteria andGiftNumLessThan(Integer value) {
            addCriterion("gift_num <", value, "giftNum");
            return (Criteria) this;
        }

        public Criteria andGiftNumLessThanOrEqualTo(Integer value) {
            addCriterion("gift_num <=", value, "giftNum");
            return (Criteria) this;
        }

        public Criteria andGiftNumIn(List<Integer> values) {
            addCriterion("gift_num in", values, "giftNum");
            return (Criteria) this;
        }

        public Criteria andGiftNumNotIn(List<Integer> values) {
            addCriterion("gift_num not in", values, "giftNum");
            return (Criteria) this;
        }

        public Criteria andGiftNumBetween(Integer value1, Integer value2) {
            addCriterion("gift_num between", value1, value2, "giftNum");
            return (Criteria) this;
        }

        public Criteria andGiftNumNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_num not between", value1, value2, "giftNum");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralIsNull() {
            addCriterion("original_each_integral is null");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralIsNotNull() {
            addCriterion("original_each_integral is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralEqualTo(Integer value) {
            addCriterion("original_each_integral =", value, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralNotEqualTo(Integer value) {
            addCriterion("original_each_integral <>", value, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralGreaterThan(Integer value) {
            addCriterion("original_each_integral >", value, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_each_integral >=", value, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralLessThan(Integer value) {
            addCriterion("original_each_integral <", value, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("original_each_integral <=", value, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralIn(List<Integer> values) {
            addCriterion("original_each_integral in", values, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralNotIn(List<Integer> values) {
            addCriterion("original_each_integral not in", values, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralBetween(Integer value1, Integer value2) {
            addCriterion("original_each_integral between", value1, value2, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andOriginalEachIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("original_each_integral not between", value1, value2, "originalEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralIsNull() {
            addCriterion("actual_each_integral is null");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralIsNotNull() {
            addCriterion("actual_each_integral is not null");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralEqualTo(Integer value) {
            addCriterion("actual_each_integral =", value, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralNotEqualTo(Integer value) {
            addCriterion("actual_each_integral <>", value, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralGreaterThan(Integer value) {
            addCriterion("actual_each_integral >", value, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_each_integral >=", value, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralLessThan(Integer value) {
            addCriterion("actual_each_integral <", value, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("actual_each_integral <=", value, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralIn(List<Integer> values) {
            addCriterion("actual_each_integral in", values, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralNotIn(List<Integer> values) {
            addCriterion("actual_each_integral not in", values, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralBetween(Integer value1, Integer value2) {
            addCriterion("actual_each_integral between", value1, value2, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andActualEachIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_each_integral not between", value1, value2, "actualEachIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralIsNull() {
            addCriterion("total_use_integral is null");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralIsNotNull() {
            addCriterion("total_use_integral is not null");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralEqualTo(Integer value) {
            addCriterion("total_use_integral =", value, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralNotEqualTo(Integer value) {
            addCriterion("total_use_integral <>", value, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralGreaterThan(Integer value) {
            addCriterion("total_use_integral >", value, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_use_integral >=", value, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralLessThan(Integer value) {
            addCriterion("total_use_integral <", value, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("total_use_integral <=", value, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralIn(List<Integer> values) {
            addCriterion("total_use_integral in", values, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralNotIn(List<Integer> values) {
            addCriterion("total_use_integral not in", values, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralBetween(Integer value1, Integer value2) {
            addCriterion("total_use_integral between", value1, value2, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andTotalUseIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("total_use_integral not between", value1, value2, "totalUseIntegral");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
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

        public Criteria andIssuebyIsNull() {
            addCriterion("issueby is null");
            return (Criteria) this;
        }

        public Criteria andIssuebyIsNotNull() {
            addCriterion("issueby is not null");
            return (Criteria) this;
        }

        public Criteria andIssuebyEqualTo(String value) {
            addCriterion("issueby =", value, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyNotEqualTo(String value) {
            addCriterion("issueby <>", value, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyGreaterThan(String value) {
            addCriterion("issueby >", value, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyGreaterThanOrEqualTo(String value) {
            addCriterion("issueby >=", value, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyLessThan(String value) {
            addCriterion("issueby <", value, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyLessThanOrEqualTo(String value) {
            addCriterion("issueby <=", value, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyLike(String value) {
            addCriterion("issueby like", value, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyNotLike(String value) {
            addCriterion("issueby not like", value, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyIn(List<String> values) {
            addCriterion("issueby in", values, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyNotIn(List<String> values) {
            addCriterion("issueby not in", values, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyBetween(String value1, String value2) {
            addCriterion("issueby between", value1, value2, "issueby");
            return (Criteria) this;
        }

        public Criteria andIssuebyNotBetween(String value1, String value2) {
            addCriterion("issueby not between", value1, value2, "issueby");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
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