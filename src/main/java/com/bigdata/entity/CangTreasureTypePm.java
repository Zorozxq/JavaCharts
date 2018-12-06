package com.bigdata.entity;

public class CangTreasureTypePm {
    private Integer cangTreasureTypePmId;

    private Integer cangPointCnt;  //藏宝积分

    private Double cangMoneyCnt;  //藏宝金钱

    private String treasureType;  //宝藏类型

    public Integer getCangTreasureTypePmId() {
        return cangTreasureTypePmId;
    }

    public void setCangTreasureTypePmId(Integer cangTreasureTypePmId) {
        this.cangTreasureTypePmId = cangTreasureTypePmId;
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

    public String getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(String treasureType) {
        this.treasureType = treasureType;
    }
}
