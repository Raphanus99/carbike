package com.liu.controller;

import com.liu.pojo.GuProPosalItemmotor;
import com.liu.pojo.GuProPosalRelatedParty;
import com.liu.server.GuProPosalItemmotorServer;
import com.liu.server.GuProPosalRelatedPartyServer;
import com.liu.server.GuProPosalRiskServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/itemmotor")
public class GuProPosalItemmotorController {

    @Autowired
    private GuProPosalRelatedPartyServer guProPosalRelatedPartyServer;

    @Autowired
    private GuProPosalItemmotorServer itemmotorServer;

    @Autowired
    private GuProPosalRiskServer guProPosalRiskServer;

    /**
     * 添加数据
     * @param proPosalNo
     * @param code
     * @return
     */
    @RequestMapping("/biao")
    public ModelAndView biao(String proPosalNo,String code){
        ModelAndView mv=new ModelAndView();
        if(proPosalNo!=null || !"".equals(proPosalNo)){
            mv.addObject("proPosalNo",proPosalNo);

            /**
             * 还得调用投保人信息，并放到request对象中
             */
            GuProPosalRelatedParty relatedParty=guProPosalRelatedPartyServer.seGuProPosalRelatedParty(proPosalNo);
            mv.addObject("relatedParty",relatedParty);

            System.out.println("==============>>>>   "+proPosalNo+"===================>>>  "+code);

        }
        mv.addObject("proPosalNo",proPosalNo);
        mv.addObject("riskCode",code);


        System.out.println(code+"{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{");

        mv.setViewName("biao");
        return mv;

    }

    /**
     * 转到itemkind页面
     * @param guProPosalItemmotor
     * @param proPosalNo
     * @param riskCode
     * @return
     */
    @RequestMapping("/carManager")
    public ModelAndView carManager(GuProPosalItemmotor guProPosalItemmotor,String proPosalNo,String riskCode){
        ModelAndView mv=new ModelAndView();
        /**
         * 添加车的信息，并且传入险种代码
         */
        System.out.println(proPosalNo+">>>>>>>>>>>>>>>>>>>>>>+++++++++++++++++"+riskCode);
        if(riskCode!=null && !"".equals(riskCode) && proPosalNo!=null && !"".equals(proPosalNo)){
            int reriskItemmotorlute = itemmotorServer.addGuProPosalItemmotor(guProPosalItemmotor);
            //调用险种表插入数据
            guProPosalRiskServer.addGuProsalRisk(proPosalNo,riskCode);

            mv.setViewName("/itemkind/itemkindManager?posalNo="+proPosalNo+"&code="+riskCode);
            System.out.println("lllllllllllllllll            "+proPosalNo+"="+riskCode);
        }else {

            System.out.println("表的信息弄完+++++++++++++++++++++++++++++++++++++=");

            mv.addObject("proPosalNo", proPosalNo);
            mv.addObject("riskCode", riskCode);
            mv.setViewName("biao");
        }

        return mv;

    }


    /**
     * 根据保单号查询车的信息
     */
    @RequestMapping("/seItemmotor")
    public ModelAndView seItemmotor(String riskCode,String proPosalNo){
        ModelAndView mv=new ModelAndView();
        if(proPosalNo!=null && !"".equals(proPosalNo)){
            GuProPosalItemmotor itemmotor=itemmotorServer.seGuProPosalItemmotor(proPosalNo);
            mv.addObject("itemmotor",itemmotor);
            System.out.println("有投保单号："+proPosalNo+"         险种号："+riskCode+"==================");

            GuProPosalRelatedParty relatedParty=guProPosalRelatedPartyServer.seGuProPosalRelatedParty(proPosalNo);
            mv.addObject("relatedParty",relatedParty);

            System.out.println("==============>>>>   "+proPosalNo+"===================>>>");


        }
        mv.addObject("proPosalNo",proPosalNo);
        mv.addObject("riskCode",riskCode);
        mv.setViewName("biao");
        return mv;


    }
}
