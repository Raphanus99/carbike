package com.liu.server.impl;

import com.liu.dao.GgRiskConfigDao;
import com.liu.pojo.GgRiskConfig;
import com.liu.server.GgRiskConfigServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GgRiskConfigServerImpl implements GgRiskConfigServer {

    @Autowired
    private GgRiskConfigDao ggRiskConfigDao;
    /**
     * 查询基础表
     *
     * @param configCode
     */
    @Override
    public GgRiskConfig seGgRiskConfig(String configCode) {
        GgRiskConfig ggRiskConfig=null;
        if(configCode!=null && !"".equals(configCode)){
            ggRiskConfig=ggRiskConfigDao.seGgRiskConfig(configCode);
            return ggRiskConfig;
        }
        return ggRiskConfig;
    }

    @Override
    public List<GgRiskConfig> sesGgRiskConfigs() {
        return null;
    }
}
