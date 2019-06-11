package com.stylefeng.guns.rest;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication(scanBasePackages = {"com.stylefeng.guns"})
<<<<<<< HEAD:guns-gateway/src/main/java/com/stylefeng/guns/rest/GunsGatewayApplication.java
public class GunsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GunsGatewayApplication.class, args);
=======
public class Gateway {

    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
>>>>>>> 35898e4528e131008ff88cbe13daa8a1ca8b3a97:guns-gateway/src/main/java/com/stylefeng/guns/rest/Gateway.java
    }
}
