package com.liu.server.impl;

import com.liu.dao.GgRiskConfigDao;
import com.liu.dao.GuProPosalMainDao;
import com.liu.dao.GuProPosalRiskDao;
import com.liu.pojo.GgRiskConfig;
import com.liu.pojo.GuProPosalMain;
import com.liu.pojo.GuProPosalRisk;
import com.liu.server.GuProPosalRiskServer;
import com.liu.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuProPosalRiskServerImpl implements GuProPosalRiskServer {

    @Autowired
    private GuProPosalRiskDao guProPosalRiskDao;

    @Autowired
    private GuProPosalMainDao guProPosalMainDao;

    @Autowired
    private GgRiskConfigDao ggRiskConfigDao;
    /**
     * 添加险种
     *
     * @param
     */
    @Override
    public int addGuProsalRisk(String proPosalNo,String riskCode) {
        //封装GuProPosalRisk
        GuProPosalRisk guProPosalRisk=new GuProPosalRisk();
        GuProPosalMain guProPosalMain = guProPosalMainDao.seGuProsalMain(proPosalNo);
        GgRiskConfig ggRiskConfig = ggRiskConfigDao.seGgRiskConfig(riskCode);

        guProPosalRisk.setProPosalNo(proPosalNo);
        guProPosalRisk.setRiskCode(riskCode);
        if(guProPosalMain.getIssueDate()!=null){
            guProPosalRisk.setStartDate(guProPosalMain.getIssueDate());
            guProPosalRisk.setEndDate(DateUtil.getDateEnd(guProPosalMain.getIssueDate()));
        }
        if(ggRiskConfig!=null){
            guProPosalRisk.setRiskCname(ggRiskConfig.getConfigCname());

        }
        guProPosalRisk.setSumGrossPremium(1232.00);

        int result=guProPosalRiskDao.addGuProsalRisk(guProPosalRisk);

        return result;
    }

    /**
     * 险种表查询
     *
     * @param proPosalNo
     */
    @Override
    public GuProPosalRisk seGuProPosalRisk(String proPosalNo) {
        GuProPosalRisk guProPosalRisk=null;
        if(proPosalNo!=null && !"".equals(proPosalNo)){
            guProPosalRisk=guProPosalRiskDao.seGuProPosalRisk(proPosalNo);
            return  guProPosalRisk;
        }
        return guProPosalRisk;
    }
}
