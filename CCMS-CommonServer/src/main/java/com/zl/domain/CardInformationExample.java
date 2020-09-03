package com.zl.domain;

import java.util.ArrayList;
import java.util.List;

public class CardInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardInformationExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andCardStateIsNull() {
            addCriterion("CARD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCardStateIsNotNull() {
            addCriterion("CARD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCardStateEqualTo(Short value) {
            addCriterion("CARD_STATE =", value, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardStateNotEqualTo(Short value) {
            addCriterion("CARD_STATE <>", value, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardStateGreaterThan(Short value) {
            addCriterion("CARD_STATE >", value, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardStateGreaterThanOrEqualTo(Short value) {
            addCriterion("CARD_STATE >=", value, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardStateLessThan(Short value) {
            addCriterion("CARD_STATE <", value, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardStateLessThanOrEqualTo(Short value) {
            addCriterion("CARD_STATE <=", value, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardStateIn(List<Short> values) {
            addCriterion("CARD_STATE in", values, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardStateNotIn(List<Short> values) {
            addCriterion("CARD_STATE not in", values, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardStateBetween(Short value1, Short value2) {
            addCriterion("CARD_STATE between", value1, value2, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardStateNotBetween(Short value1, Short value2) {
            addCriterion("CARD_STATE not between", value1, value2, "cardState");
            return (Criteria) this;
        }

        public Criteria andCardholderIsNull() {
            addCriterion("CARDHOLDER is null");
            return (Criteria) this;
        }

        public Criteria andCardholderIsNotNull() {
            addCriterion("CARDHOLDER is not null");
            return (Criteria) this;
        }

        public Criteria andCardholderEqualTo(String value) {
            addCriterion("CARDHOLDER =", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotEqualTo(String value) {
            addCriterion("CARDHOLDER <>", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderGreaterThan(String value) {
            addCriterion("CARDHOLDER >", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderGreaterThanOrEqualTo(String value) {
            addCriterion("CARDHOLDER >=", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderLessThan(String value) {
            addCriterion("CARDHOLDER <", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderLessThanOrEqualTo(String value) {
            addCriterion("CARDHOLDER <=", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderLike(String value) {
            addCriterion("CARDHOLDER like", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotLike(String value) {
            addCriterion("CARDHOLDER not like", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderIn(List<String> values) {
            addCriterion("CARDHOLDER in", values, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotIn(List<String> values) {
            addCriterion("CARDHOLDER not in", values, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderBetween(String value1, String value2) {
            addCriterion("CARDHOLDER between", value1, value2, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotBetween(String value1, String value2) {
            addCriterion("CARDHOLDER not between", value1, value2, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardKindIsNull() {
            addCriterion("CARD_KIND is null");
            return (Criteria) this;
        }

        public Criteria andCardKindIsNotNull() {
            addCriterion("CARD_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andCardKindEqualTo(Short value) {
            addCriterion("CARD_KIND =", value, "cardKind");
            return (Criteria) this;
        }

        public Criteria andCardKindNotEqualTo(Short value) {
            addCriterion("CARD_KIND <>", value, "cardKind");
            return (Criteria) this;
        }

        public Criteria andCardKindGreaterThan(Short value) {
            addCriterion("CARD_KIND >", value, "cardKind");
            return (Criteria) this;
        }

        public Criteria andCardKindGreaterThanOrEqualTo(Short value) {
            addCriterion("CARD_KIND >=", value, "cardKind");
            return (Criteria) this;
        }

        public Criteria andCardKindLessThan(Short value) {
            addCriterion("CARD_KIND <", value, "cardKind");
            return (Criteria) this;
        }

        public Criteria andCardKindLessThanOrEqualTo(Short value) {
            addCriterion("CARD_KIND <=", value, "cardKind");
            return (Criteria) this;
        }

        public Criteria andCardKindIn(List<Short> values) {
            addCriterion("CARD_KIND in", values, "cardKind");
            return (Criteria) this;
        }

        public Criteria andCardKindNotIn(List<Short> values) {
            addCriterion("CARD_KIND not in", values, "cardKind");
            return (Criteria) this;
        }

        public Criteria andCardKindBetween(Short value1, Short value2) {
            addCriterion("CARD_KIND between", value1, value2, "cardKind");
            return (Criteria) this;
        }

        public Criteria andCardKindNotBetween(Short value1, Short value2) {
            addCriterion("CARD_KIND not between", value1, value2, "cardKind");
            return (Criteria) this;
        }

        public Criteria andLordViceIsNull() {
            addCriterion("LORD_VICE is null");
            return (Criteria) this;
        }

        public Criteria andLordViceIsNotNull() {
            addCriterion("LORD_VICE is not null");
            return (Criteria) this;
        }

        public Criteria andLordViceEqualTo(Short value) {
            addCriterion("LORD_VICE =", value, "lordVice");
            return (Criteria) this;
        }

        public Criteria andLordViceNotEqualTo(Short value) {
            addCriterion("LORD_VICE <>", value, "lordVice");
            return (Criteria) this;
        }

        public Criteria andLordViceGreaterThan(Short value) {
            addCriterion("LORD_VICE >", value, "lordVice");
            return (Criteria) this;
        }

        public Criteria andLordViceGreaterThanOrEqualTo(Short value) {
            addCriterion("LORD_VICE >=", value, "lordVice");
            return (Criteria) this;
        }

        public Criteria andLordViceLessThan(Short value) {
            addCriterion("LORD_VICE <", value, "lordVice");
            return (Criteria) this;
        }

        public Criteria andLordViceLessThanOrEqualTo(Short value) {
            addCriterion("LORD_VICE <=", value, "lordVice");
            return (Criteria) this;
        }

        public Criteria andLordViceIn(List<Short> values) {
            addCriterion("LORD_VICE in", values, "lordVice");
            return (Criteria) this;
        }

        public Criteria andLordViceNotIn(List<Short> values) {
            addCriterion("LORD_VICE not in", values, "lordVice");
            return (Criteria) this;
        }

        public Criteria andLordViceBetween(Short value1, Short value2) {
            addCriterion("LORD_VICE between", value1, value2, "lordVice");
            return (Criteria) this;
        }

        public Criteria andLordViceNotBetween(Short value1, Short value2) {
            addCriterion("LORD_VICE not between", value1, value2, "lordVice");
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