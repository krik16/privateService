package com.rongyi.easy.content.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentInfoExample() {
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

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Integer value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Integer value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Integer value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Integer value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Integer value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Integer> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Integer> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Integer value1, Integer value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Integer value1, Integer value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNull() {
            addCriterion("is_disabled is null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNotNull() {
            addCriterion("is_disabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledEqualTo(Integer value) {
            addCriterion("is_disabled =", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotEqualTo(Integer value) {
            addCriterion("is_disabled <>", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThan(Integer value) {
            addCriterion("is_disabled >", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_disabled >=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThan(Integer value) {
            addCriterion("is_disabled <", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThanOrEqualTo(Integer value) {
            addCriterion("is_disabled <=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIn(List<Integer> values) {
            addCriterion("is_disabled in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotIn(List<Integer> values) {
            addCriterion("is_disabled not in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledBetween(Integer value1, Integer value2) {
            addCriterion("is_disabled between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotBetween(Integer value1, Integer value2) {
            addCriterion("is_disabled not between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andForumIdIsNull() {
            addCriterion("forum_id is null");
            return (Criteria) this;
        }

        public Criteria andForumIdIsNotNull() {
            addCriterion("forum_id is not null");
            return (Criteria) this;
        }

        public Criteria andForumIdEqualTo(Integer value) {
            addCriterion("forum_id =", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotEqualTo(Integer value) {
            addCriterion("forum_id <>", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThan(Integer value) {
            addCriterion("forum_id >", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("forum_id >=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThan(Integer value) {
            addCriterion("forum_id <", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThanOrEqualTo(Integer value) {
            addCriterion("forum_id <=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdIn(List<Integer> values) {
            addCriterion("forum_id in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotIn(List<Integer> values) {
            addCriterion("forum_id not in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdBetween(Integer value1, Integer value2) {
            addCriterion("forum_id between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("forum_id not between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("content_type is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("content_type is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(Integer value) {
            addCriterion("content_type =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(Integer value) {
            addCriterion("content_type <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(Integer value) {
            addCriterion("content_type >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_type >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(Integer value) {
            addCriterion("content_type <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("content_type <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<Integer> values) {
            addCriterion("content_type in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<Integer> values) {
            addCriterion("content_type not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(Integer value1, Integer value2) {
            addCriterion("content_type between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("content_type not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeidIsNull() {
            addCriterion("content_typeid is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeidIsNotNull() {
            addCriterion("content_typeid is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeidEqualTo(String value) {
            addCriterion("content_typeid =", value, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidNotEqualTo(String value) {
            addCriterion("content_typeid <>", value, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidGreaterThan(String value) {
            addCriterion("content_typeid >", value, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("content_typeid >=", value, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidLessThan(String value) {
            addCriterion("content_typeid <", value, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidLessThanOrEqualTo(String value) {
            addCriterion("content_typeid <=", value, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidLike(String value) {
            addCriterion("content_typeid like", value, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidNotLike(String value) {
            addCriterion("content_typeid not like", value, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidIn(List<String> values) {
            addCriterion("content_typeid in", values, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidNotIn(List<String> values) {
            addCriterion("content_typeid not in", values, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidBetween(String value1, String value2) {
            addCriterion("content_typeid between", value1, value2, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentTypeidNotBetween(String value1, String value2) {
            addCriterion("content_typeid not between", value1, value2, "contentTypeid");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeIsNull() {
            addCriterion("content_starttime is null");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeIsNotNull() {
            addCriterion("content_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeEqualTo(Date value) {
            addCriterion("content_starttime =", value, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeNotEqualTo(Date value) {
            addCriterion("content_starttime <>", value, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeGreaterThan(Date value) {
            addCriterion("content_starttime >", value, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("content_starttime >=", value, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeLessThan(Date value) {
            addCriterion("content_starttime <", value, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("content_starttime <=", value, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeIn(List<Date> values) {
            addCriterion("content_starttime in", values, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeNotIn(List<Date> values) {
            addCriterion("content_starttime not in", values, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeBetween(Date value1, Date value2) {
            addCriterion("content_starttime between", value1, value2, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("content_starttime not between", value1, value2, "contentStarttime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeIsNull() {
            addCriterion("content_endtime is null");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeIsNotNull() {
            addCriterion("content_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeEqualTo(Date value) {
            addCriterion("content_endtime =", value, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeNotEqualTo(Date value) {
            addCriterion("content_endtime <>", value, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeGreaterThan(Date value) {
            addCriterion("content_endtime >", value, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("content_endtime >=", value, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeLessThan(Date value) {
            addCriterion("content_endtime <", value, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("content_endtime <=", value, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeIn(List<Date> values) {
            addCriterion("content_endtime in", values, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeNotIn(List<Date> values) {
            addCriterion("content_endtime not in", values, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeBetween(Date value1, Date value2) {
            addCriterion("content_endtime between", value1, value2, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("content_endtime not between", value1, value2, "contentEndtime");
            return (Criteria) this;
        }

        public Criteria andContentSortIsNull() {
            addCriterion("content_sort is null");
            return (Criteria) this;
        }

        public Criteria andContentSortIsNotNull() {
            addCriterion("content_sort is not null");
            return (Criteria) this;
        }

        public Criteria andContentSortEqualTo(Integer value) {
            addCriterion("content_sort =", value, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentSortNotEqualTo(Integer value) {
            addCriterion("content_sort <>", value, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentSortGreaterThan(Integer value) {
            addCriterion("content_sort >", value, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_sort >=", value, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentSortLessThan(Integer value) {
            addCriterion("content_sort <", value, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentSortLessThanOrEqualTo(Integer value) {
            addCriterion("content_sort <=", value, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentSortIn(List<Integer> values) {
            addCriterion("content_sort in", values, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentSortNotIn(List<Integer> values) {
            addCriterion("content_sort not in", values, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentSortBetween(Integer value1, Integer value2) {
            addCriterion("content_sort between", value1, value2, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentSortNotBetween(Integer value1, Integer value2) {
            addCriterion("content_sort not between", value1, value2, "contentSort");
            return (Criteria) this;
        }

        public Criteria andContentLinkIsNull() {
            addCriterion("content_link is null");
            return (Criteria) this;
        }

        public Criteria andContentLinkIsNotNull() {
            addCriterion("content_link is not null");
            return (Criteria) this;
        }

        public Criteria andContentLinkEqualTo(String value) {
            addCriterion("content_link =", value, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkNotEqualTo(String value) {
            addCriterion("content_link <>", value, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkGreaterThan(String value) {
            addCriterion("content_link >", value, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkGreaterThanOrEqualTo(String value) {
            addCriterion("content_link >=", value, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkLessThan(String value) {
            addCriterion("content_link <", value, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkLessThanOrEqualTo(String value) {
            addCriterion("content_link <=", value, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkLike(String value) {
            addCriterion("content_link like", value, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkNotLike(String value) {
            addCriterion("content_link not like", value, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkIn(List<String> values) {
            addCriterion("content_link in", values, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkNotIn(List<String> values) {
            addCriterion("content_link not in", values, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkBetween(String value1, String value2) {
            addCriterion("content_link between", value1, value2, "contentLink");
            return (Criteria) this;
        }

        public Criteria andContentLinkNotBetween(String value1, String value2) {
            addCriterion("content_link not between", value1, value2, "contentLink");
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

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
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