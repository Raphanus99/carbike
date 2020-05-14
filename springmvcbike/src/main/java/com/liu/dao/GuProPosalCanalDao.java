package com.liu.dao;

import com.liu.pojo.GuProPosalCanal;

public interface GuProPosalCanalDao {
    /**
     * 根据渠道号查询
     */
    GuProPosalCanal seGuProPosalCannal(String businessChannel);
}
