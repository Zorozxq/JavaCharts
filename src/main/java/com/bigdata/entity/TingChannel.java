package com.bigdata.entity;

public class TingChannel {

    private Integer tingChannelId;

    private String channel;  //景点类型

    private Integer tingCnt; //播放次数

    private Integer tingUserCnt; //用户总数

    public Integer getTingChannelId() {
        return tingChannelId;
    }

    public void setTingChannelId(Integer tingChannelId) {
        this.tingChannelId = tingChannelId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
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
