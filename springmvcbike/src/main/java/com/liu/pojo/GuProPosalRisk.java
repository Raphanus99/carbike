package com.liu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 *
 投保单险种表
 */

public class GuProPosalRisk {
    private String proPosalNo;
    private String riskCode;
    private String riskCname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date endDate;
    private Double sumGrossPremium;

    public String getProPosalNo() {
        return proPosalNo;
    }

    public void setProPosalNo(String proPosalNo) {
        this.proPosalNo = proPosalNo;
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public String getRiskCname() {
        return riskCname;
    }

    public void setRiskCname(String riskCname) {
        this.riskCname = riskCname;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getSumGrossPremium() {
        return sumGrossPremium;
    }

    public void setSumGrossPremium(Double sumGrossPremium) {
        this.sumGrossPremium = sumGrossPremium;
    }

    @Override
    public String toString() {
        return "guProPosalRisk{" +
                "proPosalNo='" + proPosalNo + '\'' +
                ", riskCode='" + riskCode + '\'' +
                ", riskCname='" + riskCname + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", sumGrossPremium=" + sumGrossPremium +
                '}';
    }
}
