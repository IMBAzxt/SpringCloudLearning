package com.zhengxuetao.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("boot1")
public interface HelloService {

    @GetMapping("/hello")
    String hello();
}
