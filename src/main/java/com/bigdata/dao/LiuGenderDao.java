package com.bigdata.dao;

import com.bigdata.entity.LiuGender;
import com.bigdata.entity.TingGender;

import java.util.List;

public interface LiuGenderDao {

    /**
     * 性别统计图
     */
    List<LiuGender> getGenderInfo();
}
