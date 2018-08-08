package com.revature.caliber.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableHystrix
@EnableDiscoveryClient
public class ZuulAPIGatewayApplication {
	private String test = "Test";
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZuulAPIGatewayApplication.class, args);
	}
	
	public String getTest() {
		return test;
	}
	
}
