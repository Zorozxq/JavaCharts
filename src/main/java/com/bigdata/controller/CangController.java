package com.bigdata.controller;

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
    public List<Cang> getTotalInfo() {
        List<Cang> totalInfo = cangDao.selectAll();
        return totalInfo;
    }


    /**
     * 藏：城市统计
     * @return
     */
    @RequestMapping(value = "/cityInfo")
    @ResponseBody
    public List<CangCity> getCityInfo() {
        List<CangCity> cityInfo = cangCityDao.getCityInfo();
        return cityInfo;
    }


    /**
     * 藏：宝藏类型统计
     */
    @RequestMapping(value = "/treasureTypeInfo")
    @ResponseBody
    public List<CangTreasureType> getTreasureTypeInfo(){
        List<CangTreasureType> treasureTypeInfo = cangTreasureTypeDao.getTreasureTypeInfo();
        return treasureTypeInfo;
    }

    /**
     * 藏：宝藏类型总数统计
     */
    @RequestMapping(value = "/treasureTypePmInfo")
    @ResponseBody
    public List<CangTreasureTypePm> getTreasureTypePmInfo(){
        List<CangTreasureTypePm> treasureTypePmInfo = cangTreasureTypePmDao.getTreasureTypePmInfo();
        return treasureTypePmInfo;
    }




}
