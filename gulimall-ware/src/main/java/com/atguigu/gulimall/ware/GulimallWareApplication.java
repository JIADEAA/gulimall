package com.atguigu.gulimall.ware;

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
public class GulimallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallWareApplication.class,args);
    }
}
