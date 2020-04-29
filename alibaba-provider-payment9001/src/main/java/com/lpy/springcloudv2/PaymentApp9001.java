package com.lpy.springcloudv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lpy
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApp9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApp9001.class, args);
    }
}
