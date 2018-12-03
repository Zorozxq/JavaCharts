package com.bigdata.dao;

import com.bigdata.entity.Ting;
import com.bigdata.entity.TingCity;

import java.math.BigInteger;
import java.util.List;

public interface TingDao {

    /**
     * 获取播放总次数
     * @return
     */
    BigInteger getPlayTotalCount();

    /**
     * 获取用户总人数
     * @return
     */
    BigInteger getUserTotalCount();

    /**
     * 平均播放时长
     * @return
     */
    Double getAveragePlayTime();

    /**
     * 播放次数最多时长
     */
    Double getMaxPlayTime();

}
