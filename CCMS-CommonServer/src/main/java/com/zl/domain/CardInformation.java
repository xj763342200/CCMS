package com.zl.domain;

import java.io.Serializable;

public class CardInformation implements Serializable {
    private Integer id;

    private Integer cardId;

    private Short cardState;

    private String cardholder;

    private Short cardKind;

    private Short lordVice;

    private Integer accountId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Short getCardState() {
        return cardState;
    }

    public void setCardState(Short cardState) {
        this.cardState = cardState;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder == null ? null : cardholder.trim();
    }

    public Short getCardKind() {
        return cardKind;
    }

    public void setCardKind(Short cardKind) {
        this.cardKind = cardKind;
    }

    public Short getLordVice() {
        return lordVice;
    }

    public void setLordVice(Short lordVice) {
        this.lordVice = lordVice;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cardId=").append(cardId);
        sb.append(", cardState=").append(cardState);
        sb.append(", cardholder=").append(cardholder);
        sb.append(", cardKind=").append(cardKind);
        sb.append(", lordVice=").append(lordVice);
        sb.append(", accountId=").append(accountId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}