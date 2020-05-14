package com.liu.controller;

import com.liu.pojo.GuProPosalMain;
import com.liu.pojo.GuProPosalRelatedParty;
import com.liu.server.GuProPosalMainServer;
import com.liu.server.GuProPosalRelatedPartyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/guproposalmain")
public class GuProPosalMainController {

    @Autowired
    private GuProPosalMainServer guProPosalMainServer;

    @Autowired
    private GuProPosalRelatedPartyServer guProPosalRelatedPartyServer;

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv=new ModelAndView();
        String configcode="200";
        String configcname="车损险";
        mv.addObject("riskCode",configcode);
        mv.addObject("configcname",configcname);
        mv.setViewName("base");
        return mv;
    }

    /**
     * 添加信息
     * @param guProPosalMain
     * @param guProPosalRelatedParty
     * @param riskCode
     * @return
     */
    @RequestMapping("/base")
    public ModelAndView base(GuProPosalMain guProPosalMain, GuProPosalRelatedParty guProPosalRelatedParty,String riskCode){
        ModelAndView mv=new ModelAndView();
        String proPosalNo=guProPosalMainServer.addGuProPosalMain(guProPosalMain,guProPosalRelatedParty);
        System.out.println("====================="+guProPosalMain.getPolicyNo()+"=======");
        System.out.println(riskCode+"==========================");
        mv.setViewName("/itemmotor/biao?proPosalNo="+proPosalNo+"&code="+riskCode);
        return mv;
    }

    /**
     * 查询投保单与投保人信息
     */
    @RequestMapping("/seBase")
    public ModelAndView seBase(String proPosalNo,String riskCode){
        ModelAndView mv=new ModelAndView();
        if(proPosalNo!=null && !"".equals(proPosalNo)){
            GuProPosalMain guProPosalMains = guProPosalMainServer.seGuProsalMain(proPosalNo);
            GuProPosalRelatedParty guProPosalRelatedParty = guProPosalRelatedPartyServer.seGuProPosalRelatedParty(proPosalNo);
            mv.addObject("guProPosalMains",guProPosalMains);
            mv.addObject("RelatedParty",guProPosalRelatedParty);
        }

        mv.addObject("riskCode",riskCode);
        mv.setViewName("base");
        
        return mv;
    }
}
