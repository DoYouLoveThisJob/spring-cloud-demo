package com.example.eurekaconsumerfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sinaif-splitter-web", fallback = HystrixFeignServiceCallback.class)
public interface FeignService {

    @GetMapping("/hi")
    String consumer(@RequestParam(value = "name") String name);

    /**
     * @return
     */
    @RequestMapping(value = "/splitter/test")
    public String test();
}
