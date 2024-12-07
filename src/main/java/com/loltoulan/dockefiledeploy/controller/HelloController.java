package com.loltoulan.dockefiledeploy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/world")
    public String hello(){
        log.info("hello world");
        return "hello world";
    }

}
