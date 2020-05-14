package com.liu.server.impl;

import com.liu.dao.GuProPosalCanalDao;
import com.liu.pojo.GuProPosalCanal;
import com.liu.server.GuProPosalCanalServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuProPosalCanalServerImpl implements GuProPosalCanalServer {

    @Autowired
    private GuProPosalCanalDao guProPosalCanalDao;
    /**
     * 根据渠道号查询
     *
     * @param businessChannel
     */
    @Override
    public GuProPosalCanal seGuProPosalCannal(String businessChannel) {

        GuProPosalCanal guProPosalCanal = guProPosalCanalDao.seGuProPosalCannal(businessChannel);

        return guProPosalCanal;
    }
}
