package com.bigdata.service.Impl;

import com.bigdata.dao.XunCityDao;
import com.bigdata.dao.XunDao;
import com.bigdata.dao.XunGuideDao;
import com.bigdata.dao.XunTreasureTypeDao;
import com.bigdata.entity.Xun;
import com.bigdata.entity.XunCity;
import com.bigdata.entity.XunGuide;
import com.bigdata.entity.XunTreasureType;
import com.bigdata.service.XunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XunServiceImpl implements XunService {

    @Autowired
    private XunDao xunDao;

    @Autowired
    private XunCityDao xunCityDao;

    @Autowired
    private XunTreasureTypeDao xunTreasureTypeDao;

    @Autowired
    private XunGuideDao xunGuideDao;


    public Integer getTreasureCount() {
        return xunDao.getTreasureCount();
    }

    public Integer getTreasureUserCount() {
        return xunDao.getTreasureUserCount();
    }

    public Integer getPointCount() {
        return xunDao.getPointCount();
    }

    public Double getMoneyCount() {
        return xunDao.getMoneyCount();
    }

    public Integer getGuideCount() {
        return xunDao.getGuideCount();
    }

    public Integer getGuideUserCount() {
        return xunDao.getGuideUserCount();
    }

    public List<Xun> getTotalInfo() {
        return xunDao.selectAll();
    }

    public List<XunCity> getCityInfo() {
        return xunCityDao.getCityInfo();
    }

    public List<XunTreasureType> getTreasureTypeInfo() {
        return xunTreasureTypeDao.getTreasureTypeInfo();
    }

    public List<XunGuide> getGuideInfo() {
        return xunGuideDao.getGuideInfo();
    }


}
