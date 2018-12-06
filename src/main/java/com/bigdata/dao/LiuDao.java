package com.bigdata.dao;

import com.bigdata.entity.Liu;

import java.util.List;

public interface LiuDao {
    /**
     *获取留总次数
     * @return
     */
    Integer getLiuTotalCount();

    /**
     *获取留用户数
     * @return
     */
    Integer getLiuUserCount();

    /**
     *获取平均语音时长
     * @return
     */

    Double getAvgDuration();

    /**
     * 获取平均播放时长
     */

    Double getMaxDuration();

    /**
     * 总变化图
     */
    List<Liu> getTotalInfo();

}
