package com.zl.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuotAapplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuotAapplicationExample() {
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

        public Criteria andQuotIdIsNull() {
            addCriterion("QUOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuotIdIsNotNull() {
            addCriterion("QUOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuotIdEqualTo(Integer value) {
            addCriterion("QUOT_ID =", value, "quotId");
            return (Criteria) this;
        }

        public Criteria andQuotIdNotEqualTo(Integer value) {
            addCriterion("QUOT_ID <>", value, "quotId");
            return (Criteria) this;
        }

        public Criteria andQuotIdGreaterThan(Integer value) {
            addCriterion("QUOT_ID >", value, "quotId");
            return (Criteria) this;
        }

        public Criteria andQuotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUOT_ID >=", value, "quotId");
            return (Criteria) this;
        }

        public Criteria andQuotIdLessThan(Integer value) {
            addCriterion("QUOT_ID <", value, "quotId");
            return (Criteria) this;
        }

        public Criteria andQuotIdLessThanOrEqualTo(Integer value) {
            addCriterion("QUOT_ID <=", value, "quotId");
            return (Criteria) this;
        }

        public Criteria andQuotIdIn(List<Integer> values) {
            addCriterion("QUOT_ID in", values, "quotId");
            return (Criteria) this;
        }

        public Criteria andQuotIdNotIn(List<Integer> values) {
            addCriterion("QUOT_ID not in", values, "quotId");
            return (Criteria) this;
        }

        public Criteria andQuotIdBetween(Integer value1, Integer value2) {
            addCriterion("QUOT_ID between", value1, value2, "quotId");
            return (Criteria) this;
        }

        public Criteria andQuotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QUOT_ID not between", value1, value2, "quotId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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

        public Criteria andFacilityExtentIsNull() {
            addCriterion("FACILITY_EXTENT is null");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentIsNotNull() {
            addCriterion("FACILITY_EXTENT is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentEqualTo(BigDecimal value) {
            addCriterion("FACILITY_EXTENT =", value, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentNotEqualTo(BigDecimal value) {
            addCriterion("FACILITY_EXTENT <>", value, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentGreaterThan(BigDecimal value) {
            addCriterion("FACILITY_EXTENT >", value, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACILITY_EXTENT >=", value, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentLessThan(BigDecimal value) {
            addCriterion("FACILITY_EXTENT <", value, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACILITY_EXTENT <=", value, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentIn(List<BigDecimal> values) {
            addCriterion("FACILITY_EXTENT in", values, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentNotIn(List<BigDecimal> values) {
            addCriterion("FACILITY_EXTENT not in", values, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACILITY_EXTENT between", value1, value2, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andFacilityExtentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACILITY_EXTENT not between", value1, value2, "facilityExtent");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesIsNull() {
            addCriterion("TEMPORARY_LINES is null");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesIsNotNull() {
            addCriterion("TEMPORARY_LINES is not null");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesEqualTo(BigDecimal value) {
            addCriterion("TEMPORARY_LINES =", value, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesNotEqualTo(BigDecimal value) {
            addCriterion("TEMPORARY_LINES <>", value, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesGreaterThan(BigDecimal value) {
            addCriterion("TEMPORARY_LINES >", value, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPORARY_LINES >=", value, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesLessThan(BigDecimal value) {
            addCriterion("TEMPORARY_LINES <", value, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPORARY_LINES <=", value, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesIn(List<BigDecimal> values) {
            addCriterion("TEMPORARY_LINES in", values, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesNotIn(List<BigDecimal> values) {
            addCriterion("TEMPORARY_LINES not in", values, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPORARY_LINES between", value1, value2, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andTemporaryLinesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPORARY_LINES not between", value1, value2, "temporaryLines");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeIsNull() {
            addCriterion("SETTLING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeIsNotNull() {
            addCriterion("SETTLING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeEqualTo(Date value) {
            addCriterion("SETTLING_TIME =", value, "settlingTime");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeNotEqualTo(Date value) {
            addCriterion("SETTLING_TIME <>", value, "settlingTime");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeGreaterThan(Date value) {
            addCriterion("SETTLING_TIME >", value, "settlingTime");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SETTLING_TIME >=", value, "settlingTime");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeLessThan(Date value) {
            addCriterion("SETTLING_TIME <", value, "settlingTime");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeLessThanOrEqualTo(Date value) {
            addCriterion("SETTLING_TIME <=", value, "settlingTime");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeIn(List<Date> values) {
            addCriterion("SETTLING_TIME in", values, "settlingTime");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeNotIn(List<Date> values) {
            addCriterion("SETTLING_TIME not in", values, "settlingTime");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeBetween(Date value1, Date value2) {
            addCriterion("SETTLING_TIME between", value1, value2, "settlingTime");
            return (Criteria) this;
        }

        public Criteria andSettlingTimeNotBetween(Date value1, Date value2) {
            addCriterion("SETTLING_TIME not between", value1, value2, "settlingTime");
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