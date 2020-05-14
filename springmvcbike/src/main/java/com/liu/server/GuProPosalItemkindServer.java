package com.liu.server;

import com.liu.pojo.GuProPosalItemkind;
import com.liu.pojo.GuProPosalItemkindList;

import java.util.List;

public interface GuProPosalItemkindServer {

    /**
     * 插入
     */
    int addGuProPosalItemkind(GuProPosalItemkindList guProPosalItemkindList);


    /**
     * 查询
     */
    List<GuProPosalItemkind> sesGuProPosalItemkind(String proPosalNo);
}
