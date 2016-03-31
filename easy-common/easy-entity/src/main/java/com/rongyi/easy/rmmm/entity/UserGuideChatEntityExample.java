package com.rongyi.easy.rmmm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserGuideChatEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserGuideChatEntityExample() {
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

        public Criteria andMallUserIdIsNull() {
            addCriterion("mall_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMallUserIdIsNotNull() {
            addCriterion("mall_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMallUserIdEqualTo(String value) {
            addCriterion("mall_user_id =", value, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdNotEqualTo(String value) {
            addCriterion("mall_user_id <>", value, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdGreaterThan(String value) {
            addCriterion("mall_user_id >", value, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("mall_user_id >=", value, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdLessThan(String value) {
            addCriterion("mall_user_id <", value, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdLessThanOrEqualTo(String value) {
            addCriterion("mall_user_id <=", value, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdLike(String value) {
            addCriterion("mall_user_id like", value, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdNotLike(String value) {
            addCriterion("mall_user_id not like", value, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdIn(List<String> values) {
            addCriterion("mall_user_id in", values, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdNotIn(List<String> values) {
            addCriterion("mall_user_id not in", values, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdBetween(String value1, String value2) {
            addCriterion("mall_user_id between", value1, value2, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andMallUserIdNotBetween(String value1, String value2) {
            addCriterion("mall_user_id not between", value1, value2, "mallUserId");
            return (Criteria) this;
        }

        public Criteria andGuideIdIsNull() {
            addCriterion("guide_id is null");
            return (Criteria) this;
        }

        public Criteria andGuideIdIsNotNull() {
            addCriterion("guide_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuideIdEqualTo(Integer value) {
            addCriterion("guide_id =", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotEqualTo(Integer value) {
            addCriterion("guide_id <>", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThan(Integer value) {
            addCriterion("guide_id >", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guide_id >=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThan(Integer value) {
            addCriterion("guide_id <", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThanOrEqualTo(Integer value) {
            addCriterion("guide_id <=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdIn(List<Integer> values) {
            addCriterion("guide_id in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotIn(List<Integer> values) {
            addCriterion("guide_id not in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdBetween(Integer value1, Integer value2) {
            addCriterion("guide_id between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guide_id not between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andShopMidIsNull() {
            addCriterion("shop_mid is null");
            return (Criteria) this;
        }

        public Criteria andShopMidIsNotNull() {
            addCriterion("shop_mid is not null");
            return (Criteria) this;
        }

        public Criteria andShopMidEqualTo(String value) {
            addCriterion("shop_mid =", value, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidNotEqualTo(String value) {
            addCriterion("shop_mid <>", value, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidGreaterThan(String value) {
            addCriterion("shop_mid >", value, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidGreaterThanOrEqualTo(String value) {
            addCriterion("shop_mid >=", value, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidLessThan(String value) {
            addCriterion("shop_mid <", value, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidLessThanOrEqualTo(String value) {
            addCriterion("shop_mid <=", value, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidLike(String value) {
            addCriterion("shop_mid like", value, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidNotLike(String value) {
            addCriterion("shop_mid not like", value, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidIn(List<String> values) {
            addCriterion("shop_mid in", values, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidNotIn(List<String> values) {
            addCriterion("shop_mid not in", values, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidBetween(String value1, String value2) {
            addCriterion("shop_mid between", value1, value2, "shopMid");
            return (Criteria) this;
        }

        public Criteria andShopMidNotBetween(String value1, String value2) {
            addCriterion("shop_mid not between", value1, value2, "shopMid");
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

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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