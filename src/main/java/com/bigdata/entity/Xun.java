package com.bigdata.entity;

import java.util.Date;

public class Xun {

    private Integer xunId;

    private Integer xunTreasureCnt;  //寻宝次数

    private Integer xunTreasureUserCnt; //寻宝用户数

    private Integer xunPointCnt;   //寻宝积分

    private Double xunMoneyCnt;   //寻宝金钱

    private Integer xunGuideCnt;  //寻导游次数

    private Integer xunGudieUserCnt;  //寻导游用户

    private Date date;   //日期

    public Integer getXunId() {
        return xunId;
    }

    public void setXunId(Integer xunId) {
        this.xunId = xunId;
    }

    public Integer getXunTreasureCnt() {
        return xunTreasureCnt;
    }

    public void setXunTreasureCnt(Integer xunTreasureCnt) {
        this.xunTreasureCnt = xunTreasureCnt;
    }

    public Integer getXunTreasureUserCnt() {
        return xunTreasureUserCnt;
    }

    public void setXunTreasureUserCnt(Integer xunTreasureUserCnt) {
        this.xunTreasureUserCnt = xunTreasureUserCnt;
    }

    public Integer getXunPointCnt() {
        return xunPointCnt;
    }

    public void setXunPointCnt(Integer xunPointCnt) {
        this.xunPointCnt = xunPointCnt;
    }

    public Double getXunMoneyCnt() {
        return xunMoneyCnt;
    }

    public void setXunMoneyCnt(Double xunMoneyCnt) {
        this.xunMoneyCnt = xunMoneyCnt;
    }

    public Integer getXunGuideCnt() {
        return xunGuideCnt;
    }

    public void setXunGuideCnt(Integer xunGuideCnt) {
        this.xunGuideCnt = xunGuideCnt;
    }

    public Integer getXunGudieUserCnt() {
        return xunGudieUserCnt;
    }

    public void setXunGudieUserCnt(Integer xunGudieUserCnt) {
        this.xunGudieUserCnt = xunGudieUserCnt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
