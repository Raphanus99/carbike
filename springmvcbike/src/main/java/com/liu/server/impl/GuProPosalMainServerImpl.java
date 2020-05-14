package com.liu.server.impl;

import com.liu.dao.GuProPosalMainDao;
import com.liu.dao.GuProPosalRelatedPartyDao;
import com.liu.pojo.GuProPosalMain;
import com.liu.pojo.GuProPosalRelatedParty;
import com.liu.server.GuProPosalMainServer;
import com.liu.utils.DateUtil;
import com.liu.utils.IncrementUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class GuProPosalMainServerImpl implements GuProPosalMainServer {

    @Autowired
    private GuProPosalMainDao guProPosalMainDao;

    @Autowired
    private GuProPosalRelatedPartyDao guProPosalRelatedPartyDao;


    public static volatile Integer flag=100000;
    /**
     * 投保单
     *
     * @param guProPosalMain
     */
    @Override
    public String addGuProPosalMain(GuProPosalMain guProPosalMain,
                                 GuProPosalRelatedParty guProPosalRelatedParty) {
        //添加保单主表,传递过来有险种代码，渠道号码，以及渠道名称
        //配置保单号
        SimpleDateFormat sdf = new SimpleDateFormat("yy");
        StringBuffer str = new StringBuffer(sdf.format(new Date()).toString());
        if(",".equals(guProPosalMain.getPolicyNo())|| "".equals(guProPosalMain.getPolicyNo()) || guProPosalMain.getPolicyNo()=="" || guProPosalMain.getPolicyNo()==null) {

            Random random = new Random();
            int n = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
//            int flag = this.flag + 1;

            str = str.append(n)
                    .append("0803")
                    .append(guProPosalMain.getRiskCode())
                    .append(IncrementUtil.getPoPosalNo("",IncrementUtil.newEquipmentNo));

            guProPosalMain.setPolicyNo(new String(str));

            System.out.println("投保单号："+str);

            //添加保险人
            guProPosalRelatedParty.setProPosalNo(new String(str));

            guProPosalRelatedParty.setInsuredCode(IncrementUtil.getNewEquipmentNo("00",IncrementUtil.newEquipmentNo));

            //对签单时间调整
            Date date=DateUtil.getDateflog(guProPosalMain.getIssueDate());
            guProPosalMain.setIssueDate(date);
            System.out.println(str.toString());
            int relute=guProPosalMainDao.addGuProPosalMain(guProPosalMain);
            int result=guProPosalRelatedPartyDao.addGuProPosalRelatedParty(guProPosalRelatedParty);

            return guProPosalMain.getPolicyNo();
        }

        System.out.println("主投保单："+guProPosalMain+"======================");
        System.out.println("投保人信息："+guProPosalRelatedParty+"======================");

        /**
         * 添加到数据库中，这里因为没有从数据库表中获取投保人代码，所以会有点问题，删除数据库中的数据就好
         */


        return str.toString();

    }

    /**
     * 根据投保单来查询
     *
     * @param proPosalNo
     */
    @Override
    public GuProPosalMain seGuProsalMain(String proPosalNo) {
        GuProPosalMain guProPosalMain = guProPosalMainDao.seGuProsalMain(proPosalNo);
        return guProPosalMain;
    }

    /**
     * 根据投保单号来修改
     *
     * @param proPosalNo
     */
    @Override
    public int updateGuProPosalMain(String proPosalNo) {
        return 0;
    }

    /**
     * 根据投保单号来删除
     *
     * @param proPosalNo
     */
    @Override
    public int deleteGuProPosalMain(String proPosalNo) {
        return 0;
    }
}
