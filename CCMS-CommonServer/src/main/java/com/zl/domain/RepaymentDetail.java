package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RepaymentDetail implements Serializable {
    private Long repaymentDetailId;

    private Long cardNumber;

    private BigDecimal repaymentMoney;

    private Date repaymentDate;

    private static final long serialVersionUID = 1L;

    public Long getRepaymentDetailId() {
        return repaymentDetailId;
    }

    public void setRepaymentDetailId(Long repaymentDetailId) {
        this.repaymentDetailId = repaymentDetailId;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
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