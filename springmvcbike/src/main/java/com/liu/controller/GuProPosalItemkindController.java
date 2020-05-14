package com.liu.controller;

import com.liu.pojo.*;
import com.liu.server.GgRiskConfigServer;
import com.liu.server.GuProPosalItemkindServer;
import com.liu.server.GuProPosalRelatedPartyServer;
import com.liu.server.GuProPosalRiskServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 险种页面
 */
@Controller
@RequestMapping("/itemkind")
public class GuProPosalItemkindController {

    @Autowired
    private GuProPosalRiskServer guProPosalRiskServer;

    @Autowired
    private GuProPosalRelatedPartyServer guProPosalRelatedPartyServer;

    @Autowired
    private GuProPosalItemkindServer guProPosalItemkindServer;

    @Autowired
    private GgRiskConfigServer ggRiskConfigServer;

    /**
     * 传过来投保单号还有险种代码
     * 跳转到itemding.html页面
     * @return
     */
    @RequestMapping("/itemkindManager")
    public ModelAndView itemkindManager(String posalNo,String code){
        ModelAndView mv=new ModelAndView();
        System.out.println(posalNo+"[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[");
        System.out.println(code+"]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
        //需要传递险种表所有信息
        GuProPosalRisk guProPosalRisk=guProPosalRiskServer.seGuProPosalRisk(posalNo);
        //得查投保人表信息
        GuProPosalRelatedParty guProPosalRelatedParty=guProPosalRelatedPartyServer.seGuProPosalRelatedParty(posalNo);
        System.out.println(guProPosalRelatedParty);
        System.out.println(guProPosalRisk+"=======================");

        mv.addObject("relatedParty",guProPosalRelatedParty);
        mv.addObject("guProPosalRisk",guProPosalRisk);
        mv.addObject("proPosalNo",posalNo);
        mv.addObject("riskCode",code);
        System.out.println(code+"----------------------到了险种页面了------------------------->");
        mv.setViewName("Itemkind");
        return mv;
    }
    /**
     * 第三个页面跳转到这里，把数据库落库（险别表，被保险人包）
     */
    @RequestMapping("/riskItemmotor")
    public ModelAndView riskItemmotor(GuProPosalItemkindList guProPosalItemkindList,
                                      String riskCode, String proPosalNo,
                                      GuProPosalRiskRelatedParty guProPosalRiskRelatedParty){
        ModelAndView mv=new ModelAndView();
        System.out.println(guProPosalItemkindList+"++++++++++++++++++++++++++++++++++");
        System.out.println(guProPosalRiskRelatedParty+"==========================");
        System.out.println(riskCode);
        System.out.println(proPosalNo+"..............................................");


        //调用险别表
       if(guProPosalItemkindList!=null){
           guProPosalItemkindServer.addGuProPosalItemkind(guProPosalItemkindList);
       }


        //调用被保险人表


        return mv;
    }
    /**
     * 点击菜单栏查询数据
     */
    @RequestMapping("/seItemkinds")
    public ModelAndView seItemkinds(String riskCode,String proPosalNo){
        System.out.println(riskCode+"::::::::::::::::");
        System.out.println(proPosalNo+"::::::::::::::::");

        ModelAndView mv=new ModelAndView();
        if(riskCode!=null && !"".equals(riskCode) && proPosalNo!=null && !"".equals(proPosalNo)){
            GuProPosalRisk guProPosalRisk=guProPosalRiskServer.seGuProPosalRisk(proPosalNo);

            //得查投保人表信息
            GuProPosalRelatedParty guProPosalRelatedParty=guProPosalRelatedPartyServer.seGuProPosalRelatedParty(proPosalNo);
            System.out.println(guProPosalRelatedParty);

            mv.addObject("relatedParty",guProPosalRelatedParty);
            mv.addObject("guProPosalRisk",guProPosalRisk);
            mv.addObject("riskCode",riskCode);
            mv.addObject("riskCname",guProPosalRisk.getRiskCname());
            mv.addObject("proPosalNo",proPosalNo);
        }else{
            GgRiskConfig ggRiskConfig=ggRiskConfigServer.seGgRiskConfig(riskCode);
            mv.addObject("riskCode",riskCode);
            mv.addObject("riskCname",ggRiskConfig.getConfigCname());
        }
        mv.setViewName("Itemkind");
        return mv;
    }

}
