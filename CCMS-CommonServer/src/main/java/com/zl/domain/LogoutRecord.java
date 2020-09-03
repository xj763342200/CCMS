package com.zl.domain;

import java.io.Serializable;
import java.util.Date;

public class LogoutRecord implements Serializable {
    private Integer logoutId;

    private Integer userId;

    private String cardNumber;

    private Date logoutDate;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getLogoutId() {
        return logoutId;
    }

    public void setLogoutId(Integer logoutId) {
        this.logoutId = logoutId;
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

    public Date getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(Date logoutDate) {
        this.logoutDate = logoutDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logoutId=").append(logoutId);
        sb.append(", userId=").append(userId);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", logoutDate=").append(logoutDate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}