package com.liu.server.impl;

import com.liu.dao.GuProPosalItemkindDao;
import com.liu.pojo.GuProPosalItemkind;
import com.liu.pojo.GuProPosalItemkindList;
import com.liu.server.GuProPosalItemkindServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuProPosalItemkindServerImpl implements GuProPosalItemkindServer {
    @Autowired
    private GuProPosalItemkindDao guProPosalItemkindDao;
    /**
     * 插入
     *
     * @param
     */
    @Override
    public int addGuProPosalItemkind(GuProPosalItemkindList guProPosalItemkindList){
        int result=0;
//        if(guProPosalItemkindList.getList()!=null){
//            result=guProPosalItemkindDao.addGuProPosalItemkind();
//
//        }
        return result;
    }

    /**
     * 查询
     *
     * @param proPosalNo
     */
    @Override
    public List<GuProPosalItemkind> sesGuProPosalItemkind(String proPosalNo) {
        return null;
    }
}
