package com.ylw.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class MonitorApp {

    public static void main(String[] args) {
        SpringApplication.run(MonitorApp.class, args);
    }
}
