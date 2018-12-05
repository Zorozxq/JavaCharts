package com.bigdata.dao;


import com.bigdata.entity.Xun;

import java.util.List;

public interface XunDao {

    /**
     *获取寻宝次数
     * @return
     */
    Integer getTreasureCount();

    /**
     *寻宝用户数
     * @return
     */
    Integer getTreasureUserCount();

    /**
     *寻宝积分
     * @return
     */
    Integer getPointCount();

    /**
     *寻宝金钱
     * @return
     */
    Double getMoneyCount();

    /**
     *寻导游次数
     * @return
     */
    Integer getGuideCount();

    /**
     *寻导游用户
     * @return
     */
    Integer getGuideUserCount();

    /**
     * 寻宝统计
     */
    List<Xun> selectAll();

}
