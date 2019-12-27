package com.hospital.purchase.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mycontroller {
    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }
}
