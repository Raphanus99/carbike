package com.liu.server;

import com.liu.pojo.GuProPosalRiskRelatedParty;

public interface GuProPosalRiskRelatedPartyService {
    /**
     * 添加保险人信息
     */
    int addGuProPosalRiskRelatedParty(GuProPosalRiskRelatedParty guProPosalRiskRelatedParty);

    /**
     * 根据保单号查询
     */
    GuProPosalRiskRelatedParty seGuProPosalRiskRelatedParty(String proPosalNo);

    /**
     * 根据保单号修改
     */
    int updateGuProPosalRiskRelatedParty(String proPosalNo);

    /**
     * 删除
     */
    int deleteGuProPosalRiskRelatedParty(String proPosalNo);
}
