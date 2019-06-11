package com.stylefeng.guns.rest;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubboConfiguration
@SpringBootApplication(scanBasePackages = {"com.stylefeng.guns"})
public class GunsOrder {

    public static void main(String[] args) {
        SpringApplication.run(GunsOrder.class, args);
    }
}
