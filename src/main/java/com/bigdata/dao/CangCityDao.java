package com.bigdata.dao;


import com.bigdata.entity.CangCity;

import java.util.List;

public interface CangCityDao {

    /**
     * 城市统计
     */
    List<CangCity> getCityInfo();

}
