package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BillDetails implements Serializable {
    private Long billDetailsId;

    private Date tradeDate;

    private Date accountingDate;

    private String tradeSummary;

    private String tradePlace;

    private String cardNumber;

    private BigDecimal rmbAmount;

    private BigDecimal tradeAmount;

    private static final long serialVersionUID = 1L;

    public Long getBillDetailsId() {
        return billDetailsId;
    }

    public void setBillDetailsId(Long billDetailsId) {
        this.billDetailsId = billDetailsId;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Date getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(Date accountingDate) {
        this.accountingDate = accountingDate;
    }

    public String getTradeSummary() {
        return tradeSummary;
    }

    public void setTradeSummary(String tradeSummary) {
        this.tradeSummary = tradeSummary == null ? null : tradeSummary.trim();
    }

    public String getTradePlace() {
        return tradePlace;
    }

    public void setTradePlace(String tradePlace) {
        this.tradePlace = tradePlace == null ? null : tradePlace.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public BigDecimal getRmbAmount() {
        return rmbAmount;
    }

    public void setRmbAmount(BigDecimal rmbAmount) {
        this.rmbAmount = rmbAmount;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", billDetailsId=").append(billDetailsId);
        sb.append(", tradeDate=").append(tradeDate);
        sb.append(", accountingDate=").append(accountingDate);
        sb.append(", tradeSummary=").append(tradeSummary);
        sb.append(", tradePlace=").append(tradePlace);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", rmbAmount=").append(rmbAmount);
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}