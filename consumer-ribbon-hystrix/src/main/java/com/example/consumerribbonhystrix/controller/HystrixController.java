package com.example.consumerribbonhystrix.controller;

import com.example.consumerribbonhystrix.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HystrixController {
    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value="/hi")
    public String hi(@RequestParam String name){
        return consumerService.consumer(name);
    }

    @RequestMapping(value="/dc")
    public String dc(){
        return consumerService.dc();
    }


}
