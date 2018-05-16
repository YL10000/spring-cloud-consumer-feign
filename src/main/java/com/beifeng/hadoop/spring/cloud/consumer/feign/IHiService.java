package com.beifeng.hadoop.spring.cloud.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@FeignClient(value="service-hi",fallback=HiServiceHystric.class)//指定调用哪个服务提供者，指定熔断后的执行的类
public interface IHiService {
    
    @RequestMapping(value="/hi",method=RequestMethod.GET)//指定调用服务提供者的哪个接口
    String info();
}
