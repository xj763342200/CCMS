package com.zl.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HaveTheBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HaveTheBillExample() {
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

        public Criteria andBillIdIsNull() {
            addCriterion("BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("BILL_ID =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("BILL_ID <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("BILL_ID >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_ID >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("BILL_ID <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_ID <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("BILL_ID in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("BILL_ID not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("BILL_ID between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_ID not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andNowmonthIsNull() {
            addCriterion("NOWMONTH is null");
            return (Criteria) this;
        }

        public Criteria andNowmonthIsNotNull() {
            addCriterion("NOWMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andNowmonthEqualTo(String value) {
            addCriterion("NOWMONTH =", value, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthNotEqualTo(String value) {
            addCriterion("NOWMONTH <>", value, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthGreaterThan(String value) {
            addCriterion("NOWMONTH >", value, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthGreaterThanOrEqualTo(String value) {
            addCriterion("NOWMONTH >=", value, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthLessThan(String value) {
            addCriterion("NOWMONTH <", value, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthLessThanOrEqualTo(String value) {
            addCriterion("NOWMONTH <=", value, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthLike(String value) {
            addCriterion("NOWMONTH like", value, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthNotLike(String value) {
            addCriterion("NOWMONTH not like", value, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthIn(List<String> values) {
            addCriterion("NOWMONTH in", values, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthNotIn(List<String> values) {
            addCriterion("NOWMONTH not in", values, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthBetween(String value1, String value2) {
            addCriterion("NOWMONTH between", value1, value2, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andNowmonthNotBetween(String value1, String value2) {
            addCriterion("NOWMONTH not between", value1, value2, "nowmonth");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyIsNull() {
            addCriterion("ALLPAYMONEY is null");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyIsNotNull() {
            addCriterion("ALLPAYMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyEqualTo(BigDecimal value) {
            addCriterion("ALLPAYMONEY =", value, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyNotEqualTo(BigDecimal value) {
            addCriterion("ALLPAYMONEY <>", value, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyGreaterThan(BigDecimal value) {
            addCriterion("ALLPAYMONEY >", value, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLPAYMONEY >=", value, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyLessThan(BigDecimal value) {
            addCriterion("ALLPAYMONEY <", value, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALLPAYMONEY <=", value, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyIn(List<BigDecimal> values) {
            addCriterion("ALLPAYMONEY in", values, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyNotIn(List<BigDecimal> values) {
            addCriterion("ALLPAYMONEY not in", values, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLPAYMONEY between", value1, value2, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andAllpaymoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALLPAYMONEY not between", value1, value2, "allpaymoney");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentIsNull() {
            addCriterion("NOWLOWPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentIsNotNull() {
            addCriterion("NOWLOWPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentEqualTo(BigDecimal value) {
            addCriterion("NOWLOWPAYMENT =", value, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentNotEqualTo(BigDecimal value) {
            addCriterion("NOWLOWPAYMENT <>", value, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentGreaterThan(BigDecimal value) {
            addCriterion("NOWLOWPAYMENT >", value, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOWLOWPAYMENT >=", value, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentLessThan(BigDecimal value) {
            addCriterion("NOWLOWPAYMENT <", value, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOWLOWPAYMENT <=", value, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentIn(List<BigDecimal> values) {
            addCriterion("NOWLOWPAYMENT in", values, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentNotIn(List<BigDecimal> values) {
            addCriterion("NOWLOWPAYMENT not in", values, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOWLOWPAYMENT between", value1, value2, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andNowlowpaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOWLOWPAYMENT not between", value1, value2, "nowlowpayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayIsNull() {
            addCriterion("MONTHLY_BILL_DAY is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayIsNotNull() {
            addCriterion("MONTHLY_BILL_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayEqualTo(Short value) {
            addCriterion("MONTHLY_BILL_DAY =", value, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayNotEqualTo(Short value) {
            addCriterion("MONTHLY_BILL_DAY <>", value, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayGreaterThan(Short value) {
            addCriterion("MONTHLY_BILL_DAY >", value, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayGreaterThanOrEqualTo(Short value) {
            addCriterion("MONTHLY_BILL_DAY >=", value, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayLessThan(Short value) {
            addCriterion("MONTHLY_BILL_DAY <", value, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayLessThanOrEqualTo(Short value) {
            addCriterion("MONTHLY_BILL_DAY <=", value, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayIn(List<Short> values) {
            addCriterion("MONTHLY_BILL_DAY in", values, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayNotIn(List<Short> values) {
            addCriterion("MONTHLY_BILL_DAY not in", values, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayBetween(Short value1, Short value2) {
            addCriterion("MONTHLY_BILL_DAY between", value1, value2, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillDayNotBetween(Short value1, Short value2) {
            addCriterion("MONTHLY_BILL_DAY not between", value1, value2, "monthlyBillDay");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("BILL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("BILL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Short value) {
            addCriterion("BILL_TYPE =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Short value) {
            addCriterion("BILL_TYPE <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Short value) {
            addCriterion("BILL_TYPE >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("BILL_TYPE >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Short value) {
            addCriterion("BILL_TYPE <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Short value) {
            addCriterion("BILL_TYPE <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Short> values) {
            addCriterion("BILL_TYPE in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Short> values) {
            addCriterion("BILL_TYPE not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Short value1, Short value2) {
            addCriterion("BILL_TYPE between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Short value1, Short value2) {
            addCriterion("BILL_TYPE not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNull() {
            addCriterion("BILL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andBillStateIsNotNull() {
            addCriterion("BILL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andBillStateEqualTo(Short value) {
            addCriterion("BILL_STATE =", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotEqualTo(Short value) {
            addCriterion("BILL_STATE <>", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThan(Short value) {
            addCriterion("BILL_STATE >", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateGreaterThanOrEqualTo(Short value) {
            addCriterion("BILL_STATE >=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThan(Short value) {
            addCriterion("BILL_STATE <", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateLessThanOrEqualTo(Short value) {
            addCriterion("BILL_STATE <=", value, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateIn(List<Short> values) {
            addCriterion("BILL_STATE in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotIn(List<Short> values) {
            addCriterion("BILL_STATE not in", values, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateBetween(Short value1, Short value2) {
            addCriterion("BILL_STATE between", value1, value2, "billState");
            return (Criteria) this;
        }

        public Criteria andBillStateNotBetween(Short value1, Short value2) {
            addCriterion("BILL_STATE not between", value1, value2, "billState");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdIsNull() {
            addCriterion("BILL_DETAILS_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdIsNotNull() {
            addCriterion("BILL_DETAILS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdEqualTo(Integer value) {
            addCriterion("BILL_DETAILS_ID =", value, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdNotEqualTo(Integer value) {
            addCriterion("BILL_DETAILS_ID <>", value, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdGreaterThan(Integer value) {
            addCriterion("BILL_DETAILS_ID >", value, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_DETAILS_ID >=", value, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdLessThan(Integer value) {
            addCriterion("BILL_DETAILS_ID <", value, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_DETAILS_ID <=", value, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdIn(List<Integer> values) {
            addCriterion("BILL_DETAILS_ID in", values, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdNotIn(List<Integer> values) {
            addCriterion("BILL_DETAILS_ID not in", values, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("BILL_DETAILS_ID between", value1, value2, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andBillDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_DETAILS_ID not between", value1, value2, "billDetailsId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
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