package com.vp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ClientStockExchangeDataFieldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientStockExchangeDataFieldApplication.class, args);
	}

}
