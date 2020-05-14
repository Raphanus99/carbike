package com.liu.dao;

import com.liu.pojo.GuProPosalRisk;

public interface GuProPosalRiskDao {

    /**
     * 添加险种
     */
    int addGuProsalRisk(GuProPosalRisk guProPosalRisk);

    /**
     * 险种表查询
     */
    GuProPosalRisk seGuProPosalRisk(String proPosalNo);



}
