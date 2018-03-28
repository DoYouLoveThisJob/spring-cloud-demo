package com.example.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {
    @Value("${server.port}")
    String  port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name ){
        return "hi "+name+",i am from port:"+port;
    }

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        Thread.sleep(5000L);
        String services = "Services: " + port;
        System.out.println(services);
        return services;
    }
}
