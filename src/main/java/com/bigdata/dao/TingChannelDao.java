package com.bigdata.dao;

import com.bigdata.entity.TingChannel;

import java.util.List;

public interface TingChannelDao {

    /**
     * 播放最多语音统计
     * @return
     */
    List<TingChannel> getChannelInfo();
}
