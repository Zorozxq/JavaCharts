package com.bigdata.controller;

import com.bigdata.dao.LiuCityDao;
import com.bigdata.dao.LiuDao;
import com.bigdata.dao.LiuGenderDao;
import com.bigdata.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/liu")
public class LiuController {


    @Autowired
    private LiuDao liuDao;

    @Autowired
    private LiuGenderDao liuGenderDao;

    @Autowired
    private LiuCityDao liuCityDao;

    @ResponseBody
    @RequestMapping
    public ModelAndView totalCount() {
        ModelMap params = new ModelMap();
        Integer liuTotalCount = liuDao.getLiuTotalCount();
        Integer liuUserCount = liuDao.getLiuUserCount();
        Double avgDuration = liuDao.getAvgDuration();
        Double maxDuration = liuDao.getMaxDuration();

        params.addAttribute("liuTotalCount", liuTotalCount);
        params.addAttribute("liuUserCount", liuUserCount);
        params.addAttribute("avgDuration", Double.parseDouble(String.format("%.2f", avgDuration)));
        params.addAttribute("maxDuration",Double.parseDouble(String.format("%.2f", maxDuration)));
        ModelAndView modelAndView = new ModelAndView("liu", params);
        return modelAndView;
    }


    /**
     * 留：总变化图
     * 只显示最近7天的数据
     * @return
     */
    @RequestMapping(value = "/totalInfo")
    @ResponseBody
    public List<Liu> getTotalInfo() {
        List<Liu> totalInfo = liuDao.getTotalInfo();
        return totalInfo;
    }


    /**
     * 留：性别统计图
     * @return
     */

    @RequestMapping(value = "/genderInfo")
    @ResponseBody
    public List<LiuGender> getGenderInfo() {
        List<LiuGender> genderInfo = liuGenderDao.getGenderInfo();
        return genderInfo;
    }

    /**
     * 留：城市统计
     */

    @RequestMapping(value = "/cityInfo")
    @ResponseBody
    public List<LiuCity> getCityInfo() {
        List<LiuCity> cityInfo = liuCityDao.getCityInfo();
        return cityInfo;
    }


}
