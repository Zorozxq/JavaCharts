package com.bigdata.controller;


import com.bigdata.dao.TingCityDao;
import com.bigdata.dao.TingDao;
import com.bigdata.dao.TingGenderDao;
import com.bigdata.entity.*;
import com.bigdata.service.TingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ting")
public class TingController {

    @Autowired
    private TingService tingService;

    @Autowired
    private TingGenderDao tingGenderDao;


    @ResponseBody
    @RequestMapping
    public ModelAndView playTotalCount() {
        ModelMap params = new ModelMap();
        BigInteger playTotalCount = tingService.getPlayTotalCount();
        BigInteger userTotalCount = tingService.getUserTotalCount();
        Double averagePlayTime = tingService.getAveragePlayTime();
        Double maxPlayTime = tingService.getMaxPlayTime();
        params.addAttribute("playTotalCount", playTotalCount);
        params.addAttribute("userTotalCount", userTotalCount);
        params.addAttribute("averagePlayTime", averagePlayTime);
        params.addAttribute("maxPlayTime",maxPlayTime);
        ModelAndView modelAndView = new ModelAndView("ting", params);
        return modelAndView;
    }


    /**
     * 听：总变化图
     * @return
     */
    @RequestMapping(value = "/totalInfo")
    @ResponseBody
    public List<Ting> getTotalInfo() {
        List<Ting> totalInfo = tingService.getTotalInfo();
        return totalInfo;
    }


    /**
     * 听：性别统计图
     * @return
     */

    @RequestMapping(value = "/genderInfo")
    @ResponseBody
    public List<TingGender> getGenderInfo() {
        List<TingGender> genderInfo = tingService.getGenderInfo();
        return genderInfo;
    }


    /**
     * 听：城市统计
     * @return
     */
    @RequestMapping(value = "/cityInfo")
    @ResponseBody
    public List<TingCity> getCityInfo() {
        List<TingCity> cityInfo = tingService.getCityInfo();
        return cityInfo;
    }

    /**
     * 听：景点类别统计
     * @return
     */
    @RequestMapping(value = "/sightInfo")
    @ResponseBody
    public List<TingSight> getSightInfo() {
        List<TingSight> sightInfo = tingService.getSightInfo();
        return sightInfo;
    }




//    @ResponseBody
//    @RequestMapping
//    public String ting(Model model) {
//        int BoFangCount = 3000;
//        model.addAttribute("playTotalCount", BoFangCount);
//        return "ting";
//    }


}
