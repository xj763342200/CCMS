package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class staging implements Serializable {
    private Long id;

    private BigDecimal totalmoney;

    private Short totalmonth;

    private BigDecimal rate;

    private BigDecimal monthsend;

    private Short endsendMonthnum;

    private Short remindnum;

    private Date createtime;

    private Date updatetime;

    private Short ifDelete;

    private Integer credId;

    private BigDecimal surplusmoney;

    private Short surplusmonth;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Short getTotalmonth() {
        return totalmonth;
    }

    public void setTotalmonth(Short totalmonth) {
        this.totalmonth = totalmonth;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getMonthsend() {
        return monthsend;
    }

    public void setMonthsend(BigDecimal monthsend) {
        this.monthsend = monthsend;
    }

    public Short getEndsendMonthnum() {
        return endsendMonthnum;
    }

    public void setEndsendMonthnum(Short endsendMonthnum) {
        this.endsendMonthnum = endsendMonthnum;
    }

    public Short getRemindnum() {
        return remindnum;
    }

    public void setRemindnum(Short remindnum) {
        this.remindnum = remindnum;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Short getIfDelete() {
        return ifDelete;
    }

    public void setIfDelete(Short ifDelete) {
        this.ifDelete = ifDelete;
    }

    public Integer getCredId() {
        return credId;
    }

    public void setCredId(Integer credId) {
        this.credId = credId;
    }

    public BigDecimal getSurplusmoney() {
        return surplusmoney;
    }

    public void setSurplusmoney(BigDecimal surplusmoney) {
        this.surplusmoney = surplusmoney;
    }

    public Short getSurplusmonth() {
        return surplusmonth;
    }

    public void setSurplusmonth(Short surplusmonth) {
        this.surplusmonth = surplusmonth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", totalmoney=").append(totalmoney);
        sb.append(", totalmonth=").append(totalmonth);
        sb.append(", rate=").append(rate);
        sb.append(", monthsend=").append(monthsend);
        sb.append(", endsendMonthnum=").append(endsendMonthnum);
        sb.append(", remindnum=").append(remindnum);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", ifDelete=").append(ifDelete);
        sb.append(", credId=").append(credId);
        sb.append(", surplusmoney=").append(surplusmoney);
        sb.append(", surplusmonth=").append(surplusmonth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}