package com.zl.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountInformationExample() {
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

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCreditTotalIsNull() {
            addCriterion("CREDIT_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andCreditTotalIsNotNull() {
            addCriterion("CREDIT_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTotalEqualTo(BigDecimal value) {
            addCriterion("CREDIT_TOTAL =", value, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditTotalNotEqualTo(BigDecimal value) {
            addCriterion("CREDIT_TOTAL <>", value, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditTotalGreaterThan(BigDecimal value) {
            addCriterion("CREDIT_TOTAL >", value, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDIT_TOTAL >=", value, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLessThan(BigDecimal value) {
            addCriterion("CREDIT_TOTAL <", value, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDIT_TOTAL <=", value, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditTotalIn(List<BigDecimal> values) {
            addCriterion("CREDIT_TOTAL in", values, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditTotalNotIn(List<BigDecimal> values) {
            addCriterion("CREDIT_TOTAL not in", values, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDIT_TOTAL between", value1, value2, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDIT_TOTAL not between", value1, value2, "creditTotal");
            return (Criteria) this;
        }

        public Criteria andCreditableIsNull() {
            addCriterion("CREDITABLE is null");
            return (Criteria) this;
        }

        public Criteria andCreditableIsNotNull() {
            addCriterion("CREDITABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditableEqualTo(BigDecimal value) {
            addCriterion("CREDITABLE =", value, "creditable");
            return (Criteria) this;
        }

        public Criteria andCreditableNotEqualTo(BigDecimal value) {
            addCriterion("CREDITABLE <>", value, "creditable");
            return (Criteria) this;
        }

        public Criteria andCreditableGreaterThan(BigDecimal value) {
            addCriterion("CREDITABLE >", value, "creditable");
            return (Criteria) this;
        }

        public Criteria andCreditableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDITABLE >=", value, "creditable");
            return (Criteria) this;
        }

        public Criteria andCreditableLessThan(BigDecimal value) {
            addCriterion("CREDITABLE <", value, "creditable");
            return (Criteria) this;
        }

        public Criteria andCreditableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDITABLE <=", value, "creditable");
            return (Criteria) this;
        }

        public Criteria andCreditableIn(List<BigDecimal> values) {
            addCriterion("CREDITABLE in", values, "creditable");
            return (Criteria) this;
        }

        public Criteria andCreditableNotIn(List<BigDecimal> values) {
            addCriterion("CREDITABLE not in", values, "creditable");
            return (Criteria) this;
        }

        public Criteria andCreditableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDITABLE between", value1, value2, "creditable");
            return (Criteria) this;
        }

        public Criteria andCreditableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDITABLE not between", value1, value2, "creditable");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityIsNull() {
            addCriterion("CASH_AVAILABILITY is null");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityIsNotNull() {
            addCriterion("CASH_AVAILABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityEqualTo(BigDecimal value) {
            addCriterion("CASH_AVAILABILITY =", value, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityNotEqualTo(BigDecimal value) {
            addCriterion("CASH_AVAILABILITY <>", value, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityGreaterThan(BigDecimal value) {
            addCriterion("CASH_AVAILABILITY >", value, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_AVAILABILITY >=", value, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityLessThan(BigDecimal value) {
            addCriterion("CASH_AVAILABILITY <", value, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_AVAILABILITY <=", value, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityIn(List<BigDecimal> values) {
            addCriterion("CASH_AVAILABILITY in", values, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityNotIn(List<BigDecimal> values) {
            addCriterion("CASH_AVAILABILITY not in", values, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_AVAILABILITY between", value1, value2, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andCashAvailabilityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_AVAILABILITY not between", value1, value2, "cashAvailability");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsIsNull() {
            addCriterion("MONTHLY_BILLS is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsIsNotNull() {
            addCriterion("MONTHLY_BILLS is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsEqualTo(String value) {
            addCriterion("MONTHLY_BILLS =", value, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsNotEqualTo(String value) {
            addCriterion("MONTHLY_BILLS <>", value, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsGreaterThan(String value) {
            addCriterion("MONTHLY_BILLS >", value, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsGreaterThanOrEqualTo(String value) {
            addCriterion("MONTHLY_BILLS >=", value, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsLessThan(String value) {
            addCriterion("MONTHLY_BILLS <", value, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsLessThanOrEqualTo(String value) {
            addCriterion("MONTHLY_BILLS <=", value, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsLike(String value) {
            addCriterion("MONTHLY_BILLS like", value, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsNotLike(String value) {
            addCriterion("MONTHLY_BILLS not like", value, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsIn(List<String> values) {
            addCriterion("MONTHLY_BILLS in", values, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsNotIn(List<String> values) {
            addCriterion("MONTHLY_BILLS not in", values, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsBetween(String value1, String value2) {
            addCriterion("MONTHLY_BILLS between", value1, value2, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andMonthlyBillsNotBetween(String value1, String value2) {
            addCriterion("MONTHLY_BILLS not between", value1, value2, "monthlyBills");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateIsNull() {
            addCriterion("NOWACCOUNTDATE is null");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateIsNotNull() {
            addCriterion("NOWACCOUNTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateEqualTo(Date value) {
            addCriterion("NOWACCOUNTDATE =", value, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateNotEqualTo(Date value) {
            addCriterion("NOWACCOUNTDATE <>", value, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateGreaterThan(Date value) {
            addCriterion("NOWACCOUNTDATE >", value, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateGreaterThanOrEqualTo(Date value) {
            addCriterion("NOWACCOUNTDATE >=", value, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateLessThan(Date value) {
            addCriterion("NOWACCOUNTDATE <", value, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateLessThanOrEqualTo(Date value) {
            addCriterion("NOWACCOUNTDATE <=", value, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateIn(List<Date> values) {
            addCriterion("NOWACCOUNTDATE in", values, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateNotIn(List<Date> values) {
            addCriterion("NOWACCOUNTDATE not in", values, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateBetween(Date value1, Date value2) {
            addCriterion("NOWACCOUNTDATE between", value1, value2, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andNowaccountdateNotBetween(Date value1, Date value2) {
            addCriterion("NOWACCOUNTDATE not between", value1, value2, "nowaccountdate");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Integer value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Integer value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Integer value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Integer value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Integer> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Integer> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Integer value1, Integer value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("PAYMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("PAYMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Short value) {
            addCriterion("PAYMENT_TYPE =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Short value) {
            addCriterion("PAYMENT_TYPE <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Short value) {
            addCriterion("PAYMENT_TYPE >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_TYPE >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Short value) {
            addCriterion("PAYMENT_TYPE <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Short value) {
            addCriterion("PAYMENT_TYPE <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Short> values) {
            addCriterion("PAYMENT_TYPE in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Short> values) {
            addCriterion("PAYMENT_TYPE not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_TYPE between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Short value1, Short value2) {
            addCriterion("PAYMENT_TYPE not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("ID_NUMBER =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("ID_NUMBER <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("ID_NUMBER >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("ID_NUMBER <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("ID_NUMBER like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("ID_NUMBER not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("ID_NUMBER in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("ID_NUMBER not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("ID_NUMBER between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("ID_NUMBER not between", value1, value2, "idNumber");
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