package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HaveTheBill implements Serializable {
    private Long billId;

    private Date nowmonth;

    private BigDecimal allpaymoney;

    private BigDecimal nowlowpayment;

    private Date monthlyBillDay;

    private Short billType;

    private Short billState;

    private Long billDetailsId;

    private static final long serialVersionUID = 1L;

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Date getNowmonth() {
        return nowmonth;
    }

    public void setNowmonth(Date nowmonth) {
        this.nowmonth = nowmonth;
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

    public Date getMonthlyBillDay() {
        return monthlyBillDay;
    }

    public void setMonthlyBillDay(Date monthlyBillDay) {
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

    public Long getBillDetailsId() {
        return billDetailsId;
    }

    public void setBillDetailsId(Long billDetailsId) {
        this.billDetailsId = billDetailsId;
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}