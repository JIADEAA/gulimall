package com.atguigu.gulimall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author JIADE
 * @description GulimallCouponApplication
 * @date 2022/4/1 13:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class,args);
    }
}
