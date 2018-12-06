package com.bigdata.entity;

import java.util.Date;

public class Cang {
    private Integer cangId;

    private Integer cangTreasureCnt;  //藏宝次数

    private Integer cangTreasureUserCnt;  //藏用户数

    private Integer cangPointCnt;  //藏积分

    private Double cangMoneyCnt;   //藏金钱

    private Date date;

    public Integer getCangId() {
        return cangId;
    }

    public void setCangId(Integer cangId) {
        this.cangId = cangId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
