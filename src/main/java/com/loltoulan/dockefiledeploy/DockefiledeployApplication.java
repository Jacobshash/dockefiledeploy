package com.loltoulan.dockefiledeploy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.loltoulan.dockefiledeploy.mapper")
public class DockefiledeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockefiledeployApplication.class, args);
    }

}
