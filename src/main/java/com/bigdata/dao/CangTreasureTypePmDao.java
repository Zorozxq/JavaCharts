package com.bigdata.dao;

import com.bigdata.entity.CangTreasureTypePm;

import java.util.List;

public interface CangTreasureTypePmDao {

    /**
     * 宝藏类型总数统计
     * @return
     */
    List<CangTreasureTypePm> getTreasureTypePmInfo();
}
