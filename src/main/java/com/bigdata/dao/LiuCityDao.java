package com.bigdata.dao;

import com.bigdata.entity.LiuCity;

import java.util.List;

public interface LiuCityDao {
    /**
     * 城市统计
     */
    List<LiuCity> getCityInfo();
}
