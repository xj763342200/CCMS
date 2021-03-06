package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class HaveTheBill implements Serializable {
    private Integer billId;

    private String nowmonth;

    private BigDecimal allpaymoney;

    private BigDecimal nowlowpayment;

    private Short monthlyBillDay;

    private Short billType;

    private Short billState;

    private Integer billDetailsId;

    private Integer accountId;

    private String cardNumber;

    private static final long serialVersionUID = 1L;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getNowmonth() {
        return nowmonth;
    }

    public void setNowmonth(String nowmonth) {
        this.nowmonth = nowmonth == null ? null : nowmonth.trim();
    }

    public BigDecimal getAllpaymoney() {
        return allpaymoney;
    }

    public void setAllpaymoney(BigDecimal allpaymoney) {
        this.allpaymoney = allpaymoney;
    }

    public BigDecimal getNowlowpayment() {
        return nowlowpayment;
    }

    public void setNowlowpayment(BigDecimal nowlowpayment) {
        this.nowlowpayment = nowlowpayment;
    }

    public Short getMonthlyBillDay() {
        return monthlyBillDay;
    }

    public void setMonthlyBillDay(Short monthlyBillDay) {
        this.monthlyBillDay = monthlyBillDay;
    }

    public Short getBillType() {
        return billType;
    }

    public void setBillType(Short billType) {
        this.billType = billType;
    }

    public Short getBillState() {
        return billState;
    }

    public void setBillState(Short billState) {
        this.billState = billState;
    }

    public Integer getBillDetailsId() {
        return billDetailsId;
    }

    public void setBillDetailsId(Integer billDetailsId) {
        this.billDetailsId = billDetailsId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", billId=").append(billId);
        sb.append(", nowmonth=").append(nowmonth);
        sb.append(", allpaymoney=").append(allpaymoney);
        sb.append(", nowlowpayment=").append(nowlowpayment);
        sb.append(", monthlyBillDay=").append(monthlyBillDay);
        sb.append(", billType=").append(billType);
        sb.append(", billState=").append(billState);
        sb.append(", billDetailsId=").append(billDetailsId);
        sb.append(", accountId=").append(accountId);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}