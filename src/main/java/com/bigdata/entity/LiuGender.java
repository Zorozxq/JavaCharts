package com.bigdata.entity;

import java.util.Date;

public class LiuGender {
    private Integer liuGenderId;

    private String gender;  //播报人性别

    private Integer liuCnt; //留次数

    private Integer liuUserCnt;  //留用户总数

    private Date date;
    private Double avgLiuCnt;  //平均数


    public Double getAvgLiuCnt() {
        return avgLiuCnt;
    }

    public void setAvgLiuCnt(Double avgLiuCnt) {
        this.avgLiuCnt = avgLiuCnt;
    }


    public Integer getLiuGenderId() {
        return liuGenderId;
    }

    public void setLiuGenderId(Integer liuGenderId) {
        this.liuGenderId = liuGenderId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
