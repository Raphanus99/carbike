package com.liu.pojo;

/**
 * --投保单 被保险人表
 */

public class GuProPosalRiskRelatedParty {
    private String proPosalNo;
    private String insuredCode;
    private String insuredName;

    private String insuredAddress;
    private String identifyNumber;
    private String sex;



    public String getProPosalNo() {
        return proPosalNo;
    }

    public void setProPosalNo(String proPosalNo) {
        this.proPosalNo = proPosalNo;
    }

    public String getInsuredCode() {
        return insuredCode;
    }

    public void setInsuredCode(String insuredCode) {
        this.insuredCode = insuredCode;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getInsuredAddress() {
        return insuredAddress;
    }

    public void setInsuredAddress(String insuredAddress) {
        this.insuredAddress = insuredAddress;
    }

    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "guProPosalRiskRelatedParty{" +
                "proPosalNo='" + proPosalNo + '\'' +
                ", insuredCode='" + insuredCode + '\'' +
                ", insuredAddess='" + insuredAddress + '\'' +
                ", identifyNumber='" + identifyNumber + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
