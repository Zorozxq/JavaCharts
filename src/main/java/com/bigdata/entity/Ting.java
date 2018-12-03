package com.bigdata.entity;

import java.math.BigInteger;

public class Ting {


    private Integer id;
    private BigInteger playTotalCount; //播放次数
    private BigInteger userTotalCount; //用户总数
    private Double averagePlayTime; //平均播放时间
    private Double maxPlayTime; //播放次数最多时长
//    private String cityName;//城市名
//    private Integer cityplayCount;//本市播放次数
//    private Integer cityUserCount;//本市用户数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getCityName() {
//        return cityName;
//    }
//
//    public void setCityName(String cityName) {
//        this.cityName = cityName;
//    }
//
//    public Integer getCityplayCount() {
//        return cityplayCount;
//    }
//
//    public void setCityplayCount(Integer cityplayCount) {
//        this.cityplayCount = cityplayCount;
//    }
//
//    public Integer getCityUserCount() {
//        return cityUserCount;
//    }
//
//    public void setCityUserCount(Integer cityUserCount) {
//        this.cityUserCount = cityUserCount;
//    }

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
