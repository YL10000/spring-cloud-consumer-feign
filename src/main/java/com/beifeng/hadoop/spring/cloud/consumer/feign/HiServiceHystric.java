package com.beifeng.hadoop.spring.cloud.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class HiServiceHystric implements IHiService {

    //熔断后执行相应的方法
    public String info() {
        return "sorry info feign";
    }

    public String hi() {
        return "sorry hi feign";
    }
}
