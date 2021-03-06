package com.zl.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepaymentDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepaymentDetailExample() {
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

        public Criteria andRepaymentDetailIdIsNull() {
            addCriterion("REPAYMENT_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdIsNotNull() {
            addCriterion("REPAYMENT_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdEqualTo(Integer value) {
            addCriterion("REPAYMENT_DETAIL_ID =", value, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdNotEqualTo(Integer value) {
            addCriterion("REPAYMENT_DETAIL_ID <>", value, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdGreaterThan(Integer value) {
            addCriterion("REPAYMENT_DETAIL_ID >", value, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAYMENT_DETAIL_ID >=", value, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdLessThan(Integer value) {
            addCriterion("REPAYMENT_DETAIL_ID <", value, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("REPAYMENT_DETAIL_ID <=", value, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdIn(List<Integer> values) {
            addCriterion("REPAYMENT_DETAIL_ID in", values, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdNotIn(List<Integer> values) {
            addCriterion("REPAYMENT_DETAIL_ID not in", values, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("REPAYMENT_DETAIL_ID between", value1, value2, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andRepaymentDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAYMENT_DETAIL_ID not between", value1, value2, "repaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("CARD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("CARD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("CARD_NUMBER =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("CARD_NUMBER <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("CARD_NUMBER >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NUMBER >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("CARD_NUMBER <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("CARD_NUMBER <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("CARD_NUMBER like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("CARD_NUMBER not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("CARD_NUMBER in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("CARD_NUMBER not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("CARD_NUMBER between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("CARD_NUMBER not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyIsNull() {
            addCriterion("REPAYMENT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyIsNotNull() {
            addCriterion("REPAYMENT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_MONEY =", value, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyNotEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_MONEY <>", value, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyGreaterThan(BigDecimal value) {
            addCriterion("REPAYMENT_MONEY >", value, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_MONEY >=", value, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyLessThan(BigDecimal value) {
            addCriterion("REPAYMENT_MONEY <", value, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_MONEY <=", value, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyIn(List<BigDecimal> values) {
            addCriterion("REPAYMENT_MONEY in", values, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyNotIn(List<BigDecimal> values) {
            addCriterion("REPAYMENT_MONEY not in", values, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENT_MONEY between", value1, value2, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENT_MONEY not between", value1, value2, "repaymentMoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNull() {
            addCriterion("REPAYMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNotNull() {
            addCriterion("REPAYMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateEqualTo(Date value) {
            addCriterion("REPAYMENT_DATE =", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotEqualTo(Date value) {
            addCriterion("REPAYMENT_DATE <>", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThan(Date value) {
            addCriterion("REPAYMENT_DATE >", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPAYMENT_DATE >=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThan(Date value) {
            addCriterion("REPAYMENT_DATE <", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("REPAYMENT_DATE <=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIn(List<Date> values) {
            addCriterion("REPAYMENT_DATE in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotIn(List<Date> values) {
            addCriterion("REPAYMENT_DATE not in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateBetween(Date value1, Date value2) {
            addCriterion("REPAYMENT_DATE between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("REPAYMENT_DATE not between", value1, value2, "repaymentDate");
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