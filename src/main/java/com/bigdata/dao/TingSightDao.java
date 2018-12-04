package com.bigdata.dao;

import com.bigdata.entity.TingSight;

import java.util.List;

public interface TingSightDao {
    /**
     * 景点类别统计
     */
    List<TingSight> getSightInfo();
}
