package com.bigdata.service;

import com.bigdata.entity.Ting;
import com.bigdata.entity.TingCity;

import java.math.BigInteger;
import java.util.List;

public interface TingService {
    BigInteger getPlayTotalCount();

    BigInteger getUserTotalCount();

    Double getAveragePlayTime();

    Double getMaxPlayTime();

    List<TingCity> getCityInfo();
//   List<Ting> getCityInfo();
}
