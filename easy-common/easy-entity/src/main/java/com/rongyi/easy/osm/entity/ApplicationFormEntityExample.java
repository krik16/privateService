package com.rongyi.easy.osm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationFormEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationFormEntityExample() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoIsNull() {
            addCriterion("order_item_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoIsNotNull() {
            addCriterion("order_item_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoEqualTo(String value) {
            addCriterion("order_item_no =", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoNotEqualTo(String value) {
            addCriterion("order_item_no <>", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoGreaterThan(String value) {
            addCriterion("order_item_no >", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_item_no >=", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoLessThan(String value) {
            addCriterion("order_item_no <", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoLessThanOrEqualTo(String value) {
            addCriterion("order_item_no <=", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoLike(String value) {
            addCriterion("order_item_no like", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoNotLike(String value) {
            addCriterion("order_item_no not like", value, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoIn(List<String> values) {
            addCriterion("order_item_no in", values, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoNotIn(List<String> values) {
            addCriterion("order_item_no not in", values, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoBetween(String value1, String value2) {
            addCriterion("order_item_no between", value1, value2, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andOrderItemNoNotBetween(String value1, String value2) {
            addCriterion("order_item_no not between", value1, value2, "orderItemNo");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(String value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(String value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(String value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(String value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(String value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLike(String value) {
            addCriterion("buyer_id like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotLike(String value) {
            addCriterion("buyer_id not like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<String> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<String> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(String value1, String value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(String value1, String value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdIsNull() {
            addCriterion("weidian_id is null");
            return (Criteria) this;
        }

        public Criteria andWeidianIdIsNotNull() {
            addCriterion("weidian_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeidianIdEqualTo(String value) {
            addCriterion("weidian_id =", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdNotEqualTo(String value) {
            addCriterion("weidian_id <>", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdGreaterThan(String value) {
            addCriterion("weidian_id >", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdGreaterThanOrEqualTo(String value) {
            addCriterion("weidian_id >=", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdLessThan(String value) {
            addCriterion("weidian_id <", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdLessThanOrEqualTo(String value) {
            addCriterion("weidian_id <=", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdLike(String value) {
            addCriterion("weidian_id like", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdNotLike(String value) {
            addCriterion("weidian_id not like", value, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdIn(List<String> values) {
            addCriterion("weidian_id in", values, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdNotIn(List<String> values) {
            addCriterion("weidian_id not in", values, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdBetween(String value1, String value2) {
            addCriterion("weidian_id between", value1, value2, "weidianId");
            return (Criteria) this;
        }

        public Criteria andWeidianIdNotBetween(String value1, String value2) {
            addCriterion("weidian_id not between", value1, value2, "weidianId");
            return (Criteria) this;
        }

        public Criteria andPicUrlsIsNull() {
            addCriterion("pic_urls is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlsIsNotNull() {
            addCriterion("pic_urls is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlsEqualTo(String value) {
            addCriterion("pic_urls =", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsNotEqualTo(String value) {
            addCriterion("pic_urls <>", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsGreaterThan(String value) {
            addCriterion("pic_urls >", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsGreaterThanOrEqualTo(String value) {
            addCriterion("pic_urls >=", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsLessThan(String value) {
            addCriterion("pic_urls <", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsLessThanOrEqualTo(String value) {
            addCriterion("pic_urls <=", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsLike(String value) {
            addCriterion("pic_urls like", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsNotLike(String value) {
            addCriterion("pic_urls not like", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsIn(List<String> values) {
            addCriterion("pic_urls in", values, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsNotIn(List<String> values) {
            addCriterion("pic_urls not in", values, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsBetween(String value1, String value2) {
            addCriterion("pic_urls between", value1, value2, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsNotBetween(String value1, String value2) {
            addCriterion("pic_urls not between", value1, value2, "picUrls");
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

        public Criteria andRejectReasonIsNull() {
            addCriterion("reject_reason is null");
            return (Criteria) this;
        }

        public Criteria andRejectReasonIsNotNull() {
            addCriterion("reject_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRejectReasonEqualTo(String value) {
            addCriterion("reject_reason =", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotEqualTo(String value) {
            addCriterion("reject_reason <>", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonGreaterThan(String value) {
            addCriterion("reject_reason >", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reject_reason >=", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonLessThan(String value) {
            addCriterion("reject_reason <", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonLessThanOrEqualTo(String value) {
            addCriterion("reject_reason <=", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonLike(String value) {
            addCriterion("reject_reason like", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotLike(String value) {
            addCriterion("reject_reason not like", value, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonIn(List<String> values) {
            addCriterion("reject_reason in", values, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotIn(List<String> values) {
            addCriterion("reject_reason not in", values, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonBetween(String value1, String value2) {
            addCriterion("reject_reason between", value1, value2, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andRejectReasonNotBetween(String value1, String value2) {
            addCriterion("reject_reason not between", value1, value2, "rejectReason");
            return (Criteria) this;
        }

        public Criteria andAppealResultIsNull() {
            addCriterion("appeal_result is null");
            return (Criteria) this;
        }

        public Criteria andAppealResultIsNotNull() {
            addCriterion("appeal_result is not null");
            return (Criteria) this;
        }

        public Criteria andAppealResultEqualTo(String value) {
            addCriterion("appeal_result =", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultNotEqualTo(String value) {
            addCriterion("appeal_result <>", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultGreaterThan(String value) {
            addCriterion("appeal_result >", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_result >=", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultLessThan(String value) {
            addCriterion("appeal_result <", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultLessThanOrEqualTo(String value) {
            addCriterion("appeal_result <=", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultLike(String value) {
            addCriterion("appeal_result like", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultNotLike(String value) {
            addCriterion("appeal_result not like", value, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultIn(List<String> values) {
            addCriterion("appeal_result in", values, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultNotIn(List<String> values) {
            addCriterion("appeal_result not in", values, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultBetween(String value1, String value2) {
            addCriterion("appeal_result between", value1, value2, "appealResult");
            return (Criteria) this;
        }

        public Criteria andAppealResultNotBetween(String value1, String value2) {
            addCriterion("appeal_result not between", value1, value2, "appealResult");
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

        public Criteria andSellerTimeIsNull() {
            addCriterion("seller_time is null");
            return (Criteria) this;
        }

        public Criteria andSellerTimeIsNotNull() {
            addCriterion("seller_time is not null");
            return (Criteria) this;
        }

        public Criteria andSellerTimeEqualTo(Date value) {
            addCriterion("seller_time =", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeNotEqualTo(Date value) {
            addCriterion("seller_time <>", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeGreaterThan(Date value) {
            addCriterion("seller_time >", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seller_time >=", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeLessThan(Date value) {
            addCriterion("seller_time <", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeLessThanOrEqualTo(Date value) {
            addCriterion("seller_time <=", value, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeIn(List<Date> values) {
            addCriterion("seller_time in", values, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeNotIn(List<Date> values) {
            addCriterion("seller_time not in", values, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeBetween(Date value1, Date value2) {
            addCriterion("seller_time between", value1, value2, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andSellerTimeNotBetween(Date value1, Date value2) {
            addCriterion("seller_time not between", value1, value2, "sellerTime");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIsNull() {
            addCriterion("express_info_id is null");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIsNotNull() {
            addCriterion("express_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdEqualTo(String value) {
            addCriterion("express_info_id =", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotEqualTo(String value) {
            addCriterion("express_info_id <>", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdGreaterThan(String value) {
            addCriterion("express_info_id >", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("express_info_id >=", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLessThan(String value) {
            addCriterion("express_info_id <", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLessThanOrEqualTo(String value) {
            addCriterion("express_info_id <=", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdLike(String value) {
            addCriterion("express_info_id like", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotLike(String value) {
            addCriterion("express_info_id not like", value, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdIn(List<String> values) {
            addCriterion("express_info_id in", values, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotIn(List<String> values) {
            addCriterion("express_info_id not in", values, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdBetween(String value1, String value2) {
            addCriterion("express_info_id between", value1, value2, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andExpressInfoIdNotBetween(String value1, String value2) {
            addCriterion("express_info_id not between", value1, value2, "expressInfoId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdIsNull() {
            addCriterion("refund_reason_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdIsNotNull() {
            addCriterion("refund_reason_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdEqualTo(Long value) {
            addCriterion("refund_reason_id =", value, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdNotEqualTo(Long value) {
            addCriterion("refund_reason_id <>", value, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdGreaterThan(Long value) {
            addCriterion("refund_reason_id >", value, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("refund_reason_id >=", value, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdLessThan(Long value) {
            addCriterion("refund_reason_id <", value, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdLessThanOrEqualTo(Long value) {
            addCriterion("refund_reason_id <=", value, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdIn(List<Long> values) {
            addCriterion("refund_reason_id in", values, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdNotIn(List<Long> values) {
            addCriterion("refund_reason_id not in", values, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdBetween(Long value1, Long value2) {
            addCriterion("refund_reason_id between", value1, value2, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIdNotBetween(Long value1, Long value2) {
            addCriterion("refund_reason_id not between", value1, value2, "refundReasonId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdIsNull() {
            addCriterion("refund_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdIsNotNull() {
            addCriterion("refund_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdEqualTo(Long value) {
            addCriterion("refund_type_id =", value, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdNotEqualTo(Long value) {
            addCriterion("refund_type_id <>", value, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdGreaterThan(Long value) {
            addCriterion("refund_type_id >", value, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("refund_type_id >=", value, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdLessThan(Long value) {
            addCriterion("refund_type_id <", value, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("refund_type_id <=", value, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdIn(List<Long> values) {
            addCriterion("refund_type_id in", values, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdNotIn(List<Long> values) {
            addCriterion("refund_type_id not in", values, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdBetween(Long value1, Long value2) {
            addCriterion("refund_type_id between", value1, value2, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("refund_type_id not between", value1, value2, "refundTypeId");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtIsNull() {
            addCriterion("agent_create_at is null");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtIsNotNull() {
            addCriterion("agent_create_at is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtEqualTo(Date value) {
            addCriterion("agent_create_at =", value, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtNotEqualTo(Date value) {
            addCriterion("agent_create_at <>", value, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtGreaterThan(Date value) {
            addCriterion("agent_create_at >", value, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("agent_create_at >=", value, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtLessThan(Date value) {
            addCriterion("agent_create_at <", value, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("agent_create_at <=", value, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtIn(List<Date> values) {
            addCriterion("agent_create_at in", values, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtNotIn(List<Date> values) {
            addCriterion("agent_create_at not in", values, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtBetween(Date value1, Date value2) {
            addCriterion("agent_create_at between", value1, value2, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("agent_create_at not between", value1, value2, "agentCreateAt");
            return (Criteria) this;
        }

        public Criteria andAgentCommentIsNull() {
            addCriterion("agent_comment is null");
            return (Criteria) this;
        }

        public Criteria andAgentCommentIsNotNull() {
            addCriterion("agent_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCommentEqualTo(String value) {
            addCriterion("agent_comment =", value, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentNotEqualTo(String value) {
            addCriterion("agent_comment <>", value, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentGreaterThan(String value) {
            addCriterion("agent_comment >", value, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentGreaterThanOrEqualTo(String value) {
            addCriterion("agent_comment >=", value, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentLessThan(String value) {
            addCriterion("agent_comment <", value, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentLessThanOrEqualTo(String value) {
            addCriterion("agent_comment <=", value, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentLike(String value) {
            addCriterion("agent_comment like", value, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentNotLike(String value) {
            addCriterion("agent_comment not like", value, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentIn(List<String> values) {
            addCriterion("agent_comment in", values, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentNotIn(List<String> values) {
            addCriterion("agent_comment not in", values, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentBetween(String value1, String value2) {
            addCriterion("agent_comment between", value1, value2, "agentComment");
            return (Criteria) this;
        }

        public Criteria andAgentCommentNotBetween(String value1, String value2) {
            addCriterion("agent_comment not between", value1, value2, "agentComment");
            return (Criteria) this;
        }

        public Criteria andEndAtIsNull() {
            addCriterion("end_at is null");
            return (Criteria) this;
        }

        public Criteria andEndAtIsNotNull() {
            addCriterion("end_at is not null");
            return (Criteria) this;
        }

        public Criteria andEndAtEqualTo(Date value) {
            addCriterion("end_at =", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtNotEqualTo(Date value) {
            addCriterion("end_at <>", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtGreaterThan(Date value) {
            addCriterion("end_at >", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtGreaterThanOrEqualTo(Date value) {
            addCriterion("end_at >=", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtLessThan(Date value) {
            addCriterion("end_at <", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtLessThanOrEqualTo(Date value) {
            addCriterion("end_at <=", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtIn(List<Date> values) {
            addCriterion("end_at in", values, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtNotIn(List<Date> values) {
            addCriterion("end_at not in", values, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtBetween(Date value1, Date value2) {
            addCriterion("end_at between", value1, value2, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtNotBetween(Date value1, Date value2) {
            addCriterion("end_at not between", value1, value2, "endAt");
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