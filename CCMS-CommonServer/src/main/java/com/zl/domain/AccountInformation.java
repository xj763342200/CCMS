package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AccountInformation implements Serializable {
    private Integer accountId;

    private String currency;

    private BigDecimal creditTotal;

    private BigDecimal creditable;

    private BigDecimal cashAvailability;

    private String monthlyBills;

    private Date nowaccountdate;

    private Integer cardId;

    private Short paymentType;

    private String idNumber;

    private static final long serialVersionUID = 1L;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getCreditTotal() {
        return creditTotal;
    }

    public void setCreditTotal(BigDecimal creditTotal) {
        this.creditTotal = creditTotal;
    }

    public BigDecimal getCreditable() {
        return creditable;
    }

    public void setCreditable(BigDecimal creditable) {
        this.creditable = creditable;
    }

    public BigDecimal getCashAvailability() {
        return cashAvailability;
    }

    public void setCashAvailability(BigDecimal cashAvailability) {
        this.cashAvailability = cashAvailability;
    }

    public String getMonthlyBills() {
        return monthlyBills;
    }

    public void setMonthlyBills(String monthlyBills) {
        this.monthlyBills = monthlyBills == null ? null : monthlyBills.trim();
    }

    public Date getNowaccountdate() {
        return nowaccountdate;
    }

    public void setNowaccountdate(Date nowaccountdate) {
        this.nowaccountdate = nowaccountdate;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Short getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Short paymentType) {
        this.paymentType = paymentType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountId=").append(accountId);
        sb.append(", currency=").append(currency);
        sb.append(", creditTotal=").append(creditTotal);
        sb.append(", creditable=").append(creditable);
        sb.append(", cashAvailability=").append(cashAvailability);
        sb.append(", monthlyBills=").append(monthlyBills);
        sb.append(", nowaccountdate=").append(nowaccountdate);
        sb.append(", cardId=").append(cardId);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}