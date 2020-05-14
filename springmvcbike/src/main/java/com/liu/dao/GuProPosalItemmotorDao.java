package com.liu.dao;

import com.liu.pojo.GuProPosalItemmotor;

public interface GuProPosalItemmotorDao {

    /**
     * 添加车的信息
     */
    int addGuProPosalItemmotor(GuProPosalItemmotor guProPosalItemmotor);


    /**
     * 根据保单号查询
     */
    GuProPosalItemmotor seGuProPosalItemmotor(String proPosalNo);


}
