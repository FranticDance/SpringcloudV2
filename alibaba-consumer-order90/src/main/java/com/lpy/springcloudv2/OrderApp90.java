package com.lpy.springcloudv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lpy
 * @version 1.0
 * @date 2020/4/29 21:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApp90 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp90.class, args);
    }
}
