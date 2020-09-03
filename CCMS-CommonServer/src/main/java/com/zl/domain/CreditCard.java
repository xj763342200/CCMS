package com.zl.domain;

import java.io.Serializable;
import java.util.Date;

public class CreditCard implements Serializable {
    private String id;

    private String name;

    private String idNumber;

    private String phoneNumber;

    private String nation;

    private Short age;

    private String civilState;

    private Date identityIndate;

    private String education;

    private Integer passWord;

    private String securityQuestion;

    private String secrytyAnswers;

    private String presentAddress;

    private String houseSituation;

    private String email;

    private String cardType;

    private String cardNumber;

    private String companyName;

    private String companyType;

    private String companyPhone;

    private String companyAddress;

    private String position;

    private Long yearIncome;

    private String postalCode;

    private String contactsName;

    private String contactsPhone;

    private String contactsEmail;

    private String repaymentSccount;

    private Integer userId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getCivilState() {
        return civilState;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState == null ? null : civilState.trim();
    }

    public Date getIdentityIndate() {
        return identityIndate;
    }

    public void setIdentityIndate(Date identityIndate) {
        this.identityIndate = identityIndate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Integer getPassWord() {
        return passWord;
    }

    public void setPassWord(Integer passWord) {
        this.passWord = passWord;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion == null ? null : securityQuestion.trim();
    }

    public String getSecrytyAnswers() {
        return secrytyAnswers;
    }

    public void setSecrytyAnswers(String secrytyAnswers) {
        this.secrytyAnswers = secrytyAnswers == null ? null : secrytyAnswers.trim();
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress == null ? null : presentAddress.trim();
    }

    public String getHouseSituation() {
        return houseSituation;
    }

    public void setHouseSituation(String houseSituation) {
        this.houseSituation = houseSituation == null ? null : houseSituation.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Long getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(Long yearIncome) {
        this.yearIncome = yearIncome;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName == null ? null : contactsName.trim();
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone == null ? null : contactsPhone.trim();
    }

    public String getContactsEmail() {
        return contactsEmail;
    }

    public void setContactsEmail(String contactsEmail) {
        this.contactsEmail = contactsEmail == null ? null : contactsEmail.trim();
    }

    public String getRepaymentSccount() {
        return repaymentSccount;
    }

    public void setRepaymentSccount(String repaymentSccount) {
        this.repaymentSccount = repaymentSccount == null ? null : repaymentSccount.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", nation=").append(nation);
        sb.append(", age=").append(age);
        sb.append(", civilState=").append(civilState);
        sb.append(", identityIndate=").append(identityIndate);
        sb.append(", education=").append(education);
        sb.append(", passWord=").append(passWord);
        sb.append(", securityQuestion=").append(securityQuestion);
        sb.append(", secrytyAnswers=").append(secrytyAnswers);
        sb.append(", presentAddress=").append(presentAddress);
        sb.append(", houseSituation=").append(houseSituation);
        sb.append(", email=").append(email);
        sb.append(", cardType=").append(cardType);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyType=").append(companyType);
        sb.append(", companyPhone=").append(companyPhone);
        sb.append(", companyAddress=").append(companyAddress);
        sb.append(", position=").append(position);
        sb.append(", yearIncome=").append(yearIncome);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", contactsName=").append(contactsName);
        sb.append(", contactsPhone=").append(contactsPhone);
        sb.append(", contactsEmail=").append(contactsEmail);
        sb.append(", repaymentSccount=").append(repaymentSccount);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}