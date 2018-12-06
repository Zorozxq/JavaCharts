package com.bigdata.entity;

import java.util.Date;

public class Liu {
    private Integer liuId;

    private Integer liuCnt;  //留次数

    private Integer liuUserCnt;  //留用户总数

    private Double avgDuration;  //平均留时间

    private Double maxDuration;  //留语音时长最多时段

    private Date date;

    public Integer getLiuId() {
        return liuId;
    }

    public void setLiuId(Integer liuId) {
        this.liuId = liuId;
    }

    public Integer getLiuCnt() {
        return liuCnt;
    }

    public void setLiuCnt(Integer liuCnt) {
        this.liuCnt = liuCnt;
    }

    public Integer getLiuUserCnt() {
        return liuUserCnt;
    }

    public void setLiuUserCnt(Integer liuUserCnt) {
        this.liuUserCnt = liuUserCnt;
    }

    public Double getAvgDuration() {
        return avgDuration;
    }

    public void setAvgDuration(Double avgDuration) {
        this.avgDuration = avgDuration;
    }

    public Double getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(Double maxDuration) {
        this.maxDuration = maxDuration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
