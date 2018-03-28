package com.example.eurekaconsumerfeign.controller;

import com.example.eurekaconsumerfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignService feignService;
    @GetMapping("/feign")
    public String hi(@RequestParam String name) {
        return feignService.consumer(name);
    }

    @GetMapping("/test")
    public String test() {
        return feignService.test();
    }
}
