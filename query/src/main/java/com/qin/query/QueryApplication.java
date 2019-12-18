package com.qin.query;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.qin.query.dao")
@ComponentScan(basePackages = {"com.qin"})
public class QueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueryApplication.class, args);
    }

}
