package com.liu.dao;

import com.liu.pojo.GuProPosalItemkind;

import java.util.List;

public interface GuProPosalItemkindDao {

    /**
     * 插入
     */
    int addGuProPosalItemkind(GuProPosalItemkind guProPosalItemkind);


    /**
     * 查询
     */
    List<GuProPosalItemkind> sesGuProPosalItemkind(String proPosalNo);
}
