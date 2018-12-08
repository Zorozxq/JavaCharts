package com.bigdata.entity;

import java.time.Month;
import java.util.Date;

public class AnalyzeMonth {

    private Double monthRechargeCnt; //总充值
    private Double monthWithdrawCnt; //总提现
    private Integer monthTotalPoint; //总积分
    private Double monthUserMoney; //用户金钱

    private Integer monthId;

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public Double getMonthRechargeCnt() {
        return monthRechargeCnt;
    }

    public void setMonthRechargeCnt(Double monthRechargeCnt) {
        this.monthRechargeCnt = monthRechargeCnt;
    }

    public Double getMonthWithdrawCnt() {
        return monthWithdrawCnt;
    }

    public void setMonthWithdrawCnt(Double monthWithdrawCnt) {
        this.monthWithdrawCnt = monthWithdrawCnt;
    }

    public Integer getMonthTotalPoint() {
        return monthTotalPoint;
    }

    public void setMonthTotalPoint(Integer monthTotalPoint) {
        this.monthTotalPoint = monthTotalPoint;
    }

    public Double getMonthUserMoney() {
        return monthUserMoney;
    }

    public void setMonthUserMoney(Double monthUserMoney) {
        this.monthUserMoney = monthUserMoney;
    }


}
