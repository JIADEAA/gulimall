package com.atguigu.gulimall.product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author JIADE
 * @description GulimallProductApplication
 * @date 2022/4/1 13:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class,args);
    }
}
