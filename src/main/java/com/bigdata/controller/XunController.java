package com.bigdata.controller;

import cn.hutool.core.date.DateUtil;
import com.bigdata.entity.*;
import com.bigdata.service.XunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
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
     * 只显示最近7天的数据
     * @return
     */
    @RequestMapping(value = "/totalInfo")
    @ResponseBody
    public List<List<String>> getTotalInfo() {
        List<Xun> totalInfo = xunService.getTotalInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> xunTreasureCntList = new ArrayList<>();
        List<String> xunTreasureUserCntList = new ArrayList<>();
        List<String> xunPointCntList = new ArrayList<>();
        List<String> xunMoneyCntList = new ArrayList<>();
        List<String> xunGuideCntList = new ArrayList<>();
        List<String> xunGudieUserCntList = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        for (Xun xun : totalInfo) {
            timeList.add(DateUtil.formatDate(xun.getDate()));
            xunTreasureCntList.add(xun.getXunTreasureCnt().toString());
            xunTreasureUserCntList.add(xun.getXunTreasureUserCnt().toString());
            xunPointCntList.add(xun.getXunPointCnt().toString());
            xunMoneyCntList.add(xun.getXunMoneyCnt().toString());
            xunGuideCntList.add(xun.getXunGuideCnt().toString());
            xunGudieUserCntList.add(xun.getXunGudieUserCnt().toString());

        }

        result.add(timeList);
        result.add(xunTreasureCntList);
        result.add(xunTreasureUserCntList);
        result.add(xunPointCntList);
        result.add(xunMoneyCntList);
        result.add(xunGuideCntList);
        result.add(xunGudieUserCntList);

        return result;
    }
//    public List<Xun> getTotalInfo() {
//        List<Xun> totalInfo = xunService.getTotalInfo();
//        return totalInfo;
//    }

    /**
     * 寻：城市统计
     * @return
     */
    @RequestMapping(value = "/cityInfo")
    @ResponseBody
    public List<List<String>> getCityInfo(){
        List<XunCity> cityInfo = xunService.getCityInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> xunCityNmame = new ArrayList<>();
        List<String> xunTreasureCntList = new ArrayList<>();
        List<String> xunTreasureUserCntList = new ArrayList<>();
        List<String> xunPointCntList = new ArrayList<>();
        List<String> xunMoneyCntList = new ArrayList<>();
        List<String> xunGuideCntList = new ArrayList<>();
        List<String> xunGudieUserCntList = new ArrayList<>();
        for (XunCity xunCity : cityInfo) {
            xunCityNmame.add(xunCity.getCity());
            xunTreasureCntList.add(xunCity.getXunTreasureCnt().toString());
            xunTreasureUserCntList.add(xunCity.getXunTreasureUserCnt().toString());
            xunPointCntList.add(xunCity.getXunPointCnt().toString());
            xunMoneyCntList.add(xunCity.getXunMoneyCnt().toString());
            xunGuideCntList.add(xunCity.getXunGuideCnt().toString());
            xunGudieUserCntList.add(xunCity.getXunGudieUserCnt().toString());

        }

        result.add(xunCityNmame);
        result.add(xunTreasureCntList);
        result.add(xunTreasureUserCntList);
        result.add(xunPointCntList);
        result.add(xunMoneyCntList);
        result.add(xunGuideCntList);
        result.add(xunGudieUserCntList);
        return result;

    }
//    public List<XunCity> getCityInfo() {
//        List<XunCity> cityInfo = xunService.getCityInfo();
//        return cityInfo;
//    }


    /**
     * 寻：宝藏类型统计
     * @return
     */
    @RequestMapping(value = "/treasureTypeInfo")
    @ResponseBody
    public List<List<String>> getTreasureTypeInfo(){
        List<XunTreasureType> treasureTypeInfo = xunService.getTreasureTypeInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> xunTreasureCntList = new ArrayList<>();
        List<String> xunTreasureUserCntList = new ArrayList<>();
        List<String> xunPointCntList = new ArrayList<>();
        List<String> xunMoneyCntList = new ArrayList<>();
        for (XunTreasureType xunTreasureType : treasureTypeInfo) {
            xunTreasureCntList.add(xunTreasureType.getTreasureType());
            xunTreasureUserCntList.add(xunTreasureType.getXunTreasureUserCnt().toString());
            xunPointCntList.add(xunTreasureType.getXunPointCnt().toString());
            xunMoneyCntList.add(xunTreasureType.getXunMoneyCnt().toString());
        }
        result.add(xunTreasureCntList);
        result.add(xunTreasureUserCntList);
        result.add(xunPointCntList);
        result.add(xunMoneyCntList);

        return result;

    }
//    public List<XunTreasureType> getTreasureTypeInfo() {
//        List<XunTreasureType> treasureTypeInfo = xunService.getTreasureTypeInfo();
//        return treasureTypeInfo;
//    }


    /**
     * 寻：景点类别寻导游统计
     * @return
     */
    @RequestMapping(value = "/sightGuideInfo")
    @ResponseBody
    public List<List<String>> getSightGuideInfo(){
        List<List<String>> result = new ArrayList<>();
        List<XunGuide> sightGuideInfo = xunService.getGuideInfo();
        List<String> xunGuideCntList = new ArrayList<>();
        List<String> channelNameList = new ArrayList<>();
        for (XunGuide xunGuide : sightGuideInfo) {
            channelNameList.add(xunGuide.getChannelName());
            xunGuideCntList.add(xunGuide.getXunGuideCnt().toString());
        }
        result.add(channelNameList);
        result.add(xunGuideCntList);
        return result;
    }
//    public List<XunGuide> getSightGuideInfo() {
//        List<XunGuide> sightGuideInfo = xunService.getGuideInfo();
//        return sightGuideInfo;
//    }



}
