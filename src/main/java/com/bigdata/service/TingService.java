package com.bigdata.service;

import com.bigdata.entity.*;

import java.math.BigInteger;
import java.util.List;

public interface TingService {
    BigInteger getPlayTotalCount();

    BigInteger getUserTotalCount();

    Double getAveragePlayTime();

    Double getMaxPlayTime();

    /**
     * 城市统计图
     */

    List<TingCity> getCityInfo();

    /**
     * 听：总体变化图
     * @return
     */
    List<Ting> getTotalInfo();

    /**
     * 性别统计图
     */
    List<TingGender> getGenderInfo();

    /**
     * 景点统计图
     */
    List<TingSight> getSightInfo();

    /**
     * 播放最多语音统计
     */
    List<TingChannel> getChannelInfo();
}
