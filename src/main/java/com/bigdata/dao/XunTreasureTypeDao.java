package com.bigdata.dao;

import com.bigdata.entity.XunTreasureType;

import java.util.List;

public interface XunTreasureTypeDao {

    /**
     * 宝藏类型统计
     */
    List<XunTreasureType> getTreasureTypeInfo();
}
