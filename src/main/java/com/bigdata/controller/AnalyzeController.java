package com.bigdata.controller;


import com.bigdata.dao.AnalyzeDao;
import com.bigdata.entity.Analyze;
import com.bigdata.entity.Cang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/analyze")
public class AnalyzeController {

    @Autowired
    private AnalyzeDao analyzeDao;

    @ResponseBody
    @RequestMapping
    public ModelAndView totalCount() {
        ModelMap params = new ModelMap();
        Double rechargeCount = analyzeDao.getRechargeCount();
        Double withdrawCount = analyzeDao.getWithdrawCount();
        Integer totalPointCount = analyzeDao.getTotalPointCount();
        Double userMoneyCount = analyzeDao.getUserMoneyCount();
        params.addAttribute("rechargeCount", rechargeCount);
        params.addAttribute("withdrawCount", withdrawCount);
        params.addAttribute("totalPointCount", totalPointCount);
        params.addAttribute("userMoneyCount",userMoneyCount);
        ModelAndView modelAndView = new ModelAndView("analyze", params);
        return modelAndView;
    }

    /**
     * 用户分析：总变化图
     * 只显示最近7天的数据
     * @return
     */
    @RequestMapping(value = "/totalInfo")
    @ResponseBody
    public List<Analyze> getTotalInfo() {
        List<Analyze> totalInfo = analyzeDao.getAllInfo();
        return totalInfo;
    }

    /**
     * 用户分析：按月份统计2018年信息
     * @return
     */
    @RequestMapping(value = "/monthInfo")
    @ResponseBody
    public List<Analyze> getMonthAllInfo() {
        List<Analyze> monthAllInfo = analyzeDao.getMonthAllInfo();
        return monthAllInfo;
    }



}
