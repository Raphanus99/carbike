package com.liu.dao;

import com.liu.pojo.GgRiskConfig;

import java.util.List;

public interface GgRiskConfigDao {

    /**
     * 查询基础表
     */
    GgRiskConfig seGgRiskConfig(String configCode);

    List<GgRiskConfig> sesGgRiskConfigs();

    /**
     * 添加险种
     */

    /**
     * 修改险种
     */

    /**
     * 删除险种
     */
}
