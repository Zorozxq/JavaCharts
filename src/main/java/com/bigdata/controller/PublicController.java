package com.bigdata.controller;

import com.bigdata.entity.NewStudent;
import com.bigdata.entity.sorceResult;
import com.bigdata.service.NewStudentInfoService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elric on 2017/7/6.
 */
@Controller
public class PublicController {
    @Autowired
    private NewStudentInfoService newStudentInfoService;

    @RequestMapping(value = "/index")
    public String getMyindex() {
        return "index";
    }

//    @RequestMapping(value = "/ting")
//    public String getItripting() {
//        return "ting";
//    }


//    @RequestMapping(value = "/xun")
//    public String getItripxun() {
//        return "xun";
//    }

//    @RequestMapping(value = "/cang")
//    public String getItripcang() {
//        return "cang";
//    }

//    @RequestMapping(value = "/liu")
//    public String getItripliu() {
//        return "liu";
//    }

    @RequestMapping(value = "/analyze")
    public String getItripanalyze() {
        return "analyze";
    }

    @RequestMapping(value = "/hello2")
    @ResponseBody
    public List<NewStudent> page() {
        List<NewStudent> newStudents = newStudentInfoService.getAllStudent();
        System.out.println(newStudents.size());
        return newStudents;
    }

//    @RequestMapping(value = "/ting")
//    @ResponseBody
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // TODO Auto-generated method stub
//        request.setCharacterEncoding("UTF-8");
//        request.setAttribute("BoFangCount", "3000");
//        request.getRequestDispatcher("ting.jsp").forward(request, response);
//    }

}
