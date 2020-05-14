package com.liu.server;

import com.liu.pojo.GuProPosalCanal;

public interface GuProPosalCanalServer {
    /**
     * 根据渠道号查询
     */
    GuProPosalCanal seGuProPosalCannal(String businessChannel);
}
