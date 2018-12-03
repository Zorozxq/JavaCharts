package com.bigdata.dao;

import com.bigdata.entity.Ting;
import com.bigdata.entity.TingCity;

import java.util.List;

public interface TingCityDao {
    /**
     * 城市统计
     */
    List<TingCity> getCityInfo();

}
