package com.cago.controller;

import com.cago.mapper.StudentMapper;
import com.cago.model.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kevin on 2016/12/19.
 */
@Controller
public class TestController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping(value = "index.do")

    public void indexPage(){
        StudentEntity entity = studentMapper.getStudent("10000013");
        System.out.println("name:"+ entity.getStudentName());
    }
}
