package com.liu.pojo;

public class GuProPosalCanal {
    private String businessChannel;
    private String businessSource;

    public String getBusinessChannel() {
        return businessChannel;
    }

    public void setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
    }

    public String getBusinessSource() {
        return businessSource;
    }

    public void setBusinessSource(String businessSource) {
        this.businessSource = businessSource;
    }

    @Override
    public String toString() {
        return "GuProPosalCanal{" +
                "businessChannel='" + businessChannel + '\'' +
                ", businessSource='" + businessSource + '\'' +
                '}';
    }
}
