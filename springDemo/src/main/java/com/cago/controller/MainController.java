package com.cago.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kevin on 2016/12/10.
 */
/*

 */
@Controller
public class MainController {
    @RequestMapping(value = "/",method = RequestMethod.GET)

    public String index(){
        return "index";
    }
}
