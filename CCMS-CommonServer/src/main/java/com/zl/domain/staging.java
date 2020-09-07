package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class staging implements Serializable {
    private Integer id;

    private Double totalmoney;

    private Integer totalmonth;

    private Double rate;

    private Double monthsend;

    private Integer endsendMonthnum;

    private Integer remindnum;

    private Date createtime;

    private Date updatetime;

    private Integer ifDelete;

    private Integer credId;

    private Double surplusmoney;

    private Integer surplusmonth;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Integer getTotalmonth() {
        return totalmonth;
    }

    public void setTotalmonth(Integer totalmonth) {
        this.totalmonth = totalmonth;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getMonthsend() {
        return monthsend;
    }

    public void setMonthsend(Double monthsend) {
        this.monthsend = monthsend;
    }

    public Integer getEndsendMonthnum() {
        return endsendMonthnum;
    }

    public void setEndsendMonthnum(Integer endsendMonthnum) {
        this.endsendMonthnum = endsendMonthnum;
    }

    public Integer getRemindnum() {
        return remindnum;
    }

    public void setRemindnum(Integer remindnum) {
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

    public Integer getIfDelete() {
        return ifDelete;
    }

    public void setIfDelete(Integer ifDelete) {
        this.ifDelete = ifDelete;
    }

    public Integer getCredId() {
        return credId;
    }

    public void setCredId(Integer credId) {
        this.credId = credId;
    }

    public Double getSurplusmoney() {
        return surplusmoney;
    }

    public void setSurplusmoney(Double surplusmoney) {
        this.surplusmoney = surplusmoney;
    }

    public Integer getSurplusmonth() {
        return surplusmonth;
    }

    public void setSurplusmonth(Integer surplusmonth) {
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