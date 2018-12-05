package com.bigdata.service;

import com.bigdata.entity.Xun;
import com.bigdata.entity.XunCity;
import com.bigdata.entity.XunGuide;
import com.bigdata.entity.XunTreasureType;

import java.util.List;

public interface XunService {

    Integer getTreasureCount();

    Integer getTreasureUserCount();

    Integer getPointCount();

    Double getMoneyCount();

    Integer getGuideCount();

    Integer getGuideUserCount();

    /**
     * 寻宝统计
     */
    List<Xun> getTotalInfo();

    /**
     * 城市统计
     */
    List<XunCity> getCityInfo();

    /**
     * 宝藏类型统计
     */
    List<XunTreasureType> getTreasureTypeInfo();


    /**
     * 景点类别寻导游统计
     */
    List<XunGuide> getGuideInfo();
}
