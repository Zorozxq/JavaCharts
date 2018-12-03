package com.bigdata.entity;

public class TingCity {

    private Integer id;
    private String cityName;//城市名
    private Integer cityplayCount;//本市播放次数
    private Integer cityUserCount;//本市用户数

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCityplayCount() {
        return cityplayCount;
    }

    public void setCityplayCount(Integer cityplayCount) {
        this.cityplayCount = cityplayCount;
    }

    public Integer getCityUserCount() {
        return cityUserCount;
    }

    public void setCityUserCount(Integer cityUserCount) {
        this.cityUserCount = cityUserCount;
    }

    @Override
    public String toString() {
        return "TingCity{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityplayCount=" + cityplayCount +
                ", cityUserCount=" + cityUserCount +
                '}';
    }
}
