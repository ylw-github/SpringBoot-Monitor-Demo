package com.ylw.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {


    @RequestMapping("/method1")
    public String method1() {
        return "method1";
    }

    @RequestMapping("/method2")
    public String method2() {
        return "method1";
    }

    @RequestMapping("/method3")
    public String method3() {
        return "method1";
    }



}
