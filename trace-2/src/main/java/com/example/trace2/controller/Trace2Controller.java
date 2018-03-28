package com.example.trace2.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Trace2Controller {
    private final Logger logger = Logger.getLogger(Trace2Controller.class);

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String tace(HttpServletRequest request){
        logger.info("===<call trace-2, TraceId="+request.getHeader("X-B3-TraceId")+", SpanId="+request.getHeader("X-B3-SpanId")+",ParentSpanId="+request.getHeader("X-B3-ParentSpanId")+">===");
        return "Trace";
    }
}
