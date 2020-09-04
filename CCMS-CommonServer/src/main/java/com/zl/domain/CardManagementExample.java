package com.zl.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CardManagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardManagementExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTemporaryIsNull() {
            addCriterion("TEMPORARY is null");
            return (Criteria) this;
        }

        public Criteria andTemporaryIsNotNull() {
            addCriterion("TEMPORARY is not null");
            return (Criteria) this;
        }

        public Criteria andTemporaryEqualTo(BigDecimal value) {
            addCriterion("TEMPORARY =", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryNotEqualTo(BigDecimal value) {
            addCriterion("TEMPORARY <>", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryGreaterThan(BigDecimal value) {
            addCriterion("TEMPORARY >", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPORARY >=", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryLessThan(BigDecimal value) {
            addCriterion("TEMPORARY <", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPORARY <=", value, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryIn(List<BigDecimal> values) {
            addCriterion("TEMPORARY in", values, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryNotIn(List<BigDecimal> values) {
            addCriterion("TEMPORARY not in", values, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPORARY between", value1, value2, "temporary");
            return (Criteria) this;
        }

        public Criteria andTemporaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPORARY not between", value1, value2, "temporary");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesIsNull() {
            addCriterion("RESIDUE_TEMPORARY_LINES is null");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesIsNotNull() {
            addCriterion("RESIDUE_TEMPORARY_LINES is not null");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesEqualTo(BigDecimal value) {
            addCriterion("RESIDUE_TEMPORARY_LINES =", value, "residueTemporaryLines");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesNotEqualTo(BigDecimal value) {
            addCriterion("RESIDUE_TEMPORARY_LINES <>", value, "residueTemporaryLines");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesGreaterThan(BigDecimal value) {
            addCriterion("RESIDUE_TEMPORARY_LINES >", value, "residueTemporaryLines");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESIDUE_TEMPORARY_LINES >=", value, "residueTemporaryLines");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesLessThan(BigDecimal value) {
            addCriterion("RESIDUE_TEMPORARY_LINES <", value, "residueTemporaryLines");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESIDUE_TEMPORARY_LINES <=", value, "residueTemporaryLines");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesIn(List<BigDecimal> values) {
            addCriterion("RESIDUE_TEMPORARY_LINES in", values, "residueTemporaryLines");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesNotIn(List<BigDecimal> values) {
            addCriterion("RESIDUE_TEMPORARY_LINES not in", values, "residueTemporaryLines");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESIDUE_TEMPORARY_LINES between", value1, value2, "residueTemporaryLines");
            return (Criteria) this;
        }

        public Criteria andResidueTemporaryLinesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESIDUE_TEMPORARY_LINES not between", value1, value2, "residueTemporaryLines");
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

        public Criteria andResidueFacilityExtentIsNull() {
            addCriterion("RESIDUE_FACILITY_EXTENT is null");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentIsNotNull() {
            addCriterion("RESIDUE_FACILITY_EXTENT is not null");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentEqualTo(BigDecimal value) {
            addCriterion("RESIDUE_FACILITY_EXTENT =", value, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentNotEqualTo(BigDecimal value) {
            addCriterion("RESIDUE_FACILITY_EXTENT <>", value, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentGreaterThan(BigDecimal value) {
            addCriterion("RESIDUE_FACILITY_EXTENT >", value, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESIDUE_FACILITY_EXTENT >=", value, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentLessThan(BigDecimal value) {
            addCriterion("RESIDUE_FACILITY_EXTENT <", value, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESIDUE_FACILITY_EXTENT <=", value, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentIn(List<BigDecimal> values) {
            addCriterion("RESIDUE_FACILITY_EXTENT in", values, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentNotIn(List<BigDecimal> values) {
            addCriterion("RESIDUE_FACILITY_EXTENT not in", values, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESIDUE_FACILITY_EXTENT between", value1, value2, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andResidueFacilityExtentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESIDUE_FACILITY_EXTENT not between", value1, value2, "residueFacilityExtent");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("KIND is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("KIND is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(Short value) {
            addCriterion("KIND =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(Short value) {
            addCriterion("KIND <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(Short value) {
            addCriterion("KIND >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(Short value) {
            addCriterion("KIND >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(Short value) {
            addCriterion("KIND <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(Short value) {
            addCriterion("KIND <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<Short> values) {
            addCriterion("KIND in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<Short> values) {
            addCriterion("KIND not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(Short value1, Short value2) {
            addCriterion("KIND between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(Short value1, Short value2) {
            addCriterion("KIND not between", value1, value2, "kind");
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

        public Criteria andActivateIsNull() {
            addCriterion("ACTIVATE is null");
            return (Criteria) this;
        }

        public Criteria andActivateIsNotNull() {
            addCriterion("ACTIVATE is not null");
            return (Criteria) this;
        }

        public Criteria andActivateEqualTo(Short value) {
            addCriterion("ACTIVATE =", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateNotEqualTo(Short value) {
            addCriterion("ACTIVATE <>", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateGreaterThan(Short value) {
            addCriterion("ACTIVATE >", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateGreaterThanOrEqualTo(Short value) {
            addCriterion("ACTIVATE >=", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateLessThan(Short value) {
            addCriterion("ACTIVATE <", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateLessThanOrEqualTo(Short value) {
            addCriterion("ACTIVATE <=", value, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateIn(List<Short> values) {
            addCriterion("ACTIVATE in", values, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateNotIn(List<Short> values) {
            addCriterion("ACTIVATE not in", values, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateBetween(Short value1, Short value2) {
            addCriterion("ACTIVATE between", value1, value2, "activate");
            return (Criteria) this;
        }

        public Criteria andActivateNotBetween(Short value1, Short value2) {
            addCriterion("ACTIVATE not between", value1, value2, "activate");
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