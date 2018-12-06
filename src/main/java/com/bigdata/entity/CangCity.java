package com.bigdata.entity;

public class CangCity {
    private Integer cangCityId;

    private Integer cangTreasureCnt; //藏宝次数

    private Integer cangTreasureUserCnt;  //藏宝用户数

    private Integer cangPointCnt; //寻宝积分

    private Double cangMoneyCnt; //寻宝金钱

    private String city;

    public Integer getCangCityId() {
        return cangCityId;
    }

    public void setCangCityId(Integer cangCityId) {
        this.cangCityId = cangCityId;
    }

    public Integer getCangTreasureCnt() {
        return cangTreasureCnt;
    }

    public void setCangTreasureCnt(Integer cangTreasureCnt) {
        this.cangTreasureCnt = cangTreasureCnt;
    }

    public Integer getCangTreasureUserCnt() {
        return cangTreasureUserCnt;
    }

    public void setCangTreasureUserCnt(Integer cangTreasureUserCnt) {
        this.cangTreasureUserCnt = cangTreasureUserCnt;
    }

    public Integer getCangPointCnt() {
        return cangPointCnt;
    }

    public void setCangPointCnt(Integer cangPointCnt) {
        this.cangPointCnt = cangPointCnt;
    }

    public Double getCangMoneyCnt() {
        return cangMoneyCnt;
    }

    public void setCangMoneyCnt(Double cangMoneyCnt) {
        this.cangMoneyCnt = cangMoneyCnt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
