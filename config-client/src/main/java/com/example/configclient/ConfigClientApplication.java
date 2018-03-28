package com.example.configclient;

import com.example.configclient.controller.Device;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {

//		String brand="";
//		Device devices=new Device();
//		if(devices!=null && devices.getBrand()!=null){
//			brand=devices.getBrand().toLowerCase();
//		}
//		//手机品牌
//		System.out.println(brand);

		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
