package com.liu.server;

import com.liu.pojo.GuProPosalMain;
import com.liu.pojo.GuProPosalRelatedParty;

import java.util.List;

public interface GuProPosalMainServer {

    /**
     * 投保单
     */
    String addGuProPosalMain(GuProPosalMain guProPosalMain, GuProPosalRelatedParty guProPosalRelatedParty);

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
