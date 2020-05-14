package com.liu.server;

import com.liu.pojo.GgRiskConfig;

import java.util.List;

public interface GgRiskConfigServer {
    /**
     * 查询基础表
     */
    GgRiskConfig seGgRiskConfig(String configCode);

    List<GgRiskConfig> sesGgRiskConfigs();

    /**
     * 添加险种
     */
}
