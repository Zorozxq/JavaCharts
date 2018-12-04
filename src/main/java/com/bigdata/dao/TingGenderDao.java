package com.bigdata.dao;

import com.bigdata.entity.TingGender;
import java.util.List;

public interface TingGenderDao {

    /**
     * 性别统计图
     */
    List<TingGender> getGenderInfo();
}
