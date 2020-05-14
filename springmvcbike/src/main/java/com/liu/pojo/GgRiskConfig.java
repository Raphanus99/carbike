package com.liu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 险种代码 险别代码 等配置信息建一张基础配置
 */
public class GgRiskConfig {

    private String configCode;
    private String configCname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date updateTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date invalidDate;
    private String validind;

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public String getConfigCname() {
        return configCname;
    }

    public void setConfigCname(String configCname) {
        this.configCname = configCname;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getValidind() {
        return validind;
    }

    public void setValidind(String validind) {
        this.validind = validind;
    }

    @Override
    public String toString() {
        return "ggRiskConfig{" +
                "configCode='" + configCode + '\'' +
                ", configCname='" + configCname + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", invalidDate=" + invalidDate +
                ", validind='" + validind + '\'' +
                '}';
    }
}

