package com.liu.server;

import com.liu.pojo.GuProPosalRisk;

public interface GuProPosalRiskServer {
    /**
     * 添加险种
     */
    int addGuProsalRisk(String proPosalNo,String riskCode);

    /**
     * 险种表查询
     */
    GuProPosalRisk seGuProPosalRisk(String proPosalNo);
}
