package com.example.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ZipkinServerApplication2 {

	public static void main(String[] args) {

		SimpleDateFormat format=new SimpleDateFormat("HH");
		String nowTime=format.format(new Date());
		System.out.println(Integer.valueOf(nowTime));
	}
}
