package com.zhengxuetao.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer {

    @Autowired
    HelloService helloService;

    @GetMapping("hello")
    public String hello() {
//        return restTemplate.getForEntity("http://boot1/hello",String.class).getBody();
        return helloService.helloService();
    }
}
