package com.bigdata.controller;

import cn.hutool.core.date.DateUtil;
import com.bigdata.dao.CangCityDao;
import com.bigdata.dao.CangDao;
import com.bigdata.dao.CangTreasureTypeDao;
import com.bigdata.dao.CangTreasureTypePmDao;
import com.bigdata.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cang")
public class CangController {

    @Autowired
    private CangDao cangDao;

    @Autowired
    private CangCityDao cangCityDao;

    @Autowired
    private CangTreasureTypeDao cangTreasureTypeDao;

    @Autowired
    private CangTreasureTypePmDao cangTreasureTypePmDao;


    @ResponseBody
    @RequestMapping
    public ModelAndView playTotalCount() {
        ModelMap params = new ModelMap();
        Integer treasureCount = cangDao.getTreasureCount();
        Integer treasureUserCount = cangDao.getTreasureUserCount();
        Integer treasurePointCount = cangDao.getTreasurePointCount();
        Double  treasureMoneyCount = cangDao.getTreasureMoneyCount();
        params.addAttribute("treasureCount", treasureCount);
        params.addAttribute("treasureUserCount", treasureUserCount);
        params.addAttribute("treasurePointCount", treasurePointCount);
        params.addAttribute("treasureMoneyCount",treasureMoneyCount);
        ModelAndView modelAndView = new ModelAndView("cang", params);
        return modelAndView;
    }

    /**
     * 藏：总变化图
     * 只显示最近7天的数据
     * @return
     */
    @RequestMapping(value = "/totalInfo")
    @ResponseBody
    public List<List<String>> getTotalInfo() {
        List<Cang> totalInfo = cangDao.selectAll();
        List<List<String>> result = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        List<String> cangTreasureCntList = new ArrayList<>();
        List<String> cangTreasureUserCntList = new ArrayList<>();
        List<String> cangPointList = new ArrayList<>();
        List<String> cangMoneyList = new ArrayList<>();
        for (Cang cang : totalInfo) {
            timeList.add(DateUtil.formatDate(cang.getDate()));
            cangTreasureCntList.add(cang.getCangTreasureCnt().toString());
            cangTreasureUserCntList.add(cang.getCangTreasureUserCnt().toString());
            cangPointList.add(cang.getCangPointCnt().toString());
            cangMoneyList.add(cang.getCangMoneyCnt().toString());
        }

        result.add(timeList);
        result.add(cangTreasureCntList);
        result.add(cangTreasureUserCntList);
        result.add(cangPointList);
        result.add(cangMoneyList);

        return result;


    }
//    public List<Cang> getTotalInfo() {
//        List<Cang> totalInfo = cangDao.selectAll();
//        return totalInfo;
//    }


    /**
     * 藏：城市统计
     * @return
     */
    @RequestMapping(value = "/cityInfo")
    @ResponseBody
    public List<List<String>> getCityInfo(){
        List<CangCity> totalInfo = cangCityDao.getCityInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> cityName = new ArrayList<>();
        List<String> cangTreasureCntList = new ArrayList<>();
        List<String> cangTreasureUserCntList = new ArrayList<>();
        List<String> cangPointList = new ArrayList<>();
        List<String> cangMoneyList = new ArrayList<>();

        for (CangCity cangCity : totalInfo) {
            cityName.add(cangCity.getCity());
            cangTreasureCntList.add(cangCity.getCangTreasureCnt().toString());
            cangTreasureUserCntList.add(cangCity.getCangTreasureUserCnt().toString());
            cangPointList.add(cangCity.getCangPointCnt().toString());
            cangMoneyList.add(cangCity.getCangMoneyCnt().toString());

        }
        result.add(cityName);
        result.add(cangTreasureCntList);
        result.add(cangTreasureUserCntList);
        result.add(cangPointList);
        result.add(cangMoneyList);
        return result;

    }
//    public List<CangCity> getCityInfo() {
//        List<CangCity> cityInfo = cangCityDao.getCityInfo();
//        return cityInfo;
//    }


    /**
     * 藏：宝藏类型统计
     */
    @RequestMapping(value = "/treasureTypeInfo")
    @ResponseBody
    public List<List<String>> getTreasureTypeInfo(){
        List<CangTreasureType> treasureTypeInfo = cangTreasureTypeDao.getTreasureTypeInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> cangTreasureCntList = new ArrayList<>();
        List<String> cangTreasureTypeList = new ArrayList<>();
        for (CangTreasureType cangTreasureType : treasureTypeInfo) {
            cangTreasureTypeList.add(cangTreasureType.getTreasureType());
            cangTreasureCntList.add(cangTreasureType.getCangTreasureCnt().toString());
        }
        result.add(cangTreasureTypeList);
        result.add(cangTreasureCntList);
        return result;
    }

//    public List<CangTreasureType> getTreasureTypeInfo(){
//        List<CangTreasureType> treasureTypeInfo = cangTreasureTypeDao.getTreasureTypeInfo();
//        return treasureTypeInfo;
//    }

    /**
     * 藏：宝藏类型总数统计
     */
    @RequestMapping(value = "/treasureTypePmInfo")
    @ResponseBody
    public List<List<String>> getTreasureTypePmInfo(){
        List<CangTreasureTypePm> treasureTypePmInfo = cangTreasureTypePmDao.getTreasureTypePmInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> cangTreasureTypeList = new ArrayList<>();
        List<String> cangPointList = new ArrayList<>();
        List<String> cangMoneyList = new ArrayList<>();
        for (CangTreasureTypePm cangTreasureTypePm : treasureTypePmInfo) {
            cangTreasureTypeList.add(cangTreasureTypePm.getTreasureType());
            cangPointList.add(cangTreasureTypePm.getCangPointCnt().toString());
            cangMoneyList.add(cangTreasureTypePm.getCangMoneyCnt().toString());
        }
        result.add(cangTreasureTypeList);
        result.add(cangPointList);
        result.add(cangMoneyList);
        return result;
    }
//    public List<CangTreasureTypePm> getTreasureTypePmInfo(){
//        List<CangTreasureTypePm> treasureTypePmInfo = cangTreasureTypePmDao.getTreasureTypePmInfo();
//        return treasureTypePmInfo;
//    }




}
