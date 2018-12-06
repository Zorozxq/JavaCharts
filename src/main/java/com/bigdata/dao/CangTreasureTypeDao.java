package com.bigdata.dao;

import com.bigdata.entity.CangTreasureType;

import java.util.List;

public interface CangTreasureTypeDao {

    /**
     * 获取藏宝类型统计
     * @return
     */
    List<CangTreasureType> getTreasureTypeInfo();
}
