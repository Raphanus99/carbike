package com.liu.controller;

import com.liu.pojo.GuProPosalCanal;
import com.liu.server.GuProPosalCanalServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/canal")
public class GuProPosalCanalController {

    @Autowired
    private GuProPosalCanalServer guProPosalCanalServer;

    /**
     * 利用异步处理返回渠道号名称
     * @param
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/businessChannel")
    public Map<String,Object> regAdd(String businessChannel, HttpServletResponse response){
        Map<String,Object> result=new HashMap<String,Object>();
        GuProPosalCanal guProPosalCanal=guProPosalCanalServer.seGuProPosalCannal(businessChannel);
        if(guProPosalCanal!=null){
            result.put("flag",true);
            result.put("businessSource",guProPosalCanal.getBusinessSource());
        }else{
            result.put("flag",false);
            result.put("businessSource","");
        }
        return result;
    }
}
