package com.beifeng.hadoop.spring.cloud.consumer.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerFeignController {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerFeignController.class);

    @Autowired
    IHiService hiService;
    
    @Autowired
    IConsumerRibbonService consumerRibbonService;
    
    @RequestMapping("hi")
    public String hi() {
        String response=hiService.info()+" feign";
        logger.info(response);
        return response;
    }
    
    @RequestMapping("hello")
    public String hello() {
        String response=consumerRibbonService.hello()+" feign";
        logger.info(response);
        return response;
    }
}
