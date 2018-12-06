package com.bigdata.dao;


import com.bigdata.entity.Cang;
import com.bigdata.entity.Ting;

import java.util.List;

public interface CangDao {
    /**
     * 获取藏次数
     * @return
     */
    Integer getTreasureCount();

    /**
     * 获取藏用户数
     * @return
     */
    Integer getTreasureUserCount();


    /**
     * 获取藏积分
     * @return
     */
    Integer getTreasurePointCount();

    /**
     * 获取藏金钱
     * @return
     */
    Double getTreasureMoneyCount();

    /**
     * 总变化图
     */
    List<Cang> selectAll();


}
