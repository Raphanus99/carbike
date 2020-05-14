package com.liu.springmvcbike;

import com.liu.dao.GuProPosalItemkindDao;
import com.liu.dao.GuProPosalItemmotorDao;
import com.liu.dao.GuProPosalMainDao;
import com.liu.dao.GuProPosalRelatedPartyDao;
import com.liu.pojo.GuProPosalItemkind;
import com.liu.pojo.GuProPosalItemmotor;
import com.liu.pojo.GuProPosalMain;
import com.liu.pojo.GuProPosalRelatedParty;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringmvcbikeApplicationTests {

    @Autowired
    GuProPosalMainDao guProPosalMainDao;

    @Autowired
    GuProPosalRelatedPartyDao guProPosalRelatedPartyDao;

    @Test
    void contextLoads() {
        /**
         * 测试投保单主表插入数据库
         */
        GuProPosalMain guProPosalMain=new GuProPosalMain();
//        五个数据
        guProPosalMain.setPolicyNo("1");

        guProPosalMain.setIssueDate(new Date());
        guProPosalMain.setBusinessChannel("11");
        guProPosalMain.setBusinessSource("直销");
        guProPosalMain.setRiskCode("200");
        guProPosalMainDao.addGuProPosalMain(guProPosalMain);
    }

    @Test
    void secontextLoads(){
        System.out.println(guProPosalMainDao.seGuProsalMain("20787308032001000"));
    }

    @Test
    void relatedPatry(){
        GuProPosalRelatedParty guProPosalRelatedParty=new GuProPosalRelatedParty();
        guProPosalRelatedParty.setProPosalNo("9878977");
        guProPosalRelatedParty.setInsuredCode("89098");
        guProPosalRelatedParty.setIdentifyNumber("8907687");
        guProPosalRelatedParty.setInsuredAddress("深圳龙华");
        guProPosalRelatedParty.setInsuredName("刘升城");
        guProPosalRelatedParty.setSex("男");
        guProPosalRelatedPartyDao.addGuProPosalRelatedParty(guProPosalRelatedParty);
    }

    @Test
    void seRelatedPatry(){

        GuProPosalRelatedParty guProPosalRelatedParty=guProPosalRelatedPartyDao.seGuProPosalRelatedParty("2027970803200000001");
        System.out.println(guProPosalRelatedParty);
    }
    @Autowired
    private GuProPosalItemmotorDao guProPosalItemmotorDao;

    @Test
    void seGuProPosalItemmotor(){
    GuProPosalItemmotor guProPosalItemmotor=guProPosalItemmotorDao.seGuProPosalItemmotor("1213");
    System.out.println(guProPosalItemmotor);
    }

    @Test
    void addGuProPosalItemmotor(){
        GuProPosalItemmotor guProPosalItemmotor=new GuProPosalItemmotor();
        guProPosalItemmotor.setProPosalNo("1213");
        guProPosalItemmotor.setEngine("jk7890");
        guProPosalItemmotor.setErrDate(new Date());
        guProPosalItemmotor.setLicenNo("uiuui");
        guProPosalItemmotor.setVin("sadf");


        guProPosalItemmotorDao.addGuProPosalItemmotor(guProPosalItemmotor);

    }

    @Autowired
    GuProPosalItemkindDao guProPosalItemkindDao;
    @Test
    void addGuItemkind(){
        GuProPosalItemkind guProPosalItemkind=new GuProPosalItemkind();
        guProPosalItemkind.setProPosalNo("32432");
        guProPosalItemkind.setItemCode("3242");
        guProPosalItemkind.setItemNo(32);
        guProPosalItemkind.setRiskCode("342");
        guProPosalItemkind.setKindName("342");
        guProPosalItemkind.setStartDate(new Date());
        guProPosalItemkind.setEndDate(new Date());
        List<GuProPosalItemkind> list=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            System.out.println("----+++++++++++++++++++++++++++++++++++++++++");

            guProPosalItemkindDao.addGuProPosalItemkind(list.get(i));

            System.out.println("----+++++++++++++++++++++++++++++++++++++++++");
        }

    }

}
