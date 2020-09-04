package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RepaymentDetail implements Serializable {
    private Integer repaymentDetailId;

    private String cardNumber;

    private BigDecimal repaymentMoney;

    private Date repaymentDate;

    private static final long serialVersionUID = 1L;

    public Integer getRepaymentDetailId() {
        return repaymentDetailId;
    }

    public void setRepaymentDetailId(Integer repaymentDetailId) {
        this.repaymentDetailId = repaymentDetailId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public BigDecimal getRepaymentMoney() {
        return repaymentMoney;
    }

    public void setRepaymentMoney(BigDecimal repaymentMoney) {
        this.repaymentMoney = repaymentMoney;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repaymentDetailId=").append(repaymentDetailId);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", repaymentMoney=").append(repaymentMoney);
        sb.append(", repaymentDate=").append(repaymentDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}