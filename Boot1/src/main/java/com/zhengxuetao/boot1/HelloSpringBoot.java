package com.zhengxuetao.boot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloSpringBoot {

    private final Logger logger = Logger.getLogger(String.valueOf(Boot1Application.class));


    @GetMapping("/hello")
    public String sayHello() {
        logger.info("say something");
        return "hello spring boot";
    }
}
