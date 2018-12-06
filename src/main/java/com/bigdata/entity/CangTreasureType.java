package com.bigdata.entity;

public class CangTreasureType {
    private Integer cangTreasureTypeId;

    private Integer cangTreasureCnt;  //寻宝次数

    private String treasureType;  //宝藏类型

    public Integer getCangTreasureTypeId() {
        return cangTreasureTypeId;
    }

    public void setCangTreasureTypeId(Integer cangTreasureTypeId) {
        this.cangTreasureTypeId = cangTreasureTypeId;
    }

    public Integer getCangTreasureCnt() {
        return cangTreasureCnt;
    }

    public void setCangTreasureCnt(Integer cangTreasureCnt) {
        this.cangTreasureCnt = cangTreasureCnt;
    }

    public String getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(String treasureType) {
        this.treasureType = treasureType;
    }
}
