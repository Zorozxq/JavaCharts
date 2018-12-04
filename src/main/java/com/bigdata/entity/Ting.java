package com.bigdata.entity;

import java.math.BigInteger;
import java.util.Date;

public class Ting {


    private Integer id;
    private BigInteger playTotalCount; //播放次数
    private BigInteger userTotalCount; //用户总数
    private Double averagePlayTime; //平均播放时间
    private Double maxPlayTime; //播放次数最多时长
    private Date date;  //日期

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAveragePlayTime() {
        return averagePlayTime;
    }

    public void setAveragePlayTime(Double averagePlayTime) {
        this.averagePlayTime = averagePlayTime;
    }

    public Double getMaxPlayTime() {
        return maxPlayTime;
    }

    public void setMaxPlayTime(Double maxPlayTime) {
        this.maxPlayTime = maxPlayTime;
    }

    public BigInteger getPlayTotalCount() {
        return playTotalCount;
    }

    public void setPlayTotalCount(BigInteger playTotalCount) {
        this.playTotalCount = playTotalCount;
    }

    public BigInteger getUserTotalCount() {
        return userTotalCount;
    }

    public void setUserTotalCount(BigInteger userTotalCount) {
        this.userTotalCount = userTotalCount;
    }


}
