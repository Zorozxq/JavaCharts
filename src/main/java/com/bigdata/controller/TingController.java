package com.bigdata.controller;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
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
import java.util.*;

@Controller
@RequestMapping("/ting")
public class TingController {

    @Autowired
    private TingService tingService;

    @Autowired
    private TingGenderDao tingGenderDao;

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
     * 只显示最近7天的数据
     * @return
     */
    @RequestMapping(value = "/totalInfo")
    @ResponseBody
    public List<List<String>> getTotalInfo() {
        List<Ting> totalInfo = tingService.getTotalInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        List<String> userCountList = new ArrayList<>();
        List<String> playCountList = new ArrayList<>();
        for (Ting info : totalInfo) {
            timeList.add(DateUtil.formatDate(info.getDate()));
            userCountList.add(info.getUserTotalCount().toString());
            playCountList.add(info.getPlayTotalCount().toString());
        }

        result.add(timeList);
        result.add(userCountList);
        result.add(playCountList);

        return result;
    }


    /**
     * 听：性别统计图
     * @return
     */

    @RequestMapping(value = "/genderInfo")
    @ResponseBody
    public List<List<String>> getGenderInfo() {
        List<TingGender> genderInfo = tingService.getGenderInfo();
        List<List<String>> result = new ArrayList<>();
        List<String> timeList = new ArrayList<>();
        Set<String> ds = new HashSet<>();
        List<String> manCountList = new ArrayList<>();
        List<String> womanCountList = new ArrayList<>();
        List<String> avgCountList = new ArrayList<>();

        for (TingGender info : genderInfo) {
           if(!ds.contains(info.getDate().toString())){
               ds.add(info.getDate().toString());
               timeList.add(DateUtil.formatDate(info.getDate()));
               avgCountList.add(info.getAvgTingCnt().toString());
           }
            if(info.getGender().equals("男")){
                manCountList.add(info.getTingCnt().toString());
            }

            if(info.getGender().equals("女")){
                womanCountList.add(info.getTingCnt().toString());
            }

        }

        result.add(timeList);
        result.add(manCountList);
        result.add(womanCountList);
        result.add(avgCountList);

        return result;


        //return genderInfo;
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

    /**
     * 听：播放最多语音统计
     * @return
     */
    @RequestMapping(value = "/ChannelInfo")
    @ResponseBody
    public List<TingChannel> getChannelInfo() {
        List<TingChannel> channelInfo = tingService.getChannelInfo();
        return channelInfo;
    }




//    @ResponseBody
//    @RequestMapping
//    public String ting(Model model) {
//        int BoFangCount = 3000;
//        model.addAttribute("playTotalCount", BoFangCount);
//        return "ting";
//    }


}
