package com.denysdudka.spring.security.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public  String getInfoForAllEmps(){
        return "view_for_all_employees";
    }
    @GetMapping("/hr_info")
    public  String getInfoOnlyForHR(){
        return "view_for_HR";
    }
    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers(){
        return "view_for_Managers";
    }
}
