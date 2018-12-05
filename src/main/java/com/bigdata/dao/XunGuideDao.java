package com.bigdata.dao;

import com.bigdata.entity.XunGuide;

import java.util.List;

public interface XunGuideDao {

    /**
     * 景点类别寻导游统计
     */
    List<XunGuide> getGuideInfo();
}
