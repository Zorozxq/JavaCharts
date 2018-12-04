package com.bigdata.entity;

public class TingSight {

    private Integer tingSightId;
    private String sightName;  //景点名
    private Integer tingCnt;  //播放次数
    private Integer tingUserCnt; //用户访问数


    public Integer getTingSightId() {
        return tingSightId;
    }

    public void setTingSightId(Integer tingSightId) {
        this.tingSightId = tingSightId;
    }

    public String getSightName() {
        return sightName;
    }

    public void setSightName(String sightName) {
        this.sightName = sightName;
    }

    public Integer getTingCnt() {
        return tingCnt;
    }

    public void setTingCnt(Integer tingCnt) {
        this.tingCnt = tingCnt;
    }

    public Integer getTingUserCnt() {
        return tingUserCnt;
    }

    public void setTingUserCnt(Integer tingUserCnt) {
        this.tingUserCnt = tingUserCnt;
    }

}
