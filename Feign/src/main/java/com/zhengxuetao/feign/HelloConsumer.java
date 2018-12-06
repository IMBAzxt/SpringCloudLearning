package com.zhengxuetao.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumer {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String helloFeign() {
        return helloService.hello();
    }
}
