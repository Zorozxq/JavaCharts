package com.bigdata.dao;

import com.bigdata.entity.Analyze;
import com.bigdata.entity.AnalyzeMonth;
import com.bigdata.entity.Cang;

import java.util.List;

public interface AnalyzeDao {

    /**
     * 获取总充值金额
     * @return
     */
    Double getRechargeCount();

    /**
     * 获取总提现
     * @return
     */
    Double getWithdrawCount();

    /**
     * 获取总积分
     * @return
     */
    Integer getTotalPointCount();

    /**
     * 获取用户金钱
     * @return
     */
    Double getUserMoneyCount();

    /**
     * 总变化图
     */
    List<Analyze> getAllInfo();

    /**
     * 根据月份统计
     */
    List<AnalyzeMonth> getMonthAllInfo();


}
