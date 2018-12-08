package com.bigdata.entity;

import java.util.Date;

public class Analyze {


    private Integer id;
    private Double rechargeCnt; //总充值
    private Double withdrawCnt; //总提现
    private Integer totalPoint; //总积分
    private Double userMoney; //用户金钱
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getRechargeCnt() {
        return rechargeCnt;
    }

    public void setRechargeCnt(Double rechargeCnt) {
        this.rechargeCnt = rechargeCnt;
    }

    public Double getWithdrawCnt() {
        return withdrawCnt;
    }

    public void setWithdrawCnt(Double withdrawCnt) {
        this.withdrawCnt = withdrawCnt;
    }

    public Integer getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

    public Double getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(Double userMoney) {
        this.userMoney = userMoney;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
