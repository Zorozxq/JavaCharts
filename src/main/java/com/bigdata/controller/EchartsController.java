package com.bigdata.controller;

import com.bigdata.entity.NewStudent;
import com.bigdata.entity.sorceResult;
import com.bigdata.service.NewStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elric on 2017/7/6.
 */
@Controller
public class EchartsController {
    @Autowired
    private NewStudentInfoService newStudentInfoService;


    @RequestMapping(value = "/getPieCharts")
    public String getPieCharts() {
        return "PieCharts";
    }

    @RequestMapping(value = "/getMyCharts")
    public String getmyCharts() {
        return "myecharts";
    }




    @RequestMapping(value = "/hello")
    @ResponseBody
    public List<NewStudent> page() {
        List<NewStudent> newStudents = newStudentInfoService.getAllStudent();
        System.out.println(newStudents.size());
        return newStudents;
    }

    @RequestMapping(value = "/getScore")
    @ResponseBody
    public List<Integer> getScore() {
        List<NewStudent> newStudents = newStudentInfoService.getAllStudent();
        List<Integer> scores = null;
        for (NewStudent newStudent : newStudents) {
            scores.add(newStudent.getScore());
        }
        return scores;
    }

    @RequestMapping(value = "/getData")
    @ResponseBody
    public List<sorceResult> getData() {
        List<NewStudent> students = newStudentInfoService.getAllStudent();
        List<sorceResult> results = new ArrayList<sorceResult>();
        for (NewStudent newStudent : students) {
            //把学生的成绩和姓名封装到一个result
            sorceResult result = new sorceResult(newStudent.getScore(), newStudent.getName());
            results.add(result);
        }
        return results;
    }
}
