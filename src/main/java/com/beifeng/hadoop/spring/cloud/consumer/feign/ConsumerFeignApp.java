package com.beifeng.hadoop.spring.cloud.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//启用feign
@EnableHystrix
@EnableHystrixDashboard
public class ConsumerFeignApp {
    
    public static void main(String[] args) { 
        SpringApplication.run(ConsumerFeignApp.class, args);
    }
    
        
}
