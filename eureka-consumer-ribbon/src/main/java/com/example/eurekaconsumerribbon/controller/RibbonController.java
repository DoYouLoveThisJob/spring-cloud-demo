package com.example.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/ribbon")
    public String hi(@RequestParam String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name="+name, String.class);
    }
}
