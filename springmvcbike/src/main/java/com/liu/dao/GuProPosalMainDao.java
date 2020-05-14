package com.liu.dao;

import com.liu.pojo.GuProPosalMain;

import java.util.List;

/**
 * 投保单
 */
public interface GuProPosalMainDao {

    /**
     * 投保单
     */
    int addGuProPosalMain(GuProPosalMain guProPosalMain);

    /**
     * 根据投保单来查询
     */
    GuProPosalMain seGuProsalMain(String proPosalNo);


    /**
     * 根据投保单号来修改
     */
    int updateGuProPosalMain(String proPosalNo);

    /**
     * 根据投保单号来删除
     */
    int deleteGuProPosalMain(String proPosalNo);
}
