package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class CardManagement implements Serializable {
    private Integer cardId;

    private Integer userId;

    private String cardNumber;

    private String phone;

    private String password;

    private BigDecimal temporary;

    private BigDecimal residueTemporaryLines;

    private BigDecimal facilityExtent;

    private BigDecimal residueFacilityExtent;

    private Short kind;

    private Short cardState;

    private Short activate;

    private static final long serialVersionUID = 1L;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public BigDecimal getTemporary() {
        return temporary;
    }

    public void setTemporary(BigDecimal temporary) {
        this.temporary = temporary;
    }

    public BigDecimal getResidueTemporaryLines() {
        return residueTemporaryLines;
    }

    public void setResidueTemporaryLines(BigDecimal residueTemporaryLines) {
        this.residueTemporaryLines = residueTemporaryLines;
    }

    public BigDecimal getFacilityExtent() {
        return facilityExtent;
    }

    public void setFacilityExtent(BigDecimal facilityExtent) {
        this.facilityExtent = facilityExtent;
    }

    public BigDecimal getResidueFacilityExtent() {
        return residueFacilityExtent;
    }

    public void setResidueFacilityExtent(BigDecimal residueFacilityExtent) {
        this.residueFacilityExtent = residueFacilityExtent;
    }

    public Short getKind() {
        return kind;
    }

    public void setKind(Short kind) {
        this.kind = kind;
    }

    public Short getCardState() {
        return cardState;
    }

    public void setCardState(Short cardState) {
        this.cardState = cardState;
    }

    public Short getActivate() {
        return activate;
    }

    public void setActivate(Short activate) {
        this.activate = activate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cardId=").append(cardId);
        sb.append(", userId=").append(userId);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", temporary=").append(temporary);
        sb.append(", residueTemporaryLines=").append(residueTemporaryLines);
        sb.append(", facilityExtent=").append(facilityExtent);
        sb.append(", residueFacilityExtent=").append(residueFacilityExtent);
        sb.append(", kind=").append(kind);
        sb.append(", cardState=").append(cardState);
        sb.append(", activate=").append(activate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}