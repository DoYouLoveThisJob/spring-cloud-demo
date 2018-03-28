package com.example.eurekaconsumerfeign.service;




import org.springframework.stereotype.Component;



@Component
public class HystrixFeignServiceCallback implements FeignService {


    @Override
    public String consumer(String name) {
        return null;
    }

    @Override
    public String test() {
        return null;
    }
}
