package com.bigdata.dao;

import com.bigdata.entity.XunCity;

import java.util.List;

public interface XunCityDao {

    /**
     * 城市统计
     */
    List<XunCity> getCityInfo();
}
