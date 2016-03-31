package com.rongyi.easy.mcmc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityStockEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityStockEntityExample() {
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

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andRemainIsNull() {
            addCriterion("remain is null");
            return (Criteria) this;
        }

        public Criteria andRemainIsNotNull() {
            addCriterion("remain is not null");
            return (Criteria) this;
        }

        public Criteria andRemainEqualTo(Integer value) {
            addCriterion("remain =", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotEqualTo(Integer value) {
            addCriterion("remain <>", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThan(Integer value) {
            addCriterion("remain >", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThanOrEqualTo(Integer value) {
            addCriterion("remain >=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThan(Integer value) {
            addCriterion("remain <", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThanOrEqualTo(Integer value) {
            addCriterion("remain <=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainIn(List<Integer> values) {
            addCriterion("remain in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotIn(List<Integer> values) {
            addCriterion("remain not in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainBetween(Integer value1, Integer value2) {
            addCriterion("remain between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotBetween(Integer value1, Integer value2) {
            addCriterion("remain not between", value1, value2, "remain");
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

        public Criteria andFilialeMidIsNull() {
            addCriterion("filiale_mid is null");
            return (Criteria) this;
        }

        public Criteria andFilialeMidIsNotNull() {
            addCriterion("filiale_mid is not null");
            return (Criteria) this;
        }

        public Criteria andFilialeMidEqualTo(String value) {
            addCriterion("filiale_mid =", value, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidNotEqualTo(String value) {
            addCriterion("filiale_mid <>", value, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidGreaterThan(String value) {
            addCriterion("filiale_mid >", value, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidGreaterThanOrEqualTo(String value) {
            addCriterion("filiale_mid >=", value, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidLessThan(String value) {
            addCriterion("filiale_mid <", value, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidLessThanOrEqualTo(String value) {
            addCriterion("filiale_mid <=", value, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidLike(String value) {
            addCriterion("filiale_mid like", value, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidNotLike(String value) {
            addCriterion("filiale_mid not like", value, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidIn(List<String> values) {
            addCriterion("filiale_mid in", values, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidNotIn(List<String> values) {
            addCriterion("filiale_mid not in", values, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidBetween(String value1, String value2) {
            addCriterion("filiale_mid between", value1, value2, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andFilialeMidNotBetween(String value1, String value2) {
            addCriterion("filiale_mid not between", value1, value2, "filialeMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidIsNull() {
            addCriterion("commodity_mid is null");
            return (Criteria) this;
        }

        public Criteria andCommodityMidIsNotNull() {
            addCriterion("commodity_mid is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityMidEqualTo(String value) {
            addCriterion("commodity_mid =", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidNotEqualTo(String value) {
            addCriterion("commodity_mid <>", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidGreaterThan(String value) {
            addCriterion("commodity_mid >", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_mid >=", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidLessThan(String value) {
            addCriterion("commodity_mid <", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidLessThanOrEqualTo(String value) {
            addCriterion("commodity_mid <=", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidLike(String value) {
            addCriterion("commodity_mid like", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidNotLike(String value) {
            addCriterion("commodity_mid not like", value, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidIn(List<String> values) {
            addCriterion("commodity_mid in", values, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidNotIn(List<String> values) {
            addCriterion("commodity_mid not in", values, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidBetween(String value1, String value2) {
            addCriterion("commodity_mid between", value1, value2, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommodityMidNotBetween(String value1, String value2) {
            addCriterion("commodity_mid not between", value1, value2, "commodityMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidIsNull() {
            addCriterion("commodity_spec_mid is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidIsNotNull() {
            addCriterion("commodity_spec_mid is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidEqualTo(String value) {
            addCriterion("commodity_spec_mid =", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidNotEqualTo(String value) {
            addCriterion("commodity_spec_mid <>", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidGreaterThan(String value) {
            addCriterion("commodity_spec_mid >", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_spec_mid >=", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidLessThan(String value) {
            addCriterion("commodity_spec_mid <", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidLessThanOrEqualTo(String value) {
            addCriterion("commodity_spec_mid <=", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidLike(String value) {
            addCriterion("commodity_spec_mid like", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidNotLike(String value) {
            addCriterion("commodity_spec_mid not like", value, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidIn(List<String> values) {
            addCriterion("commodity_spec_mid in", values, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidNotIn(List<String> values) {
            addCriterion("commodity_spec_mid not in", values, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidBetween(String value1, String value2) {
            addCriterion("commodity_spec_mid between", value1, value2, "commoditySpecMid");
            return (Criteria) this;
        }

        public Criteria andCommoditySpecMidNotBetween(String value1, String value2) {
            addCriterion("commodity_spec_mid not between", value1, value2, "commoditySpecMid");
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