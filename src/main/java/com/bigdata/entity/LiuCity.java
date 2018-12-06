package com.bigdata.entity;

public class LiuCity {
    private Integer liuCityId;

    private Integer liuCnt;  //留次数

    private Integer liuUserCnt;   //留用户总数

    private String city;  //城市

    public Integer getLiuCityId() {
        return liuCityId;
    }

    public void setLiuCityId(Integer liuCityId) {
        this.liuCityId = liuCityId;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
