package com.bigdata.controller;

import com.bigdata.entity.*;
import com.bigdata.service.XunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/xun")
public class XunController {

    @Autowired
    private XunService xunService;

    @ResponseBody
    @RequestMapping
    public ModelAndView TotalCount() {
        ModelMap params = new ModelMap();
        Integer xunTreasureCnt = xunService.getTreasureCount();
        Integer xunTreasureUserCnt = xunService.getTreasureUserCount();
        Integer xunPointCnt = xunService.getPointCount();
        Double xunMoneyCnt = xunService.getMoneyCount();
        Integer xunGuideCnt = xunService.getGuideCount();
        Integer xunGudieUserCnt = xunService.getGuideUserCount();

        params.addAttribute("xunTreasureCnt", xunTreasureCnt);
        params.addAttribute("xunTreasureUserCnt", xunTreasureUserCnt);
        params.addAttribute("xunPointCnt", xunPointCnt);
        params.addAttribute("xunMoneyCnt",xunMoneyCnt);
        params.addAttribute("xunGuideCnt",xunGuideCnt);
        params.addAttribute("xunGudieUserCnt",xunGudieUserCnt);
        ModelAndView modelAndView = new ModelAndView("xun", params);
        return modelAndView;
    }

    /**
     * 寻：总变化图
     * @return
     */
    @RequestMapping(value = "/totalInfo")
    @ResponseBody
    public List<Xun> getTotalInfo() {
        List<Xun> totalInfo = xunService.getTotalInfo();
        return totalInfo;
    }

    /**
     * 寻：城市统计
     * @return
     */
    @RequestMapping(value = "/cityInfo")
    @ResponseBody
    public List<XunCity> getCityInfo() {
        List<XunCity> cityInfo = xunService.getCityInfo();
        return cityInfo;
    }


    /**
     * 寻：宝藏类型统计
     * @return
     */
    @RequestMapping(value = "/treasureTypeInfo")
    @ResponseBody
    public List<XunTreasureType> getTreasureTypeInfo() {
        List<XunTreasureType> treasureTypeInfo = xunService.getTreasureTypeInfo();
        return treasureTypeInfo;
    }


    /**
     * 寻：景点类别寻导游统计
     * @return
     */
    @RequestMapping(value = "/SightGuideInfo")
    @ResponseBody
    public List<XunGuide> getSightGuideInfo() {
        List<XunGuide> sightGuideInfo = xunService.getGuideInfo();
        return sightGuideInfo;
    }



}
