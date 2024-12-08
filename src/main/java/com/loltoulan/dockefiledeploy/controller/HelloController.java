package com.loltoulan.dockefiledeploy.controller;

import com.loltoulan.dockefiledeploy.entty.DataInfoEntity;
import com.loltoulan.dockefiledeploy.service.DataInfoService;
import com.loltoulan.dockefiledeploy.utils.RedisClientUtil;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private RedisClientUtil redisClientUtil;

    @Autowired
    private DataInfoService dataInfoService;

    @RequestMapping("/world")
    public String hello(){
        Long hello = redisClientUtil.incr("hello");
        log.info("hello world {}", hello);
        return "hello world " + hello;
    }

    @GetMapping("/all")
    public ResponseEntity<List<DataInfoEntity>> queryById() {
        List<DataInfoEntity> body = dataInfoService.queryAll();
        return ResponseEntity.ok(body);
    }

}
