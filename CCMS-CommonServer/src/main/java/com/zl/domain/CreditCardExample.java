package com.zl.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditCardExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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

        public Criteria andPhoneNumberIsNull() {
            addCriterion("PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("PHONE_NUMBER =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("PHONE_NUMBER >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("PHONE_NUMBER <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("PHONE_NUMBER like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("PHONE_NUMBER not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("PHONE_NUMBER in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Short value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Short value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Short value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Short value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Short value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Short> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Short> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Short value1, Short value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Short value1, Short value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andCivilStateIsNull() {
            addCriterion("CIVIL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCivilStateIsNotNull() {
            addCriterion("CIVIL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCivilStateEqualTo(String value) {
            addCriterion("CIVIL_STATE =", value, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateNotEqualTo(String value) {
            addCriterion("CIVIL_STATE <>", value, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateGreaterThan(String value) {
            addCriterion("CIVIL_STATE >", value, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateGreaterThanOrEqualTo(String value) {
            addCriterion("CIVIL_STATE >=", value, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateLessThan(String value) {
            addCriterion("CIVIL_STATE <", value, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateLessThanOrEqualTo(String value) {
            addCriterion("CIVIL_STATE <=", value, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateLike(String value) {
            addCriterion("CIVIL_STATE like", value, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateNotLike(String value) {
            addCriterion("CIVIL_STATE not like", value, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateIn(List<String> values) {
            addCriterion("CIVIL_STATE in", values, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateNotIn(List<String> values) {
            addCriterion("CIVIL_STATE not in", values, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateBetween(String value1, String value2) {
            addCriterion("CIVIL_STATE between", value1, value2, "civilState");
            return (Criteria) this;
        }

        public Criteria andCivilStateNotBetween(String value1, String value2) {
            addCriterion("CIVIL_STATE not between", value1, value2, "civilState");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateIsNull() {
            addCriterion("IDENTITY_INDATE is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateIsNotNull() {
            addCriterion("IDENTITY_INDATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateEqualTo(Date value) {
            addCriterion("IDENTITY_INDATE =", value, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateNotEqualTo(Date value) {
            addCriterion("IDENTITY_INDATE <>", value, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateGreaterThan(Date value) {
            addCriterion("IDENTITY_INDATE >", value, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateGreaterThanOrEqualTo(Date value) {
            addCriterion("IDENTITY_INDATE >=", value, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateLessThan(Date value) {
            addCriterion("IDENTITY_INDATE <", value, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateLessThanOrEqualTo(Date value) {
            addCriterion("IDENTITY_INDATE <=", value, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateIn(List<Date> values) {
            addCriterion("IDENTITY_INDATE in", values, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateNotIn(List<Date> values) {
            addCriterion("IDENTITY_INDATE not in", values, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateBetween(Date value1, Date value2) {
            addCriterion("IDENTITY_INDATE between", value1, value2, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andIdentityIndateNotBetween(Date value1, Date value2) {
            addCriterion("IDENTITY_INDATE not between", value1, value2, "identityIndate");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("PASS_WORD is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("PASS_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(Integer value) {
            addCriterion("PASS_WORD =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(Integer value) {
            addCriterion("PASS_WORD <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(Integer value) {
            addCriterion("PASS_WORD >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(Integer value) {
            addCriterion("PASS_WORD >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(Integer value) {
            addCriterion("PASS_WORD <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(Integer value) {
            addCriterion("PASS_WORD <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<Integer> values) {
            addCriterion("PASS_WORD in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<Integer> values) {
            addCriterion("PASS_WORD not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(Integer value1, Integer value2) {
            addCriterion("PASS_WORD between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(Integer value1, Integer value2) {
            addCriterion("PASS_WORD not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionIsNull() {
            addCriterion("SECURITY_QUESTION is null");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionIsNotNull() {
            addCriterion("SECURITY_QUESTION is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionEqualTo(String value) {
            addCriterion("SECURITY_QUESTION =", value, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionNotEqualTo(String value) {
            addCriterion("SECURITY_QUESTION <>", value, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionGreaterThan(String value) {
            addCriterion("SECURITY_QUESTION >", value, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITY_QUESTION >=", value, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionLessThan(String value) {
            addCriterion("SECURITY_QUESTION <", value, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionLessThanOrEqualTo(String value) {
            addCriterion("SECURITY_QUESTION <=", value, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionLike(String value) {
            addCriterion("SECURITY_QUESTION like", value, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionNotLike(String value) {
            addCriterion("SECURITY_QUESTION not like", value, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionIn(List<String> values) {
            addCriterion("SECURITY_QUESTION in", values, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionNotIn(List<String> values) {
            addCriterion("SECURITY_QUESTION not in", values, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionBetween(String value1, String value2) {
            addCriterion("SECURITY_QUESTION between", value1, value2, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecurityQuestionNotBetween(String value1, String value2) {
            addCriterion("SECURITY_QUESTION not between", value1, value2, "securityQuestion");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersIsNull() {
            addCriterion("SECRYTY_ANSWERS is null");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersIsNotNull() {
            addCriterion("SECRYTY_ANSWERS is not null");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersEqualTo(String value) {
            addCriterion("SECRYTY_ANSWERS =", value, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersNotEqualTo(String value) {
            addCriterion("SECRYTY_ANSWERS <>", value, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersGreaterThan(String value) {
            addCriterion("SECRYTY_ANSWERS >", value, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersGreaterThanOrEqualTo(String value) {
            addCriterion("SECRYTY_ANSWERS >=", value, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersLessThan(String value) {
            addCriterion("SECRYTY_ANSWERS <", value, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersLessThanOrEqualTo(String value) {
            addCriterion("SECRYTY_ANSWERS <=", value, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersLike(String value) {
            addCriterion("SECRYTY_ANSWERS like", value, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersNotLike(String value) {
            addCriterion("SECRYTY_ANSWERS not like", value, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersIn(List<String> values) {
            addCriterion("SECRYTY_ANSWERS in", values, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersNotIn(List<String> values) {
            addCriterion("SECRYTY_ANSWERS not in", values, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersBetween(String value1, String value2) {
            addCriterion("SECRYTY_ANSWERS between", value1, value2, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andSecrytyAnswersNotBetween(String value1, String value2) {
            addCriterion("SECRYTY_ANSWERS not between", value1, value2, "secrytyAnswers");
            return (Criteria) this;
        }

        public Criteria andPresentAddressIsNull() {
            addCriterion("PRESENT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPresentAddressIsNotNull() {
            addCriterion("PRESENT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPresentAddressEqualTo(String value) {
            addCriterion("PRESENT_ADDRESS =", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressNotEqualTo(String value) {
            addCriterion("PRESENT_ADDRESS <>", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressGreaterThan(String value) {
            addCriterion("PRESENT_ADDRESS >", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PRESENT_ADDRESS >=", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressLessThan(String value) {
            addCriterion("PRESENT_ADDRESS <", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressLessThanOrEqualTo(String value) {
            addCriterion("PRESENT_ADDRESS <=", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressLike(String value) {
            addCriterion("PRESENT_ADDRESS like", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressNotLike(String value) {
            addCriterion("PRESENT_ADDRESS not like", value, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressIn(List<String> values) {
            addCriterion("PRESENT_ADDRESS in", values, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressNotIn(List<String> values) {
            addCriterion("PRESENT_ADDRESS not in", values, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressBetween(String value1, String value2) {
            addCriterion("PRESENT_ADDRESS between", value1, value2, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andPresentAddressNotBetween(String value1, String value2) {
            addCriterion("PRESENT_ADDRESS not between", value1, value2, "presentAddress");
            return (Criteria) this;
        }

        public Criteria andHouseSituationIsNull() {
            addCriterion("HOUSE_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andHouseSituationIsNotNull() {
            addCriterion("HOUSE_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSituationEqualTo(String value) {
            addCriterion("HOUSE_SITUATION =", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationNotEqualTo(String value) {
            addCriterion("HOUSE_SITUATION <>", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationGreaterThan(String value) {
            addCriterion("HOUSE_SITUATION >", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSE_SITUATION >=", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationLessThan(String value) {
            addCriterion("HOUSE_SITUATION <", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationLessThanOrEqualTo(String value) {
            addCriterion("HOUSE_SITUATION <=", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationLike(String value) {
            addCriterion("HOUSE_SITUATION like", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationNotLike(String value) {
            addCriterion("HOUSE_SITUATION not like", value, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationIn(List<String> values) {
            addCriterion("HOUSE_SITUATION in", values, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationNotIn(List<String> values) {
            addCriterion("HOUSE_SITUATION not in", values, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationBetween(String value1, String value2) {
            addCriterion("HOUSE_SITUATION between", value1, value2, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andHouseSituationNotBetween(String value1, String value2) {
            addCriterion("HOUSE_SITUATION not between", value1, value2, "houseSituation");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("COMPANY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("COMPANY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("COMPANY_TYPE =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("COMPANY_TYPE <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("COMPANY_TYPE >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("COMPANY_TYPE <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_TYPE <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("COMPANY_TYPE like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("COMPANY_TYPE not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("COMPANY_TYPE in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("COMPANY_TYPE not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("COMPANY_TYPE not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("COMPANY_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("COMPANY_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("COMPANY_PHONE =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("COMPANY_PHONE <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("COMPANY_PHONE >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_PHONE >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("COMPANY_PHONE <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_PHONE <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("COMPANY_PHONE like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("COMPANY_PHONE not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("COMPANY_PHONE in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("COMPANY_PHONE not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("COMPANY_PHONE between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("COMPANY_PHONE not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("COMPANY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("COMPANY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("COMPANY_ADDRESS >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("COMPANY_ADDRESS <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("COMPANY_ADDRESS like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("COMPANY_ADDRESS not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andYearIncomeIsNull() {
            addCriterion("YEAR_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andYearIncomeIsNotNull() {
            addCriterion("YEAR_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andYearIncomeEqualTo(Long value) {
            addCriterion("YEAR_INCOME =", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeNotEqualTo(Long value) {
            addCriterion("YEAR_INCOME <>", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeGreaterThan(Long value) {
            addCriterion("YEAR_INCOME >", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeGreaterThanOrEqualTo(Long value) {
            addCriterion("YEAR_INCOME >=", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeLessThan(Long value) {
            addCriterion("YEAR_INCOME <", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeLessThanOrEqualTo(Long value) {
            addCriterion("YEAR_INCOME <=", value, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeIn(List<Long> values) {
            addCriterion("YEAR_INCOME in", values, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeNotIn(List<Long> values) {
            addCriterion("YEAR_INCOME not in", values, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeBetween(Long value1, Long value2) {
            addCriterion("YEAR_INCOME between", value1, value2, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andYearIncomeNotBetween(Long value1, Long value2) {
            addCriterion("YEAR_INCOME not between", value1, value2, "yearIncome");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("POSTAL_CODE =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(String value) {
            addCriterion("POSTAL_CODE <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(String value) {
            addCriterion("POSTAL_CODE >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTAL_CODE >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(String value) {
            addCriterion("POSTAL_CODE <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("POSTAL_CODE <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLike(String value) {
            addCriterion("POSTAL_CODE like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotLike(String value) {
            addCriterion("POSTAL_CODE not like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<String> values) {
            addCriterion("POSTAL_CODE in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<String> values) {
            addCriterion("POSTAL_CODE not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(String value1, String value2) {
            addCriterion("POSTAL_CODE between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(String value1, String value2) {
            addCriterion("POSTAL_CODE not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("CONTACTS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("CONTACTS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("CONTACTS_NAME =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("CONTACTS_NAME <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("CONTACTS_NAME >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS_NAME >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("CONTACTS_NAME <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS_NAME <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("CONTACTS_NAME like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("CONTACTS_NAME not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("CONTACTS_NAME in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("CONTACTS_NAME not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("CONTACTS_NAME between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("CONTACTS_NAME not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNull() {
            addCriterion("CONTACTS_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNotNull() {
            addCriterion("CONTACTS_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneEqualTo(String value) {
            addCriterion("CONTACTS_PHONE =", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotEqualTo(String value) {
            addCriterion("CONTACTS_PHONE <>", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThan(String value) {
            addCriterion("CONTACTS_PHONE >", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS_PHONE >=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThan(String value) {
            addCriterion("CONTACTS_PHONE <", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS_PHONE <=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLike(String value) {
            addCriterion("CONTACTS_PHONE like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotLike(String value) {
            addCriterion("CONTACTS_PHONE not like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIn(List<String> values) {
            addCriterion("CONTACTS_PHONE in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotIn(List<String> values) {
            addCriterion("CONTACTS_PHONE not in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneBetween(String value1, String value2) {
            addCriterion("CONTACTS_PHONE between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotBetween(String value1, String value2) {
            addCriterion("CONTACTS_PHONE not between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIsNull() {
            addCriterion("CONTACTS_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIsNotNull() {
            addCriterion("CONTACTS_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEmailEqualTo(String value) {
            addCriterion("CONTACTS_EMAIL =", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotEqualTo(String value) {
            addCriterion("CONTACTS_EMAIL <>", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailGreaterThan(String value) {
            addCriterion("CONTACTS_EMAIL >", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS_EMAIL >=", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLessThan(String value) {
            addCriterion("CONTACTS_EMAIL <", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS_EMAIL <=", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLike(String value) {
            addCriterion("CONTACTS_EMAIL like", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotLike(String value) {
            addCriterion("CONTACTS_EMAIL not like", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIn(List<String> values) {
            addCriterion("CONTACTS_EMAIL in", values, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotIn(List<String> values) {
            addCriterion("CONTACTS_EMAIL not in", values, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailBetween(String value1, String value2) {
            addCriterion("CONTACTS_EMAIL between", value1, value2, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotBetween(String value1, String value2) {
            addCriterion("CONTACTS_EMAIL not between", value1, value2, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountIsNull() {
            addCriterion("REPAYMENT_SCCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountIsNotNull() {
            addCriterion("REPAYMENT_SCCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountEqualTo(String value) {
            addCriterion("REPAYMENT_SCCOUNT =", value, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountNotEqualTo(String value) {
            addCriterion("REPAYMENT_SCCOUNT <>", value, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountGreaterThan(String value) {
            addCriterion("REPAYMENT_SCCOUNT >", value, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENT_SCCOUNT >=", value, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountLessThan(String value) {
            addCriterion("REPAYMENT_SCCOUNT <", value, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENT_SCCOUNT <=", value, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountLike(String value) {
            addCriterion("REPAYMENT_SCCOUNT like", value, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountNotLike(String value) {
            addCriterion("REPAYMENT_SCCOUNT not like", value, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountIn(List<String> values) {
            addCriterion("REPAYMENT_SCCOUNT in", values, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountNotIn(List<String> values) {
            addCriterion("REPAYMENT_SCCOUNT not in", values, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountBetween(String value1, String value2) {
            addCriterion("REPAYMENT_SCCOUNT between", value1, value2, "repaymentSccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentSccountNotBetween(String value1, String value2) {
            addCriterion("REPAYMENT_SCCOUNT not between", value1, value2, "repaymentSccount");
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