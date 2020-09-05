package com.zl.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class stagingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public stagingExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("TOTALMONEY is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("TOTALMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(BigDecimal value) {
            addCriterion("TOTALMONEY =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(BigDecimal value) {
            addCriterion("TOTALMONEY <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(BigDecimal value) {
            addCriterion("TOTALMONEY >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALMONEY >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(BigDecimal value) {
            addCriterion("TOTALMONEY <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALMONEY <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<BigDecimal> values) {
            addCriterion("TOTALMONEY in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<BigDecimal> values) {
            addCriterion("TOTALMONEY not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALMONEY between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALMONEY not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmonthIsNull() {
            addCriterion("TOTALMONTH is null");
            return (Criteria) this;
        }

        public Criteria andTotalmonthIsNotNull() {
            addCriterion("TOTALMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmonthEqualTo(Short value) {
            addCriterion("TOTALMONTH =", value, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andTotalmonthNotEqualTo(Short value) {
            addCriterion("TOTALMONTH <>", value, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andTotalmonthGreaterThan(Short value) {
            addCriterion("TOTALMONTH >", value, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andTotalmonthGreaterThanOrEqualTo(Short value) {
            addCriterion("TOTALMONTH >=", value, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andTotalmonthLessThan(Short value) {
            addCriterion("TOTALMONTH <", value, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andTotalmonthLessThanOrEqualTo(Short value) {
            addCriterion("TOTALMONTH <=", value, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andTotalmonthIn(List<Short> values) {
            addCriterion("TOTALMONTH in", values, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andTotalmonthNotIn(List<Short> values) {
            addCriterion("TOTALMONTH not in", values, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andTotalmonthBetween(Short value1, Short value2) {
            addCriterion("TOTALMONTH between", value1, value2, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andTotalmonthNotBetween(Short value1, Short value2) {
            addCriterion("TOTALMONTH not between", value1, value2, "totalmonth");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andMonthsendIsNull() {
            addCriterion("MONTHSEND is null");
            return (Criteria) this;
        }

        public Criteria andMonthsendIsNotNull() {
            addCriterion("MONTHSEND is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsendEqualTo(BigDecimal value) {
            addCriterion("MONTHSEND =", value, "monthsend");
            return (Criteria) this;
        }

        public Criteria andMonthsendNotEqualTo(BigDecimal value) {
            addCriterion("MONTHSEND <>", value, "monthsend");
            return (Criteria) this;
        }

        public Criteria andMonthsendGreaterThan(BigDecimal value) {
            addCriterion("MONTHSEND >", value, "monthsend");
            return (Criteria) this;
        }

        public Criteria andMonthsendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHSEND >=", value, "monthsend");
            return (Criteria) this;
        }

        public Criteria andMonthsendLessThan(BigDecimal value) {
            addCriterion("MONTHSEND <", value, "monthsend");
            return (Criteria) this;
        }

        public Criteria andMonthsendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHSEND <=", value, "monthsend");
            return (Criteria) this;
        }

        public Criteria andMonthsendIn(List<BigDecimal> values) {
            addCriterion("MONTHSEND in", values, "monthsend");
            return (Criteria) this;
        }

        public Criteria andMonthsendNotIn(List<BigDecimal> values) {
            addCriterion("MONTHSEND not in", values, "monthsend");
            return (Criteria) this;
        }

        public Criteria andMonthsendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHSEND between", value1, value2, "monthsend");
            return (Criteria) this;
        }

        public Criteria andMonthsendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHSEND not between", value1, value2, "monthsend");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumIsNull() {
            addCriterion("ENDSEND_MONTHNUM is null");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumIsNotNull() {
            addCriterion("ENDSEND_MONTHNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumEqualTo(Short value) {
            addCriterion("ENDSEND_MONTHNUM =", value, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumNotEqualTo(Short value) {
            addCriterion("ENDSEND_MONTHNUM <>", value, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumGreaterThan(Short value) {
            addCriterion("ENDSEND_MONTHNUM >", value, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumGreaterThanOrEqualTo(Short value) {
            addCriterion("ENDSEND_MONTHNUM >=", value, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumLessThan(Short value) {
            addCriterion("ENDSEND_MONTHNUM <", value, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumLessThanOrEqualTo(Short value) {
            addCriterion("ENDSEND_MONTHNUM <=", value, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumIn(List<Short> values) {
            addCriterion("ENDSEND_MONTHNUM in", values, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumNotIn(List<Short> values) {
            addCriterion("ENDSEND_MONTHNUM not in", values, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumBetween(Short value1, Short value2) {
            addCriterion("ENDSEND_MONTHNUM between", value1, value2, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andEndsendMonthnumNotBetween(Short value1, Short value2) {
            addCriterion("ENDSEND_MONTHNUM not between", value1, value2, "endsendMonthnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumIsNull() {
            addCriterion("REMINDNUM is null");
            return (Criteria) this;
        }

        public Criteria andRemindnumIsNotNull() {
            addCriterion("REMINDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andRemindnumEqualTo(Short value) {
            addCriterion("REMINDNUM =", value, "remindnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumNotEqualTo(Short value) {
            addCriterion("REMINDNUM <>", value, "remindnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumGreaterThan(Short value) {
            addCriterion("REMINDNUM >", value, "remindnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumGreaterThanOrEqualTo(Short value) {
            addCriterion("REMINDNUM >=", value, "remindnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumLessThan(Short value) {
            addCriterion("REMINDNUM <", value, "remindnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumLessThanOrEqualTo(Short value) {
            addCriterion("REMINDNUM <=", value, "remindnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumIn(List<Short> values) {
            addCriterion("REMINDNUM in", values, "remindnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumNotIn(List<Short> values) {
            addCriterion("REMINDNUM not in", values, "remindnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumBetween(Short value1, Short value2) {
            addCriterion("REMINDNUM between", value1, value2, "remindnum");
            return (Criteria) this;
        }

        public Criteria andRemindnumNotBetween(Short value1, Short value2) {
            addCriterion("REMINDNUM not between", value1, value2, "remindnum");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIsNull() {
            addCriterion("IF_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIsNotNull() {
            addCriterion("IF_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIfDeleteEqualTo(Short value) {
            addCriterion("IF_DELETE =", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotEqualTo(Short value) {
            addCriterion("IF_DELETE <>", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteGreaterThan(Short value) {
            addCriterion("IF_DELETE >", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("IF_DELETE >=", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteLessThan(Short value) {
            addCriterion("IF_DELETE <", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteLessThanOrEqualTo(Short value) {
            addCriterion("IF_DELETE <=", value, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteIn(List<Short> values) {
            addCriterion("IF_DELETE in", values, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotIn(List<Short> values) {
            addCriterion("IF_DELETE not in", values, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteBetween(Short value1, Short value2) {
            addCriterion("IF_DELETE between", value1, value2, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andIfDeleteNotBetween(Short value1, Short value2) {
            addCriterion("IF_DELETE not between", value1, value2, "ifDelete");
            return (Criteria) this;
        }

        public Criteria andCredIdIsNull() {
            addCriterion("CRED_ID is null");
            return (Criteria) this;
        }

        public Criteria andCredIdIsNotNull() {
            addCriterion("CRED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCredIdEqualTo(Integer value) {
            addCriterion("CRED_ID =", value, "credId");
            return (Criteria) this;
        }

        public Criteria andCredIdNotEqualTo(Integer value) {
            addCriterion("CRED_ID <>", value, "credId");
            return (Criteria) this;
        }

        public Criteria andCredIdGreaterThan(Integer value) {
            addCriterion("CRED_ID >", value, "credId");
            return (Criteria) this;
        }

        public Criteria andCredIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CRED_ID >=", value, "credId");
            return (Criteria) this;
        }

        public Criteria andCredIdLessThan(Integer value) {
            addCriterion("CRED_ID <", value, "credId");
            return (Criteria) this;
        }

        public Criteria andCredIdLessThanOrEqualTo(Integer value) {
            addCriterion("CRED_ID <=", value, "credId");
            return (Criteria) this;
        }

        public Criteria andCredIdIn(List<Integer> values) {
            addCriterion("CRED_ID in", values, "credId");
            return (Criteria) this;
        }

        public Criteria andCredIdNotIn(List<Integer> values) {
            addCriterion("CRED_ID not in", values, "credId");
            return (Criteria) this;
        }

        public Criteria andCredIdBetween(Integer value1, Integer value2) {
            addCriterion("CRED_ID between", value1, value2, "credId");
            return (Criteria) this;
        }

        public Criteria andCredIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CRED_ID not between", value1, value2, "credId");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyIsNull() {
            addCriterion("SURPLUSMONEY is null");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyIsNotNull() {
            addCriterion("SURPLUSMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyEqualTo(BigDecimal value) {
            addCriterion("SURPLUSMONEY =", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotEqualTo(BigDecimal value) {
            addCriterion("SURPLUSMONEY <>", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyGreaterThan(BigDecimal value) {
            addCriterion("SURPLUSMONEY >", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SURPLUSMONEY >=", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyLessThan(BigDecimal value) {
            addCriterion("SURPLUSMONEY <", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SURPLUSMONEY <=", value, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyIn(List<BigDecimal> values) {
            addCriterion("SURPLUSMONEY in", values, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotIn(List<BigDecimal> values) {
            addCriterion("SURPLUSMONEY not in", values, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SURPLUSMONEY between", value1, value2, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SURPLUSMONEY not between", value1, value2, "surplusmoney");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthIsNull() {
            addCriterion("SURPLUSMONTH is null");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthIsNotNull() {
            addCriterion("SURPLUSMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthEqualTo(Short value) {
            addCriterion("SURPLUSMONTH =", value, "surplusmonth");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthNotEqualTo(Short value) {
            addCriterion("SURPLUSMONTH <>", value, "surplusmonth");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthGreaterThan(Short value) {
            addCriterion("SURPLUSMONTH >", value, "surplusmonth");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthGreaterThanOrEqualTo(Short value) {
            addCriterion("SURPLUSMONTH >=", value, "surplusmonth");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthLessThan(Short value) {
            addCriterion("SURPLUSMONTH <", value, "surplusmonth");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthLessThanOrEqualTo(Short value) {
            addCriterion("SURPLUSMONTH <=", value, "surplusmonth");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthIn(List<Short> values) {
            addCriterion("SURPLUSMONTH in", values, "surplusmonth");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthNotIn(List<Short> values) {
            addCriterion("SURPLUSMONTH not in", values, "surplusmonth");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthBetween(Short value1, Short value2) {
            addCriterion("SURPLUSMONTH between", value1, value2, "surplusmonth");
            return (Criteria) this;
        }

        public Criteria andSurplusmonthNotBetween(Short value1, Short value2) {
            addCriterion("SURPLUSMONTH not between", value1, value2, "surplusmonth");
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