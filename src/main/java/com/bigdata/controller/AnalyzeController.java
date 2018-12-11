package com.bigdata.controller;


import cn.hutool.core.date.DateUtil;
import com.bigdata.dao.AnalyzeDao;
import com.bigdata.entity.Analyze;
import com.bigdata.entity.AnalyzeMonth;
import com.bigdata.entity.Cang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
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
    public List<List<String>> getTotalInfo() {
        List<Analyze> totalInfo = analyzeDao.getAllInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> rechargeCntList = new ArrayList<>();
        List<String> withdrawCntList = new ArrayList<>();
        List<String> totalPointList = new ArrayList<>();
        List<String> userMoneyList = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        for (Analyze analyze : totalInfo) {
            timeList.add(DateUtil.formatDate(analyze.getDate()));
            rechargeCntList.add(analyze.getRechargeCnt().toString());
            withdrawCntList.add(analyze.getWithdrawCnt().toString());
            totalPointList.add(analyze.getTotalPoint().toString());
            userMoneyList.add(analyze.getUserMoney().toString());
        }

        result.add(timeList);
        result.add(rechargeCntList);
        result.add(withdrawCntList);
        result.add(totalPointList);
        result.add(userMoneyList);
        return result;



    }
//    public List<Analyze> getTotalInfo() {
//        List<Analyze> totalInfo = analyzeDao.getAllInfo();
//        return totalInfo;
//    }

    /**
     * 用户分析：按月份统计2018年信息
     * @return
     */

    @RequestMapping(value = "/monthInfo")
    @ResponseBody
    public List<List<String>> getMonthAllInfo(){
        List<AnalyzeMonth> monthAllInfo = analyzeDao.getMonthAllInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> rechargeMonthCntList = new ArrayList<>();
        List<String> withdrawMonthCntList = new ArrayList<>();
        List<String> totalPointMonthList = new ArrayList<>();
        List<String> userMoneyMonthList = new ArrayList<>();
        List<String> month = new ArrayList<>();
        for (AnalyzeMonth analyzeMonth : monthAllInfo) {
            month.add(analyzeMonth.getMonthId().toString());
            rechargeMonthCntList.add(analyzeMonth.getMonthRechargeCnt().toString());
            withdrawMonthCntList.add(analyzeMonth.getMonthWithdrawCnt().toString());
            totalPointMonthList.add(analyzeMonth.getMonthTotalPoint().toString());
            userMoneyMonthList.add(analyzeMonth.getMonthUserMoney().toString());
        }
        result.add(month);
        result.add(rechargeMonthCntList);
        result.add(withdrawMonthCntList);
        result.add(totalPointMonthList);
        result.add(userMoneyMonthList);
        return result;

    }
//    public List<Analyze> getMonthAllInfo() {
//        List<Analyze> monthAllInfo = analyzeDao.getMonthAllInfo();
//        return monthAllInfo;
//    }



}
