package com.bigdata.service.Impl;

import com.bigdata.dao.newStudentInfoDao;
import com.bigdata.entity.NewStudent;
import com.bigdata.service.NewStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Elric on 2017/7/6.
 */
@Service
public class NewStudentInfoServiceImpl implements NewStudentInfoService {
    @Autowired
    private newStudentInfoDao studentInfoDao;
    public List<NewStudent> getAllStudent() {
        return studentInfoDao.getAllStudent();
    }
}
