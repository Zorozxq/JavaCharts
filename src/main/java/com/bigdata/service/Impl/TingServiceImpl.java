package com.bigdata.service.Impl;

import com.bigdata.dao.TingCityDao;
import com.bigdata.dao.TingDao;
import com.bigdata.dao.TingGenderDao;
import com.bigdata.dao.TingSightDao;
import com.bigdata.entity.Ting;
import com.bigdata.entity.TingCity;
import com.bigdata.entity.TingGender;
import com.bigdata.entity.TingSight;
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

    @Autowired
    private TingGenderDao tingGenderDao;

    @Autowired
    private TingSightDao tingSightDao;

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

    public List<Ting> getTotalInfo() {
        return tingDao.selectAll();
    }

    public List<TingGender> getGenderInfo() {
        return tingGenderDao.getGenderInfo();
    }

    public List<TingSight> getSightInfo() {
        return tingSightDao.getSightInfo();
    }


}
