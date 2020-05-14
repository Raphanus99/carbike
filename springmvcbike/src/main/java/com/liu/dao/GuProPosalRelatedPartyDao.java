package com.liu.dao;

import com.liu.pojo.GuProPosalRelatedParty;

/**
 * 保险人信息
 */
public interface GuProPosalRelatedPartyDao {

    /**
     * 添加保险人信息
     */
    int addGuProPosalRelatedParty(GuProPosalRelatedParty guProPosalRelatedParty);

    /**
     * 根据保单号查询
     */
    GuProPosalRelatedParty seGuProPosalRelatedParty(String proPosalNo);

    /**
     * 根据保单号修改
     */
    int updateGuProPosalRelatedParty(String proPosalNo);

    /**
     * 删除
     */
    int deleteGuProPosalRelatedParty(String proPosalNo);
}
