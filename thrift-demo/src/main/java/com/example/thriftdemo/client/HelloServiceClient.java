package com.example.thriftdemo.client;


import com.example.thriftdemo.service.Hello;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class HelloServiceClient {
    public static void main(String[] args){
        System.out.println("客户端开启.....");
        TTransport tTransport = null;
        try {
            tTransport = new TSocket("localhost",9898,30000);
            TProtocol protocol = new TBinaryProtocol(tTransport);
            Hello.Client client = new Hello.Client(protocol);
            tTransport.open();
            String result = client.helloString("hello world");
            System.out.println(result);
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }finally {
            if(null !=tTransport){
                tTransport.close();
            }
        }


    }
}
