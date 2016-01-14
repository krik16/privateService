package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppAdvertisementQuery implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppAdvertisementQuery() {
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
        
        public Criteria addCityIdOrCondition(String value) {
            addCriterion(" (pro = '" + value + "' or city = '" + value + "') ");
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

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andTimefromIsNull() {
            addCriterion("timeFrom is null");
            return (Criteria) this;
        }

        public Criteria andTimefromIsNotNull() {
            addCriterion("timeFrom is not null");
            return (Criteria) this;
        }

        public Criteria andTimefromEqualTo(Date value) {
            addCriterion("timeFrom =", value, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimefromNotEqualTo(Date value) {
            addCriterion("timeFrom <>", value, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimefromGreaterThan(Date value) {
            addCriterion("timeFrom >", value, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimefromGreaterThanOrEqualTo(Date value) {
            addCriterion("timeFrom >=", value, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimefromLessThan(Date value) {
            addCriterion("timeFrom <", value, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimefromLessThanOrEqualTo(Date value) {
            addCriterion("timeFrom <=", value, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimefromIn(List<Date> values) {
            addCriterion("timeFrom in", values, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimefromNotIn(List<Date> values) {
            addCriterion("timeFrom not in", values, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimefromBetween(Date value1, Date value2) {
            addCriterion("timeFrom between", value1, value2, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimefromNotBetween(Date value1, Date value2) {
            addCriterion("timeFrom not between", value1, value2, "timefrom");
            return (Criteria) this;
        }

        public Criteria andTimetoIsNull() {
            addCriterion("timeTo is null");
            return (Criteria) this;
        }

        public Criteria andTimetoIsNotNull() {
            addCriterion("timeTo is not null");
            return (Criteria) this;
        }

        public Criteria andTimetoEqualTo(Date value) {
            addCriterion("timeTo =", value, "timeto");
            return (Criteria) this;
        }

        public Criteria andTimetoNotEqualTo(Date value) {
            addCriterion("timeTo <>", value, "timeto");
            return (Criteria) this;
        }

        public Criteria andTimetoGreaterThan(Date value) {
            addCriterion("timeTo >", value, "timeto");
            return (Criteria) this;
        }

        public Criteria andTimetoGreaterThanOrEqualTo(Date value) {
            addCriterion("timeTo >=", value, "timeto");
            return (Criteria) this;
        }

        public Criteria andTimetoLessThan(Date value) {
            addCriterion("timeTo <", value, "timeto");
            return (Criteria) this;
        }

        public Criteria andTimetoLessThanOrEqualTo(Date value) {
            addCriterion("timeTo <=", value, "timeto");
            return (Criteria) this;
        }

        public Criteria andTimetoIn(List<Date> values) {
            addCriterion("timeTo in", values, "timeto");
            return (Criteria) this;
        }

        public Criteria andTimetoNotIn(List<Date> values) {
            addCriterion("timeTo not in", values, "timeto");
            return (Criteria) this;
        }

        public Criteria andTimetoBetween(Date value1, Date value2) {
            addCriterion("timeTo between", value1, value2, "timeto");
            return (Criteria) this;
        }

        public Criteria andTimetoNotBetween(Date value1, Date value2) {
            addCriterion("timeTo not between", value1, value2, "timeto");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNull() {
            addCriterion("articleId is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("articleId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(String value) {
            addCriterion("articleId =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(String value) {
            addCriterion("articleId <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(String value) {
            addCriterion("articleId >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(String value) {
            addCriterion("articleId >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(String value) {
            addCriterion("articleId <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(String value) {
            addCriterion("articleId <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLike(String value) {
            addCriterion("articleId like", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotLike(String value) {
            addCriterion("articleId not like", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<String> values) {
            addCriterion("articleId in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<String> values) {
            addCriterion("articleId not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(String value1, String value2) {
            addCriterion("articleId between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(String value1, String value2) {
            addCriterion("articleId not between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNull() {
            addCriterion("articleTitle is null");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNotNull() {
            addCriterion("articleTitle is not null");
            return (Criteria) this;
        }

        public Criteria andArticletitleEqualTo(String value) {
            addCriterion("articleTitle =", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotEqualTo(String value) {
            addCriterion("articleTitle <>", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThan(String value) {
            addCriterion("articleTitle >", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThanOrEqualTo(String value) {
            addCriterion("articleTitle >=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThan(String value) {
            addCriterion("articleTitle <", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThanOrEqualTo(String value) {
            addCriterion("articleTitle <=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLike(String value) {
            addCriterion("articleTitle like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotLike(String value) {
            addCriterion("articleTitle not like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleIn(List<String> values) {
            addCriterion("articleTitle in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotIn(List<String> values) {
            addCriterion("articleTitle not in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleBetween(String value1, String value2) {
            addCriterion("articleTitle between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotBetween(String value1, String value2) {
            addCriterion("articleTitle not between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidIsNull() {
            addCriterion("groupPurchaseId is null");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidIsNotNull() {
            addCriterion("groupPurchaseId is not null");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidEqualTo(Integer value) {
            addCriterion("groupPurchaseId =", value, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidNotEqualTo(Integer value) {
            addCriterion("groupPurchaseId <>", value, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidGreaterThan(Integer value) {
            addCriterion("groupPurchaseId >", value, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupPurchaseId >=", value, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidLessThan(Integer value) {
            addCriterion("groupPurchaseId <", value, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidLessThanOrEqualTo(Integer value) {
            addCriterion("groupPurchaseId <=", value, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidIn(List<Integer> values) {
            addCriterion("groupPurchaseId in", values, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidNotIn(List<Integer> values) {
            addCriterion("groupPurchaseId not in", values, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidBetween(Integer value1, Integer value2) {
            addCriterion("groupPurchaseId between", value1, value2, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupPurchaseId not between", value1, value2, "grouppurchaseid");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameIsNull() {
            addCriterion("groupPurchaseName is null");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameIsNotNull() {
            addCriterion("groupPurchaseName is not null");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameEqualTo(String value) {
            addCriterion("groupPurchaseName =", value, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameNotEqualTo(String value) {
            addCriterion("groupPurchaseName <>", value, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameGreaterThan(String value) {
            addCriterion("groupPurchaseName >", value, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameGreaterThanOrEqualTo(String value) {
            addCriterion("groupPurchaseName >=", value, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameLessThan(String value) {
            addCriterion("groupPurchaseName <", value, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameLessThanOrEqualTo(String value) {
            addCriterion("groupPurchaseName <=", value, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameLike(String value) {
            addCriterion("groupPurchaseName like", value, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameNotLike(String value) {
            addCriterion("groupPurchaseName not like", value, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameIn(List<String> values) {
            addCriterion("groupPurchaseName in", values, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameNotIn(List<String> values) {
            addCriterion("groupPurchaseName not in", values, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameBetween(String value1, String value2) {
            addCriterion("groupPurchaseName between", value1, value2, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andGrouppurchasenameNotBetween(String value1, String value2) {
            addCriterion("groupPurchaseName not between", value1, value2, "grouppurchasename");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andSeqnumIsNull() {
            addCriterion("seqNum is null");
            return (Criteria) this;
        }

        public Criteria andSeqnumIsNotNull() {
            addCriterion("seqNum is not null");
            return (Criteria) this;
        }

        public Criteria andSeqnumEqualTo(Integer value) {
            addCriterion("seqNum =", value, "seqnum");
            return (Criteria) this;
        }

        public Criteria andSeqnumNotEqualTo(Integer value) {
            addCriterion("seqNum <>", value, "seqnum");
            return (Criteria) this;
        }

        public Criteria andSeqnumGreaterThan(Integer value) {
            addCriterion("seqNum >", value, "seqnum");
            return (Criteria) this;
        }

        public Criteria andSeqnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seqNum >=", value, "seqnum");
            return (Criteria) this;
        }

        public Criteria andSeqnumLessThan(Integer value) {
            addCriterion("seqNum <", value, "seqnum");
            return (Criteria) this;
        }

        public Criteria andSeqnumLessThanOrEqualTo(Integer value) {
            addCriterion("seqNum <=", value, "seqnum");
            return (Criteria) this;
        }

        public Criteria andSeqnumIn(List<Integer> values) {
            addCriterion("seqNum in", values, "seqnum");
            return (Criteria) this;
        }

        public Criteria andSeqnumNotIn(List<Integer> values) {
            addCriterion("seqNum not in", values, "seqnum");
            return (Criteria) this;
        }

        public Criteria andSeqnumBetween(Integer value1, Integer value2) {
            addCriterion("seqNum between", value1, value2, "seqnum");
            return (Criteria) this;
        }

        public Criteria andSeqnumNotBetween(Integer value1, Integer value2) {
            addCriterion("seqNum not between", value1, value2, "seqnum");
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

        public Criteria andProIsNull() {
            addCriterion("pro is null");
            return (Criteria) this;
        }

        public Criteria andProIsNotNull() {
            addCriterion("pro is not null");
            return (Criteria) this;
        }

        public Criteria andProEqualTo(String value) {
            addCriterion("pro =", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotEqualTo(String value) {
            addCriterion("pro <>", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProGreaterThan(String value) {
            addCriterion("pro >", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProGreaterThanOrEqualTo(String value) {
            addCriterion("pro >=", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProLessThan(String value) {
            addCriterion("pro <", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProLessThanOrEqualTo(String value) {
            addCriterion("pro <=", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProLike(String value) {
            addCriterion("pro like", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotLike(String value) {
            addCriterion("pro not like", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProIn(List<String> values) {
            addCriterion("pro in", values, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotIn(List<String> values) {
            addCriterion("pro not in", values, "pro");
            return (Criteria) this;
        }

        public Criteria andProBetween(String value1, String value2) {
            addCriterion("pro between", value1, value2, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotBetween(String value1, String value2) {
            addCriterion("pro not between", value1, value2, "pro");
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

        public Criteria andContenttypeIsNull() {
            addCriterion("contentType is null");
            return (Criteria) this;
        }

        public Criteria andContenttypeIsNotNull() {
            addCriterion("contentType is not null");
            return (Criteria) this;
        }

        public Criteria andContenttypeEqualTo(String value) {
            addCriterion("contentType =", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotEqualTo(String value) {
            addCriterion("contentType <>", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThan(String value) {
            addCriterion("contentType >", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("contentType >=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThan(String value) {
            addCriterion("contentType <", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThanOrEqualTo(String value) {
            addCriterion("contentType <=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLike(String value) {
            addCriterion("contentType like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotLike(String value) {
            addCriterion("contentType not like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeIn(List<String> values) {
            addCriterion("contentType in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotIn(List<String> values) {
            addCriterion("contentType not in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeBetween(String value1, String value2) {
            addCriterion("contentType between", value1, value2, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotBetween(String value1, String value2) {
            addCriterion("contentType not between", value1, value2, "contenttype");
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