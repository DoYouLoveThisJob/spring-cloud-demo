package com.example.thriftdemo.server;

import com.example.thriftdemo.service.Hello;
import com.example.thriftdemo.service.HelloServiceImpl;
import org.apache.thrift.TProcessor;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

public class HelloServiceServer {
  public static void main(String[] args){
    System.out.println("服务端开启.....");
      TProcessor tProcessor=new Hello.Processor<Hello.Iface>(new HelloServiceImpl());
      try {
          TServerSocket serverTransport=new TServerSocket(9898);
          TServer.Args targs = new TServer.Args(serverTransport);
          targs.processor(tProcessor);
          targs.processorFactory(new TProcessorFactory(tProcessor));
          TServer server =new TSimpleServer(targs);
          server.serve();
      } catch (TTransportException e) {
          e.printStackTrace();
      }


  }
}
