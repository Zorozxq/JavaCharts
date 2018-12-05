package com.bigdata.entity;

public class XunGuide {

    private Integer xunGuideId;

    private Integer xunGuideCnt; //寻导游次数

    private Integer xunGudieUserCnt;  //寻导游用户数

    private String channelId;   //宝藏类别

    private String channelName;  //宝藏名称

    public Integer getXunGuideId() {
        return xunGuideId;
    }

    public void setXunGuideId(Integer xunGuideId) {
        this.xunGuideId = xunGuideId;
    }

    public Integer getXunGuideCnt() {
        return xunGuideCnt;
    }

    public void setXunGuideCnt(Integer xunGuideCnt) {
        this.xunGuideCnt = xunGuideCnt;
    }

    public Integer getXunGudieUserCnt() {
        return xunGudieUserCnt;
    }

    public void setXunGudieUserCnt(Integer xunGudieUserCnt) {
        this.xunGudieUserCnt = xunGudieUserCnt;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
