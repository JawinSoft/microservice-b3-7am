package com.yuvintech.msk.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MskZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MskZuulGatewayApplication.class, args);
	}

}