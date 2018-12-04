package com.bigdata.entity;

public class TingGender {

    private Integer id;
    private String gender;  //语音播报人性别
    private Integer tingCnt; //播放次数
    private Integer tingUserCnt; //用户总数
    private String date; //日期
    private Double avgTingCnt; //平均播报次数

    public Double getAvgTingCnt() {
        return avgTingCnt;
    }

    public void setAvgTingCnt(Double avgTingCnt) {
        this.avgTingCnt = avgTingCnt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
