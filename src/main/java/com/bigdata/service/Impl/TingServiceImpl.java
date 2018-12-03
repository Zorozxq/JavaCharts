package com.bigdata.service.Impl;

import com.bigdata.dao.TingCityDao;
import com.bigdata.dao.TingDao;
import com.bigdata.entity.Ting;
import com.bigdata.entity.TingCity;
import com.bigdata.service.TingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class TingServiceImpl implements TingService {
    @Autowired
    private TingDao tingDao;

    @Autowired
    private TingCityDao tingCityDao;

    public BigInteger getPlayTotalCount() {
        return tingDao.getPlayTotalCount();
    }

    public BigInteger getUserTotalCount() {
        return tingDao.getUserTotalCount();
    }

    public Double getAveragePlayTime() {
        Double averagePlayTime = tingDao.getAveragePlayTime();
        return Double.parseDouble(String.format("%.2f", averagePlayTime));
    }

    public Double getMaxPlayTime() {
        Double maxPlayTime = tingDao.getMaxPlayTime();
        return Double.parseDouble(String.format("%.2f", maxPlayTime));
    }


    public List<TingCity> getCityInfo() {
        return tingCityDao.getCityInfo();
    }

}
