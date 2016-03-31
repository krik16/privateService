package com.rongyi.easy.rvc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdentifyIsNull() {
            addCriterion("identify is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyIsNotNull() {
            addCriterion("identify is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyEqualTo(String value) {
            addCriterion("identify =", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotEqualTo(String value) {
            addCriterion("identify <>", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThan(String value) {
            addCriterion("identify >", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThanOrEqualTo(String value) {
            addCriterion("identify >=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThan(String value) {
            addCriterion("identify <", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThanOrEqualTo(String value) {
            addCriterion("identify <=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLike(String value) {
            addCriterion("identify like", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotLike(String value) {
            addCriterion("identify not like", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyIn(List<String> values) {
            addCriterion("identify in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotIn(List<String> values) {
            addCriterion("identify not in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyBetween(String value1, String value2) {
            addCriterion("identify between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotBetween(String value1, String value2) {
            addCriterion("identify not between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNull() {
            addCriterion("regist_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Date value) {
            addCriterion("regist_time =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Date value) {
            addCriterion("regist_time <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Date value) {
            addCriterion("regist_time >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("regist_time >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Date value) {
            addCriterion("regist_time <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Date value) {
            addCriterion("regist_time <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Date> values) {
            addCriterion("regist_time in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Date> values) {
            addCriterion("regist_time not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Date value1, Date value2) {
            addCriterion("regist_time between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Date value1, Date value2) {
            addCriterion("regist_time not between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andAlipayIdIsNull() {
            addCriterion("alipay_id is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIdIsNotNull() {
            addCriterion("alipay_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayIdEqualTo(String value) {
            addCriterion("alipay_id =", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotEqualTo(String value) {
            addCriterion("alipay_id <>", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdGreaterThan(String value) {
            addCriterion("alipay_id >", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_id >=", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdLessThan(String value) {
            addCriterion("alipay_id <", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdLessThanOrEqualTo(String value) {
            addCriterion("alipay_id <=", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdLike(String value) {
            addCriterion("alipay_id like", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotLike(String value) {
            addCriterion("alipay_id not like", value, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdIn(List<String> values) {
            addCriterion("alipay_id in", values, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotIn(List<String> values) {
            addCriterion("alipay_id not in", values, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdBetween(String value1, String value2) {
            addCriterion("alipay_id between", value1, value2, "alipayId");
            return (Criteria) this;
        }

        public Criteria andAlipayIdNotBetween(String value1, String value2) {
            addCriterion("alipay_id not between", value1, value2, "alipayId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdIsNull() {
            addCriterion("weibo_id is null");
            return (Criteria) this;
        }

        public Criteria andWeiboIdIsNotNull() {
            addCriterion("weibo_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboIdEqualTo(String value) {
            addCriterion("weibo_id =", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotEqualTo(String value) {
            addCriterion("weibo_id <>", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdGreaterThan(String value) {
            addCriterion("weibo_id >", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdGreaterThanOrEqualTo(String value) {
            addCriterion("weibo_id >=", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdLessThan(String value) {
            addCriterion("weibo_id <", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdLessThanOrEqualTo(String value) {
            addCriterion("weibo_id <=", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdLike(String value) {
            addCriterion("weibo_id like", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotLike(String value) {
            addCriterion("weibo_id not like", value, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdIn(List<String> values) {
            addCriterion("weibo_id in", values, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotIn(List<String> values) {
            addCriterion("weibo_id not in", values, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdBetween(String value1, String value2) {
            addCriterion("weibo_id between", value1, value2, "weiboId");
            return (Criteria) this;
        }

        public Criteria andWeiboIdNotBetween(String value1, String value2) {
            addCriterion("weibo_id not between", value1, value2, "weiboId");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatar_url like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatarUrl");
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

        public Criteria andCardFetchTimeIsNull() {
            addCriterion("card_fetch_time is null");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeIsNotNull() {
            addCriterion("card_fetch_time is not null");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeEqualTo(Date value) {
            addCriterion("card_fetch_time =", value, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeNotEqualTo(Date value) {
            addCriterion("card_fetch_time <>", value, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeGreaterThan(Date value) {
            addCriterion("card_fetch_time >", value, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("card_fetch_time >=", value, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeLessThan(Date value) {
            addCriterion("card_fetch_time <", value, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeLessThanOrEqualTo(Date value) {
            addCriterion("card_fetch_time <=", value, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeIn(List<Date> values) {
            addCriterion("card_fetch_time in", values, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeNotIn(List<Date> values) {
            addCriterion("card_fetch_time not in", values, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeBetween(Date value1, Date value2) {
            addCriterion("card_fetch_time between", value1, value2, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andCardFetchTimeNotBetween(Date value1, Date value2) {
            addCriterion("card_fetch_time not between", value1, value2, "cardFetchTime");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(Integer value) {
            addCriterion("member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(Integer value) {
            addCriterion("member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(Integer value) {
            addCriterion("member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(Integer value) {
            addCriterion("member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<Integer> values) {
            addCriterion("member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<Integer> values) {
            addCriterion("member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andContryIsNull() {
            addCriterion("contry is null");
            return (Criteria) this;
        }

        public Criteria andContryIsNotNull() {
            addCriterion("contry is not null");
            return (Criteria) this;
        }

        public Criteria andContryEqualTo(String value) {
            addCriterion("contry =", value, "contry");
            return (Criteria) this;
        }

        public Criteria andContryNotEqualTo(String value) {
            addCriterion("contry <>", value, "contry");
            return (Criteria) this;
        }

        public Criteria andContryGreaterThan(String value) {
            addCriterion("contry >", value, "contry");
            return (Criteria) this;
        }

        public Criteria andContryGreaterThanOrEqualTo(String value) {
            addCriterion("contry >=", value, "contry");
            return (Criteria) this;
        }

        public Criteria andContryLessThan(String value) {
            addCriterion("contry <", value, "contry");
            return (Criteria) this;
        }

        public Criteria andContryLessThanOrEqualTo(String value) {
            addCriterion("contry <=", value, "contry");
            return (Criteria) this;
        }

        public Criteria andContryLike(String value) {
            addCriterion("contry like", value, "contry");
            return (Criteria) this;
        }

        public Criteria andContryNotLike(String value) {
            addCriterion("contry not like", value, "contry");
            return (Criteria) this;
        }

        public Criteria andContryIn(List<String> values) {
            addCriterion("contry in", values, "contry");
            return (Criteria) this;
        }

        public Criteria andContryNotIn(List<String> values) {
            addCriterion("contry not in", values, "contry");
            return (Criteria) this;
        }

        public Criteria andContryBetween(String value1, String value2) {
            addCriterion("contry between", value1, value2, "contry");
            return (Criteria) this;
        }

        public Criteria andContryNotBetween(String value1, String value2) {
            addCriterion("contry not between", value1, value2, "contry");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andMallIdIsNull() {
            addCriterion("mall_id is null");
            return (Criteria) this;
        }

        public Criteria andMallIdIsNotNull() {
            addCriterion("mall_id is not null");
            return (Criteria) this;
        }

        public Criteria andMallIdEqualTo(String value) {
            addCriterion("mall_id =", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotEqualTo(String value) {
            addCriterion("mall_id <>", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdGreaterThan(String value) {
            addCriterion("mall_id >", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdGreaterThanOrEqualTo(String value) {
            addCriterion("mall_id >=", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLessThan(String value) {
            addCriterion("mall_id <", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLessThanOrEqualTo(String value) {
            addCriterion("mall_id <=", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdLike(String value) {
            addCriterion("mall_id like", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotLike(String value) {
            addCriterion("mall_id not like", value, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdIn(List<String> values) {
            addCriterion("mall_id in", values, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotIn(List<String> values) {
            addCriterion("mall_id not in", values, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdBetween(String value1, String value2) {
            addCriterion("mall_id between", value1, value2, "mallId");
            return (Criteria) this;
        }

        public Criteria andMallIdNotBetween(String value1, String value2) {
            addCriterion("mall_id not between", value1, value2, "mallId");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Byte value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Byte value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Byte value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Byte value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Byte value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Byte> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Byte> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Byte value1, Byte value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(String value) {
            addCriterion("owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(String value) {
            addCriterion("owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(String value) {
            addCriterion("owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(String value) {
            addCriterion("owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(String value) {
            addCriterion("owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(String value) {
            addCriterion("owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLike(String value) {
            addCriterion("owner_id like", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotLike(String value) {
            addCriterion("owner_id not like", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<String> values) {
            addCriterion("owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<String> values) {
            addCriterion("owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(String value1, String value2) {
            addCriterion("owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(String value1, String value2) {
            addCriterion("owner_id not between", value1, value2, "ownerId");
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

        public Criteria andFirstConsumeTimeIsNull() {
            addCriterion("first_consume_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeIsNotNull() {
            addCriterion("first_consume_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeEqualTo(Date value) {
            addCriterion("first_consume_time =", value, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeNotEqualTo(Date value) {
            addCriterion("first_consume_time <>", value, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeGreaterThan(Date value) {
            addCriterion("first_consume_time >", value, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_consume_time >=", value, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeLessThan(Date value) {
            addCriterion("first_consume_time <", value, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_consume_time <=", value, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeIn(List<Date> values) {
            addCriterion("first_consume_time in", values, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeNotIn(List<Date> values) {
            addCriterion("first_consume_time not in", values, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeBetween(Date value1, Date value2) {
            addCriterion("first_consume_time between", value1, value2, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andFirstConsumeTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_consume_time not between", value1, value2, "firstConsumeTime");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeIsNull() {
            addCriterion("last_consume_time is null");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeIsNotNull() {
            addCriterion("last_consume_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeEqualTo(Date value) {
            addCriterion("last_consume_time =", value, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeNotEqualTo(Date value) {
            addCriterion("last_consume_time <>", value, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeGreaterThan(Date value) {
            addCriterion("last_consume_time >", value, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_consume_time >=", value, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeLessThan(Date value) {
            addCriterion("last_consume_time <", value, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_consume_time <=", value, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeIn(List<Date> values) {
            addCriterion("last_consume_time in", values, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeNotIn(List<Date> values) {
            addCriterion("last_consume_time not in", values, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeBetween(Date value1, Date value2) {
            addCriterion("last_consume_time between", value1, value2, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andLastConsumeTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_consume_time not between", value1, value2, "lastConsumeTime");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNull() {
            addCriterion("member_level is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNotNull() {
            addCriterion("member_level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelEqualTo(String value) {
            addCriterion("member_level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(String value) {
            addCriterion("member_level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(String value) {
            addCriterion("member_level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(String value) {
            addCriterion("member_level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(String value) {
            addCriterion("member_level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(String value) {
            addCriterion("member_level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLike(String value) {
            addCriterion("member_level like", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotLike(String value) {
            addCriterion("member_level not like", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<String> values) {
            addCriterion("member_level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<String> values) {
            addCriterion("member_level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(String value1, String value2) {
            addCriterion("member_level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(String value1, String value2) {
            addCriterion("member_level not between", value1, value2, "memberLevel");
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