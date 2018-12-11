package com.bigdata.controller;

import cn.hutool.core.date.DateUtil;
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

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public List<List<String>> getTotalInfo() {
        List<Liu> totalInfo = liuDao.getTotalInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        List<String> liuCntList = new ArrayList<>();
        List<String> liuUserCntList = new ArrayList<>();
        for (Liu liu : totalInfo) {
            timeList.add(DateUtil.formatDate(liu.getDate()));
            liuCntList.add(liu.getLiuCnt().toString());
            liuUserCntList.add(liu.getLiuUserCnt().toString());
        }
        result.add(timeList);
        result.add(liuCntList);
        result.add(liuUserCntList);
        return result;


    }
//    public List<Liu> getTotalInfo() {
//        List<Liu> totalInfo = liuDao.getTotalInfo();
//        return totalInfo;
//    }


    /**
     * 留：性别统计图
     * @return
     */

    @RequestMapping(value = "/genderInfo")
    @ResponseBody
    public List<List<String>> getGenderInfo() {
        List<LiuGender> genderInfo = liuGenderDao.getGenderInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        Set<String> ds = new HashSet<>();
        List<String> manCountList = new ArrayList<>();
        List<String> womanCountList = new ArrayList<>();
        List<String> avgCountList = new ArrayList<>();
        for (LiuGender liuGender : genderInfo) {
            if(!ds.contains(liuGender.getDate().toString())){
                ds.add(liuGender.getDate().toString());
                timeList.add(DateUtil.formatDate(liuGender.getDate()));
                avgCountList.add(liuGender.getAvgLiuCnt().toString());
            }
//            timeList.add(DateUtil.formatDate(liuGender.getDate()));
//            avgCountList.add(liuGender.getAvgLiuCnt().toString());
            if(liuGender.getGender().equals("男")){
                manCountList.add(liuGender.getLiuCnt().toString());
            }
            if(liuGender.getGender().equals("女")){
                womanCountList.add(liuGender.getLiuCnt().toString());
            }

        }

        result.add(timeList);
        result.add(manCountList);
        result.add(womanCountList);
        result.add(avgCountList);

        return result;

    }
//    public List<LiuGender> getGenderInfo() {
//        List<LiuGender> genderInfo = liuGenderDao.getGenderInfo();
//        return genderInfo;
//    }

    /**
     * 留：城市统计
     */

    @RequestMapping(value = "/cityInfo")
    @ResponseBody
    public List<List<String>> getCityInfo(){
        List<LiuCity> cityInfo = liuCityDao.getCityInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> liuCntList = new ArrayList<>();
        List<String> liuUserCntList = new ArrayList<>();
        List<String> cityNameList = new ArrayList<>();
        for (LiuCity liuCity : cityInfo) {
            cityNameList.add(liuCity.getCity());
            liuCntList.add(liuCity.getLiuCnt().toString());
            liuUserCntList.add(liuCity.getLiuUserCnt().toString());
        }
        result.add(cityNameList);
        result.add(liuCntList);
        result.add(liuUserCntList);
        return result;
    }
//    public List<LiuCity> getCityInfo() {
//        List<LiuCity> cityInfo = liuCityDao.getCityInfo();
//        return cityInfo;
//    }


}
