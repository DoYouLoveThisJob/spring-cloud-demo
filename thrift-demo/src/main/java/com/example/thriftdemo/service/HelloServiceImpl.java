package com.example.thriftdemo.service;

import org.apache.thrift.TException;

public class HelloServiceImpl implements  Hello.Iface{
    @Override
    public String helloString(String para) throws TException {
        return "result:"+para;
    }
}
