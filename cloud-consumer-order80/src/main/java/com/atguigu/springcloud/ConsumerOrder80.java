package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder80.class, args);
        System.out.println("启动成功");
        System.out.println("master");
        System.out.println("hot-fix");
        System.out.println("push test");
        System.out.println("push test2");
        System.out.println("push test3");
    }

}
