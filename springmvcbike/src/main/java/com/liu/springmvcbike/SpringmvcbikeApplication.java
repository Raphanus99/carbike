package com.liu.springmvcbike;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.liu")
@MapperScan("com.liu.dao")
public class SpringmvcbikeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcbikeApplication.class, args);
    }

}
