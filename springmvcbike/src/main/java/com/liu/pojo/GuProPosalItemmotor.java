package com.liu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 标的信息
 */
public class GuProPosalItemmotor {
    private String proPosalNo;
    private String vin;
    private String engine;
    private String licenNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date errDate;

    public String getProPosalNo() {
        return proPosalNo;
    }

    public void setProPosalNo(String proPosalNo) {
        this.proPosalNo = proPosalNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getLicenNo() {
        return licenNo;
    }

    public void setLicenNo(String licenNo) {
        this.licenNo = licenNo;
    }

    public Date getErrDate() {
        return errDate;
    }

    public void setErrDate(Date errDate) {
        this.errDate = errDate;
    }

    @Override
    public String toString() {
        return "GuProPosalItemmotor{" +
                "proPosalNo='" + proPosalNo + '\'' +
                ", vin='" + vin + '\'' +
                ", engine='" + engine + '\'' +
                ", licenNo='" + licenNo + '\'' +
                ", errDate=" + errDate +
                '}';
    }
}
