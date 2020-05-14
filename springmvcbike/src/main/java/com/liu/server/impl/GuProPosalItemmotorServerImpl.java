package com.liu.server.impl;

import com.liu.dao.GuProPosalItemmotorDao;
import com.liu.pojo.GuProPosalItemmotor;
import com.liu.server.GuProPosalItemmotorServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuProPosalItemmotorServerImpl implements GuProPosalItemmotorServer {

    @Autowired
    private GuProPosalItemmotorDao guProPosalItemmotorDao;
    /**
     * 添加车的信息
     *
     * @param guProPosalItemmotor
     */
    @Override
    public int addGuProPosalItemmotor(GuProPosalItemmotor guProPosalItemmotor) {
        int result=guProPosalItemmotorDao.addGuProPosalItemmotor(guProPosalItemmotor);
        return result;
    }

    /**
     * 根据保单号查询
     *
     * @param proPosalNo
     */
    @Override
    public GuProPosalItemmotor seGuProPosalItemmotor(String proPosalNo) {
        GuProPosalItemmotor itemmotor=guProPosalItemmotorDao.seGuProPosalItemmotor(proPosalNo);
        return itemmotor;
    }
}
