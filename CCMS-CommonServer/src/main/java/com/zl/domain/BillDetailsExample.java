package com.zl.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillDetailsExample() {
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

        public Criteria andTradeDateIsNull() {
            addCriterion("TRADE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("TRADE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterion("TRADE_DATE =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterion("TRADE_DATE <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterion("TRADE_DATE >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRADE_DATE >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterion("TRADE_DATE <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterion("TRADE_DATE <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterion("TRADE_DATE in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterion("TRADE_DATE not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterion("TRADE_DATE between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterion("TRADE_DATE not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateIsNull() {
            addCriterion("ACCOUNTING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountingDateIsNotNull() {
            addCriterion("ACCOUNTING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingDateEqualTo(Date value) {
            addCriterion("ACCOUNTING_DATE =", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotEqualTo(Date value) {
            addCriterion("ACCOUNTING_DATE <>", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateGreaterThan(Date value) {
            addCriterion("ACCOUNTING_DATE >", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCOUNTING_DATE >=", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateLessThan(Date value) {
            addCriterion("ACCOUNTING_DATE <", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCOUNTING_DATE <=", value, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateIn(List<Date> values) {
            addCriterion("ACCOUNTING_DATE in", values, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotIn(List<Date> values) {
            addCriterion("ACCOUNTING_DATE not in", values, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateBetween(Date value1, Date value2) {
            addCriterion("ACCOUNTING_DATE between", value1, value2, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andAccountingDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCOUNTING_DATE not between", value1, value2, "accountingDate");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryIsNull() {
            addCriterion("TRADE_SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryIsNotNull() {
            addCriterion("TRADE_SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryEqualTo(String value) {
            addCriterion("TRADE_SUMMARY =", value, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryNotEqualTo(String value) {
            addCriterion("TRADE_SUMMARY <>", value, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryGreaterThan(String value) {
            addCriterion("TRADE_SUMMARY >", value, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_SUMMARY >=", value, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryLessThan(String value) {
            addCriterion("TRADE_SUMMARY <", value, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryLessThanOrEqualTo(String value) {
            addCriterion("TRADE_SUMMARY <=", value, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryLike(String value) {
            addCriterion("TRADE_SUMMARY like", value, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryNotLike(String value) {
            addCriterion("TRADE_SUMMARY not like", value, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryIn(List<String> values) {
            addCriterion("TRADE_SUMMARY in", values, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryNotIn(List<String> values) {
            addCriterion("TRADE_SUMMARY not in", values, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryBetween(String value1, String value2) {
            addCriterion("TRADE_SUMMARY between", value1, value2, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradeSummaryNotBetween(String value1, String value2) {
            addCriterion("TRADE_SUMMARY not between", value1, value2, "tradeSummary");
            return (Criteria) this;
        }

        public Criteria andTradePlaceIsNull() {
            addCriterion("TRADE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andTradePlaceIsNotNull() {
            addCriterion("TRADE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andTradePlaceEqualTo(String value) {
            addCriterion("TRADE_PLACE =", value, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceNotEqualTo(String value) {
            addCriterion("TRADE_PLACE <>", value, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceGreaterThan(String value) {
            addCriterion("TRADE_PLACE >", value, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_PLACE >=", value, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceLessThan(String value) {
            addCriterion("TRADE_PLACE <", value, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceLessThanOrEqualTo(String value) {
            addCriterion("TRADE_PLACE <=", value, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceLike(String value) {
            addCriterion("TRADE_PLACE like", value, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceNotLike(String value) {
            addCriterion("TRADE_PLACE not like", value, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceIn(List<String> values) {
            addCriterion("TRADE_PLACE in", values, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceNotIn(List<String> values) {
            addCriterion("TRADE_PLACE not in", values, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceBetween(String value1, String value2) {
            addCriterion("TRADE_PLACE between", value1, value2, "tradePlace");
            return (Criteria) this;
        }

        public Criteria andTradePlaceNotBetween(String value1, String value2) {
            addCriterion("TRADE_PLACE not between", value1, value2, "tradePlace");
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

        public Criteria andRmbAmountIsNull() {
            addCriterion("RMB_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRmbAmountIsNotNull() {
            addCriterion("RMB_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRmbAmountEqualTo(BigDecimal value) {
            addCriterion("RMB_AMOUNT =", value, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andRmbAmountNotEqualTo(BigDecimal value) {
            addCriterion("RMB_AMOUNT <>", value, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andRmbAmountGreaterThan(BigDecimal value) {
            addCriterion("RMB_AMOUNT >", value, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andRmbAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RMB_AMOUNT >=", value, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andRmbAmountLessThan(BigDecimal value) {
            addCriterion("RMB_AMOUNT <", value, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andRmbAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RMB_AMOUNT <=", value, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andRmbAmountIn(List<BigDecimal> values) {
            addCriterion("RMB_AMOUNT in", values, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andRmbAmountNotIn(List<BigDecimal> values) {
            addCriterion("RMB_AMOUNT not in", values, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andRmbAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RMB_AMOUNT between", value1, value2, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andRmbAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RMB_AMOUNT not between", value1, value2, "rmbAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("TRADE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("TRADE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(BigDecimal value) {
            addCriterion("TRADE_AMOUNT =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(BigDecimal value) {
            addCriterion("TRADE_AMOUNT <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(BigDecimal value) {
            addCriterion("TRADE_AMOUNT >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_AMOUNT >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(BigDecimal value) {
            addCriterion("TRADE_AMOUNT <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_AMOUNT <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<BigDecimal> values) {
            addCriterion("TRADE_AMOUNT in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<BigDecimal> values) {
            addCriterion("TRADE_AMOUNT not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_AMOUNT between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_AMOUNT not between", value1, value2, "tradeAmount");
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