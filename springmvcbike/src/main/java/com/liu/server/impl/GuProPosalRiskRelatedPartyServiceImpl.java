package com.liu.server.impl;

import com.liu.dao.GuProPosalRiskRelatedPartyDao;
import com.liu.pojo.GuProPosalRiskRelatedParty;
import com.liu.server.GuProPosalRiskRelatedPartyService;
import org.springframework.beans.factory.annotation.Autowired;

public class GuProPosalRiskRelatedPartyServiceImpl implements GuProPosalRiskRelatedPartyService{

    @Autowired
    private GuProPosalRiskRelatedPartyDao guProPosalRiskRelatedPartyDao;
    /**
     * 添加保险人信息
     *
     * @param guProPosalRiskRelatedParty
     */
    @Override
    public int addGuProPosalRiskRelatedParty(GuProPosalRiskRelatedParty guProPosalRiskRelatedParty) {
        int flag=0;
        if(guProPosalRiskRelatedParty!=null){
            flag=guProPosalRiskRelatedPartyDao.addGuProPosalRiskRelatedParty(guProPosalRiskRelatedParty);
            return flag;
        }

        return flag;
    }

    /**
     * 根据保单号查询
     *
     * @param proPosalNo
     */
    @Override
    public GuProPosalRiskRelatedParty seGuProPosalRiskRelatedParty(String proPosalNo) {
        GuProPosalRiskRelatedParty guProPosalRiskRelatedParty=null;
        if(proPosalNo!=null && !"".equals(proPosalNo)){
            guProPosalRiskRelatedParty=guProPosalRiskRelatedPartyDao.seGuProPosalRiskRelatedParty(proPosalNo);
            return guProPosalRiskRelatedParty;

        }
        return guProPosalRiskRelatedParty;
    }

    /**
     * 根据保单号修改
     *
     * @param proPosalNo
     */
    @Override
    public int updateGuProPosalRiskRelatedParty(String proPosalNo) {
        return 0;
    }

    /**
     * 删除
     *
     * @param proPosalNo
     */
    @Override
    public int deleteGuProPosalRiskRelatedParty(String proPosalNo) {
        return 0;
    }
}
