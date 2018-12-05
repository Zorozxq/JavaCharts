package com.bigdata.entity;

public class XunTreasureType {
    private Integer xunTreasureTypeId;

    private Integer xunTreasureCnt;  //寻宝次数

    private Integer xunTreasureUserCnt;  //寻宝用户数

    private Integer xunPointCnt;  //寻宝积分

    private Double xunMoneyCnt;  //寻宝金钱

    private String treasureType; //宝藏类型

    public Integer getXunTreasureTypeId() {
        return xunTreasureTypeId;
    }

    public void setXunTreasureTypeId(Integer xunTreasureTypeId) {
        this.xunTreasureTypeId = xunTreasureTypeId;
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

    public String getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(String treasureType) {
        this.treasureType = treasureType;
    }
}
