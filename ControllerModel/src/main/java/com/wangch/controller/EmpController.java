package com.wangch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("连接成功！");
        return "success";
    }
}
