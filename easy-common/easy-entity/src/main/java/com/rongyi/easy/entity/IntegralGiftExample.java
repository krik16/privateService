package com.rongyi.easy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntegralGiftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralGiftExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesIsNull() {
            addCriterion("personal_times is null");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesIsNotNull() {
            addCriterion("personal_times is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesEqualTo(Integer value) {
            addCriterion("personal_times =", value, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesNotEqualTo(Integer value) {
            addCriterion("personal_times <>", value, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesGreaterThan(Integer value) {
            addCriterion("personal_times >", value, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("personal_times >=", value, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesLessThan(Integer value) {
            addCriterion("personal_times <", value, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesLessThanOrEqualTo(Integer value) {
            addCriterion("personal_times <=", value, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesIn(List<Integer> values) {
            addCriterion("personal_times in", values, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesNotIn(List<Integer> values) {
            addCriterion("personal_times not in", values, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesBetween(Integer value1, Integer value2) {
            addCriterion("personal_times between", value1, value2, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andPersonalTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("personal_times not between", value1, value2, "personalTimes");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andShelvesDateIsNull() {
            addCriterion("shelves_date is null");
            return (Criteria) this;
        }

        public Criteria andShelvesDateIsNotNull() {
            addCriterion("shelves_date is not null");
            return (Criteria) this;
        }

        public Criteria andShelvesDateEqualTo(Date value) {
            addCriterion("shelves_date =", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateNotEqualTo(Date value) {
            addCriterion("shelves_date <>", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateGreaterThan(Date value) {
            addCriterion("shelves_date >", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateGreaterThanOrEqualTo(Date value) {
            addCriterion("shelves_date >=", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateLessThan(Date value) {
            addCriterion("shelves_date <", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateLessThanOrEqualTo(Date value) {
            addCriterion("shelves_date <=", value, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateIn(List<Date> values) {
            addCriterion("shelves_date in", values, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateNotIn(List<Date> values) {
            addCriterion("shelves_date not in", values, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateBetween(Date value1, Date value2) {
            addCriterion("shelves_date between", value1, value2, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andShelvesDateNotBetween(Date value1, Date value2) {
            addCriterion("shelves_date not between", value1, value2, "shelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateIsNull() {
            addCriterion("off_shelves_date is null");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateIsNotNull() {
            addCriterion("off_shelves_date is not null");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateEqualTo(Date value) {
            addCriterion("off_shelves_date =", value, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateNotEqualTo(Date value) {
            addCriterion("off_shelves_date <>", value, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateGreaterThan(Date value) {
            addCriterion("off_shelves_date >", value, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateGreaterThanOrEqualTo(Date value) {
            addCriterion("off_shelves_date >=", value, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateLessThan(Date value) {
            addCriterion("off_shelves_date <", value, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateLessThanOrEqualTo(Date value) {
            addCriterion("off_shelves_date <=", value, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateIn(List<Date> values) {
            addCriterion("off_shelves_date in", values, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateNotIn(List<Date> values) {
            addCriterion("off_shelves_date not in", values, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateBetween(Date value1, Date value2) {
            addCriterion("off_shelves_date between", value1, value2, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andOffShelvesDateNotBetween(Date value1, Date value2) {
            addCriterion("off_shelves_date not between", value1, value2, "offShelvesDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralIsNull() {
            addCriterion("exchange_integral is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralIsNotNull() {
            addCriterion("exchange_integral is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralEqualTo(Integer value) {
            addCriterion("exchange_integral =", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralNotEqualTo(Integer value) {
            addCriterion("exchange_integral <>", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralGreaterThan(Integer value) {
            addCriterion("exchange_integral >", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_integral >=", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralLessThan(Integer value) {
            addCriterion("exchange_integral <", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_integral <=", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralIn(List<Integer> values) {
            addCriterion("exchange_integral in", values, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralNotIn(List<Integer> values) {
            addCriterion("exchange_integral not in", values, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralBetween(Integer value1, Integer value2) {
            addCriterion("exchange_integral between", value1, value2, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_integral not between", value1, value2, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeIsNull() {
            addCriterion("favourable_start_time is null");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeIsNotNull() {
            addCriterion("favourable_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeEqualTo(Date value) {
            addCriterion("favourable_start_time =", value, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeNotEqualTo(Date value) {
            addCriterion("favourable_start_time <>", value, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeGreaterThan(Date value) {
            addCriterion("favourable_start_time >", value, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("favourable_start_time >=", value, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeLessThan(Date value) {
            addCriterion("favourable_start_time <", value, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("favourable_start_time <=", value, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeIn(List<Date> values) {
            addCriterion("favourable_start_time in", values, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeNotIn(List<Date> values) {
            addCriterion("favourable_start_time not in", values, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeBetween(Date value1, Date value2) {
            addCriterion("favourable_start_time between", value1, value2, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("favourable_start_time not between", value1, value2, "favourableStartTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeIsNull() {
            addCriterion("favourable_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeIsNotNull() {
            addCriterion("favourable_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeEqualTo(Date value) {
            addCriterion("favourable_end_time =", value, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeNotEqualTo(Date value) {
            addCriterion("favourable_end_time <>", value, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeGreaterThan(Date value) {
            addCriterion("favourable_end_time >", value, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("favourable_end_time >=", value, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeLessThan(Date value) {
            addCriterion("favourable_end_time <", value, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("favourable_end_time <=", value, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeIn(List<Date> values) {
            addCriterion("favourable_end_time in", values, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeNotIn(List<Date> values) {
            addCriterion("favourable_end_time not in", values, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeBetween(Date value1, Date value2) {
            addCriterion("favourable_end_time between", value1, value2, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("favourable_end_time not between", value1, value2, "favourableEndTime");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralIsNull() {
            addCriterion("favourable_integral is null");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralIsNotNull() {
            addCriterion("favourable_integral is not null");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralEqualTo(Integer value) {
            addCriterion("favourable_integral =", value, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralNotEqualTo(Integer value) {
            addCriterion("favourable_integral <>", value, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralGreaterThan(Integer value) {
            addCriterion("favourable_integral >", value, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("favourable_integral >=", value, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralLessThan(Integer value) {
            addCriterion("favourable_integral <", value, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("favourable_integral <=", value, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralIn(List<Integer> values) {
            addCriterion("favourable_integral in", values, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralNotIn(List<Integer> values) {
            addCriterion("favourable_integral not in", values, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralBetween(Integer value1, Integer value2) {
            addCriterion("favourable_integral between", value1, value2, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andFavourableIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("favourable_integral not between", value1, value2, "favourableIntegral");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesIsNull() {
            addCriterion("receive_times is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesIsNotNull() {
            addCriterion("receive_times is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesEqualTo(Integer value) {
            addCriterion("receive_times =", value, "receiveTimes");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesNotEqualTo(Integer value) {
            addCriterion("receive_times <>", value, "receiveTimes");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesGreaterThan(Integer value) {
            addCriterion("receive_times >", value, "receiveTimes");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_times >=", value, "receiveTimes");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesLessThan(Integer value) {
            addCriterion("receive_times <", value, "receiveTimes");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesLessThanOrEqualTo(Integer value) {
            addCriterion("receive_times <=", value, "receiveTimes");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesIn(List<Integer> values) {
            addCriterion("receive_times in", values, "receiveTimes");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesNotIn(List<Integer> values) {
            addCriterion("receive_times not in", values, "receiveTimes");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesBetween(Integer value1, Integer value2) {
            addCriterion("receive_times between", value1, value2, "receiveTimes");
            return (Criteria) this;
        }

        public Criteria andReceiveTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_times not between", value1, value2, "receiveTimes");
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