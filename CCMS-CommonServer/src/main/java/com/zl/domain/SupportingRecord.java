package com.zl.domain;

import java.io.Serializable;
import java.util.Date;

public class SupportingRecord implements Serializable {
    private Integer supportingId;

    private Integer userId;

    private String cardNumber;

    private Long phone;

    private String address;

    private Date replaceDate;

    private static final long serialVersionUID = 1L;

    public Integer getSupportingId() {
        return supportingId;
    }

    public void setSupportingId(Integer supportingId) {
        this.supportingId = supportingId;
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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getReplaceDate() {
        return replaceDate;
    }

    public void setReplaceDate(Date replaceDate) {
        this.replaceDate = replaceDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", supportingId=").append(supportingId);
        sb.append(", userId=").append(userId);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", replaceDate=").append(replaceDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}