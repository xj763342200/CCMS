package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class QuotAapplication implements Serializable {
    private Integer quotId;

    private Integer userId;

    private String cardNumber;

    private BigDecimal facilityExtent;

    private BigDecimal temporaryLines;

    private Date settlingTime;

    private static final long serialVersionUID = 1L;

    public Integer getQuotId() {
        return quotId;
    }

    public void setQuotId(Integer quotId) {
        this.quotId = quotId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public BigDecimal getFacilityExtent() {
        return facilityExtent;
    }

    public void setFacilityExtent(BigDecimal facilityExtent) {
        this.facilityExtent = facilityExtent;
    }

    public BigDecimal getTemporaryLines() {
        return temporaryLines;
    }

    public void setTemporaryLines(BigDecimal temporaryLines) {
        this.temporaryLines = temporaryLines;
    }

    public Date getSettlingTime() {
        return settlingTime;
    }

    public void setSettlingTime(Date settlingTime) {
        this.settlingTime = settlingTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", quotId=").append(quotId);
        sb.append(", userId=").append(userId);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", facilityExtent=").append(facilityExtent);
        sb.append(", temporaryLines=").append(temporaryLines);
        sb.append(", settlingTime=").append(settlingTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}