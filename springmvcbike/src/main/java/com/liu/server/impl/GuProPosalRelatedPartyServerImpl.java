package com.liu.server.impl;

import com.liu.dao.GuProPosalRelatedPartyDao;
import com.liu.pojo.GuProPosalRelatedParty;
import com.liu.server.GuProPosalMainServer;
import com.liu.server.GuProPosalRelatedPartyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuProPosalRelatedPartyServerImpl implements GuProPosalRelatedPartyServer {

    @Autowired
    private GuProPosalRelatedPartyDao guProPosalRelatedPartyDao;
    /**
     * 添加保险人信息
     *
     * @param guProPosalRelatedParty
     */
    @Override
    public int addGuProPosalRelatedParty(GuProPosalRelatedParty guProPosalRelatedParty) {
        int relute=guProPosalRelatedPartyDao.addGuProPosalRelatedParty(guProPosalRelatedParty);
        return relute;
    }

    /**
     * 根据保单号查询
     *
     * @param proPosalNo
     */
    @Override
    public GuProPosalRelatedParty seGuProPosalRelatedParty(String proPosalNo) {
        GuProPosalRelatedParty guProPosalRelatedParty=null;
        if(proPosalNo!=null && !"".equals(proPosalNo)){
            guProPosalRelatedParty=guProPosalRelatedPartyDao.seGuProPosalRelatedParty(proPosalNo);
            System.out.println("======================"+guProPosalRelatedParty);
            return guProPosalRelatedParty;
        }
        return guProPosalRelatedParty;
    }

    /**
     * 根据保单号修改
     *
     * @param proPosalNo
     */
    @Override
    public int updateGuProPosalRelatedParty(String proPosalNo) {
        return 0;
    }

    /**
     * 删除
     *
     * @param proPosalNo
     */
    @Override
    public int deleteGuProPosalRelatedParty(String proPosalNo) {
        return 0;
    }
}
